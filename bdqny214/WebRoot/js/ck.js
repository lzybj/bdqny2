var xmlHttpRequest;

function createXMLHttpRequest(){
	if(window.ActiveXObject){
		xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
	}else{
		xmlHttpRequest = new XMLHttpRequest();
	}
}

function callback(){
	if(xmlHttpRequest.readyState == 4){
		if(xmlHttpRequest.status == 200){
			var doc = xmlHttpRequest.responseXML;
			var street = document.getElementById("street");
			var idnodelist = doc.getElementsByTagName("sid");
			var namenodelist = doc.getElementsByTagName("sname");
			street.options.length = 0;
			for(var i = 0;i < idnodelist.length;i++){
				var myid = idnodelist[i].childNodes[0].nodeValue;
				var myname = namenodelist[i].childNodes[0].nodeValue;
				street.add(new Option(myname,myid),null);
			}
		}
	}
}

function loadstreet(){
	var did = document.getElementById("district").value;
	var url = "getstreetxml?did=" + did;
	createXMLHttpRequest();
	xmlHttpRequest.open("get",url,true);
	xmlHttpRequest.onreadystatechange = callback;
	xmlHttpRequest.send(null);
}

function mycx(){
	var did = document.getElementById("district").value;
	var sid = document.getElementById("street").value;
	var htid = document.getElementById("htid").value;
	var xiaoyu = document.getElementById("xiaoyu").value;
	var dayu = document.getElementById("dayu").value;
	var orderby = document.getElementById("orderby").value;
	var uname = document.getElementById("uname").value;
	var myurl = "getresaction?did="+ did +"&sid="+ sid +"&htid="+ htid +"&xiaoyu="+ xiaoyu +"&dayu="+ dayu +"&orderby="+ orderby +"&uname="+uname;
	createXMLHttpRequest();
	xmlHttpRequest.open("get",myurl,true);
	xmlHttpRequest.onreadystatechange = callback2;
	xmlHttpRequest.send(null);
	return false;
}

function callback2(){
	if(xmlHttpRequest.readyState == 4){
		if(xmlHttpRequest.status == 200){
			document.getElementById("myres").innerHTML = xmlHttpRequest.responseText;
		}
	}
}