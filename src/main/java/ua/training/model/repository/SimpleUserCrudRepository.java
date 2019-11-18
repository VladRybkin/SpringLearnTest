package ua.training.model.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;

import java.util.List;

@Repository
public interface SimpleUserCrudRepository extends JpaRepository<SimpleUser, Long> {



}
