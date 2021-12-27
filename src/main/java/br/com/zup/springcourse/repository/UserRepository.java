package br.com.zup.springcourse.repository;

import br.com.zup.springcourse.domain.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long > {

    @Query("SELECT u FROM user u WHERE email = ?1 AND password = ?2")
    public Optional<User> login(String email, String password);
}
