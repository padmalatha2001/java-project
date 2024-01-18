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
    <form:form method="POST" action="/office/book" enctype="multipart/form-data" modelAttribute="book">
   
         <span th:text="${header}"/>
    <table>
       <tr>
        				<td>BookName</td>
        				<td><form:input type="text" path="bookName"></form:input></td>
        			</tr>
        			<tr>
        				<td>AuthorName</td>
        				<td><form:input type="text" path="authorName"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
   
    </table>
    </form:form>

</body>
</html>