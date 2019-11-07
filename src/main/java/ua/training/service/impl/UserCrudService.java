package ua.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;
import ua.training.model.repository.UserCrudRepository;

@Service
public class UserCrudService {

    @Autowired
    UserCrudRepository userCrudRepository;


    @Transactional
    public void add(SimpleUser user) {
        userCrudRepository.save(user);
    }
}
