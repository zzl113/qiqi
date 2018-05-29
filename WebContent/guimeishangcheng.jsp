<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=gb2312" /> -->
<title>贵美商城首页</title>
<link href="css/busywork_guimei.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="float" class="float"><img src="images/guimei_float.jpg" id="floatImg" alt="漂浮广告" /></div>
<script src="js/busywork_guimei.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<!--网页导航部分开始-->
<div id="header">
<div class="header_top">
	<ul>
			<li class="pic pic1"></li>
            <li class="top_menu_text "><a href="#">购物车</a></li>
            <li class="pic pic2"></li>
			<li class="top_menu_text"><a href="#">帮助中心</a></li>
            <li class="pic pic3"></li>
			<li class="top_menu_text"><a href="javascript:addCookie()">加入收藏</a></li>	
            <li class="pic pic4"></li>	
			<li class="top_menu_text"><a href="javascript:setHomePages()">设为首页</a></li>		
			<li class="pic btn"><a href="login2.html">登录</a></li>
			<li class="pic btn"><a href="user_add.jsp">注册</a></li>																																
				</ul>
</div>
<div class="header_middle" id="header_middle">
<script type="text/javascript">
window.onload=function(){
    window.setInterval("time()",0);}</script>
</div>
<div class="nav">
<ul>
  				<li><a href="#">&nbsp;首&nbsp;&nbsp;&nbsp;页&nbsp;</a></li>
  				<li><a href="#">家用电器</a></li>
  				<li><a href="#">手机数码</a></li>
  				<li><a href="#">日用百货</a></li>
  				<li><a href="#">&nbsp;书&nbsp;&nbsp;&nbsp;籍&nbsp;</a></li>
  				<li><a href="#">帮助中心</a></li>
  				<li><a href="#">免费开店</a></li>
  				<li><a href="#">全球咨询</a></li>  				
  			</ul>
</div>
</div>
<!--网页中间部分开始-->
<div id="main">
<!--左则菜单开始-->
<div class="cat">
<ul id="cat_menu">
<!--
本菜单使用纯HTML实现的代码如下：
<li class="cat_class">家用电器</li>
   <li class="cat_li">大家电</li>
     ......
   <li class="cat_li">摄像机</li>
<li class="cat_class">书籍</li>
   <li class="cat_li">文学</li>
     ......
   <li class="cat_li">法律</li>
<li class="cat_class">手机数码</li>
   <li class="cat_li">电脑整机</li>
     ......
   <li class="cat_li">网线</li>
<li class="cat_class">日用百货</li>
   <li class="cat_li">儿童床品</li>
     ......
   <li class="cat_li">减肥</li>
   
  本例使用JavaScript方法实现
