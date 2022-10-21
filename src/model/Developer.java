package model;

import java.util.List;

public class Developer {
    Long id;
    String firsName;
    String lastName;
    List <Skill> skills;

    public Developer(Long id, String firsName, String lastName, List<Skill> skills) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
