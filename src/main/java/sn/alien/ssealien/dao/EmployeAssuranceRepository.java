package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.EmployeAssurance;


public interface EmployeAssuranceRepository extends JpaRepository<EmployeAssurance, Long> {

    public EmployeAssurance  findByIdEmploye(Long id);
}
