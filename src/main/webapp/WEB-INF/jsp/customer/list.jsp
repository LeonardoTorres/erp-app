<%-- 
    Document   : list
    Created on : Oct 30, 2019, 7:33:01 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Clientes</h1>
        <table>
            <tr>
                <th>Nome</th>
                <th>CPF</th>
                <th>Rua</th>
                <th>Cidade</th>
                <th>Ações</th>
            </tr>
            <c:forEach items="${customerList}" var="customer" >
                <tr>
                    <td>${customer.name}</td>
                    <td>${customer.cpf}</td>
                    <td>${customer.address.street}</td>
                    <td>${customer.address.city}</td>
                    <td>
                        <a href="">Detalhar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
