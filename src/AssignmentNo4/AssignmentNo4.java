package AssignmentNo4;

import java.util.ArrayList;

public class AssignmentNo4 {
    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Blake", 5594, 35);
        Officer officer2 = new Officer("Martin", "Carson", 5595, 10);
        Officer officer3 = new Officer("Jack", "Steal", 5596, 42);
        Officer officer4 = new Officer("Nil", "Johnson", 5597, 31);
        Officer officer5 = new Officer("Tod", "Pearson", 5598, 16);
        Officer officer6 = new Officer("James", "Silver", 5599, 36);
        Officer officer7 = new Officer("Teo", "Clever", 5593, 21);

        District district1 = new District("District1", "downtown", 1, new ArrayList<Person>());
        District district2 = new District("District2", "area", 2, new ArrayList<Person>());

        Lawyer lawyer1 = new Lawyer("Greg", "Jordan", 6095, 12);
        Lawyer lawyer2 = new Lawyer("John", "Wane", 6096, 23);
        Lawyer lawyer3 = new Lawyer("Tim", "Baker", 6095, 31);

        district1.addNewPerson(officer1);
        district1.addNewPerson(officer2);
        district1.addNewPerson(officer3);
        district1.addNewPerson(lawyer1);
        district1.addNewPerson(lawyer2);

        district2.addNewPerson(officer4);
        district2.addNewPerson(officer5);
        district2.addNewPerson(officer6);
        district2.addNewPerson(officer7);
        district2.addNewPerson(lawyer3);

        System.out.println(district1);
        System.out.println(district2);

        System.out.format("Average Officer`s level in %s: \t%s", district1.getTitle(), district1.calculateAvgLevelInDistrict());
        System.out.format("\nAverage Officer`s level in %s: \t%s\n", district2.getTitle(), district2.calculateAvgLevelInDistrict());

        ArrayList<District> districts = new ArrayList<>();
        districts.add(district1);
        districts.add(district2);

        highestAmountOfPersons(districts);
    }

    public static void highestAmountOfPersons(ArrayList<District> districts) {
        for (int i = 0, j = i + 1; i < districts.size(); i++) {
            if (districts.get(i).getPersonsInTheDistrict().size() > districts.get(j).getPersonsInTheDistrict().size()) {
                System.out.println(districts.get(i).getTitle() + "has the highest amount of Persons");
            } else if (districts.get(i).getPersonsInTheDistrict().size() > districts.get(j).getPersonsInTheDistrict().size()) {
                System.out.println(districts.get(j).getTitle() + "has the highest amount of Persons");
            } else if (districts.get(i).getPersonsInTheDistrict().size() == districts.get(j).getPersonsInTheDistrict().size() && i != j) {
                System.out.println("The amount of Persons is equal in both districts.");
            }
        }
    }
}
