<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>修改订单</title>
    <meta charset="utf-8">
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            /*border: 1px solid red;*/
        }
        iframe{
            border: none;
        }
        .header{
            width: 1024px;
            height: 150px;
            margin-left: 170px;
        }
        .main{
            width: 1024px;
            height: 380px;
            margin-left: 170px;
        }
        .main_left{
            width: 181px;
            height: 342px;
            margin-left: 26px;
            float: left;
        }
        .main_right{
            width: 796px;
            height: 342px;
            float: left;
            margin-top: 10px;
            margin-left: 10px;
        }
        .main_right dl{
            height: 24px;
            border-bottom: 2px solid #fc883b;
        }
        .main_right dl dt{
          /*   background-image: url("../images/bg.png"); */
            background-position: -236px -107px;
            width: 13px;
            height: 14px;
            float: left;
            margin-right: 6px;
        }
        .main_right dl dd{
            line-height: 14px;
            font-weight: bold;
            font-size: 15px;
        }
        .main_right form table{
            margin-left: 115px;
        }
        .main_right form table tr{
            height: 34px;
        }
        #tr{
            height: 16px;
        }
        .td1{
            font-size: 13px;
            text-align: right;
        }
        .input{
            width: 400px;
            height: 20px;
        }
        .submit{
            background-color: #5e77aa;
            color: white;
            width: 44px;
            height: 24px;
            border: 1px solid black;
        }
        .footer{
            width: 1024px;
            height: 31px;
            margin-left: 170px;
        }
    </style>
</head>
<body>
  
  <section class="main">  
    
    <section class="main_right">
        <dl>
            <dt></dt>
            <dd>修改订单</dd>
        </dl>
        <form action="UpdateOrders" method="post" >
         <div style="border:1px red" >--------------------------
            <table align="left" >
<%--           <c:forEach items="${tw }" var="t"></c:forEach> --%>
                <tr>
                    <td class="td1">订单编号：</td>
                    <td><label><input class="input" type="text" value="${tw.id}"  name="id"  ></label></td>
                </tr>
                <tr>
                    <td class="td1">订购人姓名：</td>
                    <td><label><input class="input" type="text" value="${tw.name}" name="name"></label></td>
                </tr>
                <tr> 
                    <td class="td1">订购人地址：</td>
                    <td><label><input class="input" type="text" value="${tw.address }" name="address"></label></td>
                </tr>
                <tr>
                    <td class="td1">总金额：</td>
                    <td><label><input class="input" type="text" value="${tw.state }" name="state"></label></td>
                </tr>
                <tr>
                    <td class="td1">下订单日期：</td>
                    <td><label><input class="input" type="datetime" value="${tw.time }" name="time"></label></td>
                </tr>
                <tr>
                    <td class="td1">订单状态：</td>
                    <td>
                        <label>
                            <select>
                                <option value="0">待审核</option>
                                <option value="0">已通过</option>
                                <option value="0">已撤销</option>
                            </select>
                        </label>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><label><input class="submit" type="submit" value="更新"></label></td>
                </tr>
                 
            </table>
             </div>
        </form>
     </section>  
</section>
<iframe class="footer" src="footer.html"></iframe>
</body>
</html>