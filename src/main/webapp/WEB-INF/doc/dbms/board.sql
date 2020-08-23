/**********************************/
/* Table Name: 게시판 */
/**********************************/
DROP TABLE board;
CREATE TABLE board(
		board_no                      		INT(10)		 NOT NULL		 AUTO_INCREMENT PRIMARY KEY COMMENT '게시판번호',
		board_title                   		VARCHAR(100)		 NOT NULL COMMENT '게시판제목',
		board_content                 		TEXT		 NOT NULL COMMENT '게시판내용',
		board_member                  		VARCHAR(100)		 NOT NULL COMMENT '게시판작성자',
		board_passwd                  		VARCHAR(100)		 NOT NULL COMMENT '게시판패스워드',
		board_rdate                   		DATE		 NOT NULL COMMENT '게시판등록일자',
		board_cnt                     		INT(10)		 NOT NULL COMMENT '조회수'
) COMMENT='게시판';



-- 등록
INSERT INTO board(board_title, board_content, board_member, board_passwd, board_rdate, board_cnt)
VALUES('TITLE', 'CONTENT', '등록자', '1234', NOW(), 0);

INSERT INTO board(board_title, board_content, board_member, board_passwd, board_rdate, board_cnt)
VALUES('TITLE', 'CONTENT', '등록자', '1234', NOW(), 0);

SELECT * FROM board;

SELECT * FROM board;

-- 목록
SELECT board_no, board_title, board_content, board_member, board_passwd, board_rdate, board_cnt
FROM board
ORDER BY board_no ASC;



-- 조회
SELECT board_no, board_title, board_content, board_member, board_passwd, board_rdate, board_cnt
FROM board
WHERE board_no=4;


-- 패스워드체크
SELECT COUNT(*) AS passwd_cnt
FROM board
WHERE board_no='1' AND board_passwd = '1234';

-- 조회수 증가
UPDATE board
SET board_cnt = board_cnt + 1
WHERE board_no =1;


COMMIT;