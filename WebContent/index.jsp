<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>易购-主页</title>    
</head>

<body style="margin: 0 auto">
	<header  style="margin: 0 auto">
    	<iframe src="header.jsp" name="headFrame" id="head" height="160px" frameborder="0" scrolling="no" width="100%"></iframe>
	</header>
	
	<div  style="margin: 0 auto;width: 980px">
	<!--左侧各种管理部分  -->
    	<div style="width: 190px;float: left;padding-left:2px;border: 1px solid #cccccc;margin-bottom:30px">
        	<iframe src="main_left.jsp" id="main" name="main" height="300px" frameborder="0" scrolling="no" width="100%"></iframe>
    	</div>
    <!--中间管理内容部分  -->	
    	<div style="width: 785px;float: right">
        	<iframe src="center.jsp"  frameborder="0" scrolling="no" width="100%" name="center"
                	onload="this.height=this.contentWindow.document.documentElement.scrollHeight"></iframe>
    	</div>

	</div>
	<!--页面底部  -->	
	<footer  style="margin: 0 auto">
    	<iframe src="footer.html" height="200px" frameborder="0" scrolling="no" width="100%"></iframe>
	</footer>
</body>
</html>