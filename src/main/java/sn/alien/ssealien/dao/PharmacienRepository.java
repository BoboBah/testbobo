package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.Pharmacien;


public interface PharmacienRepository extends JpaRepository<Pharmacien, Long> {
}
