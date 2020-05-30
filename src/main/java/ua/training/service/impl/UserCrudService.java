package ua.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.entity.SimpleUser;
import ua.training.model.repository.SimpleUserCrudRepository;

import java.util.List;

@Service
public class UserCrudService {

    @Autowired
    SimpleUserCrudRepository simpleUserCrudRepository;

    @Transactional
    public List<SimpleUser> findAllSimpleUsers() {

        return simpleUserCrudRepository.findAll();

    }

    @Transactional
    public void add(SimpleUser user) {
        simpleUserCrudRepository.save(user);
    }


    @Transactional
    public void remove(SimpleUser user) {
        simpleUserCrudRepository.delete(user);
    }
}
