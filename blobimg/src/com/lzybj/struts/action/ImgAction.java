package com.lzybj.struts.action;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

import org.hibernate.Hibernate;

import com.lzybj.hibernate.domain.Test;
import com.lzybj.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

public class ImgAction extends ActionSupport{
	private File img = null;
	private String imgFileName = "";
	private String imgContentType = "";
	private String tid = "";
	
	private TestService ts = null;
	
	private List<Test> data = null;
	private InputStream inputStream = null;
	
	
	
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public List<Test> getData() {
		return data;
	}
	public void setData(List<Test> data) {
		this.data = data;
	}
	public TestService getTs() {
		return ts;
	}
	public void setTs(TestService ts) {
		this.ts = ts;
	}
	public File getImg() {
		return img;
	}
	public void setImg(File img) {
		this.img = img;
	}
	public String getImgFileName() {
		return imgFileName;
	}
	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
	public String getImgContentType() {
		return imgContentType;
	}
	public void setImgContentType(String imgContentType) {
		this.imgContentType = imgContentType;
	}
	
	public String uploadimg(){
		try {
			FileInputStream fis = new FileInputStream(img);
			Test t = new Test();
			t.setTname(imgFileName);
			t.setBigimg(Hibernate.createBlob(fis));
			FileInputStream fis2 = new FileInputStream(Thumbnails.of(img).size(100,100).outputFormat("jpeg").asFiles(Rename.PREFIX_DOT_THUMBNAIL).get(0));
			t.setSmallimg(Hibernate.createBlob(fis2));
			ts.addImg(t);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "succ";
	}
	
	private byte[] blobToByteArr(Blob blob){
		BufferedInputStream is = null;
		try {
			is = new BufferedInputStream(blob.getBinaryStream());
			byte[] bytes = new byte[(int) blob.length()];
			int len = bytes.length;
		    int offset = 0;
		    int read = 0;
		    while (offset < len && (read = is.read(bytes, offset, len - offset)) >= 0) {
		    	offset += read;
		    	}
		return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		try {
		is.close();
		is = null;
		} catch (IOException e) {
		return null;
		}
		}		
		return null;
	}
	
	public String viewimg(){
		Blob smallimg = this.ts.findByTid(tid).getSmallimg();
		inputStream = new ByteArrayInputStream(this.blobToByteArr(smallimg));
		return "succ";
	}
	
	public String viewall(){
		this.setData(ts.findByAll());
		return "succ";
	}
	
	
}
