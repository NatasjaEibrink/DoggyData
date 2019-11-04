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
    private Date birthDate;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Dog> pupsOfLitter;

    //JPA
    public Litter(){}

    public Litter(String pedigreeNameOfMother, String pedigreeNameOfFather, Date birthDate, List<Dog> pupsOfLitter) {
        this.pedigreeNameOfMother = pedigreeNameOfMother;
        this.pedigreeNameOfFather = pedigreeNameOfFather;
        this.birthDate = birthDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Dog> getPupsOfLitter() {
        return pupsOfLitter;
    }

    public void setPupsOfLitter(List<Dog> pupsOfLitter) {
        this.pupsOfLitter = pupsOfLitter;
    }
}

