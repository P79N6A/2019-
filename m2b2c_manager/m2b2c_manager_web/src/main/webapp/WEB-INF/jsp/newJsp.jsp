<%--
  Created by IntelliJ IDEA.
  User: say
  Date: 2019/3/13
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title>m2b2c商城后台管理系统</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/s/ajaxFileUpload.js"></script>
</head>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">

<div>
    <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
        <h4> 欢迎</h4>
        <ul class="nav navbar-top-links navbar-right">
            <li>用户</li>
        </ul>
    </nav>
</div>

<div class="col-sm-6">
    <div class="tabs-container">
        <ul class="nav nav-tabs">
            <li class="active"><a rows-toggle="tab" href="#tab-1" aria-expanded="true"> 第一个选项卡</a>
            </li>
            <li class=""><a rows-toggle="tab" href="#tab-2" aria-expanded="false">第二个选项卡</a>
            </li>
        </ul>
        <div class="tab-content">
            <div id="tab-1" class="tab-pane active">
                <div class="panel-body">
                    <strong>HTML5 文档类型</strong>
                    <nav class="navbar-default navbar-static-side" role="navigation">
                        <div class="nav-close"><i class="fa fa-times-circle"></i>
                        </div>
                        <div class="sidebar-collapse">
                            <ul class="nav" id="side-menu">
                                <li class="nav-header">
                                    <div class="dropdown profile-element">
                                        <a rows-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                                    <span class="block m-t-xs" style="font-size:20px;">
                                        <i class="fa fa-area-chart"></i>
                                        <strong class="font-bold">后台管理系统</strong>
                                    </span>
                              </span>
                                        </a>
                                    </div>
                                    <div class="logo-element">后台管理系统
                                    </div>
                                </li>
                                <li>
                                    <a class="J_menuItem" href="welcome.html">
                                        <i class="fa fa-home"></i>
                                        <span class="nav-label">首页</span>
                                    </a>
                                </li>
                                <li class="line dk"></li>
                                <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                                    <span class="ng-scope">品牌商管理</span>
                                </li>
                                <li ><a class="J_menuItem" href="/user_manager/brand.html">
                                    <span class="nav-label">品牌管理</span>
                                </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="nav-label">企业管理</span>
                                    </a>

                                </li>


                                <li class="line dk"></li>
                                <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                                    <span class="ng-scope">分销商管理</span>
                                </li>
                                <li>
                                    <a href="">
                                        <span class="nav-label">品牌管理</span>
                                    </a>

                                </li>
                                <li>
                                    <a href="#">
                                        <span class="nav-label">企业管理</span>
                                    </a>

                                </li>
                                <li class="line dk"></li>

                                <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                                    <span class="ng-scope">管理员管理</span>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa fa-bar-chart-o"></i>
                                        <span class="nav-label">管理员</span>
                                    </a>

                                </li>
                                <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                                    <span class="ng-scope">用户入驻审核</span>
                                </li>
                                <li>
                                    <a href="#">

                                        <span class="nav-label">品牌商审核</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="nav-label">分销商审核</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
            <div id="tab-2" class="tab-pane">
                <div class="panel-body">
                    <strong>移动设备优先</strong>
                    <p>在 Bootstrap 2 中，我们对框架中的某些关键部分增加了对移动设备友好的样式。而在 Bootstrap 3 中，我们重写了整个框架，使其一开始就是对移动设备友好的。这次不是简单的增加一些可选的针对移动设备的样式，而是直接融合进了框架的内核中。也就是说，Bootstrap 是移动设备优先的。针对移动设备的样式融合进了框架的每个角落，而不是增加一个额外的文件。</p>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 自定义js -->
<%--<script src="js/content.js?v=1.0.0"></script>--%>
<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="js/plugins/layer/layer.min.js"></script>
<!-- 自定义js -->
<script src="js/hAdmin.js?v=4.1.0"></script>
<%--<script type="text/javascript" src="js/index.js"></script>--%>
<!-- 第三方插件 -->
<%--<script src="js/plugins/pace/pace.min.js"></script>--%>
<script>
    $(function(){
        //菜单点击
        J_iframe
        $(".J_menuItem").on('click',function(){
            var url = $(this).attr('href');
            $("#J_iframe").attr('src',url);
            return false;
        });
    });
</script>
</body>
</html>
