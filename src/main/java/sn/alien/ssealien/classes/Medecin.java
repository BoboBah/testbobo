package sn.alien.ssealien.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Medecin implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMedecin;


    @Column(unique = true)
    private String matricule;


    private String nom;


    private String prenom;


    private String specialite;


    private String telephoneFixe;


    private String telephoneMobile;


    private String email;


    private Date dateNaissance;



    @OneToOne
    @JoinColumn(name = "idUser")
    @JsonIgnore
    private User user;


    @OneToMany(mappedBy = "medecin")
    @JsonIgnore
    private Collection<Assistant> assistants;

    @OneToMany(mappedBy = "medecin")
    @JsonIgnore
    private Collection<Traitement> traitements;


    public Long getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(Long idMedecin) {
        this.idMedecin = idMedecin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(String telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Collection<Assistant> getAssistants() {
        return assistants;
    }

    public void setAssistants(Collection<Assistant> assistants) {
        this.assistants = assistants;
    }

    public Collection<Traitement> getTraitements() {
        return traitements;
    }

    public void setTraitements(Collection<Traitement> traitements) {
        this.traitements = traitements;
    }



    public Medecin() {
    }

    public Medecin(String matricule, String nom, String prenom, String specialite, String telephoneFixe, String telephoneMobile, String email, Date dateNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.telephoneFixe = telephoneFixe;
        this.telephoneMobile = telephoneMobile;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }


}
