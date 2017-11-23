<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="my" uri="/WEB-INF/mytag.tld" %>
<%@ taglib prefix="hoge" uri="/WEB-INF/myhogetag.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<my:MyTag/>
<hoge:MyHogeTag/>
<form method="POST" action="./MainServlet">
	<input type="submit" value="送信">
</form>
</body>
</html>