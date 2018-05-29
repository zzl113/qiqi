<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
  <title>添加公告</title>
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
            background-image: url("../images/bg.png");
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
            font-size: 13px;
            margin-left: 110px;
        }
        .tr1{
            height: 22px;
        }
        .tr2{
            height: 10px;
        }
        .td1{
            height: 20px;
        }
        .td2{
            float: right;
            line-height: 90px;
        }
        .input{
            width: 456px;
            height: 20px;
        }
        textarea{
            margin-bottom: 8px;
            overflow-y: scroll;
            resize: none;
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
<section class="main_right">
        <dl>
            <dt></dt>
            <dd>修改公告</dd>
        </dl>
        <form action="Addannouncement" method="post">
            <table>
                <tr class="tr1"></tr>
                <tr>
                    <td class="td1">公告标题(*)：</td>
                     
                    <td class="td1"><label><input class="input" type="text"   name="wben" ></label></td>
                </tr>
                <tr class="tr2"></tr>
                <tr>
                    <td class="td2">公告内容：</td>
                    <td><label><textarea rows="6" cols="63"  name="contet"></textarea></label></td>
                </tr>
                <tr>
                    <td></td>
                    <td><label><input class="submit" type="submit" value="提交"></label></td>
                </tr>
            </table>
        </form>
    </section>

</body>
</html>