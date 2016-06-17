package com.study.spring.persistance;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.spring.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOImplTest {
				@Inject
				private MemberDAO dao;
				@Test
				public void test(){System.out.println("Test DAO = "+dao);}
				@Test
				public void getNowTest(){ System.out.println("Test DAO now = "+dao.getNow());}
				@Test
				public void insertTest(){
					MemberVO vo = new MemberVO();
					vo.setUser_id("아이디"+System.currentTimeMillis());
					vo.setUser_name("이름"+System.currentTimeMillis());
					vo.setPw("패스워드"+System.currentTimeMillis());
					vo.setEmail("이메일"+System.currentTimeMillis());
					dao.insertMember(vo);
				}
				@Test
				public void getTest() throws Exception {
					MemberVO vo = dao.get("아이디1464759074190");
					System.out.println("이름 : " + vo.getUser_name());
				}
				@Test
				public void getListTest() throws Exception {
					List<MemberVO> list = dao.getList();
					Iterator<MemberVO> it = list.iterator();
					while (it.hasNext()) {
						MemberVO vo = it.next();
						System.out.println("이름 : " + vo.getUser_name());
					}
				}
				
				@Test
				public void updateTest(){
					MemberVO vo = new MemberVO();
					vo.setUser_name("한현우");
					vo.setPw("패스");
					vo.setEmail("안알랴쥼");
					vo.setUser_id("아이디");
					dao.update(vo);
				}
				
				@Test
				public void deleteTest(){
					dao.delete("아이디1464827462236");
				}
}