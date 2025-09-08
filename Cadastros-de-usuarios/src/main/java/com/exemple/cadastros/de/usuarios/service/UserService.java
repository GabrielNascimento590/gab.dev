package com.exemple.cadastros.de.usuarios.service;

import com.exemple.cadastros.de.usuarios.model.User;
import com.exemple.cadastros.de.usuarios.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    private final UserRepository userRepository;

      public UserService(UserRepository userRepository) {
          this.userRepository=userRepository;
      }
      //Listar
      public List <User> getAll() {
          return userRepository.findAll();
      }

    public User create(User user) {
        return userRepository.save(user);

    }
    public User update(Long id, User userAtualizado) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setNome(userAtualizado.getNome());
                    user.setEmail(userAtualizado.getEmail());
                    user.setIdade(userAtualizado.getIdade());
                    return userRepository.save(user);
                }).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
    public void delete(Long id) {
        userRepository.deleteById(id);









          }
      }


