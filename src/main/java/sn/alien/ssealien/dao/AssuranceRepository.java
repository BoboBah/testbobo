package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.Assurance;


public interface AssuranceRepository extends JpaRepository<Assurance, Long> {


    public Assurance findByIdAssurance(Long id);
}
