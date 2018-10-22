package sn.alien.ssealien.metier;



import sn.alien.ssealien.classes.Medecin;

import java.util.List;

public interface ImetierMedecin {

    public Medecin ajouterMedecin(Medecin medecin);



    public List<Medecin> getAllMedecins();


    public Medecin getByIdMedecin(Long idMedecin);


    public List<Medecin> getBySpecialite(String specialite);


    public Medecin getMedecinByMatricule(String matricule);







}
