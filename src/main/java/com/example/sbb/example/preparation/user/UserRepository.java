package com.example.sbb.example.preparation.user;

import com.example.sbb.example.preparation.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
    Optional<SiteUser> findByemail(String email);
    SiteUser findByUsernameAndEmail(String username, String email);
}
