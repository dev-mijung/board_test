<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<style type="text/css">
*{font-family: Malgun Gothic; font-size: 26px; color: #555555;}

table{
	border: solid 1px #555555; 
	border-collapse: collapse;
}

th{
	border: solid 1px #777777;
}

td{
	border: solid 1px #777777;
}
</style>
</head>
<body>
	<form name='frm' method='POST' action='./create.do'>
	글쓴이 : <input type='text' name='board_member' size=20 maxlength=20 required='required'>
	비밀번호 : <input type='password' name='board_passwd' size=20 maxlength=20 required='required'> <br>
	제목 : <input type='text' name='board_title' size=50 maxlength=70 required='required'> <br>
	내용 : <textarea name='board_content' cols=50 rows='6' required='required'>
	</textarea> <br>
	
	<button type='submit'>등록하기</button>
	
	</form>
</body>
</html>