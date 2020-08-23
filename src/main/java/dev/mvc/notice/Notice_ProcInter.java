package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

public interface Notice_ProcInter {
	/**
	 * ���
	 * @param noticeVO
	 * @return
	 */
	 public int create(NoticeVO noticeVO);
	 
	 /**
	  * ���
	  * @return
	  */
	 public List<NoticeVO> list();
	 
	 /**
	  * ��ȸ
	  * @param board_no
	  * @return
	  */
	 public NoticeVO read(int board_no);
	 
	 /**
	  * �н����� üũ
	  * @param map
	  * @return
	  */
	 public int passwd_check(HashMap<Object, Object> map);
	 
	 /**
	  * ��ȸ�� ����
	  * @param board_no
	  * @return
	  */
	 public int board_cnt_up(int board_no);
}
