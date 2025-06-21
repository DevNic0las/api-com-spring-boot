package com.CRUD.CRUD.controller;

import com.CRUD.CRUD.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.CRUD.CRUD.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/users")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> index() {
    return userService.index();
  }

  @PostMapping
  public ResponseEntity<User> store(@RequestBody @Valid User user) {
    User userSaved = userService.store(user);
    return ResponseEntity.ok(userSaved);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> delete(@PathVariable Long id) {
    boolean idExist = userService.idExist(id);
    if (idExist) {
      userService.delete(id);
      return ResponseEntity.ok("Usuário deletado com sucesso");
    }
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não existe");
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> update(@PathVariable Long id, @RequestBody @Valid User user) {
    boolean idExists = userService.idExist(id);
    if (idExists) {
      user.setId(id);
      User userEdited = userService.store(user);
      return ResponseEntity.ok(userEdited);
    }
    return ResponseEntity.notFound().build();
  }

}
