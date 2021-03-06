package br.com.zup.springcourse.repository;

import br.com.zup.springcourse.domain.User;
import br.com.zup.springcourse.domain.enums.Role;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    @Order(1)
    public void saveTest(){
        User user = new User(null, "Márcio", "marcio.viana@zup.com.br", "123", Role.ADMINISTRATOR, null,null);
        User createdUser = userRepository.save(user);

        assertThat(createdUser.getId()).isEqualTo(1L);

    }

    @Test
    @Order(2)
    public void updateTest(){
        User user = new User(1L, "Márcio Viana", "marcio.viana@zup.com.br", "123", Role.ADMINISTRATOR, null,null);
        User updatedUser = userRepository.save(user);

        assertThat(updatedUser.getName()).isEqualTo("Márcio Viana");
    }

    @Test
    @Order(3)
    public void findByIdTest(){
        Optional<User> result = userRepository.findById(1L);
        User user = result.get();

        assertThat(user.getPassword()).isEqualTo("123");

    }

    @Test
    @Order(4)
    public void listTest(){
        List<User> users = (List<User>) userRepository.findAll();

        assertThat(users.size()).isEqualTo(1);

    }

    @Test
    @Order(5)
    public void loginTest(){
        Optional<User> result = userRepository.login("marcio.viana@zup.com.br", "123");
        User loggedUser = result.get();

        assertThat(loggedUser.getId()).isEqualTo(1L);
    }
}
