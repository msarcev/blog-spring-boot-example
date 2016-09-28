<%--
  Created by IntelliJ IDEA.
  User: Mario
  Date: 14.9.2015.
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	 <!-- start: CSS -->
        <style type="text/css"><%@ include file="/resources/css/bootstrap.css" %> </style>        
        <style type="text/css"><%@ include file="/resources/js/bootstrap.min.js" %> </style>
        <style type="text/css"><%@ include file="/resources/css/main.css" %> </style>
	<!--  /CSS -->
		<script src="//tinymce.cachefly.net/4.2/tinymce.min.js"></script>
    <title>Welcome Page</title>
</head>
<body>
  <jsp:include page ="/WEB-INF/templates/header.jsp" />
 ${user} - admin page 
<br>
<br>

 <form:form method="post" commandName="addPost" action="submitPost">
     <table>
         <tr>
         <td>Title</td>
         <td><form:input path="title" /></td>
     </tr>
         <tr>
             <td>Text</td>
             <td><form:textarea path="body" /></td>
         </tr>
         <tr>
         <tr>
             <td>&nbsp;</td>
             <td><input type="submit" value="Add Post" /><input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/></td>             
         </tr>
     </table>
 </form:form>
<br>
<a href="logout">Logout</a>
</body>

<script>tinymce.init({selector:'textarea'});</script>

</html>
