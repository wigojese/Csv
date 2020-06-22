package ge.itvet;

import java.io.*;
import java.util.*;


public class Main {

    public static final String CSV_PATH = "D:\\country.csv";

    public static void main(String[] args) throws Exception {


        List<Country> alist = new ArrayList<>();
        FileReader fileReader = new FileReader(CSV_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        bufferedReader.readLine();
        String s=null;
        while ((s = bufferedReader.readLine()) != null) {
            if (!s.isEmpty()) {
                String[] parts = s.split(",");
                int area = Integer.parseInt(parts[2].trim());
                int population = Integer.parseInt(parts[1].trim());
                Country countries = new Country(parts[0], population, area);
                alist.add(countries);
            }

        }
            System.out.println("Choose number (1, 2, or 3) to sort countries: " + "\n" +
                    "1. by name; " + "\n" +
                    "2. by area; " + "\n" +
                    "3. by population" + "\n");


            String sorting = reader.readLine();
            if (sorting.contentEquals("1")) {
                alist.sort((Country country, Country country1) -> -1 * country.getName().compareTo(country1.getName()));
                System.out.println(alist);
            } else if (sorting.contentEquals("2")) {
                alist.sort((Country country, Country country1) -> -1 * Integer.compare(country.getArea(), (country1.getArea())));
                System.out.println(alist);
            } else if (sorting.contentEquals("3")) {
                alist.sort((Country countr, Country country1) -> -1 * Integer.compare(countr.getPopulation(), (country1.getPopulation())));
                System.out.println(alist);
            } else {
                System.err.println("Error, please try again");
            }
        }
}

