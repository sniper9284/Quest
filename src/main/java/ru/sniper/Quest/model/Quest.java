package ru.sniper.Quest.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "quest_table")
public class Quest {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quest")
    private String quest;

    @Column(name = "answer1")
    private String answer1;

    @Column(name = "answer2")
    private String answer2;

    @Column(name = "answer3")
    private String answer3;

    @Column(name = "answer4")
    private String answer4;

    @Column(name = "true_answer")
    private String true_answer;

    public Quest() {
    }

    public Quest(int id, String quest, String answer1, String answer2, String answer3, String answer4, String answer_true) {
        this.id = id;
        this.quest = quest;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.true_answer = answer_true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getAnswer_true() {
        return true_answer;
    }

    public void setAnswer_true(String answer_true) {
        this.true_answer = answer_true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quest quest1 = (Quest) o;
        return id == quest1.id &&
                Objects.equals(quest, quest1.quest) &&
                Objects.equals(answer1, quest1.answer1) &&
                Objects.equals(answer2, quest1.answer2) &&
                Objects.equals(answer3, quest1.answer3) &&
                Objects.equals(answer4, quest1.answer4) &&
                Objects.equals(true_answer, quest1.true_answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quest, answer1, answer2, answer3, answer4, true_answer);
    }

    @Override
    public String toString() {
        return "Quest{" +
                "id=" + id +
                ", quest='" + quest + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                ", answer4='" + answer4 + '\'' +
                ", answer_true='" + true_answer + '\'' +
                '}';
    }
}
