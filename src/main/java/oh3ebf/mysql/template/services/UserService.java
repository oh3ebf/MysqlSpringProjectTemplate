/*
 * Software: Spring Mysql template
 * Module: UserService class
 * Version: 0.1
 * Licence: GPL2
 * Owner: Kim Kristo
 * Date creation : 12.10.2016
 */
package oh3ebf.mysql.template.services;

import oh3ebf.mysql.template.model.User;
import oh3ebf.mysql.template.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class  UserService implements UserServiceInterface{
    @Autowired
    private UserRepository userRepository;

    /*
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }*/
    
    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }
}
