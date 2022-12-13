package com.springboot.biz.board;

import java.util.List;

public interface BoardService {

	// CRUD �޼ҵ� ����
	// �� ���
	// prepareStatement : sql���� �Ű������� �޾� �����ϴ� ����
	void insertBoard(BoardVO vo);

	// �� ������Ʈ
	void updateBoard(BoardVO vo);

	// �� ����
	void deleteBoard(BoardVO vo);

	// �� �� ��ȸ
	BoardVO getBoard(BoardVO vo);

	// �� �����ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}