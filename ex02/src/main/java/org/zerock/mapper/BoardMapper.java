package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

		//@Select("select * from tbl_board where bno > 0")
		public List<BoardVO> getList();
		
		//페이징처리를 위한 메소드
		public List<BoardVO> getListWithPaging(Criteria cri);
		
		//pk값을 몰라도 되는 경우
		public void insert(BoardVO board);
		
		//pk값을 알아야 하는 경우
		public void insertSelectKey(BoardVO board);
		
		//pk로 목록 불러오기
		public BoardVO read(Long bno);
		
		//delete 처리
		public int delete(Long bno);
		
		//update 
		public int update(BoardVO board);
}
