<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>酒水乳饮</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	
		<div class="col-md-12">
			<div class="row">
		
			 <table class="table table-hover" >
                <td width="200px" class="thtd">商品图片</td>
                <td class="thtd">商品编号</td>
                <td class="thtd">商品名称</td>
                <td class="thtd">商品详情</td> 
                <td class="thtd">商品价格</td>
                <td class="thtd">商品数量</td>
                <td class="thtd">加入购物车</td>
                <td class="thtd">商品购买</td>
                <td class="thtd">收藏商品</td>
            
            <c:forEach items="${requestScope.goods_list}" var="goods">      
            <tr>
                <td><img src="image/${goods.image }"></td>
                <td>${goods.id}</td>
                <td>${goods.goods_name}</td> 
                
                <td><font color="red"><a href="${goods.remark}">商品详情</a></font></td>
                <td>${goods.goods_price}</td>
                <td>${goods.amount}</td>
                
                         
               	
			<td><a class="btn btn-info" href="addcart?goods_id=${goods.id}" role="button">购物车</a></td> 
			 
			 
                <td><a class="btn btn-info" href="saveorder?goods_id=${goods.id}" role="button">购买</a></td> 
                <td><a class="btn btn-danger" href="savecollect?goods_id=${goods.id}" role="button">收藏</a></td> 
            </tr>
            </c:forEach>
        </table>
			
			</div>
		</div>

	</div>



    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>