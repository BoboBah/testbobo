package sn.alien.ssealien.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.alien.ssealien.classes.Medecin;
import sn.alien.ssealien.dao.MedecinRepository;
import sn.alien.ssealien.errors.MedecinNotFoundException;


import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class MedecinImpl implements ImetierMedecin {


    @Autowired
    private MedecinRepository medecinRepository;

    @Override
    public Medecin ajouterMedecin(@Valid Medecin medecin) {

        if (medecin == null) {
            throw new MedecinNotFoundException("Medecin ne peut pas etre null");
        }

        return medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> getAllMedecins() {

        return medecinRepository.findAll();
    }

    @Override
    public Medecin getByIdMedecin(Long idMedecin)  {

        if (idMedecin == null) {

            throw new MedecinNotFoundException("Medecin avec "+idMedecin+ "est introuvable");

        }

        Medecin medecin = medecinRepository.getOne(idMedecin);

        if (medecin == null) {
            throw new MedecinNotFoundException("Medecin avec "+idMedecin+ "est introuvable");
        }

        return medecin;
    }

    @Override
    public List<Medecin> getBySpecialite(String specialite) {

        if (specialite == null) {

            throw new MedecinNotFoundException("specialite ne peut etre null");

        }

        List<Medecin> medecins = medecinRepository.findBySpecialite(specialite);

        if (medecins == null) {
            throw new MedecinNotFoundException("Les medecins de cette specialite sont introuvables");
        }

        return medecins;
    }

    @Override
    public Medecin getMedecinByMatricule(String matricule) {

        if (matricule == null) {
            throw new MedecinNotFoundException("aucun medecin avec ce "+matricule+ " matricule");
        }

        Medecin medecin = medecinRepository.findByMatricule(matricule);

        if (medecin == null) {

            throw new MedecinNotFoundException("aucun medecin avec ce "+matricule+ " matricule");

        }


        return medecinRepository.findByMatricule(matricule);
    }
}
