package vn.edu.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.fit.models.User;
import vn.edu.fit.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(long id){
        return userRepository.findById(id);
    }

}
