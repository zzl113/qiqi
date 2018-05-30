<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>易购——user_manage</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
      <script type="text/javascript" src="js/changeBGC.js"></script>
    <link type="text/css" href="css/user_manage.css" rel="stylesheet">
    <script type="text/javascript" src="js/check1.js" charset="utf-8"></script>
</head>
<body>
<main>
       <section class="right">
            <section class="right_top">
                <ul>
                    <li><img src="images/houtai1.png"></li>
                    <li><span>用户管理</span></li>
                </ul>
            </section>
            <div class="line"></div>
            <section class="right_middle">
                <table>
                    <tr class="title">
                        <th>用户编号</th>
                        <th>用户名</th>
                        <th>真实姓名</th>
                        <th>性别</th>
                        <th>Email</th>
                        <th>手机</th>
                        <th>冻结/解冻</th>
                        <th class="right_border">操作</th>
                    </tr>
                    <s:iterator value="%{us}" status="sta">
                    	<tr class="neirong" <s:if test="%{#sta.index%2==0}">style="background-color:red"</s:if>>
                    	
                    	 <td> <s:property value="%{id}"/></td>
                        <td> <s:property value="%{loginname}"/></td>
                         <td> <s:property value="%{realname}"/></td>
                            <s:if test="%{sex==0}">
                            <td>女</td>
                            </s:if>
                            <s:else><td>男</td></s:else>
                            
                                 <td> <s:property value="%{email}"/></td>
                                   <td> <s:property value="%{tel}"/></td>
                                   <s:if test="%{isuse==0}"><td>解冻</td></s:if><s:else><td>冻结</td></s:else>
                       
                       
                        <td class="right_border"><img src="images/update1.png"><a href="UpdateUs!updateUser.action?tid=<s:property value="%{id}"/>" target="center">修改</a><img src="images/delete.png"><a href="UpdateUse!deleterUser.action?tid=<s:property value="%{id}"/>"  onclick="return confirm('确认删除吗？')"">删除</a></td>
                    </tr>
                    
                    </s:iterator>
                    
                    
                    
                    
                </table>
                
                <div class="fanye">
                [<s:property value="%{yeha}"/>/<s:property value="%{totlPages}"/>]
                <a href="TuserAction!UserManage.action?page=1">首页</a>&nbsp;
                 
               <a href="TuserAction!UserManage.action?page=<s:property value="%{yeha-1}"/>">上一页</a>&nbsp;
               
               <a href="TuserAction!UserManage.action?page=<s:property value="%{yeha+1}"/>">下一页</a>&nbsp;
               
                
                <a href="TuserAction!UserManage.action?page=<s:property value="%{totlPages}"/>">尾页</a></div>
            </section>
        </section>
</main>
</body>
</html>