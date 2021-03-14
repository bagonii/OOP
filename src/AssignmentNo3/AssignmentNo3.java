package AssignmentNo3;

import java.util.ArrayList;

public class AssignmentNo3 {
    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Blake", 5594, 35);
        Officer officer2 = new Officer("Martin", "Carson", 5595, 10);
        Officer officer3 = new Officer("Jack", "Steal", 5596, 42);
        Officer officer4 = new Officer("Nil", "Johnson", 5597, 31);
        Officer officer5 = new Officer("Tod", "Pearson", 5598, 16);
        Officer officer6 = new Officer("James", "Silver", 5599, 36);
        Officer officer7 = new Officer("Teo", "Clever", 5593, 21);

        District district1 = new District("District1", "downtown", 1, new Officer[0]);
        District district2 = new District("District2", "area", 2, new Officer[0]);

        Lawyer lawyer1 = new Lawyer("Greg", "Jordan", 6095, 12);
        Lawyer lawyer2 = new Lawyer("John", "Wane", 6096, 23);
        Lawyer lawyer3 = new Lawyer("Tim", "Baker", 6095, 31);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);
        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println(district1);
        System.out.println(district2);
        System.out.format("\nLawyer1: %s, \nLawyer2: %s, \nLawyer3: %s", lawyer1.toString(), lawyer2.toString(), lawyer3.toString());

        ArrayList<Lawyer> lawyersList = new ArrayList<>();
        lawyersList.add(lawyer1);
        lawyersList.add(lawyer2);
        lawyersList.add(lawyer3);
        System.out.println("\n\nThe total number of crimes in which solving Lawyers were involved: " + solvedCrimes(lawyersList));
        System.out.println("\nThe best lawyer is: " + findTheBest(lawyersList));

    }

    public static int solvedCrimes(ArrayList<Lawyer> lawyersList) {
        int sum = 0;
        for (Lawyer lawyer : lawyersList) {
            sum += lawyer.getHelpedInCrimesSolving();
        }
        return sum;
    }

    public static Lawyer findTheBest(ArrayList<Lawyer> lawyersList) {
        Lawyer theBest = null;
        for (Lawyer lawyer : lawyersList) {
            if (lawyer.getHelpedInCrimesSolving() > Integer.MIN_VALUE) {
                theBest = lawyer;
            }
        }
        return theBest;
    }
}
