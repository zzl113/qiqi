<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>易购——goods_detail_manage</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <link type="text/css" href="css/goods_detail_manage.css" rel="stylesheet">
     <script type="text/javascript" src="js/changeBGC.js"></script>
</head>
<body>
<main>
    
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>商品详细信息管理</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
                <table>
                    <tr class="title">
                        <th>商品编号</th>
                        <th>商品名称</th>
                        <th>所属分类</th>
                        <th>价格</th>
                        <th>剩余数量</th>
                        <th>图片</th>
                        <th class="right_border">操作</th>
                    </tr>
                    <c:forEach items="${gd}" var="t">
                    <tr class="neirong">
                        <td>${t.id}</td>
                        <td>${t.goodsname}</td>
                        <td>
                     		 ${t.catesname }
                        </td>
                        <td>${t.price}</td>
                        <td>${t.sucount }</td>
                        <td><img src="${t.spic}"  style="width: 60px;height: 30px;margin-top:10px"></td>
                        <td class="right_border"><img src="images/update1.png"><a href="upGoods.action?id=${t.id}" target="center">修改</a><img src="images/delete.png"><a href="deleTgood.action?id=${t.id }" onclick="return confirm('删除商品，确认删除吗？')">删除</a></td>
                    </tr>
                    </c:forEach>
                       
                </table>
               <div class="fanye">[<s:property value="%{yehao}"/>/<s:property value="%{countyehao}"/>]
               <a href="chaXiaogoods.action?page=1">首页</a>&nbsp;
                 <a href="chaXiaogoods.action?page=<s:property value="%{yehao-1}"/>">上一页</a>&nbsp;
               
               
               <a href="chaXiaogoods.action?page=<s:property value="%{yehao+1}"/>">下一页</a>&nbsp;
               
               
                <a href="chaXiaogoods.action?page=<s:property value="%{countyehao}"/>">尾页</a></div>
           </section>
        </section>

</main>
</body>
</html>