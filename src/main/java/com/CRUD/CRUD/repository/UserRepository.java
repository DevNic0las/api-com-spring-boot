package com.CRUD.CRUD.repository;
import com.CRUD.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
boolean existsById(Long id);
}
