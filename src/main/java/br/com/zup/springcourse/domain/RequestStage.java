package br.com.zup.springcourse.domain;

import br.com.zup.springcourse.domain.enums.RequestState;

import java.util.Date;

public class RequestStage {
    private Long id;
    private String description;
    private Date realizationDate;
    private RequestState state;
    private Request request;
    private User user;
}
