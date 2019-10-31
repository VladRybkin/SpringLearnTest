package ua.training.service.impl;


import org.springframework.stereotype.Service;
import ua.training.model.entity.Role;
import ua.training.model.entity.User;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@Service("UserService1")
public class UserService {


    private Set<Role> adminRoles;
    private Set<Role> userRoles;
    private List<User> users;

    public UserService() {
        users = new CopyOnWriteArrayList<>();
        adminRoles = new HashSet<>();
        userRoles = new HashSet<>();
        adminRoles.add(new Role("ROLE_ADMIN"));
        userRoles.add(new Role("ROLE_USER"));
        users.add(new User(1, "Vlad", "password", adminRoles));
        users.add(new User(2, "Anton", "password", userRoles));
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


}
