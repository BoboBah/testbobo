package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Traitement implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTraitement;

    private Date dateTraitement;


    @ManyToOne
    @JoinColumn(name = "idMedecin")
    private Medecin medecin;









    @ManyToOne
    @JoinColumn(name = "idBeneficiare")
    private Beneficiaire beneficiaire;



    @ManyToOne
    @JoinColumn(name = "idAssure")
    private Assure assure;



    @OneToOne
    @JoinColumn(name = "idActeMedical")
    private ActeMedical acteMedical;



    @OneToOne
    @JoinColumn(name = "idMaladie")
    private Maladie maladie;


    @OneToOne
    @JoinColumn(name = "idAccident")
    private Accident accident;


    public Long getIdTraitement() {
        return idTraitement;
    }

    public void setIdTraitement(Long idTraitement) {
        this.idTraitement = idTraitement;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
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

    public ActeMedical getActeMedical() {
        return acteMedical;
    }

    public void setActeMedical(ActeMedical acteMedical) {
        this.acteMedical = acteMedical;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }

    public Accident getAccident() {
        return accident;
    }

    public void setAccident(Accident accident) {
        this.accident = accident;
    }

    public Traitement() {
    }


    public Traitement(Date dateTraitement, Medecin medecin, Beneficiaire beneficiaire, Assure assure, ActeMedical acteMedical, Maladie maladie, Accident accident) {
        this.dateTraitement = dateTraitement;
        this.medecin = medecin;
        this.beneficiaire = beneficiaire;
        this.assure = assure;
        this.acteMedical = acteMedical;
        this.maladie = maladie;
        this.accident = accident;
    }
}
