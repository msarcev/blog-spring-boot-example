<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	 <!-- start: CSS -->
        <style type="text/css"><%@ include file="/resources/css/bootstrap.css" %> </style>        
        <style type="text/css"><%@ include file="/resources/js/bootstrap.min.js" %> </style>
        <style type="text/css"><%@ include file="/resources/css/main.css" %> </style>
	<!--  /CSS -->
<title>laflog</title>
</head>
  <body>  
  	<jsp:include page ="/WEB-INF/templates/header.jsp" />
    <div class="mainContainerHome">
    <jsp:include page ="/WEB-INF/templates/showPosts.jsp" />    
    </div>
  </body>
</html>