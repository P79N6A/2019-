<%--
  Created by IntelliJ IDEA.
  User: say
  Date: 2019/3/12
  Time: 16:15
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
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/s/ajaxFileUpload.js"></script>
</head>
<script>
</script>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
       <h4> 欢迎</h4>
        <ul class="nav navbar-top-links navbar-right">
            <li>用户</li>
        </ul>
    </nav>
    <!--左侧导航开始-->
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
                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="ng-scope">用户管理</span>
                            <span class="fa arrow"></span>
                        </a>
                         <ul class="nav nav-second-level">
                        <li>
                            <a href="#">
                                <i class="fa fa fa-bar-chart-o"></i>
                                <span class="nav-label">品牌商管理</span>
                                <span class="fa arrow"></span>
                            </a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a class="J_menuItem" href="user_manager/user.html">品牌管理</a>
                                </li>
                                <li>
                                    <a class="J_menuItem" href="user_manager/role.html">企业管理</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                         <ul class="nav nav-second-level">
                        <li>
                            <a href="#">
                                <i class="fa fa fa-bar-chart-o"></i>
                                <span class="nav-label">分销商管理</span>
                                <span class="fa arrow"></span>
                            </a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a class="J_menuItem" href="user_manager/user.html">品牌管理</a>
                                </li>
                                <li>
                                    <a class="J_menuItem" href="user_manager/role.html">企业管理</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                         <ul class="nav nav-second-level">
                        <li>
                            <a href="#">
                                <i class="fa fa fa-bar-chart-o"></i>
                                <span class="nav-label">管理员管理</span>
                                <span class="fa arrow"></span>
                            </a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a class="J_menuItem" href="user-manager/user.html">管理员</a>
                                </li>
                            </ul>
                    </ul>
                         <ul class="nav nav-second-level">
                        <li>
                            <a href="#">
                                <i class="fa fa fa-bar-chart-o"></i>
                                <span class="nav-label">用户入驻管理</span>
                                <span class="fa arrow"></span>
                            </a>
                            <ul class="nav nav-second-level" >
                                <li>
                                    <a class="J_menuItem" href="user_manager/Verify_brand.html">品牌商入驻审核</a>
                                </li>
                                <li>
                                    <a class="J_menuItem" href="user_manager/user.html">分销商入驻审核</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    </li>

                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="ng-scope">商品管理</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a class="J_menuItem" href="user_manager/product_add.html">商品添加</a>
                            </li>
                        </ul>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">
                                    <i class="fa fa fa-bar-chart-o"></i>
                                    <span class="nav-label">商品修改</span>
                                </a>
                            </li>
                        </ul>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">
                                    <i class="fa fa fa-bar-chart-o"></i>
                                    <span class="nav-label">商品审核</span>
                                </a>
                            </li>
                        </ul>
                    </li>


                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="ng-scope">钱包管理</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">
                                    <i class="fa fa fa-bar-chart-o"></i>
                                    <span class="nav-label">钱包审核</span>
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a class="J_menuItem" href="user-manager/user.html">充值审核</a>
                                    </li>
                                    <li>
                                        <a class="J_menuItem" href="user-manager/role.html">提现审核</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">
                                    <i class="fa fa fa-bar-chart-o"></i>
                                    <span class="nav-label">用户钱包</span>
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a class="J_menuItem" href="user-manager/user.html">钱包明细</a>
                                    </li>

                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="ng-scope">个人资料</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">
                                    <i class="fa fa fa-bar-chart-o"></i>
                                    <span class="nav-label">账号信息</span>
                                </a>
                                <ul></ul>
                            </li>
                        </ul>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">
                                    <i class="fa fa fa-bar-chart-o"></i>
                                    <span class="nav-label">信息修改</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
    </nav>

    <!--左侧导航结束-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row wrapper border-bottom white-bg page-heading">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-info " href="#"><i class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" method="post" action="search_results.html">
                        <div class="form-group">
                            <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                        </div>
                    </form>
                </div>
            </nav>

            <div class="row J_mainContent" id="content-main">
                <p id="add" style="display: none"></p>
                <iframe id="J_iframe" width="100%" height="100%" ></iframe>
            </div>
                <%--<ul class="nav navbar-top-links navbar-right">--%>
                    <%--<li class="dropdown">--%>
                        <%--<a class="dropdown-toggle count-info" rows-toggle="dropdown" href="#">--%>
                            <%--<i class="fa fa-envelope"></i> <span class="label label-warning">16</span>--%>
                        <%--</a>--%>
                        <%--<ul class="dropdown-menu dropdown-messages">--%>
                            <%--<li class="m-t-xs">--%>
                                <%--<div class="dropdown-messages-box">--%>
                                    <%--<a href="profile.html" class="pull-left">--%>
                                        <%--<img alt="image" class="img-circle" src="img/a7.jpg">--%>
                                    <%--</a>--%>
                                    <%--<div class="media-body">--%>
                                        <%--<small class="pull-right">46小时前</small>--%>
                                        <%--<strong>小四</strong> 是不是只有我死了,你们才不骂爵迹--%>
                                        <%--<br>--%>
                                        <%--<small class="text-muted">3天前 2014.11.8</small>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</li>--%>
                            <%--<li class="divider"></li>--%>
                            <%--<li>--%>
                                <%--<div class="dropdown-messages-box">--%>
                                    <%--<a href="profile.html" class="pull-left">--%>
                                        <%--<img alt="image" class="img-circle" src="img/a4.jpg">--%>
                                    <%--</a>--%>
                                    <%--<div class="media-body ">--%>
                                        <%--<small class="pull-right text-navy">25小时前</small>--%>
                                        <%--<strong>二愣子</strong> 呵呵--%>
                                        <%--<br>--%>
                                        <%--<small class="text-muted">昨天</small>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</li>--%>
                            <%--<li class="divider"></li>--%>
                            <%--<li>--%>
                                <%--<div class="text-center link-block">--%>
                                    <%--<a class="J_menuItem" href="mailbox.html">--%>
                                        <%--<i class="fa fa-envelope"></i> <strong> 查看所有消息</strong>--%>
                                    <%--</a>--%>
                                <%--</div>--%>
                            <%--</li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                    <%--<li class="dropdown">--%>
                        <%--<a class="dropdown-toggle count-info" rows-toggle="dropdown" href="#">--%>
                            <%--<i class="fa fa-bell"></i> <span class="label label-primary">8</span>--%>
                        <%--</a>--%>
                        <%--<ul class="dropdown-menu dropdown-alerts">--%>
                            <%--<li>--%>
                                <%--<a href="mailbox.html">--%>
                                    <%--<div>--%>
                                        <%--<i class="fa fa-envelope fa-fw"></i> 您有16条未读消息--%>
                                        <%--<span class="pull-right text-muted small">4分钟前</span>--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li class="divider"></li>--%>
                            <%--<li>--%>
                                <%--<a href="profile.html">--%>
                                    <%--<div>--%>
                                        <%--<i class="fa fa-qq fa-fw"></i> 3条新回复--%>
                                        <%--<span class="pull-right text-muted small">12分钟钱</span>--%>
                                    <%--</div>--%>
                                <%--</a>--%>
                            <%--</li>--%>
                            <%--<li class="divider"></li>--%>
                            <%--<li>--%>
                                <%--<div class="text-center link-block">--%>
                                    <%--<a class="J_menuItem" href="notifications.html">--%>
                                        <%--<strong>查看所有 </strong>--%>
                                        <%--<i class="fa fa-angle-right"></i>--%>
                                    <%--</a>--%>
                                <%--</div>--%>
                            <%--</li>--%>
                        <%--</ul>--%>
                    <%--</li>--%>
                <%--</ul>--%>
            <%--</nav>--%>
        <%--</div>--%>
    </div>
</div>
    <!--右侧部分结束-->
    <!-- 自定义js -->


    <script src="js/content.js?v=1.0.0"></script>
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
    <script src="js/plugins/pace/pace.min.js"></script>

<script>
    $('#productAdd').click(function () {
        <%--document.getElementById("content-main").innerHTML('<jsp:include page="../user_manager/product_add.jsp" flush="true"/>');--%>
        var $test=$("#content-main");
        var s =" <jsp:include page= "welcome.jsp" flush= "true"/> ";
        $test.html(s).show;
    });
</script>
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
