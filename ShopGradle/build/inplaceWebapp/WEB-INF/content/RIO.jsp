<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>RIO鸡尾酒</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet">

<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
<link href="css/css.css" type="text/css" rel="stylesheet">
<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
</head>
<body style="text-align:center;">
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span8">
			<h1 style="float:left";><font color="#FFCC33">RIO鸡尾酒</font></h1>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="image/R01.jpg" jqimg="image/R01.jpg" width=350>
	</div>
	<div id=spec-n5>
		<div class=control id=spec-left>
			<img src="image/left.gif" />
		</div>
		<div id=spec-list>
			<ul class=list-h>
				<li><img src="image/R01.jpg"> </li>
				<li><img src="image/R02.jpg"> </li>
				<li><img src="image/R03.jpg"> </li>
				<li><img src="image/R04.jpg"> </li>
				
				
			</ul>
		</div>
		<div class=control id=spec-right>
			<img src="image/right.gif" />
		</div>
		
    </div>
</div>
<SCRIPT type=text/javascript>
	$(function(){			
	   $(".jqzoom").jqueryzoom({
			xzoom:400,
			yzoom:400,
			offset:10,
			position:"right",
			preload:1,
			lens:1
		});
		$("#spec-list").jdMarquee({
			deriction:"left",
			width:350,
			height:56,
			step:2,
			speed:4,
			delay:10,
			control:true,
			_front:"#spec-right",
			_back:"#spec-left"
		});
		$("#spec-list img").bind("mouseover",function(){
			var src=$(this).attr("src");
			$("#spec-n1 img").eq(0).attr({
				src:src.replace("\/n5\/","\/n1\/"),
				jqimg:src.replace("\/n5\/","\/n0\/")
			});
			$(this).css({
				"border":"2px solid #ff6600",
				"padding":"1px"
			});
		}).bind("mouseout",function(){
			$(this).css({
				"border":"1px solid #ccc",
				"padding":"2px"
			});
		});				
	})
	</SCRIPT>

<SCRIPT src="js/lib.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/163css.js" type=text/javascript></SCRIPT>

		</div>
		
			<div class="col-md-12">
			<form action="addCart" method="post">
			 <a id="modal-746511" href="#modal-container-746511" role="button" class="btn" data-toggle="modal">加入购物车</a>
			</form>
			<div class="modal fade" id="modal-container-746511" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
								×
							</button>
							<h4 class="modal-title" id="myModalLabel">
								提示栏
							</h4>
						</div>
					
						<div class="modal-body">
							加入购物车成功
						</div>
						<div class="modal-footer">
							 
							<button type="button" class="btn btn-default" data-dismiss="modal">
								Close
							</button> 
							
						</div>
					</div>
					
				</div>
				
			</div>
			
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
 

	
	<div class="row-fluid">
		<div class="span12">
			<div class="tabbable" id="tabs-665433">
				<ul class="nav nav-tabs">
					<li class="active">
						<a rel="nofollow" href="#panel-365037" data-toggle="tab">累计评价</a>
					</li>
					<li>
						<a rel="nofollow" href="#panel-343705" data-toggle="tab">产品参数</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-365037">
						<p>
							累计评价
						</p>
					</div>
					<div class="tab-pane" id="panel-343705">
						<p>
							产品参数
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>