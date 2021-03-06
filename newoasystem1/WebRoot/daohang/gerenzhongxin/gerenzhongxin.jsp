<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html lang="en">
  <head> 
   	
		<meta charset="utf-8">
		<title>网络传播中心</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description"
			content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
		<meta name="author" content="Muhammad Usman">

		<!-- The styles -->
		<link id="bs-css" href="css/bootstrap-cerulean.css" rel="stylesheet">
		<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}
</style>
		<link href="css/bootstrap-responsive.css" rel="stylesheet">
		<link href="css/charisma-app.css" rel="stylesheet">
		<link href="css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
		<link href='css/fullcalendar.css' rel='stylesheet'>
		<link href='css/fullcalendar.print.css' rel='stylesheet' media='print'>
		<link href='css/chosen.css' rel='stylesheet'>
		<link href='css/uniform.default.css' rel='stylesheet'>
		<link href='css/colorbox.css' rel='stylesheet'>
		<link href='css/jquery.cleditor.css' rel='stylesheet'>
		<link href='css/jquery.noty.css' rel='stylesheet'>
		<link href='css/noty_theme_default.css' rel='stylesheet'>
		<link href='css/elfinder.min.css' rel='stylesheet'>
		<link href='css/elfinder.theme.css' rel='stylesheet'>
		<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
		<link href='css/opa-icons.css' rel='stylesheet'>
		<link href='css/uploadify.css' rel='stylesheet'>

		<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
		<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

		<!-- The fav icon -->
		<link rel="shortcut icon" href="img/favicon.ico">

  </head>
  
  <body>
 <!-- topbar starts -->
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> </a>
					<a class="brand" href="index.html"> <img alt="Charisma Logo"
							src="img/logo20.png" /> <span>网络传播中心</span>
					</a>

					<!-- theme selector starts -->
					<div class="btn-group pull-right theme-container">
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
							<i class="icon-tint"></i><span class="hidden-phone">
								Change Theme / Skin</span> <span class="caret"></span> </a>
						<ul class="dropdown-menu" id="themes">
							<li>
								<a data-value="classic" href="#"><i class="icon-blank"></i>
									Classic</a>
							</li>
							<li>
								<a data-value="cerulean" href="#"><i class="icon-blank"></i>
									Cerulean</a>
							</li>
							<li>
								<a data-value="cyborg" href="#"><i class="icon-blank"></i>
									Cyborg</a>
							</li>
							<li>
								<a data-value="redy" href="#"><i class="icon-blank"></i>
									Redy</a>
							</li>
							<li>
								<a data-value="simplex" href="#"><i class="icon-blank"></i>
									Simplex</a>
							</li>
							<li>
								<a data-value="slate" href="#"><i class="icon-blank"></i>
									Slate</a>
							</li>
							<li>
								<a data-value="spacelab" href="#"><i class="icon-blank"></i>
									Spacelab</a>
							</li>
							<li>
								<a data-value="united" href="#"><i class="icon-blank"></i>
									United</a>
							</li>
						</ul>
					</div>
					<!-- theme selector ends -->

					<!-- user dropdown starts -->
					<div class="btn-group pull-right">
						<a class="brand" href="index.html"> <span>OASystem</span>
						</a>
					</div>
					<!-- user dropdown ends -->

					<div class="top-nav nav-collapse">
						<ul class="nav">
							<li>
								<a href="#"><font size="3"><%=request.getSession().getAttribute("zhiwu")%></font>
								</a>
							</li>
							<li>
								<a href="#"><font size="3"><%=request.getSession().getAttribute("name")%></font>
								</a>
							</li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>
		<!-- topbar ends -->
				<div class="container-fluid">
			<div class="row-fluid">

				<!-- left menu starts -->
				<div class="span2 main-menu-span">
					<div class="well nav-collapse sidebar-nav">
						<ul class="nav nav-tabs nav-stacked main-menu">
							<li class="nav-header hidden-tablet">
								导航栏
							</li>
							<li>
								<a class="ajax-link" href="../../index.jsp"><i class="icon-home"></i><span
									class="hidden-tablet">首页面</span>
								</a>
							</li>
		<%
		                     if(request.getSession().getAttribute("quanxian").equals("zuzhang")){
		%>
							<li>
								<a class="ajax-link" href="../../daohang/jixiao/bukaoqin.jsp"><i
									class="icon-edit"></i><span class="hidden-tablet"> 人员考勤</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/rencaiku/rencaikudown.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">
										人才信息库</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/jixiao/zujx.jsp"><i
									class="icon-th"></i><span class="hidden-tablet"> 绩效管理</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/wuzibaoxiu/baoxiu.jsp"><i
									class="icon-list-alt"></i><span class="hidden-tablet">
										物品报修</span>
								</a>
							</li>
		<%
							}
							if(request.getSession().getAttribute("quanxian").equals("superman")){
		%>
		                    <li>
								<a class="ajax-link" href="../../daohang/jixiao/kaoqinluru.jsp"><i
									class="icon-edit"></i><span class="hidden-tablet"> 人员考勤</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/wuzibaoxiu/superBaoxiu.jsp"><i
									class="icon-list-alt"></i><span class="hidden-tablet">
										物品报修</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/rencaiku/rencaiku.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">
										人才信息库</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/jixiao/gongzibiao.jsp"><i 
								class="icon-star"></i><span class="hidden-tablet"> 
								                 工资表</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/ziyuanshenqing/ziyuanliebiao.jsp"><i class="icon-star"></i><span
									class="hidden-tablet"> 资源管理</span>
								</a>
							</li>
		<%
							}
							if(request.getSession().getAttribute("quanxian").equals("zuyuan")||request.getSession().getAttribute("quanxian").equals("zuyuanxs")){
		%>
							 <li>
								<a class="ajax-link" href="../../daohang/jixiao/bukaoqin.jsp"><i
									class="icon-edit"></i><span class="hidden-tablet"> 人员考勤</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/wuzibaoxiu/baoxiu.jsp"><i
									class="icon-list-alt"></i><span class="hidden-tablet">
										物品报修</span>
								</a>
							</li>
		<%
							}
							if(request.getSession().getAttribute("quanxian").equals("zhuren")||request.getSession().getAttribute("quanxian").equals("fuzhuren")){
		%>
							<li>
								<a class="ajax-link" href="../../daohang/rencaiku/rencaikudown.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">
										人才信息库</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/jixiao/zhurenjixiao.jsp"><i
									class="icon-align-justify"></i><span class="hidden-tablet">
										绩效管理</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/wuzibaoxiu/baoxiu.jsp"><i
									class="icon-list-alt"></i><span class="hidden-tablet">
										物品报修</span>
								</a>
							</li>
		<%
							}
		%>
							<li>
								<a class="ajax-link" href="../../daohang/qingxiaojia/shouyemian.jsp"><i
									class="icon-eye-open"></i><span class="hidden-tablet">
										请销假</span>
								</a>
							</li>
							<li>
								<a class="ajax-link"
									href="../../daohang/ziyuanshenqing/shouyemian.jsp"><i
									class="icon-font"></i><span class="hidden-tablet">
										公共资源申请与审批</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/renyuanxinxi/huamingce.jsp"><i
									class="icon-calendar"></i><span class="hidden-tablet">
										花名册</span>
								</a>
							</li>
							<li>
								<a class="ajax-link"
									href="../../daohang/gerenzhongxin/gerenzhongxin.jsp"><i
									class="icon-folder-open"></i><span class="hidden-tablet">
										个人中心</span>
								</a>
							</li>
							<li>
								<a class="ajax-link" href="../../daohang/zhuxiao/zhuxiao.jsp"><i
									class="icon-globe"></i><span class="hidden-tablet"> 退出登录</span>
								</a>
							</li>
						</ul>
					</div>
					<!--/.well -->
				</div>
				<!--/span-->
				<!-- left menu ends -->

				<noscript>
					<div class="alert alert-block span10">
						<h4 class="alert-heading">
							Warning!
						</h4>
						<p>
							You need to have
							<a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>
							enabled to use this site.
						</p>
					</div>
				</noscript>

				<div id="content" class="span10">
					<!-- content starts -->


					<div>
						<ul class="breadcrumb">
							<li>
								<a href="#">Home</a>
								<span class="divider">/</span>
							</li>
							<li>
								<a href="#">个人中心</a>
							</li>
						</ul>
					</div>
					
				<!--主体-->
					<div class="row-fluid">
						<div class="box span12">
							<div class="box-header well">
								<h2>
									<i class="icon-info-sign"></i> 网络传播中心
								</h2>

								<div class="box-icon">
								<input type=button onclick="javascript:window.location.href='xiugaiziliao.jsp'" value="修改密码"><br>
								</div>
							</div>
							<div class="box-content">
							<table class="table table-striped table-bordered bootstrap-datatable datatable">
						      <thead>
							  <tr>
								    <th>姓名</th>
								    <th>入职时间</th>
								    <th>政治面貌</th>
								    <th>籍贯</th>
								    <th>毕业院校</th>
								    <th>专业</th>
								    <th>部门</th>
								    <th>职务</th>
							  </tr>
						  </thead>
			              <tbody>
  	
							<tr>
								<td class="center"> </td>
								<td class="center"> </td>
								<td class="center"> </td>
								<td class="center"> </td>
								<td class="center"> </td>
								<td class="center"> </td>
								<td class="center"> </td>
								<td class="center"> </td>
							</tr>
						  </tbody>
					  </table> 
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--/fluid-row-->

			<hr>
			<footer>
			<p class="pull-left">
				&copy;
				<a href="#" target="_blank">OASystem</a> 2016
			</p>
			<p class="pull-right">
				Powered by:
				<a href="http://usman.it/free-responsive-admin-template">网络传播中心</a>
			</p>
			</footer>
		</div>
		<!--/.fluid-container-->

		<!-- external javascript
	================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->

		<!-- jQuery -->
		<script src="js/jquery-1.7.2.min.js"></script>
		<!-- jQuery UI -->
		<script src="js/jquery-ui-1.8.21.custom.min.js"></script>
		<!-- transition / effect library -->
		<script src="js/bootstrap-transition.js"></script>
		<!-- alert enhancer library -->
		<script src="js/bootstrap-alert.js"></script>
		<!-- modal / dialog library -->
		<script src="js/bootstrap-modal.js"></script>
		<!-- custom dropdown library -->
		<script src="js/bootstrap-dropdown.js"></script>
		<!-- scrolspy library -->
		<script src="js/bootstrap-scrollspy.js"></script>
		<!-- library for creating tabs -->
		<script src="js/bootstrap-tab.js"></script>
		<!-- library for advanced tooltip -->
		<script src="js/bootstrap-tooltip.js"></script>
		<!-- popover effect library -->
		<script src="js/bootstrap-popover.js"></script>
		<!-- button enhancer library -->
		<script src="js/bootstrap-button.js"></script>
		<!-- accordion library (optional, not used in demo) -->
		<script src="js/bootstrap-collapse.js"></script>
		<!-- carousel slideshow library (optional, not used in demo) -->
		<script src="js/bootstrap-carousel.js"></script>
		<!-- autocomplete library -->
		<script src="js/bootstrap-typeahead.js"></script>
		<!-- tour library -->
		<script src="js/bootstrap-tour.js"></script>
		<!-- library for cookie management -->
		<script src="js/jquery.cookie.js"></script>
		<!-- calander plugin -->
		<script src='js/fullcalendar.min.js'></script>
		<!-- data table plugin -->
		<script src='js/jquery.dataTables.min.js'></script>

		<!-- chart libraries start -->
		<script src="js/excanvas.js"></script>
		<script src="js/jquery.flot.min.js"></script>
		<script src="js/jquery.flot.pie.min.js"></script>
		<script src="js/jquery.flot.stack.js"></script>
		<script src="js/jquery.flot.resize.min.js"></script>
		<!-- chart libraries end -->

		<!-- select or dropdown enhancer -->
		<script src="js/jquery.chosen.min.js"></script>
		<!-- checkbox, radio, and file input styler -->
		<script src="js/jquery.uniform.min.js"></script>
		<!-- plugin for gallery image view -->
		<script src="js/jquery.colorbox.min.js"></script>
		<!-- rich text editor library -->
		<script src="js/jquery.cleditor.min.js"></script>
		<!-- notification plugin -->
		<script src="js/jquery.noty.js"></script>
		<!-- file manager library -->
		<script src="js/jquery.elfinder.min.js"></script>
		<!-- star rating plugin -->
		<script src="js/jquery.raty.min.js"></script>
		<!-- for iOS style toggle switch -->
		<script src="js/jquery.iphone.toggle.js"></script>
		<!-- autogrowing textarea plugin -->
		<script src="js/jquery.autogrow-textarea.js"></script>
		<!-- multiple file upload plugin -->
		<script src="js/jquery.uploadify-3.1.min.js"></script>
		<!-- history.js for cross-browser state change on ajax -->
		<script src="js/jquery.history.js"></script>
		<!-- application script for Charisma demo -->
		<script src="js/charisma.js"></script>

  </body>
</html>
