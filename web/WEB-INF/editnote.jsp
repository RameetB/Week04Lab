<%-- 
    Document   : editnote
    Created on : 2-Oct-2020, 7:04:19 PM
    Author     : 814992
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Simple Note Keeper</title>
        <script> function save() {
            
        }
        </script>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>edit Note</h2>
        <form action="note" method="post">
            Title: <input name="title" type="text" placeholder="Title goes here." value="${note.title}"> <br><br>

            Contents: <br>
            <input name="content" type="text" placeholder="Contents go here." value="${note.content}">
            <br>
            <input type="submit" value="save">
        </form><br><br>
    </body>
</html>
