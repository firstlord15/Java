package org.example.models;

import org.example.annotations.ColumnAnnotation;
import org.example.annotations.IdAnnotation;
import org.example.annotations.MyEntity;
import org.example.annotations.TableAnnotation;

@MyEntity
@TableAnnotation(name = "Person")
public class User {
    @IdAnnotation
    private final int id;

    @ColumnAnnotation(nullable = false)
    private String username;

    @ColumnAnnotation(nullable = false)
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}