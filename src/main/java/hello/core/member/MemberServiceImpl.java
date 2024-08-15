package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) { //객체 저장 메서드
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) { //객체 조회 메서드
        return memberRepository.findById(memberId);
    }
}
