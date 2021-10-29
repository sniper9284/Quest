package ru.sniper.Quest.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "ball")
    private int user_ball;

    public User(int id, String login, int user_ball) {
        this.id = id;
        this.login = login;
        this.user_ball = user_ball;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getUser_ball() {
        return user_ball;
    }

    public void setUser_ball(int user_ball) {
        this.user_ball = user_ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                user_ball == user.user_ball &&
                login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, user_ball);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", user_ball=" + user_ball +
                '}';
    }
}
