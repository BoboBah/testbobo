package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pharmacien implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPharmacien;

    private String nomPharmacien;

    private String prenomPharmacien;



    @ManyToOne()
    @JoinColumn(name = "idPharmacie")
    private Pharmacie pharmacie;

    @OneToOne
    @JoinColumn(name = "idUser")
    private User user;


    public String getNomPharmacien() {
        return nomPharmacien;
    }

    public void setNomPharmacien(String nomPharmacien) {
        this.nomPharmacien = nomPharmacien;
    }

    public String getPrenomPharmacien() {
        return prenomPharmacien;
    }

    public void setPrenomPharmacien(String prenomPharmacien) {
        this.prenomPharmacien = prenomPharmacien;
    }





    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pharmacien() {
    }

    public Pharmacien(String nomPharmacien, String prenomPharmacien) {
        this.nomPharmacien = nomPharmacien;
        this.prenomPharmacien = prenomPharmacien;
    }
}
