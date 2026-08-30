package hello.hello_spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class TourProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "name")
    private String name;

    @Setter
    @Column(name = "src", length = 500)
    private String src;

    @Setter
    @Column(name = "alt")
    private String alt;

    @Setter
    @Column(name = "title")
    private String title;

    @Setter
    @Column(name = "adult_price")
    private Integer adultPrice;

    @Setter
    @Column(name = "kid_price")
    private Integer kidPrice;

    @Setter
    @Column(name = "featured")
    private Boolean featured = false;
}
