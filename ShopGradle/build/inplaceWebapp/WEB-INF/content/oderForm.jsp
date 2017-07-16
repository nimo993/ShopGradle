<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交订单</title>
</head>
<body>

</body>
<div class="container-fluid " id="order">
	<div class="row">
		<div class="col-md-8">
			<form class="form-horizontal" role="form" action="saveorder" method="post">
				<div class="form-group">
				 
					<label for="inputPassword3" class="col-sm-2 control-label">
						${sessionScope.user.username },您好!您的收货地址是:
					</label>
					<div class="col-sm-10">
						<input type="text" name="address" class="form-control" id="address">
					</div>	 
					
				</div>
				<div class="form-group">
					 
					<table class="table table-hover">
                
                <tr>
			<th class="thtd">商品图片</th>
			
			<th class="thtd">商品名称</th>
			<th class="thtd">商品价格</th>
			<th class="thtd">商品数量</th>
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
        <button>提交订单</button>
				</div>
				</form>
				</div>
				</div>
				</div>
				