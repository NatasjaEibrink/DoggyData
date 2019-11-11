package nl.eibrink.doggydata.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pedigreeName;

    private String sex;

    private Date birthDate;

    //JPA
    public Dog(){}

    public Dog(Integer id){
        this.id = id;
    }

    public Dog(String pedigreeName, String sex, Date birthDate) {
        this.pedigreeName = pedigreeName;
        this.sex = sex;
        this.birthDate = birthDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
