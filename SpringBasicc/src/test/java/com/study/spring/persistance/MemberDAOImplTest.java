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
					vo.setUser_id("���̵�"+System.currentTimeMillis());
					vo.setUser_name("�̸�"+System.currentTimeMillis());
					vo.setPw("�н�����"+System.currentTimeMillis());
					vo.setEmail("�̸���"+System.currentTimeMillis());
					dao.insertMember(vo);
				}
				@Test
				public void getTest() throws Exception {
					MemberVO vo = dao.get("���̵�1464759074190");
					System.out.println("�̸� : " + vo.getUser_name());
				}
				@Test
				public void getListTest() throws Exception {
					List<MemberVO> list = dao.getList();
					Iterator<MemberVO> it = list.iterator();
					while (it.hasNext()) {
						MemberVO vo = it.next();
						System.out.println("�̸� : " + vo.getUser_name());
					}
				}
				
				@Test
				public void updateTest(){
					MemberVO vo = new MemberVO();
					vo.setUser_name("������");
					vo.setPw("�н�");
					vo.setEmail("�Ⱦ˷���");
					vo.setUser_id("���̵�");
					dao.update(vo);
				}
				
				@Test
				public void deleteTest(){
					dao.delete("���̵�1464827462236");
				}
}