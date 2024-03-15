package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {
	public static void main(String[] args) {
		List<Board> bList = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			Board board = new Board(i, "제목"+i, "내용"+i, "작성자"+i, "2024.3."+(i+1), i+i);
			bList.add(board);
		}
		
		for(Board b:bList) {
			System.out.println(b.toString());
		}
	}
}
