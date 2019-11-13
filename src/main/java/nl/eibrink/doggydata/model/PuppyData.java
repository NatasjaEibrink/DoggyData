package nl.eibrink.doggydata.model;

import javax.persistence.*;

@Entity
public class PuppyData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer weekNumber;

    private Long weight;

    @ManyToOne
    private Dog dog;

    public PuppyData(){}

    public PuppyData(Integer weekNumber, Long weight, Dog dog) {
        this.weekNumber = weekNumber;
        this.weight = weight;
        this.dog = dog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString(){
        return weekNumber+" "+weight+" ";
    }
}
