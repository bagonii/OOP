package AssignmentNo3;

import java.util.ArrayList;
import java.util.Arrays;

public class District {
    private String title;
    private String city;
    private int districtId;
    private Officer[] officersInTheDistrict;

    public District(String district1, String downtown, int i) {
    }

    public District(String title, String city, int districtId, Officer[] officersInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        this.officersInTheDistrict = officersInTheDistrict;
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

    public Officer[] getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(Officer[] officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String toString() {
        return getTitle() + ", " + getCity() + ", " + getDistrictId() + ", " + Arrays.toString(getOfficersInTheDistrict());
    }

    public boolean addNewOfficer(Officer officer) {
        ArrayList<Officer> officersList = new ArrayList<>(Arrays.asList(getOfficersInTheDistrict()));
        officersList.add(officer);
        setOfficersInTheDistrict(officersList.toArray(getOfficersInTheDistrict()));
        return true;
    }

    public boolean removeOfficer(Officer officer) {
        ArrayList<Officer> list = new ArrayList<>(Arrays.asList(getOfficersInTheDistrict()));
        list.remove(officer);
        setOfficersInTheDistrict(list.toArray(new Officer[0]));
        return true;
    }

    public float calculateAvgLevelInDistrict() {
        Officer[] officers = getOfficersInTheDistrict();
        float sum = 0;
        for (Officer officer : officers) {
            sum += officer.calculateLevel(officer.getCrimesSolved());
        }
        return sum / officers.length;
    }
}
