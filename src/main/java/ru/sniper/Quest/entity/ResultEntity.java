package ru.sniper.Quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "result")
@AllArgsConstructor
@Getter
@Setter
public class ResultEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "quest_result")
    private String quest_result;

    @Column(name = "answer_result")
    private String answer_result;

    @Column(name = "answer_user")
    private String answer_user;

    public ResultEntity() {
    }
}
