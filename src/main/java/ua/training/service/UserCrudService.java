package ua.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.entity.User;
import ua.training.model.repository.UserCrudRepository;

@Service
public class UserCrudService {

    //     @Autowired(required = true)
    //             @Qualifier("repo")
    UserCrudRepository userCrudRepository;


    @Transactional
    public void add(User user) {
        userCrudRepository.save(user);
    }
}
