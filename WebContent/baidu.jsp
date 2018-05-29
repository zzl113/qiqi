<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">

.onit{
background-color: #FF0;
}


</style>
<script type="text/javascript">
 function doIt(){
	//创建XMLHttpRequest
		var req=new XMLHttpRequest();
		//建立到服务器的连接
		req.open("post","BaiDu");
		//post请求，设置请求头的信息
		req.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		//设置回调
		req.onreadystatechange=function(){ 
		if(req.status==200&&req.readyState==4){
			document.getElementById("names").innerHTML=req.responseText;
			}
		
		}
	//发送请求
	req.send("inputValue="+document.getElementById("content").value);
   
 }
 function enterit(e ){
	 e.className=".onit";
 }
function outit(t){
	t.className="";
}
function clik(e){
	
	document.getElementById("content").value=e.innerHTML;
	
	document.getElementById("names").innerHTML="";
}
</script>
<script type="text/javascript" src="js/jquery-1.11.0.js" ></script>
<script > 
$(function(){
$("#content").keyup(function(e){
	 
	$.post("BaiDu",$("#drm").serialize(),function(data){
		
		alert(data);
		
	});
	
	
	
});

});
</script>
</head>
<body>
<div style="width:400px;margin-left:auto;margin-right: auto;">
<img  src="image/baidu.png" style="width:400px;height:120px;">
</div>

<div style="width:600px; margin-left:auto;margin-right: auto;">
<form id="drm">
<!-- <input onkeyup="doIt()" style="width: 500px;" type="text" name="inputValue" id="content"/><button type="button">百度一下</button> -->
<input  style="width: 500px;" type="text" name="inputValue" id="content"/><button type="button">百度一下</button>
</form>
</div>

<div id="names" onmouseleave="this.innerHTML=''" style="width:600px;margin-left:auto;margin-right: auto;">
 

</div>
</body>
</html>