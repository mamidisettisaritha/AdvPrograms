<%@page import="com.sathya.servlet.ProductDao"
import="java.util.Base64" %>
 <%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Product List</title>
 <!-- BootStrap CDN link to Get the Support of Bootstrap -->
<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.0/dist/css/bootstrap.min.css">
 
</head>
<body>
<h1 class="text-success text center">List of Available Products</h1>
<a href="add-product.html" class="btn btn-success" class="text-success text-italic">Save Product</a>
<br>
<input type="text" placeholder="search">
<br>
<c:if test="${saveResult==1 }">
<h2 class="text-success text-center" >Data inserted succesfully...</h2>
</c:if>
<c:if test="${deleteResult==1 }">
<h2 class="text-danger text-center" >Data Deleted succesfully....</h2>
</c:if>
<c:if test="${deleteResult==0 }">
<h2 class="text-danger text-center" >Data deletion Fail...</h2>
</c:if>
<table class="table table-bordered table-striped">
<thead class="thead-dark">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Price</th>
		<th>Product Brand</th>
		<th>Product MadeIn</th>
		<th>Product Manufacturing Date</th>
		<th>Product Expiry Date</th>
		<th>Product Image</th>
		<th>Actions</th>
	</tr>
</thead>
<tbody>
	<c:forEach   ar="product"  items="<%=new ProductDao().findAll() %>">
		<tr>
			<td>${product.proId}</td>
			<td>${product.proName}</td>
			<td>${product.proPrice}</td>
			<td>${product.proBrand}</td>
			<td>${product.proMadeIn}</td>
			<td>${product.proMfgDate}</td>
			<td>${product.proExpDate}</td>
			<td> <img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="Product Image" style="max-width:100px; max-height:100px;">
			</td>
			<td>
			<a class ="btn btn-primary" href="./DeleteProductServlet?proId=${product.proId }">Delete</a>
			</td>
		</tr>
	</c:forEach>
			
</tbody>
</table>
</body>
</html>