package br.com.zup.springcourse.domain;

import br.com.zup.springcourse.domain.enums.RequestState;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class RequestStage {
    private Long id;
    private String description;
    private Date realizationDate;
    private RequestState state;
    private Request request;
    private User user;
}
