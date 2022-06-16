<%--
  Created by IntelliJ IDEA.
  User: localadmin
  Date: 2022-06-16
  Time: 10:38 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <title>Person List</title>
</head>

<body>
<div id = 'all'>
    <table border="1">
        <thead>
        <tr>
            <th>Person ID</th>
            <th>Person Name</th>
        </tr>
        </thead>
    </table>
    <tbody>
    <g:each in="${person}" status="i" var="thisPerson">
    <tr>
        <th>${thisPerson.personId}</th>
        <th>${thisPerson.personName}</th>
    </tr>
    </g:each>
    </tbody>
    <g:form controller="submit" action="submitIndex">
        <input value="Submit again" type="submit"/>
    </g:form>
</div>

</body>
</html>