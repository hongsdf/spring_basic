package com.springboot.biz.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.biz.board.BoardService;
import com.springboot.biz.board.BoardVO;

// ����Ͻ� ����
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	/* @Autowired �ش� ������̼� ���� ��ü Ÿ���� �ڵ� �Ҵ�*/
	
	@Autowired
	private BoardDAOSpring boardDAO;
	
	//private LogAdvice log;
	//private Log4jAdvice log;

	@Override
	public void insertBoard(BoardVO vo) {
		// After-Throwing�� Ȯ���ϱ� ���� ���� �߰�
		//if(vo.getSeq() == 0) {
		//	throw new IllegalArgumentException("0���� �۷� ����� �� �����ϴ�."); 
		//}
		//log.printLogging();
		boardDAO.insertBoard(vo);
		boardDAO.insertBoard(vo);
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.deleteBoard(vo);		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		//log.printLogging();
		return boardDAO.getBoard(vo) ;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		//log.printLogging();
		return boardDAO.getBoardList(vo);
	}

}
