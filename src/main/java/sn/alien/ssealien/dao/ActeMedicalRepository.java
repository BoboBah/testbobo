package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.ActeMedical;


public interface ActeMedicalRepository extends JpaRepository<ActeMedical, Long> {
}
