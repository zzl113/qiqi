<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<main>
    
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>修改大分类</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <form action="updeCate.action" method="post">
            <section class="right_middle">            
                <table>
                    <tr>
                        <td class="text">分类名称</td>
                        <td><input type="text" class="GG" name="cate.catename" value="${cate.catename }"> </td>
                 		<td id="result"></td>
                    </tr>
                    <tr><td><input type="hidden" name="cate.id" value="${cate.id }"></td></tr>
                    <tr><td class="right_bottom"><input type="image" src="images/submit.gif" onclick="return checkAll()"/></td></tr>
                </table>            
            </section>
          </form> 
        </section>

</main>
</body>
</html>