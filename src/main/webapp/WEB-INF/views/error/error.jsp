<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>probono</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="<%=request.getContextPath() %>/resources/images/fevicon.png" type="<%=request.getContextPath() %>/resources/image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
   </head>
   <!-- body -->
   <body class="main-layout">
      <!-- header -->
      <header>
         <!-- header inner -->
         <div class="header">
            <div class="white_bg">
               <div class="container-fluid">
                  <div class="row">
                     <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                        <div class="full">
                           <div class="center-desk">
                              <div class="logo">
                                 <a href="index.jsp"><img src="<%=request.getContextPath() %>/resources/images/logo.png" alt="#" /></a>
                              </div>
                           </div>
                        </div>
                     </div>
                     <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                        <nav class="navigation navbar navbar-expand-md navbar-dark ">
                           <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                           <span class="navbar-toggler-icon"></span>
                           </button>
                           <div class="collapse navbar-collapse" id="navbarsExample04">
                              <ul class="navbar-nav mr-auto">
                                 <li class="nav-item">
                                    <a class="nav-link" href="<%=request.getContextPath()%>"> 홈  </a>
                                 </li>
                                 <li class="nav-item">
                                    <a class="nav-link" href="#">계좌조회</a>
                                 </li>
                                 <li class="nav-item">
                                    <a class="nav-link" href="#">이체 </a>
                                 </li>
                              
                                 <li class="nav-item d_none le_co">
                                    <a class="nav-link" href="#"data-toggle="modal" data-target="#modalSubscriptionForm"><i  class="fa fa-user" aria-hidden="true"></i> Login</a>
                                 </li>
                                 <li class="nav-item d_none le_co">
                                    <a class="nav-link" href="#"><i  class="fa fa-search" aria-hidden="true"></i></a>
                                 </li>
                              </ul>
                           </div>
                        </nav>
                     </div>
                  </div>
               </div>
               <!-- end header inner -->
               <!-- end header -->
               <!-- banner -->
               <section class="banner_main">
                  <div id="banner1" class="carousel slide" data-ride="carousel">
                     <ol class="carousel-indicators">
                        <li data-target="#banner1" data-slide-to="0" class="active"></li>
                     </ol>
                     <div class="carousel-inner">
                        <div class="carousel-item active">
                           <div class="container-fluid">
                              <div class="carousel-caption">
                                 <div class="row">
                                    <div class="col-md-12 col-lg-7">
                                       <div class="text-bg">
                                          <span>Error log</span>
                                          <h1>${error }</h1>
                                          <p> </p>
                                       </div>
                                    </div>
                                    <div class="col-md-12 col-lg-5">
                                       <div class="text_img">
                                          <figure><img src="<%=request.getContextPath() %>/resources/images/ban_img.png" alt="#"/></figure>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                        
                     </div>
                  </div>
               </section>
            </div>
         </div>
      </header>
     
      <script src="<%=request.getContextPath() %>/resources/js/jquery.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/js/popper.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/js/bootstrap.bundle.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/js/jquery-3.0.0.min.js"></script>
      <!-- sidebar -->
      <script src="<%=request.getContextPath() %>/resources/js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/js/custom.js"></script>
   </body>
</html>

