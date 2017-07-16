<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
<meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <style>
.thtd{
        color:coral;
        font-family:华文细黑;
        font-size: 16px;
        padding: 5px 15px;
        }
        table {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px solid #888;
	border-top: 1px solid #888;
	background: #efefef;
}
th, td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	padding: 5px 15px;
}

th {
	font-weight: bold;
	background: #ccc;
}
    </style>
</head>
<body>
<div class="container-fluid ">
 <div style="width:80%;margin:auto auto;">
         <h1>${sessionScope.user.username}：订单.<a class="btn btn-primary" href="mainshop" role="button">继续购物</a>
          </h1>
         <br>
         <table class="table table-hover">
                
                <tr>
			<th class="thtd">商品图片</th>
			
			<th class="thtd">商品名称</th>
			<th class="thtd">商品价格</th>
			<th class="thtd">商品数量</th>
			<th class="thtd">我的收货地址</th>
			
			<th class="thtd"><font color="blue">确认收货</font></th>
			
			<th class="thtd"><font color="red">删除</font></th>
		    </tr>		    
           <c:forEach items="${requestScope.order_list }" var="order">
		   <c:forEach items="${order.goods }" var="goods">
			<tr>
				<td><img src="image/${goods.image}"></td>			
				<td>${goods.goods_name}</td>
				<td>${goods.goods_price}</td>
				<td>${order.count}</td>
				<td>${sessionScope.user.address}</td>
			<td>
			<a class="btn btn-info" href="buy?goods_id=${goods.id}" role="button">确认收货</a>
		    </td>
		    <td>
			<a class="btn btn-danger" href="removeorder?goods_id=${goods.id}" role="button">删除</a>
		    </td>
		  </tr>
		</c:forEach>		
		</c:forEach>		
        </table>
     </div>
 </div>
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>