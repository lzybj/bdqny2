var xmlHttpRequest;
function createXMLHttpRequest(){
	if(window.ActiveXObject){
		xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
	}else{
		xmlHttpRequest =  new XMLHttpRequest();
	}
}

function ckuname(){
	var uname = document.getElementById("uname").value;
	if(uname == ''){
		document.getElementById("msg").innerHTML = "SORRY,IS NULL";
	}else{
		createXMLHttpRequest();
		var url = "ckunameaction?uname=" + uname;
		xmlHttpRequest.open("get",url,true);
		xmlHttpRequest.onreadystatechange = callback;
		xmlHttpRequest.send(null);
	}
}

function callback(){
	if(xmlHttpRequest.status == 200){
		if(xmlHttpRequest.readyState == 4){
			document.getElementById("msg").innerHTML = xmlHttpRequest.responseText;
		}
	}
}