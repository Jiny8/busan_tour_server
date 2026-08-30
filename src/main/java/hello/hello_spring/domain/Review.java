package hello.hello_spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name="title")
    private String title;

    @Setter
    @Column(name="author")
    private String author;

    @Setter
    @Column(name="content")
    private String content;

    @Setter
    @Column(name="member_id")
    private String memberId;

    @Column(name="created_at")
    private String createdAt;

    @PrePersist
    public void prePersist() {
        if (this.createdAt == null) {
            this.createdAt = LocalDate.now().toString();
        }
    }
}
