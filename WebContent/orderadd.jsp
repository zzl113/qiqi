<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                    <!-- <li><img src="images/houtai1.png"></li> -->
                    <li><span>添加订单</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
            <form action="ordersAdd" method="post">
                <table>
                  <tr>
                        <td class="Ntext"></td>
                        <td style="color:red"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td class="Ntext">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓&nbsp;名（*）：</td>
                        <td><input type="text" class="In" name="Name"></td>
                        <td id="resultUserName"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">&nbsp;&nbsp;&nbsp;总金额（*）：</td>
                        <td><input type="text" class="In" name="state"></td>
                        <td id="resultRealName"></td>
                    </tr>
                    <tr>
                        <td class="Ntext">下单日期（*）：</td>
                        <td><input type="text" class="In" name="time"></td>
                        <td id="resulBirthday"></td>
                    </tr>
                  <tr>
                        <td class="Ntext">发货地址（*）：</td>
                        <td><input type="text" class="In" name="address"></td>
                        <td id="resultAddress"></td>
                    </tr>
                    <tr><td colspan="2" class="right_bottom"><input type="image" src="images/submit.gif"></td></tr>
                </table>
               </form> 
            </section>
        </section>
</main>
</body>
</html>