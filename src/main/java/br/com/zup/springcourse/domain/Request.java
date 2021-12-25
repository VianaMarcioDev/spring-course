package br.com.zup.springcourse.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Request {
    private Long id;
    private String subject;
    private String description;
    private Date creationDate;
    private RequestState state;
    private User user;
    private List<RequestState> states = new ArrayList<>();
}
