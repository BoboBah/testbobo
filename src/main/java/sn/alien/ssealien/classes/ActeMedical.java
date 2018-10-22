package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class ActeMedical implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String designation;

    private double montant;

    private double montantHonoraire;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "acteMedical")
    private Traitement traitement;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontantHonoraire() {
        return montantHonoraire;
    }

    public void setMontantHonoraire(double montantHonoraire) {
        this.montantHonoraire = montantHonoraire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public ActeMedical() {
    }

    public ActeMedical(String designation, double montant, double montantHonoraire) {
        this.designation = designation;
        this.montant = montant;
        this.montantHonoraire = montantHonoraire;
    }
}
