package ru.alexrufov.mytwitter.repository;

import org.springframework.data.repository.CrudRepository;
import ru.alexrufov.mytwitter.domain.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
