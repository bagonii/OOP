package AssignmentNo4;

public class Officer extends Person {

    public int officerID;
    private int crimesSolved;

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        super.setName(name);
        super.setSurname(surname);
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
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
        return super.getName() + ", " + super.getSurname() + ", " + officerID + ", " + ", " + crimesSolved;
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
