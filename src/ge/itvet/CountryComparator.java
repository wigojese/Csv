package ge.itvet;

import java.util.Comparator;

public interface CountryComparator {

    class ByName implements Comparator<Country> {

        @Override
        public int compare(Country country, Country country1 ) {
            return country.getName().compareTo(country1.getName());
        }
    }

    class ByArea implements Comparator<Country> {

        @Override
        public int compare(Country country, Country country1 ) {
             return Integer.compare(country.getArea(), country1.getArea());
        }
    }

    class ByPopulation implements Comparator<Country> {
        @Override
        public int compare(Country country, Country country1) {
            return Integer.compare(country.getPopulation(), country1.getPopulation());
        }
    }
}
