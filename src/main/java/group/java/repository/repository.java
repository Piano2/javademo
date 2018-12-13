package group.java.repository;

import group.java.user;
import org.springframework.data.repository.CrudRepository;

public interface User extends CrudRepository <user, Integer> {
}
