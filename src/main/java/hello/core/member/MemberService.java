package hello.core.member;

public interface MemberService {
    //회원가입(join)
    void join(Member member);

    //회원조회 기능(findMember)
    Member findMember(Long memberId);
}
