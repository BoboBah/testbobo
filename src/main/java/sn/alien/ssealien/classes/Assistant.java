package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Assistant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAssistant;

    private String nomAssistant;

    private String prenomAssistant;




    @OneToOne
    @JoinColumn(name = "idUser")
    private User user;


    @ManyToOne()
    @JoinColumn(name = "idMedecin")
    private Medecin medecin;


    public Long getIdAssistant() {
        return idAssistant;
    }

    public void setIdAssistant(Long idAssistant) {
        this.idAssistant = idAssistant;
    }

    public String getNomAssistant() {
        return nomAssistant;
    }

    public void setNomAssistant(String nomAssistant) {
        this.nomAssistant = nomAssistant;
    }

    public String getPrenomAssistant() {
        return prenomAssistant;
    }

    public void setPrenomAssistant(String prenomAssistant) {
        this.prenomAssistant = prenomAssistant;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public Assistant() {
    }

    public Assistant(String nomAssistant, String prenomAssistant) {
        this.nomAssistant = nomAssistant;
        this.prenomAssistant = prenomAssistant;
    }
}
