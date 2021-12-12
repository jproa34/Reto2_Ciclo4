package com.hiper.repository.crud;

import com.hiper.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Juan pablo Roa Fragozo
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
    public Optional<User> findByEmailAndPassword(String email, String password);
}
