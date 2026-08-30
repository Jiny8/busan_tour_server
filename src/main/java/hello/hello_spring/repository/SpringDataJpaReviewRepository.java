package hello.hello_spring.repository;

import hello.hello_spring.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByMemberId(String memberId);
}
