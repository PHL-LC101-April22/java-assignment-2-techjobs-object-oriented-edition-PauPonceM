package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id= nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name= name;
        this.employer= employer;
        this.location= location;
        this.positionType= positionType;
        this.coreCompetency= coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString(){
        String noData = "Data not available";
        String nameV;
        String employerV;
        String locationV;
        String positionTypeV;
        String coreCompetencyV;

        if (this.getName().isEmpty()) {
             nameV = noData;
        }else {
            nameV = getName();
        }
        if (this.getEmployer().getValue().isEmpty()) {
            employerV = noData;
        }else {
            employerV = getEmployer().getValue();
        }
        if (this.getLocation().getValue().isEmpty()) {
            locationV = noData;
        }else {
            locationV = getLocation().getValue();
        }
        if (this.getPositionType().getValue().isEmpty()) {
            positionTypeV = noData;
        }else {
            positionTypeV = getPositionType().getValue();
        }
        if (this.getCoreCompetency().getValue().isEmpty()){
            coreCompetencyV = noData;
        } else {
            coreCompetencyV = getCoreCompetency().getValue();
        }
            return "\nID: " + this.getId() +
                    "\nName: " + nameV +
                    "\nEmployer: " + employerV +
                    "\nLocation: " + locationV +
                    "\nPosition Type: " + positionTypeV +
                    "\nCore Competency: " + coreCompetencyV + "\n";
        }


    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(!(o instanceof Job)) return false;
        Job job=(Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {return Objects.hash(getId());}

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
