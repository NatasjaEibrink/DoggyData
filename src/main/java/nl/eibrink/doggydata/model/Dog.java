package nl.eibrink.doggydata.model;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String pedigreeName;

    @NonNull
    private String sex;

    //private Date birthDate;

    //JPA
    public Dog(){}

    public Dog(String pedigreeName, String sex) {
        this.pedigreeName = pedigreeName;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPedigreeName() {
        return pedigreeName;
    }

    public void setPedigreeName(String pedigreeName) {
        this.pedigreeName = pedigreeName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