-->
<script type="text/javascript">menu()</script>
</ul>
</div>
<!--中间广告和疯狂购物开始-->
<div class="content">
<!--带按钮的横幅广告开始-->
<div class="adRotator">
<img src="images/guimei_ad-01.jpg" alt="scroll" id="adverImg"/>
<div class="number_bg">
<a href="javascript:adver(1)" class="advers">1</a>
<a href="javascript:adver(2)" class="advers">2</a>
<a href="javascript:adver(3)" class="advers">3</a>
<a href="javascript:adver(4)" class="advers">4</a>
</div>
</div>
<!--疯狂购物开始-->
<div class="shopping">
<dl>
<dd class="shopping_images"><img src="images/guimei_shopping_01.jpg" alt="shopping"/></dd>
<dd class="shopping_images"><img src="images/guimei_shopping_02.jpg" alt="shopping"/></dd>
<dd class="shopping_images"><img src="images/guimei_shopping_03.jpg" alt="shopping"/></dd>
<dd class="shopping_text">惠普商务移动应用英寸笔记本</dd>
<dd class="shopping_text">夏新N6 GPS真人语音导航手机 超低特价疯抢 数量有限！</dd>
<dd class="shopping_text">三星家庭影院 HT-TZ325 购机送好礼(超值性价比)</dd>
<dd class="shopping_images"><img src="images/guimei_shopping_04.jpg" alt="shopping"/></dd>
<dd class="shopping_images"><img src="images/guimei_shopping_05.jpg" alt="shopping"/></dd>
<dd class="shopping_images"><img src="images/guimei_shopping_06.jpg" alt="shopping"/></dd>
<dd class="shopping_text">明基MP512投影机 2899元 送100元京卷 SVGA 2200流明</dd>
<dd class="shopping_text">罗技数据1TB移动鼠标729元开抢了！</dd>
<dd class="shopping_text">海森那尔极品耳机绝对不容错过！</dd>
<dd class="shopping_images"><img src="images/guimei_shopping_07.jpg" alt="shopping"/></dd>
<dd class="shopping_images"><img src="images/guimei_shopping_08.jpg" alt="shopping"/></dd>
<dd class="shopping_images"><img src="images/guimei_shopping_09.jpg" alt="shopping"/></dd>
<dd class="shopping_text">亚马逊随时阅读，随时记录，时尚最佳选择！</dd>
<dd class="shopping_text">优雅相框</dd>
<dd class="shopping_text">IBM 2009最新上网本，特色尽显</dd>
</dl>
</div>
</div>
<!--右侧开始-->
<div class="sidebar">
<div id="dome">
    <div id="dome1">
    
    <dl>
      <dt><img src="images/guimei_scroll_01.jpg" alt="scroll" /></dt>
      <dd>大牌狂降价，三折直送</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_02.jpg" alt="scroll" /></dt>
      <dd>大学老师开网店</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_03.jpg" alt="scroll" /></dt>
      <dd>黑眼圈推荐，美白不停</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_04.jpg" alt="scroll" /></dt>
      <dd>瘦身狂潮风，修形之选</dd>
      </dl>
      <dl>
      <dt><img src="images/guimei_scroll_01.jpg" alt="scroll" /></dt>
      <dd>大牌狂降价，三折直送</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_02.jpg" alt="scroll" /></dt>
      <dd>大学老师开网店</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_03.jpg" alt="scroll" /></dt>
      <dd>黑眼圈推荐，美白不停</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_04.jpg" alt="scroll" /></dt>
      <dd>瘦身狂潮风，修形之选</dd>
      </dl>
      <dl>
      <dt><img src="images/guimei_scroll_01.jpg" alt="scroll" /></dt>
      <dd>大牌狂降价，三折直送</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_02.jpg" alt="scroll" /></dt>
      <dd>大学要求老师开网店</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_03.jpg" alt="scroll" /></dt>
      <dd>黑眼圈推荐，美白不停</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_04.jpg" alt="scroll" /></dt>
      <dd>瘦身狂潮风，修形之选</dd>
      </dl>
      <dl>
      <dt><img src="images/guimei_scroll_01.jpg" alt="scroll" /></dt>
      <dd>大牌狂降价，三折直送</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_02.jpg" alt="scroll" /></dt>
      <dd>大学老师开网店</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_03.jpg" alt="scroll" /></dt>
      <dd>黑眼圈推荐，美白不停</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_04.jpg" alt="scroll" /></dt>
      <dd>瘦身狂潮风，修形之选</dd>
      </dl>
      <dl>
      <dt><img src="images/guimei_scroll_03.jpg" alt="scroll" /></dt>
      <dd>黑眼圈推荐，美白不停</dd>
      </dl>
         <dl>
      <dt><img src="images/guimei_scroll_04.jpg" alt="scroll" /></dt>
      <dd>瘦身狂潮风，修形之选</dd>
      </dl>
      <dl>
      <dt><img src="images/guimei_scroll_01.jpg" alt="scroll" /></dt>
      <dd>大牌狂降价，三折直送</dd>
      </dl>
      
      </div>
    <div id="dome2"></div>
  </div> 
  <script type="text/javascript">
    var speed=50;  //设置向上滚动速度
	var dome=document.getElementById("dome");
   var dome1=document.getElementById("dome1");
   var dome2=document.getElementById("dome2");
	     function moveTop(){
   dome2.innerHTML=dome1.innerHTML //复制dome1为dome2
   if(dome2.offsetTop-dome.scrollTop<=0)   //当滚动至dome1与dome2交界时
   dome.scrollTop-=dome1.offsetHeight      //dome跳到最顶端
   else{
   dome.scrollTop++
   }
   }
    var MyMar=setInterval(moveTop,speed) //设置定时器
   dome.onmouseover=function() {clearInterval(MyMar)}//鼠标移上时清除定时器达到滚动停止的目的
   dome.onmouseout=function() {MyMar=setInterval(moveTop,speed)}//鼠标移开时重设定时器，继续滚动
      </script>
<!--TAB切换开始-->
  <div class="tab"> <dl>
    <dt><img src="images/guimei_left1.jpg" alt="笔记本" id="left1"/><img src="images/guimei_left2.jpg" alt="笔记本" id="left2" onmouseover="change('top1')" style="display:none;"/></dt>
     <dt><img src="images/guimei_right1.jpg" alt="手机充值" id="right1" onmouseover="change('top2')"/><img src="images/guimei_right2.jpg" alt="手机充值" id="right2" style="display:none;" /></dt>
  </dl>
  <dl>
    <dd><img src="images/guimei_end1.jpg" alt="笔记本" id="end1" /><img src="images/guimei_end2.jpg" alt="手机充值" id="end2" style="display:none;"/></dd>
  </dl>
  </div>
  <!--TAB切换结束-->
</div>
<!--中间的右侧内容结束-->
</div>
<!--网页版权部分开始-->
<div id="footer">
 <div class="copyright">友情链接：&nbsp;&nbsp;<a href="#">百度</a> | <a href="#">Google</a> | <a href="#">雅虎</a> | <a href="#">淘宝</a> | <a href="#">拍拍</a> | <a href="#">易趣</a> | <a href="#">当当</a> | <a href="#">京东商城</a> | <a href="#">迅雷</a> | <a href="#">新浪</a> | <a href="#">网易</a> | <a href="#">搜狐</a> | <a href="#">猫扑</a> | <a href="#">开心网</a> | <a href="#">新华网</a> | <a href="#">凤凰网</a><br />
			 	<hr size="1" />COPYRIGHT &copy;  2003-2010 <a href="#">北京市贵美商城有限公司</a> ALL RIGHT RESERVED<br />
			  	  热线：400-66-13060 Email:service@prd.com<br />
			  		ICP：<a href="#">沪ICP备05021104号</a><br />
			  			<img src="images/guimei_copy_01.gif" alt="alt" /><img src="images/guimei_copy_02.gif" alt="alt" /><img src="images/guimei_copy_03.gif" alt="alt" /><img src="images/guimei_copy_04.gif" alt="alt" />
			 </div>
</div>
<!--网页版权部分结束-->
</body>
</html>