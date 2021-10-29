package ru.sniper.Quest.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "result")
public class Result {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "quest_result")
    private String quest_result;

    @Column(name = "answer_result")
    private String answer_result;

    @Column(name = "answer_user")
    private String getResult_answer_true;

    public Result() {
    }

    public Result(int id, int user_id, String quest_result, String answer_result, String getResult_answer_true) {
        this.id = id;
        this.user_id = user_id;
        this.quest_result = quest_result;
        this.answer_result = answer_result;
        this.getResult_answer_true = getResult_answer_true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getResult_quest() {
        return quest_result;
    }

    public void setResult_quest(String result_quest) {
        this.quest_result = result_quest;
    }

    public String getResult_answer() {
        return answer_result;
    }

    public void setResult_answer(String result_answer) {
        this.answer_result = result_answer;
    }

    public String getGetResult_answer_true() {
        return getResult_answer_true;
    }

    public void setGetResult_answer_true(String getResult_answer_true) {
        this.getResult_answer_true = getResult_answer_true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return id == result.id &&
                user_id == result.user_id &&
                Objects.equals(quest_result, result.quest_result) &&
                Objects.equals(answer_result, result.answer_result) &&
                Objects.equals(getResult_answer_true, result.getResult_answer_true);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, quest_result, answer_result, getResult_answer_true);
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", result_quest='" + quest_result + '\'' +
                ", result_answer='" + answer_result + '\'' +
                ", getResult_answer_true='" + getResult_answer_true + '\'' +
                '}';
    }
}
