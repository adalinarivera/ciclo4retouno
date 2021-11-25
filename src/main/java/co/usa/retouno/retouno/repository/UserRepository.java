package co.usa.retouno.retouno.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.retouno.retouno.model.User;
import co.usa.retouno.retouno.repository.crud.UserCrudRepository;

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }
    public User save(User user){
        return userCrudRepository.save(user);
    }
    public boolean existeEmail (String email){
        Optional <User> Usuario = userCrudRepository.findByEmail(email);
        return !Usuario.isEmpty();
    }
    public Optional<User> autenticarUsuario (String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

}
