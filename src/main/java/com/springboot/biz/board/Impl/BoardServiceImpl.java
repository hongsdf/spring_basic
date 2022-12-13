package com.springboot.biz.board.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.biz.board.BoardService;
import com.springboot.biz.board.BoardVO;

// 비즈니스 로직
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	/* @Autowired 해당 어노테이션 밑의 객체 타입을 자동 할당*/
	
	@Autowired
	private BoardDAOSpring boardDAO;
	
	//private LogAdvice log;
	//private Log4jAdvice log;

	@Override
	public void insertBoard(BoardVO vo) {
		// After-Throwing을 확인하기 위한 예외 추가
		//if(vo.getSeq() == 0) {
		//	throw new IllegalArgumentException("0번은 글로 등록할 수 없습니다."); 
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
