<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta charset=UTF-8">
<meta name="viewport" content="width=device-width">
<title><sitemesh:write property="title" /></title>
<sitemesh:write property="head" />
</head>
<body>
	<p>
		Default Decorator
	</p>
	<sitemesh:write property="body" />
	<p>
		Footer
	</p>
</body>
</html>