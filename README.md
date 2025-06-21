# API Usuários

Base URL: `/api/users`

---

## Endpoints

### 1. Listar todos os usuários

- **GET** `/api/users`
- Retorna todos os usuários cadastrados.
- **Resposta:**
  - Status: 200 OK
  - Corpo: Array JSON com usuários

### 2. Criar um novo usuário

- **POST** `/api/users`
- Cria um novo usuário.
- **Body (JSON):**

  ```json
  {
    "nome": "Lucas",
    "email": "lucas@email.com",
    "senha": "Senha123!"
  }
  
  ### 3. Deletar um usuário

- **DELETE** /api/users/{id}
- Remove o usuário pelo ID.
- Parâmetros: id (Long) - ID do usuário
- Resposta: 200 OK: "Usuário deletado com sucesso" 404 Not Found: "Usuário não existe"

  ### 4. Atualizar um usuário
  - **PUT** /api/users/{id}
  - Atualiza o usuário pelo ID.
  - Parâmetros: id (Long) - ID do usuário
  - Body (JSON):
  ```
  {
  "nome": "Lucas Silva",
  "email": "lucas.silva@email.com",
  "senha": "NovaSenha123!"
}
Resposta: 200 OK: JSON com o usuário atualizado
Erros: 404 Not Found: caso o usuário não exista


  
