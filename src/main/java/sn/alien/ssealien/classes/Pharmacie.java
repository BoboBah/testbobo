package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Pharmacie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPharmacie;


    private String nomPharmacie;


    private String adresse;

    private String email;


    private String telephone;


    private String telephoneMobile;


    @OneToMany(mappedBy = "pharmacie")
    private Collection<Pharmacien> pharmaciens;




    @OneToMany(mappedBy = "pharmacie")
    private Collection<TraitementPharmacie> traitementPharmacies;









    public String getNomPharmacie() {
        return nomPharmacie;
    }

    public void setNomPharmacie(String nomPharmacie) {
        this.nomPharmacie = nomPharmacie;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Collection<Pharmacien> getPharmaciens() {
        return pharmaciens;
    }

    public void setPharmaciens(Collection<Pharmacien> pharmaciens) {
        this.pharmaciens = pharmaciens;
    }


    public Long getIdPharmacie() {
        return idPharmacie;
    }

    public void setIdPharmacie(Long idPharmacie) {
        this.idPharmacie = idPharmacie;
    }

    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }


    public Collection<TraitementPharmacie> getTraitementPharmacies() {
        return traitementPharmacies;
    }

    public void setTraitementPharmacies(Collection<TraitementPharmacie> traitementPharmacies) {
        this.traitementPharmacies = traitementPharmacies;
    }

    public Pharmacie() {
    }




    public Pharmacie(String nomPharmacie, String adresse, String email, String telephone, String telephoneMobile) {
        this.nomPharmacie = nomPharmacie;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.telephoneMobile = telephoneMobile;
    }
}
