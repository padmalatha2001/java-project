<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <body>
    <div>
    		<p>
    			<h1>Error Message</h1> <br>
    			<h3>${exception.getMessage()} </h3> <br>
    			<h3>${exception.getClass().getSimpleName()} </h3>
    		</p>
    	</div>
    </body>
</html>
