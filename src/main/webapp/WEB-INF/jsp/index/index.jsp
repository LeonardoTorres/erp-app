<%-- 
    Document   : index
    Created on : Oct 30, 2019, 7:48:13 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
    </head>
    <body>
        <p>Usuário logado: ${userSession.userName}</p>
        <p>
            <a href="auth/signout">
                Sair
            </a>
        </p>
    </body>
</html>
