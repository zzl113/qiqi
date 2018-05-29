<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset='utf-8'>
    
    <title>易购——Category</title>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
      <script type="text/javascript" src="js/changeBGC.js"></script>
	<link type="text/css" href="css/class_manage.css" rel="stylesheet">
</head>
<body>
 <main>
    
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>大分类管理</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
                <table id="result">
                    <tr class="title">
                        <th>编号</th>
                        <th>分类名称</th>
                        <th class="right_border">操作</th>
                    </tr>
             		<s:iterator  value="Cate" id="td">
             			<tr class="neirong">
             			<td>${td.id }</td>
                        <td class="Titl">${td.catename}</td>
                        <td class="right_border"><img src="images/update1.png"><a href="updcate.action?id=${td.id}" target="center">修改</a><img src="images/delete.png"><a href="deleteCate.action?id=${td.id}" onclick="return confirm('删除大分类，对应小分类也会删除，以及所属小分类的商品，确认删除吗？')">删除</a></td>
             			</tr>
             			</s:iterator>
           </table>
                <div class="fanye">[<s:property value="%{yehao}"/>/<s:property value="%{countyeshu}"/>]<a href="chaCate.action?page=1">首页</a>&nbsp;
                <a href="chaCate.action?page=<s:property value="%{yehao-1}"/>">上一页</a>&nbsp;
               
               
               <a href="chaCate.action?page=<s:property value="%{yehao+1}"/>">下一页</a>&nbsp;
               
                <a href="chaCate.action?page=<s:property value="%{countyeshu}"/>">尾页</a></div>
            </section>
        </section>
</main>
</body>
</html>