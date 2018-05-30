<%@page import="org.apache.catalina.connector.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.lechenggu.entitys.*"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>订单管理</title>
    <meta charset="utf-8">
	
	
	
	<link type="text/css" href="css/order_manage.css" rel="stylesheet">
</head>
<body>
<section class="main_right">
        <dl>
            <dt></dt>
            <dd>订单管理</dd>
        </dl>
   
	  <form action="orderChaxun" method="post">
            <ul>
                <li>订单号：<label><input type="text" name="hid" ></label>
                    订货人：<label><input type="text" name="sname"></label>
                    <label><input class="submit" type="submit" value="查询"></label></li>
            </ul>
		 
       
        <table>
            <tr class="tr1">
                <td class="td1">编号</td>
                <td class="td2">姓名</td>
                <td class="td2">发货地址</td>
                 <td class="td2">总金额</td>
                 <td class="td2">下单日期</td>
                <td class="td4">状态</td>
                <td class="td5">操作</td>
            </tr>
            
            <tr class="tr2">
                <td>${derd.id}</td>
                <td>${derd.name }</td>
                <td>${derd.address }</td>
            	<td>${derd.state}</td>
                  <td>${derd.time}</td>
                <td>待审核</td>
                <td id="td"><a href="chaxOrders?dd=${derd.id}">修改</a>&nbsp;<a href="deleOrders?td=${derd.id}">删除</a></td>
            </tr>
            
        </table>
 <div  style="width:770px" align="right">
 [${Opage}/${der}]  
                  <a href="OrdersFenye?page=${Opage}">首页</a>
               <a href="OrdersFenye?page=${Opage-1}">上一页</a> 
               
               <a href="OrdersFenye?page=${Opage+1}">下一页</a> 
               
                
                <a href="OrdersFenye?page=${der}">尾页</a></div>
                </form>
</section>
</body>
</html>