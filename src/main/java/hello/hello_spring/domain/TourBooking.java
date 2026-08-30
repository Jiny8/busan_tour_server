package hello.hello_spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class TourBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "member_id")
    private String memberId;

    @Setter
    @Column(name = "tour_name")
    private String tourName;

    @Setter
    @Column(name = "start_date")
    private String startDate;

    @Setter
    @Column(name = "end_date")
    private String endDate;

    @Setter
    @Column(name = "total_people")
    private Integer totalPeople;

    @Setter
    @Column(name = "adults")
    private Integer adults;

    @Setter
    @Column(name = "kids")
    private Integer kids;

    @Setter
    @Column(name = "total_price")
    private Long totalPrice;
}
