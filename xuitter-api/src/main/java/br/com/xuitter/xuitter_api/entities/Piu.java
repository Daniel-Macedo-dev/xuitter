package br.com.xuitter.xuitter_api.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Piu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private String _content;
    private LocalDateTime _createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User _user;

    @Deprecated
    public Piu() { }

    public Piu(String content, User user) {
        _content = content;
        _user = user;
        _createdAt = LocalDateTime.now();
    }

    public Long getId() { return _id; }
    public String getContent() { return _content; }
    public LocalDateTime getCreatedAt() { return _createdAt; }
    public User getUser() { return _user; }
}
