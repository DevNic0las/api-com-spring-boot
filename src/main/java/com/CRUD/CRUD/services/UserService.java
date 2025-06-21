package com.CRUD.CRUD.services;

import com.CRUD.CRUD.exception.HandlerValidation;
import com.CRUD.CRUD.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CRUD.CRUD.repository.UserRepository;
import com.CRUD.CRUD.exception.NotFoundException;
import com.CRUD.CRUD.exception.HandlerValidation;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public List<User> index() {
    List<User> users = userRepository.findAll();
    if (users.isEmpty()) {
      throw new NotFoundException("Nenhum usuario encontrado");
    }
    return users;
  }

  public Optional<User> showId(Long id) {
    return userRepository.findById(id);
  }

  public User store(User user) {
    return userRepository.save(user);
  }

  public void delete(Long id) {
    userRepository.deleteById(id);

  }
  public boolean idExist(Long id){
    return userRepository.existsById(id);
  }

}
