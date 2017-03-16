package jdbc.data.dao;


import java.util.List;

import jdbc.data.entity.Member;

// ����, ������ ���� �����°� �� ����.
public interface MemberDao {
	public List<Member> getList(String query);
	
	int add(Member member);
	int update(Member member);
	int delete(Member member);
}


