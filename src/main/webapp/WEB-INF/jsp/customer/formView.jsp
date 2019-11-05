<%-- 
    Document   : formView
    Created on : Oct 28, 2019, 7:44:19 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="save" method="post">
            <div>
                <label>Nome</label>
                <input type="text" name="customer.name"/>
            </div>
            <div>
                <label>CPF</label>
                <input type="text" name="customer.cpf"/>
            </div>
            <div>
                <label>Rua</label>
                <input type="text" name="customer.address.street"/>
            </div>
            <div>
                <label>Cidade</label>
                <select name="customer.address.city">
                    <c:forEach items="${citiesList}" var="city">
                        <option value="${city}">${city}</option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <button type="submit">Salvar</button>
            </div>
        </form>
        <div>
            <p>${msgSuccess}</p>
        </div>
    </body>
</html>
