package ua.training.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.training.model.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("UserService1")
public class UserService {


    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(11);


    private List<User> users;

    public UserService() {
        users = new CopyOnWriteArrayList<>();
        users.add(new User(1, "Vlad"));
        users.add(new User(2, "Anton"));
        users.add(new User(3, "Oleg"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int id) {
        users.stream().filter(user -> user.getId() == id).forEach(users::remove);

    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


}
