package AssignmentNo1;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentNo1 {

    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Blake", 5594, "District99", 35);
        Officer officer2 = new Officer("Martin", "Carson", 5595, "District99", 10);
        Officer officer3 = new Officer("Jack", "Steal", 5596, "District99", 42);

        System.out.println(officer1.toString());
        System.out.println("Officer`s level: " + officer1.calculateLevel(officer1.getCrimesSolved()));
        System.out.println(officer2.toString());
        System.out.println("Officer`s level: " + officer2.calculateLevel(officer2.getCrimesSolved()));
        System.out.println(officer3.toString());
        System.out.println("Officer`s level: " + officer3.calculateLevel(officer3.getCrimesSolved()));

        ArrayList<Officer> district99 = new ArrayList<>();
        district99.add(officer1);
        district99.add(officer2);
        district99.add(officer3);
        System.out.println("\nDistrict99: " + district99);
        countLevel(district99, 1);
        System.out.println("\nThere is officer with name John: " + findName(district99));
        Officer officer4 = createOfficer();
        district99.add(officer4);
        System.out.println("New District99: " + district99);
    }

    public static void countLevel(ArrayList<Officer> district99, int level) {
        int counter1 = 0;
        int moreThan1 = 0;
        for (Officer officer : district99) {
            if (officer.calculateLevel(officer.getCrimesSolved()) == level) {
                counter1++;
            } else if (officer.calculateLevel(officer.getCrimesSolved()) > level) {
                moreThan1++;
            }
        }
        System.out.println("\nOfficers with level 1: " + counter1 + "\nOfficers with level larger than 1: " + moreThan1);
    }

    public static boolean findName(ArrayList<Officer> district99) {
        for (Officer officer : district99) {
            return officer.getName().matches("John");
        }
        return false;
    }

    public static Officer createOfficer() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter AssignmentNo1.AssignmentNo1.Officer`s name: ");
        String name = input.nextLine();
        System.out.println("Please enter AssignmentNo1.AssignmentNo1.Officer`s surname: ");
        String surname = input.nextLine();
        System.out.println("Please enter AssignmentNo1.AssignmentNo1.Officer`s ID: ");
        int officerID = Integer.parseInt(input.nextLine());
        System.out.println("Please enter AssignmentNo1.AssignmentNo1.Officer`s district name: ");
        String workingDistrict = input.nextLine();
        System.out.println("Please enter number of AssignmentNo1.AssignmentNo1.Officer`s sold crimes : ");
        int crimesSolved = Integer.parseInt(input.nextLine());
        return new Officer(name, surname, officerID, workingDistrict, crimesSolved);
    }

}


