package hello.hello_spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Entity
public class Qna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "name")
    private String name;

    @Setter
    @Column(name = "title")
    private String title;

    @Setter
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Setter
    @Column(name = "member_id")
    private String memberId;

    @Column(name = "created_at")
    private String createdAt;

    @PrePersist
    public void prePersist() {
        if (this.createdAt == null) {
            this.createdAt = LocalDate.now().toString();
        }
    }
}
