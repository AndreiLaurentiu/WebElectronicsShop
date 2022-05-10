<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
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

<div class="card">
<article class="card-body">
<a href="SignUp.jsp" class="float-right btn btn-outline-primary">Sign up</a>
<h4 class="card-title mb-4 mt-1">Sign in</h4>
	 <form action="Login">
    <div class="form-group">
    	<label>Your username</label>
        <input name="Username" class="form-control" placeholder="Username" type="text">
    </div> <!-- form-group// -->
    <div class="form-group">
    	<a class="float-right" href="#">Forgot?</a>
    	<label>Your password</label>
        <input name="Password" class="form-control" placeholder="******" type="password">
    </div> <!-- form-group// --> 
    <div class="form-group"> 
    <div class="checkbox">
      <label> <input type="checkbox"> Save password </label>
    </div> <!-- checkbox .// -->
    </div> <!-- form-group// -->  
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Login  </button>
    </div> <!-- form-group// -->                                                           
</form>
</article>
</div> <!-- card.// -->
</body>
</html>