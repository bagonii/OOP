package AssignmentNo2;

public class Officer {
    private String name;
    private String surname;
    public int officerID;
    private int crimesSolved;

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }

    public Officer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return name + ", " + surname + ", " + officerID + ", " + ", " + crimesSolved;
    }

    public int calculateLevel(int crimesSolved) {
        int level;
        if ((crimesSolved > 0) && (crimesSolved < 20)) level = 1;
        else if ((crimesSolved >= 20) && (crimesSolved < 40)) level = 2;
        else if ((crimesSolved >= 40)) level = 3;
        else level = 0;
        return level;
    }
}
