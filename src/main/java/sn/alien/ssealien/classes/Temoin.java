package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Temoin implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTemoin;


    private String nom;

    private String prenom;


    private String numeroTelephone;





    @ManyToOne()
    @JoinColumn(name = "idAccident")
    private Accident accident;

    public Long getIdTemoin() {
        return idTemoin;
    }

    public void setIdTemoin(Long idTemoin) {
        this.idTemoin = idTemoin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }


    public Accident getAccident() {
        return accident;
    }

    public void setAccident(Accident accident) {
        this.accident = accident;
    }

    public Temoin() {
    }

    public Temoin(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
