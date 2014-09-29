<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Say Hello</title>
        <link rel="stylesheet" type="text/css" href="css/login.css"/>
    </head>
    <body>
        <div id="m-center">
        	<div id="m-left">
        	
        	</div>
        	<div id="m-right">
        		<textarea id="m_textarea" class="comments" rows=1 name=s1 cols=27 onpropertychange= "this.style.posHeight=this.scrollHeight "></textarea>  
        	</div>
        </div>
        <div id="m-bottom">
        	<form action="SendMessage" method="post">
			  <input type="text" id="m_name" />
			  <input type="submit" value="发送" id="m_send" />
			</form>
        </div>
    </body>
</html>