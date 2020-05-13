package ru.alexrufov.mytwitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexrufov.mytwitter.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername (String username);
}