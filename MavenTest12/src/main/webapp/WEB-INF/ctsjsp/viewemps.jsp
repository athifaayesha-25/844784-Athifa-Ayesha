<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<h1>Employees List</h1>
<table border="3" width="20%">
<tr><th>emp_eno</th><th>emp_name</th><th>salary</th></tr>
<c:forEach var="emp11" items="${emplist}">
<tr>
<td>${emp11.emp_eno}</td>
<td>${emp11.emp_name}</td>
<td>${emp11.salary}</td>
</c:forEach>
</table> 
<td><a href="editemp/${emp.id}">Edit</a></td>
<td><a href="deleteemp/${emp.eno}">Delete</a></td> 