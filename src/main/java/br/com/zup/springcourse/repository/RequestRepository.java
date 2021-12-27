package br.com.zup.springcourse.repository;

import br.com.zup.springcourse.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long > {

    public List<Request>findAllByOwnerId(Long id);

}
