<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang='ko'>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/JavaScript"
          src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btn_send').on('click',send);
	});
	
	function send(){
		var frm = $('#frm');
		var board_passwd = $('#board_passwd', frm).val();
		var board_board = $('#board_no', frm).val();
		
		var params = 'board_passwd='+board_passwd+'&board_no='+board_no;
		
	$.ajax({
		url:'./passwd.do',
		type: 'get',
		cache: false,
		async: true,
		dataTyle: 'json',
		data: params,
		success: function(rdata){
			
		if(rdata.cnt > 0 ){
			frm.submit();
		} else {
			alert('패스워드가 일치하지 않습니다. <br> 다시 확인 해 주세요.')
		}
		},
		 // Ajax 통신 에러, 응답 코드가 200이 아닌경우, dataType이 다른경우 , 디버깅을 위해 있는 것 이고 소스는 거의 이대로 쓰임
        error: function(request, status, error) { // callback 함수, ajax가 호출하는 함수, ajax엔진이 호출 함
            var msg = 'ERROR<br><br>';
            msg += '<strong>request.status</strong><br>'+request.status + '<hr>'; // 상태값.
            msg += '<strong>error</strong><br>'+error + '<hr>'; // 에러메세지 
              console.log(msg);
        }
        });
}
	
</script>
</head>
<body>
<form name='frm' id='frm' method='POST' action='./secret_read.do'>
<input type='hidden' name='board_no' id='board_no' value='${param.board_no }'>
 <div class="form-group">   
        <div class="col-md-12" style='text-align: center; margin: 30px;'>
           <br><br>
         <h2><b>비밀번호 확인</b></h2><br>
         	이글은 비밀글입니다.<br>
         	비밀번호를 입력하여 주세요.<br>
         	비밀번호 : <input type="password" name="board_passwd" id='board_passwd' required="required">
        </div>
        
        <div style='text-align:center;'>
        <button type='submit' id='btn_send'>확인</button>
        <button type='button' onclick='history.back();'>취소</button>
        </div>
 </div>
 </form>
</body>
</html>