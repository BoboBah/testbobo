package sn.alien.ssealien.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.alien.ssealien.classes.Medecin;


import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {




    public List<Medecin> findBySpecialite(String specialite);



    public Medecin findByMatricule(String matricule);


}
