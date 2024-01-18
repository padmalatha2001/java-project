<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form method="POST" action="/springmvc/save" modelAttribute="domain">
   
         <span th:text="${header}"/>
    <table>
       <tr>
        				<td>Name</td>
        				<td><form:input type="text" path="name"></form:input></td>
        			</tr>
        			<tr>
        				<td>Employee-Count</td>
        				<td><form:input type="text" path="employee_count"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
   
    </table>
    </form:form>
</body>
</html>