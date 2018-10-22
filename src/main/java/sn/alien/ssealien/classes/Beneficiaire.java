package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
public class Beneficiaire implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBeneficiaire;

    private String nomBeneficiaire;

    private String prenomBeneficiaire;


    private Date dateNaissance;

    @Column(unique = true)
    private String refPolice;



    @ManyToOne()
    @JoinColumn(name = "idAssure")
    private Assure assure;

    @OneToMany(mappedBy = "beneficiaire")
    private Collection<Traitement> traitements;


    @OneToMany(mappedBy = "beneficiaire")
    private Collection<TraitementPharmacie> traitementPharmacies;






    public Long getIdBeneficiaire() {
        return idBeneficiaire;
    }

    public void setIdBeneficiaire(Long idBeneficiaire) {
        this.idBeneficiaire = idBeneficiaire;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getPrenomBeneficiaire() {
        return prenomBeneficiaire;
    }

    public void setPrenomBeneficiaire(String prenomBeneficiaire) {
        this.prenomBeneficiaire = prenomBeneficiaire;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getRefPolice() {
        return refPolice;
    }

    public void setRefPolice(String refPolice) {
        this.refPolice = refPolice;
    }


    public Assure getAssure() {
        return assure;
    }

    public void setAssure(Assure assure) {
        this.assure = assure;
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

    public Beneficiaire() {
    }

    public Beneficiaire(String nomBeneficiaire, String prenomBeneficiaire, Date dateNaissance, String refPolice) {
        this.nomBeneficiaire = nomBeneficiaire;
        this.prenomBeneficiaire = prenomBeneficiaire;
        this.dateNaissance = dateNaissance;
        this.refPolice = refPolice;
    }
}
