package sn.alien.ssealien.classes;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    private String username;
    private String password;
    private boolean actived;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Medecin medecin;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Assure assure;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private EmployeAssurance employeAssurance;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Assistant assistant;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Pharmacien pharmacien;

    @ManyToMany
    @JoinTable(name = "USERS_ROLES")
    private Collection<Role> roles;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActived() {
        return actived;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }


    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }


    public Assure getAssure() {
        return assure;
    }

    public void setAssure(Assure assure) {
        this.assure = assure;
    }

    public EmployeAssurance getEmployeAssurance() {
        return employeAssurance;
    }

    public void setEmployeAssurance(EmployeAssurance employeAssurance) {
        this.employeAssurance = employeAssurance;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public Pharmacien getPharmacien() {
        return pharmacien;
    }

    public void setPharmacien(Pharmacien pharmacien) {
        this.pharmacien = pharmacien;
    }

    public User() {
        super();
        this.actived=false;
    }


    public User(String username, String password, boolean actived) {
        this.username = username;
        this.password = password;
        this.actived = actived;
    }
}
