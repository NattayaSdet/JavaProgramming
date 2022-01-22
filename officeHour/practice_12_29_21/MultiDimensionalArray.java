package practice_12_29_21;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {


        String[] scrum1 = {"Aysegul", "Timur", "Oleksandr", "Jilili"};

        String[] scrum2 = {"Ali", "Olga"};

        String[] scrum3 = {"Sergei", "Yuliya", "Farangez"};

        String[][] scrumTeams = {{"Aysegul", "Timur", "Oleksandr", "Jilili"}, {"Ali", "Olga"}, {"Sergei", "Yuliya", "Farangez"}};

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrum2[1]); // Olga
        System.out.println(scrumTeams[1][1]); //olga

        System.out.println("----------------------------");

        for (String[] eachScrum :scrumTeams ) {
            for (String eachName : eachScrum) {
                System.out.print(eachName+ " ");

            }

        }


    }
}