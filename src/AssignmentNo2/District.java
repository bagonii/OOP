package AssignmentNo2;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtId;
    private ArrayList<Officer> officersInTheDistrict;

    public District(String title, String city, int districtId, ArrayList<Officer> officers) {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        this.officersInTheDistrict = new ArrayList<>(officers);
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

    public ArrayList<Officer> getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(ArrayList<Officer> officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    public String toString() {
        return title + ", " + city + ", " + districtId + ", " + officersInTheDistrict;
    }

    public boolean addNewOfficer(Officer officer) {
        if (officer != null) {
            officersInTheDistrict.add(officer);
            return true;
        }
        return false;
    }

    public boolean removeOfficer(int officerID) {
        if (officerID > 0 && officersInTheDistrict.stream().anyMatch(officer -> officer.officerID == officerID)) {
            officersInTheDistrict.removeIf(officer -> officer.officerID == officerID);
        }
        return false;
    }

    public float calculateAvgLevelInDistrict() {
        float sum = 0;
        for (Officer officer : officersInTheDistrict) {
            sum += officer.calculateLevel(officer.getCrimesSolved());
        }
        return sum / officersInTheDistrict.size();
    }
}
