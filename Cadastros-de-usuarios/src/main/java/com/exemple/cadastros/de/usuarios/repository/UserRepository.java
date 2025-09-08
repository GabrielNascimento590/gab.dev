package com.exemple.cadastros.de.usuarios.repository;
import com.exemple.cadastros.de.usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface UserRepository extends JpaRepository<User, Long> {

}









