<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="products.TV" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"> 
<style>
body {
  background-image: url("https://static.vecteezy.com/system/resources/previews/003/840/500/large_2x/3d-virtual-tv-studio-news-backdrop-for-tv-shows-tv-on-wall-3d-virtual-news-studio-background-free-photo.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<br>
<br>

<div class="container">
  <div class="row align-items-start">
<c:set var="matrixLength" value="3"/>
<c:forEach items="${tvs}" var="tv" varStatus="loopStatus">
<c:if test="${(loopStatus.index % matrixLength) == 0 && (loopStatus.index != 0) }">
<br>
</c:if>
    <div class="col">
      <div class="card" style="width: 18rem;">
  <img class="card-img-top" src=${tv.image}>
  <p class="card-text">Price:${tv.price }</p>
  <div class="card-body">
  <a href="#" class="btn btn-primary">${tv.productName}</a>
  </div>
  
</div><br>
    </div>
   
   
</c:forEach>
</div>
</div>

</body>
</html>