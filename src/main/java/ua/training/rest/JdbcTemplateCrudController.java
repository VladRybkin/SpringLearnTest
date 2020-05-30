package ua.training.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.training.model.dao.JDBCUserDao;
import ua.training.model.entity.SimpleUser;

import java.util.List;

@RestController
@RequestMapping("/jdbcrestusers")
public class JdbcTemplateCrudController {

    @Autowired
    private JDBCUserDao jdbcUserDao;


    @GetMapping
    public List<SimpleUser> getUsersByJdbc() {
        return jdbcUserDao.getUsers();
    }
}
