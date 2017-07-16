<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>好吃吧  </title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="#">首页</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						
						<li>
							<a href="#">推荐</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">分类<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="drinking">酒水乳饮</a>
								</li>
								<li>
									<a href="fruits">生鲜水果</a>
								</li>
								<li>
									<a href="administerForm">休闲零食</a>
								</li>
								
								
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control">
						</div> 
						<button type="submit" class="btn btn-default">
							Submit
						</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="loginForm">退出登录</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">我的<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="cart">购物车</a>
								</li>
								<li>
									<a href="UpdatePasForm">修改密码</a>
								</li>
								<li>
									<a href="order">我的订单</a>
								</li>
								<li>
									<a href="collect">我的收藏</a>
								</li>
								
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
			 <div class="container-fluid">
			 当前在线人数为：${applicationScope.count}人
			 </div>
			<div class="carousel slide" id="carousel-473706">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-473706">
					</li>
					<li data-slide-to="1" data-target="#carousel-473706">
					</li>
					<li data-slide-to="2" data-target="#carousel-473706">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="水果" src="image/水果.jpg">
						<div class="carousel-caption">
							<h4>
								Fresh Every Day
							</h4>
							<p>
								多吃水果，身体棒棒！
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="零食" src="image/零食.jpg">
						<div class="carousel-caption">
							<h4>
								Snake
							</h4>
							<p>
								最享受的事，莫过于边看电视边吃零食啦
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="牛奶" src="image/牛奶.jpg">
						<div class="carousel-caption">
							<h4>
								Milk
							</h4>
							<p>
								不是所有的牛奶都叫特仑苏
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-473706" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-473706" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		</div>
	</div>
</div>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/" />
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
				<dt>
					Euismod
				</dt>
				<dd>
					Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
				</dd>
				<dd>
					Donec id elit non mi porta gravida at eget metus.
				</dd>
				<dt>
					Malesuada porta
				</dt>
				<dd>
					Etiam porta sem malesuada magna mollis euismod.
				</dd>
				<dt>
					Felis euismod semper eget lacinia
				</dt>
				<dd>
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
				</dd>
			</dl>
		</div>
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/" />
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
				<dt>
					Euismod
				</dt>
				<dd>
					Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
				</dd>
				<dd>
					Donec id elit non mi porta gravida at eget metus.
				</dd>
				<dt>
					Malesuada porta
				</dt>
				<dd>
					Etiam porta sem malesuada magna mollis euismod.
				</dd>
				<dt>
					Felis euismod semper eget lacinia
				</dt>
				<dd>
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
				</dd>
			</dl>
		</div>
		<div class="col-md-4">
			<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/" />
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
				<dt>
					Euismod
				</dt>
				<dd>
					Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
				</dd>
				<dd>
					Donec id elit non mi porta gravida at eget metus.
				</dd>
				<dt>
					Malesuada porta
				</dt>
				<dd>
					Etiam porta sem malesuada magna mollis euismod.
				</dd>
				<dt>
					Felis euismod semper eget lacinia
				</dt>
				<dd>
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
				</dd>
			</dl>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>