package br.com.zup.springcourse.repository;

import br.com.zup.springcourse.domain.Request;
import br.com.zup.springcourse.domain.enums.RequestState;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long > {

    public List<Request>findAllByOwnerId(Long id);

    @Query("UPDATE Request SET state = ?2 WHERE id = ?1")
    public Request updateStatus(Long id, RequestState state);
}
