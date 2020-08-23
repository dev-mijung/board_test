package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dev.mvc.notice.Notice_Proc")
public class Notice_Proc implements Notice_ProcInter{
	@Autowired
	Notice_DAOInter notice_DAO;
	
	@Override
	public int create(NoticeVO noticeVO) {
		int cnt = this.notice_DAO.create(noticeVO);
		return cnt;
	}

	@Override
	public List<NoticeVO> list() {
		List<NoticeVO> list = this.notice_DAO.list();
		return list;
	}

	@Override
	public NoticeVO read(int board_no) {
		NoticeVO noticeVO = this.notice_DAO.read(board_no);
		return noticeVO;
	}

	@Override
	public int passwd_check(HashMap<Object, Object> map) {
		int passwd_check = this.notice_DAO.passwd_check(map);
		return passwd_check;
	}

	@Override
	public int board_cnt_up(int board_no) {
		int cnt = this.notice_DAO.board_cnt_up(board_no);
		return cnt;
	}

}
