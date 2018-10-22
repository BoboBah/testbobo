package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.Role;


public interface RoleRepository extends JpaRepository<Role, String> {
}
