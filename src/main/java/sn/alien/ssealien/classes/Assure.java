package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Assure implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAssure;

    private String nomAssure;


    private String prenomAssure;

    @Column(unique = true)
    private String refPolice;

    private String souscripteur;


    @ManyToOne
    @JoinColumn(name = "idAssurance")
    private Assurance assurance;


    @OneToMany(mappedBy = "assure")
    private Collection<Beneficiaire> beneficiaires;

    @OneToOne
    @JoinColumn(name = "idUser")
    private User user;


    @OneToMany(mappedBy = "assure")
    private Collection<Traitement> traitements;

    @OneToMany(mappedBy = "assure")
    private Collection<TraitementPharmacie> traitementPharmacies;


    public Long getIdAssure() {
        return idAssure;
    }

    public void setIdAssure(Long idAssure) {
        this.idAssure = idAssure;
    }

    public String getNomAssure() {
        return nomAssure;
    }

    public void setNomAssure(String nomAssure) {
        this.nomAssure = nomAssure;
    }

    public String getPrenomAssure() {
        return prenomAssure;
    }

    public void setPrenomAssure(String prenomAssure) {
        this.prenomAssure = prenomAssure;
    }

    public String getRefPolice() {
        return refPolice;
    }

    public void setRefPolice(String refPolice) {
        this.refPolice = refPolice;
    }

    public String getSouscripteur() {
        return souscripteur;
    }

    public void setSouscripteur(String souscripteur) {
        this.souscripteur = souscripteur;
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }


    public Collection<Beneficiaire> getBeneficiaires() {
        return beneficiaires;
    }

    public void setBeneficiaires(Collection<Beneficiaire> beneficiaires) {
        this.beneficiaires = beneficiaires;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Collection<Traitement> getTraitements() {
        return traitements;
    }

    public void setTraitements(Collection<Traitement> traitements) {
        this.traitements = traitements;
    }


    public Collection<TraitementPharmacie> getTraitementPharmacies() {
        return traitementPharmacies;
    }

    public void setTraitementPharmacies(Collection<TraitementPharmacie> traitementPharmacies) {
        this.traitementPharmacies = traitementPharmacies;
    }

    public Assure() {
    }

    public Assure(String nomAssure, String prenomAssure, String refPolice, String souscripteur) {
        this.nomAssure = nomAssure;
        this.prenomAssure = prenomAssure;
        this.refPolice = refPolice;
        this.souscripteur = souscripteur;
    }
}
