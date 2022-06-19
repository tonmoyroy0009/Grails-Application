<%--
  Created by IntelliJ IDEA.
  User: localadmin
  Date: 2022-06-16
  Time: 10:30 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Address Book</title>
</head>

<body>

<div>
    <h2>Address Book</h2>

    <g:form controller="Submit"  action="postMethod">
        Person Name:
        <g:textField name="personName" maxlength="100"></g:textField>
        <br>
        <br>
        Person Mobile:
        <g:textField name="mobileNo" maxlength="100"></g:textField>
        <br>
        <br>
        Address:
        <g:textField name="address" maxlength="100"></g:textField>
        <br>
        <br>
        <input type="submit" value="Submit">
    </g:form>
</div>

</body>
</html>