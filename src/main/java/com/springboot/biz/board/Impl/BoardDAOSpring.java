package com.springboot.biz.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.biz.board.BoardVO;

@Repository
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	// SQL ��ɾ��
		private final String BOARD_INSERT = "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board),?,?,?)";
		//private final String BOARD_INSERT = "insert into board(seq,title,writer,content) values(?,?,?,?)";
		private final String BOARD_UPDATE = "update board set title=?,content=? where seq = ?";
		private final String BOARD_DELETE = "delete board where seq=? ";
		private final String BOARD_GET    = "select * from board where seq = ?";
		private final String BOARD_LIST   = "select * from board order by seq desc";
	

	// CRUD �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardVO vo) {
		System.out.println("--> Spring jdbc�� insertBoard()");
		JdbcTemplate.update(BOARD_INSERT,vo.getTitle(),vo.getWriter(),vo.getContent());
		//JdbcTemplate.update(BOARD_INSERT,vo.getSeq(),vo.getTitle(),vo.getWriter(),vo.getContent());
	}
	// �� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("--> Spring jdbc�� updateBoard()");
		JdbcTemplate.update(BOARD_UPDATE,vo.getTitle(),vo.getContent(),vo.getSeq());
	}
	// �� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("--> Spring jdbc�� deleteBoard()");
		JdbcTemplate.update(BOARD_DELETE,vo.getSeq());
	}
	// �� �� ��ȸ
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("--> Spring jdbc�� getBoard()");
		Object[] args = {vo.getSeq()};
		return   JdbcTemplate.queryForObject(BOARD_GET,args, new BoardRowMapper());
	}
	// �� ��� ��ȸ
		public List<BoardVO> getBoardList(BoardVO vo) {
			System.out.println("--> Spring jdbc�� getListBoard()");
			return   JdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
			
		}
		
	
	
	
}

