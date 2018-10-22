package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.User;


public interface UserRepository extends JpaRepository<User, String> {
}
