package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

public interface Notice_ProcInter {
	/**
	 * 등록
	 * @param noticeVO
	 * @return
	 */
	 public int create(NoticeVO noticeVO);
	 
	 /**
	  * 목록
	  * @return
	  */
	 public List<NoticeVO> list();
	 
	 /**
	  * 조회
	  * @param board_no
	  * @return
	  */
	 public NoticeVO read(int board_no);
	 
	 /**
	  * 패스워드 체크
	  * @param map
	  * @return
	  */
	 public int passwd_check(HashMap<Object, Object> map);
	 
	 /**
	  * 조회수 증가
	  * @param board_no
	  * @return
	  */
	 public int board_cnt_up(int board_no);
}
