package org.zerock.persistence;

import org.zerock.domain.*;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);

    public MemberVO readMember(String userid) throws Exception;

	public MemberVO readWithPW(String userid, String pw) throws Exception;
}
