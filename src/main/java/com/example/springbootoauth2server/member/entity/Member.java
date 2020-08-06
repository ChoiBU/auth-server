package com.example.springbootoauth2server.member.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * CREATE TABLE members (
 *   username            VARCHAR(40),
 *   password            VARCHAR(40),
 *   name                VARCHAR(40),
 *   scope               VARCHAR(1000), // 사용하지 않음
 *   PRIMARY KEY (username)
 * );
 */
@Entity
public class Member {

    @Id
    private String username;
    private String password;
    private String name;

    public String getUsername() {
        return username;
    }

    // 암호 일치 여부
    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }
}