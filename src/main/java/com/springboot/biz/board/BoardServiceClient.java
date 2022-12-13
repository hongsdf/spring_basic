package com.springboot.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. spring �����̳� �����Ѵ�.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup �˻��Ѵ�. 
		BoardService boardservice = (BoardService) container.getBean("boardService"); // BoardService�� �����Ѱ�ü
	
		// 3. �� ��� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		//vo.setSeq(100); // 100 ���� ���
		vo.setTitle("�ӽ� ����");
		vo.setWriter("ȫ�浿");
		vo.setContent("�ӽó���.."); 
		boardservice.insertBoard(vo); // board��ü ���޸����� vo�� ����
		
		// 4.�� ��� �˻� ��� �׽�Ʈ
		List<BoardVO> boardList = boardservice.getBoardList(vo);
		for(BoardVO board: boardList) {
			System.out.println("--->"+board.toString());
		}
		
		container.close();
	}
}
