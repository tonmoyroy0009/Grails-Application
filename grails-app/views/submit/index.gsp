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
<div>
    <table border="1">
        <thead>
        <tr>
            <th>Person Name</th>
            <th>Mobile</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${persons}" status="i" var="thisPerson">
            <tr>
                <th>${thisPerson.personName}</th>
                <th>${thisPerson.mobileNo}</th>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>
<br></br>
<button onclick="window.location.href='/submit/submitIndex'">Go to submit page</button>
</body>
</html>