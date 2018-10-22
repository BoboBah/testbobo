package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Maladie implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMaladie;

    private String natureMaladie;


    private Date dateMaladie;

    private String duree;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "maladie")
    private Traitement traitement;


    public Long getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(Long idMaladie) {
        this.idMaladie = idMaladie;
    }

    public String getNatureMaladie() {
        return natureMaladie;
    }

    public void setNatureMaladie(String natureMaladie) {
        this.natureMaladie = natureMaladie;
    }

    public Date getDateMaladie() {
        return dateMaladie;
    }

    public void setDateMaladie(Date dateMaladie) {
        this.dateMaladie = dateMaladie;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }


    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public Maladie() {
    }

    public Maladie(String natureMaladie, Date dateMaladie, String duree) {
        this.natureMaladie = natureMaladie;
        this.dateMaladie = dateMaladie;
        this.duree = duree;
    }
}
