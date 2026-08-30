package hello.hello_spring.repository;

import hello.hello_spring.domain.TourProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourProductRepository extends JpaRepository<TourProduct, Long> {
    List<TourProduct> findByFeaturedTrue();
}
