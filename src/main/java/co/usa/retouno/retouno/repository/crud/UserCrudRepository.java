package co.usa.retouno.retouno.repository.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.usa.retouno.retouno.model.User;

public interface UserCrudRepository extends CrudRepository <User,Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
