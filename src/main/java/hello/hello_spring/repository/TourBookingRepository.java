package hello.hello_spring.repository;

import hello.hello_spring.domain.TourBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourBookingRepository extends JpaRepository<TourBooking, Long> {
    List<TourBooking> findByMemberId(String memberId);
}
