<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title><g:message code="default.title.500" default="IBCS Reporting Tool | 500 Error"/></title>
    <!-- favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="${resource(dir: "resources/images", file: "favicon.ico")}"/>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" type="text/css"
          href="${resource(dir: "resources/plugins/bootstrap/css", file: "bootstrap.min.css")}">
    <!-- Font Awesome -->
    <link rel="stylesheet" type="text/css"
          href="${resource(dir: "resources/plugins/font-awesome/css", file: "font-awesome.min.css")}">
    <!-- Ionicons -->
    <link rel="stylesheet" type="text/css"
          href="${resource(dir: "resources/plugins/ionicons/css", file: "ionicons.min.css")}">
    <!-- Theme style -->
    <link rel="stylesheet" type="text/css"
          href="${resource(dir: "resources/plugins/admin-lte/css", file: "AdminLTE.min.css")}">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" type="text/css"
          href="${resource(dir: "resources/plugins/admin-lte/css/skins", file: "_all-skins.min.css")}">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <g:render template="/layouts/headerWithMenuLeft"/>

    <!-- Left side column. contains the logo and sidebar -->
    <g:render template="/layouts/sideBarLeft"/>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>500 Error Page</h1>
            <ol class="breadcrumb">
                <li><a href="${request.contextPath}/"><i class="fa fa-dashboard"></i> Home</a></li>
                %{--<li><a href="#">Examples</a></li>--}%
                <li class="active">500 error</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="error-page">
                <h2 class="headline text-red">500</h2>

                <div class="error-content">
                    <h3><i class="fa fa-warning text-red"></i> Oops! Something went wrong.</h3>

                    <p>
                        We will work on fixing that right away.
                        Meanwhile, you may <a
                            href="${request.contextPath}/sample/index.gsp">return to dashboard</a> or try using the search form.
                    </p>

                    <form class="search-form">
                        <div class="input-group">
                            <input type="text" name="search" class="form-control" placeholder="Search">

                            <div class="input-group-btn">
                                <button type="submit" name="submit" class="btn btn-danger btn-flat"><i
                                        class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                        <!-- /.input-group -->
                    </form>
                </div>
            </div>
            <!-- /.error-page -->

        </section>
        <!-- /.content -->
    </div>

    <!-- Control Sidebar -->
    <g:render template="/layouts/sideBarRight"/>

    %{--Main Footer--}%
    <g:render template="/layouts/footer"/>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.0 -->
<script type="text/javascript" src="${resource(dir: "resources/plugins/jQuery", file: "jquery.min.js")}"></script>
<!-- Bootstrap 3.3.6 -->
<script type="text/javascript"
        src="${resource(dir: "resources/plugins/bootstrap/js", file: "bootstrap.min.js")}"></script>
<!-- FastClick -->
<script type="text/javascript" src="${resource(dir: "resources/plugins/fastclick", file: "fastclick.js")}"></script>
<!-- AdminLTE App -->
<script type="text/javascript" src="${resource(dir: "resources/plugins/admin-lte/js", file: "app.min.js")}"></script>
<!-- AdminLTE for demo purposes -->
<script type="text/javascript" src="${resource(dir: "resources/plugins/admin-lte/js", file: "config.js")}"></script>
</body>
</html>
