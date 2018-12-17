package group.java.repository;

import group.java.user;
import org.springframework.data.repository.CrudRepository;

public interface repository extends CrudRepository <user, Integer> {
}
