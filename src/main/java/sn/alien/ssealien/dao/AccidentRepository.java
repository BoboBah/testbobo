package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.Accident;


public interface AccidentRepository extends JpaRepository<Accident, Long> {
}
