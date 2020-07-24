<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Food items
</h1>
<%
List result= (List) request.getAttribute("items");
Iterator it = result.iterator();
out.println();
while(it.hasNext()){
out.println(it.next());
}
%>
</body>
</html>