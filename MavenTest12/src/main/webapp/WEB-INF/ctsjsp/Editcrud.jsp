<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <h1>Edit Employee</h1>
    <form:form action="/MavenTest12/editsave" method="get" >
    <table >
    <tr>
    <td></td>
     <td><form:hidden path="emp_eno" /></td>
     </tr>
     <tr>
     <td>emp_eno : </td>
     <td><form:input path="emp_eno" /></td>
     </tr>
     <tr>
     <td>emp_name : </td>
     <td><form:input path="emp_name" /></td>
     </tr>
     <tr>
     <td>salary :</td>
     <td><form:input path="salary" /></td>
     </tr>
     <td> </td>
     <td><input type="submit" value="Edit Save" /></td>
     </tr>
    </table>
    </form:form>   
