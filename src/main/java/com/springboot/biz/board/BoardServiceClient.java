package com.springboot.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. spring 컨테이너 구동한다.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup 검색한다. 
		BoardService boardservice = (BoardService) container.getBean("boardService"); // BoardService를 구현한객체
	
		// 3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		//vo.setSeq(100); // 100 번글 등록
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("임시내용.."); 
		boardservice.insertBoard(vo); // board객체 전달목적인 vo에 삽입
		
		// 4.글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardservice.getBoardList(vo);
		for(BoardVO board: boardList) {
			System.out.println("--->"+board.toString());
		}
		
		container.close();
	}
}
