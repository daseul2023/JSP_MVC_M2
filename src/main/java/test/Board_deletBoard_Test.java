package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_deletBoard_Test {
	public static void main(String[] args) {
		// 1. BoardDTO에 seq의 값을 할당
		BoardDTO dto = new BoardDTO();
		
		dto.setSeq(5);
		
		// 2. BoardDAO의 deleteBoard(dto)
		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(dto);
		
		
	}
}
