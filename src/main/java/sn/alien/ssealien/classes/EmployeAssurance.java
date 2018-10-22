package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class EmployeAssurance implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idEmploye;


    @Column(unique = true)
    private String matricule;

    private String nomEmploye;

    private String prenomEmploye;


    @OneToOne
    @JoinColumn(name = "idUser")
    private User user;


    @ManyToOne()
    @JoinColumn(name = "idAssurance")
    private Assurance assurance;


    public Long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }


    public EmployeAssurance() {
    }

    public EmployeAssurance(String matricule, String nomEmploye, String prenomEmploye) {
        this.matricule = matricule;
        this.nomEmploye = nomEmploye;
        this.prenomEmploye = prenomEmploye;
    }


}
