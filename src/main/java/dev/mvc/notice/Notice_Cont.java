package dev.mvc.notice;

import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Notice_Cont {
	@Autowired
	@Qualifier("dev.mvc.notice.Notice_Proc")
	Notice_ProcInter notice_Proc;
	
	public Notice_Cont() {
		System.out.println("--> Notice_Cont created.");
	}
	
/**
 * 등록
 * @return
 */
@RequestMapping(value="/notice/create.do", method=RequestMethod.GET)
 public ModelAndView create() {
	ModelAndView mav = new ModelAndView();
	
	mav.setViewName("/notice/create");
	
	return mav;
 }

/**
 * 등록 처리
 * @param noticeVO
 * @return
 */
@RequestMapping(value="/notice/create.do", method=RequestMethod.POST)
 public ModelAndView create(NoticeVO noticeVO) {
	ModelAndView mav = new ModelAndView();
	
	int cnt = this.notice_Proc.create(noticeVO);
	mav.addObject("cnt",cnt);
	
	mav.setViewName("redirect:/notice/list.do");
	return mav;
}

/**
 * 목록
 * @return
 */
@RequestMapping(value="/notice/list.do", method=RequestMethod.GET)
	public ModelAndView list() {
	ModelAndView mav = new ModelAndView();
	List<NoticeVO> list = this.notice_Proc.list();
	mav.addObject("list", list);
	mav.setViewName("/notice/list");
	return mav;
}

/**
 * 조회 폼
 * @param board_no
 * @param board_passwd
 * @return
 */
@RequestMapping(value="/notice/secret.do", method=RequestMethod.GET)
	public ModelAndView read(int board_no) {
	ModelAndView mav = new ModelAndView();

//	
//	int passwd_cnt = this.notice_Proc.passwd_check(map);
//	mav.addObject("passwd_cnt", passwd_cnt);
//	
	NoticeVO noticeVO = this.notice_Proc.read(board_no);
	mav.addObject("noticeVO",noticeVO);
	mav.setViewName("/notice/secret");
	
	return mav;
	}

/**
 * 조회
 * @return
 */
@RequestMapping(value="/notice/secret_read.do", method=RequestMethod.POST)
	public ModelAndView read_proc(int board_no) {
	ModelAndView mav = new ModelAndView();
	
	NoticeVO noticeVO = this.notice_Proc.read(board_no);
	mav.addObject("noticeVO", noticeVO);
	
	mav.setViewName("/notice/secret_read");
	
	return mav;
}

/**
 * 패스워드 체크
 * @return
 */
@ResponseBody
@RequestMapping(value="/notice/passwd.do", method=RequestMethod.GET,
				produces = "text/plain;charset-UTF-8")
	public String PasswdCheck(int board_no, String board_passwd) {
	
	HashMap<Object, Object> map = new HashMap<Object, Object>();
	map.put("board_no", board_no);
	map.put("board_passwd", board_passwd);
	
	int cnt = this.notice_Proc.passwd_check(map);
	
	JSONObject json = new JSONObject();
	json.put("cnt", cnt);
	
	return json.toString();
	}
}
