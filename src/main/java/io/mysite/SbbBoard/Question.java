package io.mysite.SbbBoard;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Question {
    @Id
    // @Column(name = "question_id") 비추천
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 200)
    private String subject; // VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime createDate;
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    List<Answer> answerList;

}
