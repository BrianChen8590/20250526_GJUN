<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>delete</h3>
<form action="/member/deleteMember" method="post">
id:<input type="text" name="id">

<input type="submit" value="ok">
</form>
<a href="/member/loginSuccess">上一頁</a>
</body>
</html>