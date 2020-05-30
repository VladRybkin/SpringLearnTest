package ua.training.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.training.model.entity.SimpleUser;

@Repository
public interface SimpleUserCrudRepository extends JpaRepository<SimpleUser, Long> {


}
