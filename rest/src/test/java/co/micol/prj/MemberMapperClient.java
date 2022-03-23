package co.micol.prj;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.micol.prj.member.mapper.MemberMapper;
import co.micol.prj.member.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class MemberMapperClient {
	
	@Autowired MemberMapper mapper;
	
	//@Test
	public void listTest() {
		List<MemberVO> list = mapper.memberSelectList();
		System.out.println(list);
	}
	
	/*
	 * public void selectTest() { MemberVO vo = new MemberVO(); vo.getId();
	 * vo.getPassword(); vo.getName(); vo.getAddress(); vo.getTel(); vo.getAuthor();
	 * 
	 * int r = mapper.memberSelect(vo); System.out.println(r);
	 * assertEquals(vo.getId(), "kokw"); }
	 */
	
	@Test
	public void insertTest() {
		MemberVO vo = new MemberVO();
		vo.setId("kokw");
		vo.setPassword("1234");
		vo.setName("권영");
		vo.setAddress("대구");
		vo.setTel("010-1234-1234");
		vo.setAuthor("");
		
		int test = mapper.memberInsert(vo);
		System.out.println(test);
	}
	
}
