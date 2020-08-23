<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	
	
<table>
<tr>
	<th>순서</th>
	<th>제목</th>
	<th>글쓴이</th>
	<th>등록일</th>
	<th>조회수</th>
</tr>

<c:forEach var='noticeVO' items="${list }">
<tr>
	<td>${noticeVO.board_no }</td>
	<td><a href='./secret.do?board_no=${noticeVO.board_no }'>${noticeVO.board_title }</a></td>
	<td>${noticeVO.board_member }</td>
	<td>${noticeVO.board_rdate }</td>
	<td>${noticeVO.board_cnt }</td>
</tr>
</c:forEach>
</table>
</body>
</html>