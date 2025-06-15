package com.CRUD.CRUD.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Email(message = "Formato de email inválido")
  @NotBlank(message = "O email é obrigatório")
  private String email;

  @NotBlank(message = "O nome é obrigatório")
  @Column(unique = true)
  private String name;

  @NotBlank(message = "O cpf é obrigatório")
  @CPF(message = "Cpf inválido")
  @Column(unique = true)
  @Size(min = 14, max = 14)
  private String cpf;

  @NotBlank(message = "O telefone é obrigatório")
  @Column(unique = true)
  private String telefone;

  @NotBlank(message = "A senha é obrigatória")
  @Size(message = "A senha deve ter no minimo 8 caracteres", min = 8, max = 10)
  private String password;

  public User() {
  }

  public User(String email, String name, String cpf, String telefone, String password) {
    this.email = email;
    this.name = name;
    this.cpf = cpf;
    this.telefone = telefone;
    this.password = password;
  }

  public String getEmail() {
    return this.email;
  }

  public String getName() {
    return this.name;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public String getPassword() {
    return this.password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
