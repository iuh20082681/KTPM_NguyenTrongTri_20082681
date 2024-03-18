package vn.edu.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fit.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
