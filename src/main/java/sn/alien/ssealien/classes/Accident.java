package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity

public class Accident implements Serializable {


//------------------------------------------------------


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAccident;

    private String causes;



    @OneToMany(mappedBy = "accident")
    private Collection<Temoin> temoins;



    private String tiersResponsable;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "accident")
    private Traitement traitement;


    public Long getIdAccident() {
        return idAccident;
    }

    public void setIdAccident(Long idAccident) {
        this.idAccident = idAccident;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public Collection<Temoin> getTemoins() {
        return temoins;
    }

    public void setTemoins(Collection<Temoin> temoins) {
        this.temoins = temoins;
    }

    public String getTiersResponsable() {
        return tiersResponsable;
    }

    public void setTiersResponsable(String tiersResponsable) {
        this.tiersResponsable = tiersResponsable;
    }


    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }



    public Accident() {
    }

    public Accident(String causes, Collection<Temoin> temoins, String tiersResponsable) {
        this.causes = causes;
        this.temoins = temoins;
        this.tiersResponsable = tiersResponsable;
    }


    public Accident(String causes, String tiersResponsable) {
        this.causes = causes;
        this.tiersResponsable = tiersResponsable;
    }
}
