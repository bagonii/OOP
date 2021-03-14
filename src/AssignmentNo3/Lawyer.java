package AssignmentNo3;

public class Lawyer extends Person {

    private int lawyerID;
    private int helpedInCrimesSolving;

    public Lawyer(String name, String surname, int lawyerID, int helpedInCrimesSolving) {
        super.setName(name);
        super.setSurname(surname);
        this.lawyerID = lawyerID;
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public Lawyer() {
    }

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return helpedInCrimesSolving;
    }

    public void setHelpedInCrimesSolving(int helpedInCrimesSolving) {
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public String toString() {
        return super.getName() + ", " + super.getSurname() + ", " + lawyerID + ", " + helpedInCrimesSolving;
    }
}
