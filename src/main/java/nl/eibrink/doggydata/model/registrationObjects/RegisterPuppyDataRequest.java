package nl.eibrink.doggydata.model.registrationObjects;

public class RegisterPuppyDataRequest {

    private Integer weekNumber;

    private Long weight;

    public RegisterPuppyDataRequest(){}

    public RegisterPuppyDataRequest(Integer weekNumber, Long weight) {
        this.weekNumber = weekNumber;
        this.weight = weight;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
