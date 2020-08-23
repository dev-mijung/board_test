<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
 		<li>
          <div>${noticeVO.board_title }</div>
        </li>
        
        <li>
          <div>${noticeVO.board_content }</div>
        </li>
        
        <li>
          <div>등록일: ${noticeVO.board_rdate }</div>
        </li>
</ul>
</body>
</html>