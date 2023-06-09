package net.javaguides.springdatarest.repository;

import net.javaguides.springdatarest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path = "members")
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByFirstName(@Param("firstName") String firstName); // searching to name

    List<User> findByLastName(@Param("lastName")String lastName);     // searching to surname

    List<User> findByEmail(@Param("email") String email);             // searching to email

}
