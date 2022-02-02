package com.green.dao;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.green.vo.MemberVO;

public class MemberDAO2 {
	private MemberDAO2() {}
	private static MemberDAO2 dao = new MemberDAO2();
	public static MemberDAO2 getInstance() {
		return dao;
	}
	////////////////////////////////////////////////////////
	// 마이바티스를 사용하기 위해서는 SqlSessionFactory객체가필요하다.
	// xml설정파일을 읽어와서 SqlSessionFactory 빌드해야한다.
	// 빌드된 sqlSessionFactory객체를 통해서  sqlSession객체를 얻어오고 
	// 이 객체를 통해서 mapper에 미리 셋팅된 쿼리를 읽어와서 데이터베이스에 접근 
	
	public static SqlSessionFactory sqlMapper = null;
	
	private static SqlSessionFactory getFactory() {
		if(sqlMapper == null) {
			try {
				String resource = "com/green/mybatis/config/sqlConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	
	public List<MemberVO> selectAll(){
		List<MemberVO> lists = null;
		
		 sqlMapper = getFactory();
		 SqlSession session = sqlMapper.openSession();
		 lists = session.selectList("com.green.mapper.member.selectAll");
		 return lists;
	}
	
	public List<HashMap<String,String>> selectALLToHash(){
		List<HashMap<String,String>> lists = null;
		// 해시맵은 순서에 상관없이 id,email,name등 키값으로 데이터를 가져온다.
				
		sqlMapper = getFactory();
		SqlSession session = sqlMapper.openSession();
		lists = session.selectList("com.green.mapper.member.selectAllToHash");
		
		return lists;
	}
	
	// 숫자 반환
	public int selectCnt() {
		int cnt = 0;
		
		sqlMapper = getFactory();
		SqlSession session = sqlMapper.openSession();
		cnt = session.selectOne("com.green.mapper.member.selectCnt");
		
		return cnt;
	}
	
	//이메일 조회
	public MemberVO selectByEmail(String email) {
		MemberVO mVo = null;
		
		sqlMapper = getFactory();
		SqlSession session = sqlMapper.openSession();
		mVo = session.selectOne("com.green.mapper.member.selectByEmail",email);
		
		return mVo;
	}
	
	// 데이터 삽입
	public int insertMember(MemberVO mVo) {
		sqlMapper = getFactory();
		SqlSession session = sqlMapper.openSession();
		int cnt = session.insert("com.green.mapper.member.insertMember",mVo);
		session.commit();
		return cnt;
	}
	
	//데이터 수정
	public int updateMember(MemberVO mVo) {
		sqlMapper = getFactory();
		SqlSession session = sqlMapper.openSession();
		int cnt = session.update("com.green.mapper.member.updateMember",mVo);
		session.commit();
		return cnt;
	}
	//데이터 삭제
	public int deleteMember(String email) {
		sqlMapper = getFactory();
		SqlSession session = sqlMapper.openSession();
		int cnt = session.delete("com.green.mapper.member.deleteMember",email);
		session.commit();
		return cnt;
	}
}










