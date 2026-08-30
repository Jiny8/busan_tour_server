package hello.hello_spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Setter
    @Column(name="id")
    private String id;

    @Setter
    @Column(name="pw")
    private String pw;
}
