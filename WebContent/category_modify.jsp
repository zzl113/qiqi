<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.lechenggu.entitys.*"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>易购——CategorySecond</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <link type="text/css" href="css/category_manage.css" rel="stylesheet">
      <script type="text/javascript" src="js/changeBGC.js"></script>
</head>
<body>
<main>
    
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>小分类管理</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
                <table>
                    <tr class="title">
                        <th>编号</th>
                        <th>商品小分类</th>
                        <th>所属类别</th>
                        <th class="right_border">操作</th>
                    </tr>
                  
                   <c:forEach items="${Cate}" var="t"> 
                    <tr class="neirong">
                        <td>${t.id}</td>
                        <td class="Title">
                   		${t.catesname }
                        </td>
                        <td>${t.catename}</td>
                        <td class="right_border"><img src="images/update1.png"><a href="updscate.action?id=${t.id}" target="center">修改</a><img src="images/delete.png"><a href="detescate.action?id=${t.id}" onclick="return confirm('删除小分类，对应的商品也会删除吗？')">删除</a></td>
                    </tr>
                    </c:forEach>
                    
                </table>
               <div class="fanye">[<s:property value="%{yehao}"/>/<s:property value="%{countyehao}"/>]
               <a href="chaXiaoCate.action?page=1">首页</a>&nbsp;
                
                <a href="chaXiaoCate.action?page=<s:property value="%{yehao-1}"/>">上一页</a>&nbsp;
               <a href="chaXiaoCate.action?page=<s:property value="%{yehao+1}"/>">下一页</a>&nbsp;
               
                <a href="chaXiaoCate.action?page=<s:property value="%{countyehao}"/>">尾页</a></div>
            </section>
        </section>

</main>
</body>
</html>