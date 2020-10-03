<%-- 
    Document   : viewnote
    Created on : 2-Oct-2020, 7:04:08 PM
    Author     : 814992
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note - Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form>
            Title: <input name="title" type="text" placeholder="Title goes here."> <br><br>
            
            Contents: <br>
            <input name="content" type="text" placeholder="Contents go here.">
        </form><br><br>
        <a href="note?edit">Edit</a>
    </body>
</html>
