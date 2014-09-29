<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body>
<div id="center">
	<s:form action="Login" method="POST">
	    <s:textfield name="name" label="用户"/>
	    <s:password name="password" label="密码"/>
	    <s:submit />
	</s:form>
</div>

</body>
</html>