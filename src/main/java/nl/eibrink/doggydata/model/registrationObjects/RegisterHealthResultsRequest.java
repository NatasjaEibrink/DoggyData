package nl.eibrink.doggydata.model.registrationObjects;
import java.util.Date;

public class RegisterHealthResultsRequest {

    private String patella;

    private String heupen;

    private String ogen;

    private Date dateOfExamination;

    public RegisterHealthResultsRequest(){}

    public RegisterHealthResultsRequest(String patella, String heupen, String ogen, Date dateOfExamination) {
        this.patella = patella;
        this.heupen = heupen;
        this.ogen = ogen;
        this.dateOfExamination = dateOfExamination;
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
}
