package sn.alien.ssealien.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
public class Assurance implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAssurance;



    @Column(unique = true)
    private String ninea;




    private String nomAssurance;


    private String adresse;

    private String email;


    private String telephoneFixe;


    private String fax;




    @OneToMany(mappedBy = "assurance")
    private Collection<EmployeAssurance> employeAssurances;

    @OneToMany(mappedBy = "assurance")
    private Collection<Assure> assures;


    public Long getIdAssurance() {
        return idAssurance;
    }

    public void setIdAssurance(Long idAssurance) {
        this.idAssurance = idAssurance;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getNomAssurance() {
        return nomAssurance;
    }

    public void setNomAssurance(String nomAssurance) {
        this.nomAssurance = nomAssurance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Collection<EmployeAssurance> getEmployeAssurances() {
        return employeAssurances;
    }

    public void setEmployeAssurances(Collection<EmployeAssurance> employeAssurances) {
        this.employeAssurances = employeAssurances;
    }

    public Collection<Assure> getAssures() {
        return assures;
    }

    public void setAssures(Collection<Assure> assures) {
        this.assures = assures;
    }

    public Assurance() {
    }

    public Assurance(String ninea, String nomAssurance, String adresse, String email, String telephoneFixe, String fax) {
        this.ninea = ninea;
        this.nomAssurance = nomAssurance;
        this.adresse = adresse;
        this.email = email;
        this.telephoneFixe = telephoneFixe;
        this.fax = fax;
    }
}
