package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.Maladie;

public interface MaladieRepository extends JpaRepository<Maladie, Long> {
}
