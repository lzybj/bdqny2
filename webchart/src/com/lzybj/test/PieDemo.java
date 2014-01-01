package com.lzybj.test;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class PieDemo {

	private static DefaultPieDataset getDataSet() { 
	        DefaultPieDataset dfp = new DefaultPieDataset(); 
	        dfp.setValue("研发人员", 5); 
	        dfp.setValue("市场策划人员", 10); 
	        dfp.setValue("市场推广人员", 25); 
	        dfp.setValue("网络维护人员", 5); 
	        dfp.setValue("财务人员", 15); 
	        return dfp; 
	} 
	    /** 
	     * 生成饼状图。 
	     */ 
	    public static void makePieChart3D() { 
	        String title = "饼状图"; 
	        // 获得数据集 
	        DefaultPieDataset dataset = getDataSet(); 
	        // 利用chart工厂创建一个jfreechart实例 
	        JFreeChart chart = ChartFactory.createPieChart3D(title,   // 图表标题 
	                dataset,   // 图表数据集 
	                true,      // 是否显示图例 
	                false,     // 是否生成工具（提示） 
	                false      // 是否生成URL链接 
	                ); 
	        // 设置pieChart的标题与字体 
	        Font font = new Font("宋体", Font.BOLD, 25); 
	        TextTitle textTitle = new TextTitle(title); 
	        textTitle.setFont(font); 
	        chart.setTitle(textTitle); 
	        chart.setTextAntiAlias(false); 
	        // 设置背景色 
	        chart.setBackgroundPaint(new Color(255, 255, 255)); 
	        // 设置图例字体 
	        LegendTitle legend = chart.getLegend(0); 
	        legend.setItemFont(new Font("宋体", 1, 15)); 
	        // 设置标签字体 
	        PiePlot plot = (PiePlot) chart.getPlot(); 
	        plot.setLabelFont(new Font("宋体", Font.TRUETYPE_FONT, 12)); 
	        // 指定图片的透明度(0.0-1.0) 
	        plot.setForegroundAlpha(0.95f); 
	        // 图片中显示百分比:自定义方式，{0} 表示选项， {1} 表示数值， {2} 表示所占比例 ,小数点后两位 
	        plot.setLabelGenerator(new StandardPieSectionLabelGenerator( 
	                "{0}={1}({2})", NumberFormat.getNumberInstance(), 
	                new DecimalFormat("0.00%"))); 
	        // 图例显示百分比:自定义方式， {0} 表示选项， {1} 表示数值， {2} 表示所占比例 
	        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({2})")); 
	        // 设置第一个饼块截面开始的位置，默认是12点钟方向 
	        plot.setStartAngle(90); 
	        /***********************************************************/ 
	        ChartFrame frame = new ChartFrame(title, chart, true); 
	        frame.pack(); 
	        frame.setVisible(true); 
	    } 
	    /** 
	     * @param args 
	     */ 
	    public static void main(String[] args) { 
	        // 3D饼状图 
	        makePieChart3D(); 
	    } 
}
