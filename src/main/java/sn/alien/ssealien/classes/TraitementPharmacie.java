package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class TraitementPharmacie implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTraitementPharmacie;

    private Date date;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "idBeneficiare")
    private Beneficiaire beneficiaire;



    @ManyToOne
    @JoinColumn(name = "idAssure")
    private Assure assure;


    @ManyToOne()
    @JoinColumn(name = "idPharmacie")
    private Pharmacie pharmacie;


    public Long getIdTraitementPharmacie() {
        return idTraitementPharmacie;
    }

    public void setIdTraitementPharmacie(Long idTraitementPharmacie) {
        this.idTraitementPharmacie = idTraitementPharmacie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }


    public Beneficiaire getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(Beneficiaire beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public Assure getAssure() {
        return assure;
    }

    public void setAssure(Assure assure) {
        this.assure = assure;
    }

    public TraitementPharmacie() {
    }





    public TraitementPharmacie(Date date, double montant, Pharmacie pharmacie) {
        this.date = date;
        this.montant = montant;
        this.pharmacie = pharmacie;
    }
}
