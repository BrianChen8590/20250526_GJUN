<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="
    service.impl.MemberServiceImpl,
    java.util.List,
    entity.Member"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=500 align=center border=1>
		<tr>
			<td>id
			<td>名
			<td>帳號
			<td>密碼
			<td>地址
			<td>電話 <%=new MemberServiceImpl().selectAllMemberTable()%>
		<tr>
			<td colspan=6 align=center><a href="member.jsp">回管理頁</a>
	</table>
</body>
</html>