
package nl.eibrink.doggydata.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class HealthTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String patella;

    private String heupen;

    private String ogen;

    @Temporal(TemporalType.DATE)
    private Date dateOfExamination;

    @ManyToOne
    private Dog dog;

    public HealthTest(){}

    public HealthTest(String patella, String heupen, String ogen, Date dateOfExamination, Dog dog) {
        this.patella = patella;
        this.heupen = heupen;
        this.ogen = ogen;
        this.dateOfExamination = dateOfExamination;
        this.dog = dog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatella() {
        return patella;
    }

    public void setPatella(String patella) {
        this.patella = patella;
    }

    public String getHeupen() {
        return heupen;
    }

    public void setHeupen(String heupen) {
        this.heupen = heupen;
    }

    public String getOgen() {
        return ogen;
    }

    public void setOgen(String ogen) {
        this.ogen = ogen;
    }

    public Date getDateOfExamination() {
        return dateOfExamination;
    }

    public void setDateOfExamination(Date dateOfExamination) {
        this.dateOfExamination = dateOfExamination;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}

