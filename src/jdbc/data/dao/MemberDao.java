package jdbc.data.dao;


import java.util.List;

import jdbc.data.entity.Member;

// 재사용, 협업을 위해 나누는게 더 좋다.
public interface MemberDao {
	public List<Member> getList(String query);
	
	int add(Member member);
	int update(Member member);
	int delete(Member member);
}


