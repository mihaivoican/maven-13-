package homework17;

import java.util.List;

public record Country(int id,String name, String capital, double population, double area, String continent, List<String> neighbour) {
    //citim tarile din fisier
    //name|capital|population|area|continent|neighbour1~neighbour2

}
