<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 导包 -->
    <%@ page import="java.util.*,java.text.*"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" % >
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
SimpleDateFormat mat=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
String date=mat.format(new Date());
%>
<%=date%>
</body>
</html>