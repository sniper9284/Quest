package ru.sniper.Quest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "ball")
    private int ball;

    public UserEntity() {
    }

    public UserEntity(String login) {
        this.setLogin(login);
    }
}
