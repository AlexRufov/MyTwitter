package ru.alexrufov.mytwitter.repository;

import org.springframework.data.repository.CrudRepository;
import ru.alexrufov.mytwitter.domain.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
