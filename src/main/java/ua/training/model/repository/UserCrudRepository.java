package ua.training.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.training.model.entity.SimpleUser;
import ua.training.model.entity.User;

@Repository
public interface UserCrudRepository extends JpaRepository<SimpleUser, Long> {


}
