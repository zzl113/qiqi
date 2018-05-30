<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>易购——categoryAdd</title>
    <meta charset="utf-8">
    <link type="text/css" href="css/class_add.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
</head>
<body>
<main>
    
        <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>添加大分类</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <form action="categoryAdd.action" method="post">
            <section class="right_middle">            
                <table>
                    <tr>
                        <td class="text">分类名称：</td>
                        <td><input type="text" class="GG" name="cate.catename"></td>
                 		<td id="result"></td>
                    </tr>
                    <tr><td></td><td class="right_bottom"><input type="image" src="images/submit.gif" onclick="return checkAll()"/></td></tr>
                </table>            
            </section>
          </form> 
        </section>

</main>
</body>
</html>