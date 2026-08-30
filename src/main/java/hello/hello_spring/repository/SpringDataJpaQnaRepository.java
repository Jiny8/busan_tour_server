package hello.hello_spring.repository;

import hello.hello_spring.domain.Qna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaQnaRepository extends JpaRepository<Qna, Long> {
    List<Qna> findByMemberId(String memberId);
}
