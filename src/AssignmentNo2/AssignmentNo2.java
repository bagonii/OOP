package AssignmentNo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class AssignmentNo2 {
    public static void main(String[] args) {

        ArrayList<District> districts = new ArrayList<>();
        ArrayList<Officer> officers = new ArrayList<>(asList(
                new Officer("John", "Blake", 5594, 35),
                new Officer("Martin", "Carson", 5595, 10),
                new Officer("Jack", "Steal", 5596, 42)
        ));
        districts.add(new District("District1", "downtown", 1, officers));
        officers = new ArrayList<>(asList(
                new Officer("Nil", "Johnson", 5597, 31),
                new Officer("Tod", "Pearson", 5598, 16),
                new Officer("James", "Silver", 5599, 36),
                new Officer("Teo", "Clever", 5593, 21)
        ));
        districts.add(new District("District2", "area", 2, officers));

        System.out.println(districts.get(0));
        System.out.println(districts.get(1));

        districts.get(1).removeOfficer(5593);

        System.out.println("\nAverage level in District 1: " + dF.format(districts.get(0).calculateAvgLevelInDistrict()));
        System.out.println("Average level in District 2: " + dF.format(districts.get(1).calculateAvgLevelInDistrict()));

        ArrayList<District> mergedDistrict = new ArrayList<>();
        mergedDistrict.add(districts.get(0));
        mergedDistrict.add(districts.get(1));

        for (District district : mergedDistrict) {
            System.out.println("\nDistrict: " + district.getDistrictId() + "\t" + district.getCity());
            System.out.println("Count of officer: " + district.getOfficersInTheDistrict().size());
            for (Officer officer : district.getOfficersInTheDistrict()) {
                System.out.format("Officer name: %s, surname: %s%n", officer.getName(), officer.getSurname());
            }
        }
        System.out.println("\nCount of Officer in both districts: " + countOfficers(mergedDistrict));
        System.out.println("Average level in both districts: " + dF.format(averageLevelBothDistricts(mergedDistrict)));

        if (districts.get(0).calculateAvgLevelInDistrict() > (districts.get(1).calculateAvgLevelInDistrict())) {
            System.out.println(districts.get(0).getTitle() + " is the best based on the average level of Officers.");
        } else {
            System.out.println(districts.get(1).getTitle() + " is the best based on the average level of Officers.");
        }
    }

    public static DecimalFormat dF = new DecimalFormat("0.00");

    public static int countOfficers(ArrayList<District> mergedDistrict) {
        int counter = 0;
        for (District district : mergedDistrict) {
            counter = counter + district.getOfficersInTheDistrict().size();
        }
        return counter;
    }

    public static float averageLevelBothDistricts(ArrayList<District> mergedDistrict) {
        float sum = 0;
        for (District district : mergedDistrict) {
            sum += district.calculateAvgLevelInDistrict();
        }
        return sum / mergedDistrict.size();
    }

}
