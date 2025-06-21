package com.CRUD.CRUD.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
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
  @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Email inválido")
  @NotBlank(message = "O email é obrigatório")
  @Column(unique = true)
  private String email;

  @NotBlank(message = "O nome é obrigatório")
  private String name;

  @NotBlank(message = "O cpf é obrigatório")
  @CPF(message = "Cpf inválido")
  @Column(unique = true)
  private String cpf;

  @Pattern(regexp = "^\\(?\\d{2}\\)?\\s?9?\\d{4}-?\\d{4}$", message = "Telefone inválido")
  @NotBlank(message = "O telefone é obrigatório")
  @Column(unique = true)
  private String telefone;

  @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", message = "A senha deve ter pelo menos 8 caracteres, incluindo uma letra maiúscula, uma minúscula, um número e um caractere especial")
  @NotBlank(message = "A senha é obrigatória")
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

  public Long getId() {
    return this.id;
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

  public void setId(Long id) {
    this.id = id;
  }
}
