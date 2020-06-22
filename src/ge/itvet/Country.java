package ge.itvet;

public class Country  implements Comparable<Country>{
    private  String name;
    private  int area;
    private  int population;

    public Country(String name, int area, int price) {
        this.name = name;
        this.area = area;
        this.population = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public int compareTo(Country country) {
        if (country == null) return 1;
        return this.area == country.area ? 0 : this.area - country.area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population = " + population +
                '}' ;
    }
}
