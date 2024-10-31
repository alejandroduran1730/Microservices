package com.microservice.users.persistence;

import com.microservice.users.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, BigDecimal> {
    @Query("SELECT s FROM User u WHERE u.id")
    List<User> findUserByUserName(BigDecimal id);
}
