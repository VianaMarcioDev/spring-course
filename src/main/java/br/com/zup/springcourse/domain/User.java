package br.com.zup.springcourse.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Request> requests = new ArrayList<>();

    public User(Long id, String name, String email, String password, List<Request> requests) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.requests = requests;
    }

    public User() {
    }


}
