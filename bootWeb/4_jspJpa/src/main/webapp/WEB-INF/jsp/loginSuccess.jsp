<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
${M.name} 登入成功<br>

<a href="/member/query">1)查詢</a><br>
<a href="/member/update">2)修改</a><br>
<a href="/member/delete">3)刪除</a><br>
</body>
</html>