package dev.mvc.notice;

public class NoticeVO {
//	board_no                      		INT(10)		 NOT NULL		 AUTO_INCREMENT PRIMARY KEY COMMENT '�Խ��ǹ�ȣ',
//	board_title                   		VARCHAR(100)		 NOT NULL COMMENT '�Խ�������',
//	board_content                 		TEXT		 NOT NULL COMMENT '�Խ��ǳ���',
//	board_member                  		VARCHAR(100)		 NOT NULL COMMENT '�Խ����ۼ���',
//	board_passwd                  		VARCHAR(100)		 NOT NULL COMMENT '�Խ����н�����',
//	board_rdate                   		DATE		 NOT NULL COMMENT '�Խ��ǵ������',
//	board_cnt                     		INT(10)		 NOT NULL COMMENT '��ȸ��'
	
	private int board_no;
	private String board_title;
	private String board_content;
	private String board_member;
	private String board_passwd;
	private String board_rdate;
	private int board_cnt;
	
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_member() {
		return board_member;
	}
	public void setBoard_member(String board_member) {
		this.board_member = board_member;
	}
	public String getBoard_passwd() {
		return board_passwd;
	}
	public void setBoard_passwd(String board_passwd) {
		this.board_passwd = board_passwd;
	}
	public String getBoard_rdate() {
		return board_rdate;
	}
	public void setBoard_rdate(String board_rdate) {
		this.board_rdate = board_rdate;
	}
	public int getBoard_cnt() {
		return board_cnt;
	}
	public void setBoard_cnt(int board_cnt) {
		this.board_cnt = board_cnt;
	}
	
}
