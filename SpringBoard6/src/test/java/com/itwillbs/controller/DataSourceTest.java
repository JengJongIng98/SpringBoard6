package com.itwillbs.controller;

import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.domain.Criteria;
import com.itwillbs.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(DataSourceTest.class);
	
//	@Inject
//	private DataSource ds;
	
	@Inject
	private BoardDAO bdao;
	
	//@Test
//	public void 디비연결테스트() {
//		System.out.println(" 디비 연결 : "+ds);
//	} // 디비연결테스트()
	
	@Test
	public void 페이징처리테스트() throws Exception {
		
		//List<BoardVO> boardList = bdao.listPage(1);
		//List<BoardVO> boardList = bdao.listPage(2);
		
		// 페이징처리 정보 저장객체 생성
		System.out.println("@@@@@@@@@@@@@@@@3333333@@@@@@@@@@@@@@@");
		Criteria cri = new Criteria();
		
		System.out.println("@@@@@@@@@@@@@@@@4444444@@@@@@@@@@@@@@@");
		
		List<BoardVO> boardList = bdao.listPage(cri);
		
		System.out.println("@@@@@@@@@@@@@@@@5555555@@@@@@@@@@@@@@@");
		for(BoardVO vo:boardList) {
			logger.debug(""+vo.getBno()+"/"+vo.getTitle());
		}
		
	} // 페이징처리테스트()
	
}
