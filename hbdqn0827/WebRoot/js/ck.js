var xmlHttpRequest;

function createXMLHttpRequest(){
	if(window.ActiveXObject){
		xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
	}else{
		xmlHttpRequest = new XMLHttpRequest();
	}
}

function geths(){
	var did = document.getElementById("district").value;
	var url = "getxmlaction?did=" + did;
	createXMLHttpRequest();
	xmlHttpRequest.open("GET", url, true);
	xmlHttpRequest.onreadystatechange = callback;
	xmlHttpRequest.send(null);
}

function getres(){
	var did = document.getElementById("district").value;
	var sid = document.getElementById("street").value;
	var htid = document.getElementById("htype").value;
	var bprice = document.getElementById("bprice").value;
	var eprice = document.getElementById("eprice").value;
	var orderby = document.getElementById("orderby").value;
	var uname = document.getElementById("uname").value;
	var url = "getresaction?did="+ did +"&sid="+ sid +"&htid="+ htid +"&bprice="+ bprice +"&eprice="+ eprice +"&orderby="+ orderby +"&uname="+uname;
	createXMLHttpRequest();
	xmlHttpRequest.open("GET", url,true);
	xmlHttpRequest.onreadystatechange = callback2;
	xmlHttpRequest.send(null);
	return false;
}

function callback2() {
	if(xmlHttpRequest.readyState == 4){
		if(xmlHttpRequest.status == 200){
			document.getElementById("res").innerHTML = xmlHttpRequest.responseText;
		}
	}
}



function callback() {
	if(xmlHttpRequest.readyState == 4){
		if(xmlHttpRequest.status == 200){
			var doc = xmlHttpRequest.responseXML;//获得XML响应结果
			var street = document.getElementById("street");
			street.length = 0;//制空
			var sidnodes = doc.getElementsByTagName("sid");
			var snamenodes = doc.getElementsByTagName("sname");
			for(var i = 0;i < sidnodes.length;i++){
				var mysid = sidnodes[i].childNodes[0].nodeValue;
				var mysname = snamenodes[i].childNodes[0].nodeValue;
				street.add(new Option(mysname,mysid),null);
			}
		}
	}
}
