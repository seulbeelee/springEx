package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	
//	//객체가 제대로 주입되는지 확인
//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}
	
//	//생성된 게시물의 번호 확인
//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 장성하는 내용");
//		board.setWriter("newbie");
//		
//		service.register(board);
//		
//		log.info("생성된 게시물의 번호 : "+board.getBno());
//	}
	
//	//리스트 구현
//	@Test
//	public void testGetList() {
//		//service.getList().forEach(board -> log.info(board));
//		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
//	}
	
//	//게시글 조회
//	@Test
//	public void testGet() {
//		log.info(service.get(1L));
//	}
	
	@Test
	public void testDelete() {
		log.info("REMOVE RESULT : "+service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("제목 수정합니다");
		log.info("MODIFY RESULT : "+service.modify(board));
	}
}
