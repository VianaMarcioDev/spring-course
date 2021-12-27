package br.com.zup.springcourse.repository;

import br.com.zup.springcourse.domain.RequestStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long> {

    public List<RequestStage> findAllByRequestId(Long id);
}
