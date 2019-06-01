package ua.training.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.training.model.entity.Role;
import ua.training.model.entity.User;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("UserService1")
public class UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private Set<Role> roles;
    private List<User> users;

    public UserService() {
        users = new CopyOnWriteArrayList<>();
        roles = new HashSet<>();
        roles.add(new Role("ROLE_ADMIN"));
        users.add(new User(1, "Vlad", "password", roles));
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

    public User findByUsernameAndPassword(String userName) {
        Optional<User> user = users.stream().filter(u -> u.getName().equals(userName)).findAny();
        return user.orElse(null);
    }


    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


}
