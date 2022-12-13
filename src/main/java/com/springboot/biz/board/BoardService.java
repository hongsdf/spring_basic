package com.springboot.biz.board;

import java.util.List;

public interface BoardService {

	// CRUD 메소드 구현
	// 글 등록
	// prepareStatement : sql문을 매개변수로 받아 전달하는 역할
	void insertBoard(BoardVO vo);

	// 글 업데이트
	void updateBoard(BoardVO vo);

	// 글 삭제
	void deleteBoard(BoardVO vo);

	// 글 상세 조회
	BoardVO getBoard(BoardVO vo);

	// 글 목록조회
	List<BoardVO> getBoardList(BoardVO vo);

}