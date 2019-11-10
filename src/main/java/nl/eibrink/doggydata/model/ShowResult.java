/*
package nl.eibrink.doggydata.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ShowResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date dateOfExposition;

    private String nameExposition;
    private String nameJudge;
    private String pedigreeNameDog;
    private String dogShowClass; //Todo: change to Enum ?
    private Result result;

    public ShowResult(){}

    public ShowResult(Date dateOfExposition, String nameExposition, String nameJudge, String pedigreeNameDog, String dogShowClass, Result result) {
        this.dateOfExposition = dateOfExposition;
        this.nameExposition = nameExposition;
        this.nameJudge = nameJudge;
        this.pedigreeNameDog = pedigreeNameDog;
        this.dogShowClass = dogShowClass;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfExposition() {
        return dateOfExposition;
    }

    public void setDateOfExposition(Date dateOfExposition) {
        this.dateOfExposition = dateOfExposition;
    }

    public String getNameExposition() {
        return nameExposition;
    }

    public void setNameExposition(String nameExposition) {
        this.nameExposition = nameExposition;
    }

    public String getNameJudge() {
        return nameJudge;
    }

    public void setNameJudge(String nameJudge) {
        this.nameJudge = nameJudge;
    }

    public String getPedigreeNameDog() {
        return pedigreeNameDog;
    }

    public void setPedigreeNameDog(String pedigreeNameDog) {
        this.pedigreeNameDog = pedigreeNameDog;
    }

    public String getDogShowClass() {
        return dogShowClass;
    }

    public void setDogShowClass(String dogShowClass) {
        this.dogShowClass = dogShowClass;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
*/
