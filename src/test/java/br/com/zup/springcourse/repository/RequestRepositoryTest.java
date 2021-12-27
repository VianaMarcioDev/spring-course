package br.com.zup.springcourse.repository;

import br.com.zup.springcourse.domain.Request;
import br.com.zup.springcourse.domain.User;
import br.com.zup.springcourse.domain.enums.RequestState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class RequestRepositoryTest {

    @Autowired
    private RequestRepository requestRepository;

    @Test
    public void saveTest(){
        User owner = new User();
        owner.setId(1L);
        Request request = new Request(null, "Novo Laptop HP","Pretendo obter um laptop HP", new Date(), RequestState.OPEN, owner, null);

        Request createdRequest = requestRepository.save(request);

        assertThat(createdRequest.getId()).isEqualTo(1L);
    }

    @Test
    public void updateTest(){
        User owner = new User();
        owner.setId(1L);
        Request request = new Request(null, "Novo Laptop HP","Pretendo obter um laptop HP de RAM 16 Gb", null, RequestState.OPEN, owner, null);

        Request updatedRequest = requestRepository.save(request);

        assertThat(updatedRequest.getId()).isEqualTo("Pretendo obter um laptop HP de RAM 16 Gb");


    }

    @Test
    public void getByIdTest(){
    Optional<Request> result = requestRepository.findById(1L);
    Request request = result.get();

    assertThat(request.getSubject()).isEqualTo("Novo Laptop HP");

    }

    @Test
    public void listTest(){
        List<Request> requests = (List<Request>) requestRepository.findAll();

        assertThat(requests.size()).isEqualTo(1);

    }

    @Test
    public void listByOwnerIdTest(){
        List<Request> requests = (List<Request>) requestRepository.findAllByOwnerId(1L);

        assertThat(requests.size()).isEqualTo(1);

    }
}
