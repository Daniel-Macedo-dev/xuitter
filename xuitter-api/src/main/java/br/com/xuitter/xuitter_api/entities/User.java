package br.com.xuitter.xuitter_api.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    private String _username;

    private LocalDateTime _createdAt;

    @Deprecated
    public User() { }

    public User(String username) {
        _username = username;
        _createdAt = LocalDateTime.now();
    }

    public Long getId() { return _id; }
    public String getUsername() { return _username; }
    public LocalDateTime getCreatedAt() { return _createdAt; }
}
