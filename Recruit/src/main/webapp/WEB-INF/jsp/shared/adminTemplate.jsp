<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <link href="../static/assets/css/bootstrap.css" rel="stylesheet" />
    <link href="../static/assets/css/font-awesome.css" rel="stylesheet" />
    <link href="../static/assets/css/basic.css" rel="stylesheet" />
    <link href="../static/assets/css/custom.css" rel="stylesheet" />
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <script src="../static/vendor/jquery/jquery.js"></script>
    <script src="../static/assets/js/bootstrap.js"></script>
    <script src="../static/assets/js/jquery.metisMenu.js"></script>
    <script src="../static/assets/js/custom.js"></script>
    <script src="../static/vendor/datatables/jquery.dataTables.js"></script>
	<script src="../static/vendor/datatables/dataTables.bootstrap.js"></script> 
	<script src="../static/vendor/jquery-validate/jquery.validate.js"></script> 
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html" style="font-size:30px;">后台管理</a>
            </div>
            <div class="header-right">
                <a href="login.html" class="btn btn-danger" title="Logout"><i class="fa fa-exclamation-circle fa-2x"></i></a>
            </div>
        </nav>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <div class="user-img-div">
                            <div class="inner-text">
                           	 <h2>欢迎您，管理员</h2>
                             <span>qqqqqqqqq</span>
                            </div>
                        </div>
                    </li>
                    <li>
                        <a class="active-menu" href="index"><i class="fa fa-dashboard"></i>首页</a>
                    </li>
                    <li>
                        <a href="category"><i class="fa fa-square-o"></i>分类管理</a>
                    </li>
                    <li>
                        <a href=""><i class="fa fa-circle-o"></i>用户管理</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop "></i>招聘信息管理<span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="recruit"><i class="fa fa-toggle-on"></i>招聘信息查询</a>
                            </li>
                            <li>
                                <a href="record"><i class="fa fa-bell"></i>招聘记录查询</a>
                            </li>
                             <li>
                                <a href="progress.html"><i class="fa fa-circle-o"></i>Progressbars</a>
                            </li>
                             <li>
                                <a href="buttons.html"><i class="fa fa-code"></i>Buttons</a>
                            </li>
                             <li>
                                <a href="icons.html"><i class="fa fa-bug"></i>Icons</a>
                            </li>
                             <li>
                                <a href="wizard.html"><i class="fa fa-bug"></i>Wizard</a>
                            </li>
                             <li>
                                <a href="typography.html"><i class="fa fa-edit"></i>Typography</a>
                            </li>
                             <li>
                                <a href="grid.html"><i class="fa fa-eyedropper"></i>Grid</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div id="page-wrapper">
            <div id="page-inner">
				<tiles:insertAttribute name="main"/>
        	</div>
        </div>
    </div>
    <!-- /. WRAPPER  -->

    <div id="footer-sec">
        Copyright &copy; 2016.Company name All rights reserved.More Templates - Collect from 
    </div>
</body>
</html>