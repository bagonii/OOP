package AssignmentNo4;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtId;
    private ArrayList<Person> personsInTheDistrict = new ArrayList<>();

    public District() {
    }

    public District(String title, String city, int districtId, ArrayList<Person> personsInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        this.personsInTheDistrict = personsInTheDistrict;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public ArrayList<Person> getPersonsInTheDistrict() {
        return personsInTheDistrict;
    }

    public void setPersonsInTheDistrict(ArrayList<Person> personsInTheDistrict) {
        this.personsInTheDistrict = personsInTheDistrict;
    }
    public String toString() {
        return getTitle() + ", " + getCity() + ", " + getDistrictId() + ", " + getPersonsInTheDistrict();
    }

    public boolean addNewPerson(Person person) {
            personsInTheDistrict.add(person);
            return true;
        }

    public boolean removePerson(String name, String surname) {
        if (!name.isEmpty() && !surname.isEmpty()) {
            personsInTheDistrict.removeIf(person -> person.getName().equals(name) && person.getSurname().equals(surname));
            return true;
        }
        return false;
    }

    public float calculateAvgLevelInDistrict() {
        ArrayList<Officer> officerArrayList = new ArrayList<>();
        for (int i = 0; i < getPersonsInTheDistrict().size(); i++){
            if (getPersonsInTheDistrict().get(i) instanceof Officer){
                officerArrayList.add((Officer) getPersonsInTheDistrict().get(i));
            }
        }
        float sum = 0;
        for (Officer officer : officerArrayList) {
            sum += officer.calculateLevel(officer.getCrimesSolved());
        }
        return sum / officerArrayList.size();
    }
}
