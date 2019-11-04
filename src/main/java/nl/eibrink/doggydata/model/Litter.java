package nl.eibrink.doggydata.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Litter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String pedigreeNameOfMother;

    @NonNull
    private String pedigreeNameOfFather;

    @NonNull
    @Temporal(TemporalType.DATE)
    private Date birthDateOfLitter;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Dog> pupsOfLitter;

    //JPA
    public Litter(){}

    public Litter(String pedigreeNameOfMother, String pedigreeNameOfFather, Date birthDateOfLitter, List<Dog> pupsOfLitter) {
        this.pedigreeNameOfMother = pedigreeNameOfMother;
        this.pedigreeNameOfFather = pedigreeNameOfFather;
        this.birthDateOfLitter = birthDateOfLitter;
        this.pupsOfLitter = pupsOfLitter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPedigreeNameOfMother() {
        return pedigreeNameOfMother;
    }

    public void setPedigreeNameOfMother(String pedigreeNameOfMother) {
        this.pedigreeNameOfMother = pedigreeNameOfMother;
    }

    public String getPedigreeNameOfFather() {
        return pedigreeNameOfFather;
    }

    public void setPedigreeNameOfFather(String pedigreeNameOfFather) {
        this.pedigreeNameOfFather = pedigreeNameOfFather;
    }

    public Date getBirthDateOfLitter() {
        return birthDateOfLitter;
    }

    public void setBirthDateOfLitter(Date birthDateOfLitter) {
        this.birthDateOfLitter = birthDateOfLitter;
    }

    public List<Dog> getPupsOfLitter() {
        return pupsOfLitter;
    }

    public void setPupsOfLitter(List<Dog> pupsOfLitter) {
        this.pupsOfLitter = pupsOfLitter;
    }
}

