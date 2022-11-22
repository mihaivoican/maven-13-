package homework17;

import java.io.IOException;
import java.util.List;

public class CountryService {
    private final List<Country> listaTari;

    //constructor
    public CountryService() throws IOException {
        listaTari = CountryReader.listCountries("files/countries2.txt");
    }

    public List<Country> getListaTari() {
        return listaTari;
    }


    //- list all country names :  -> returns a list of strings
    public List<String> countriesNames() {
        return listaTari.stream()
                .map(c -> c.name())
                .toList();
    }

    //- get capital of a country :  -> returns a string
    public String getCapital(String country) {
        return listaTari.stream()
                .filter(c -> c.name().equals(country))
                .map(c -> c.capital())
                .findFirst()
                .orElse("nu exista aceasta tara");

    }

    // get population of a country : -> returns a long
    public double getPopulation(String country) {
        return listaTari.stream()
                .filter(c -> c.name().equals(country))
                .map(Country::population)
                .findFirst()
                .orElse(0d);

    }

    //- get countries in continent : -> returns list of Country objects
    public List<String> getCountryInContinent(String continent) {
        return listaTari.stream()
                .filter(c -> c.continent().equals(continent))
                .map(Country::name)
                .toList();
    }

    //- get country neighbours :  -> returns list of Strings
    public List<List<String>> getCountryNeighbours(String country) {
        return listaTari.stream()
                .filter(c -> c.name().equals(country))
                .map(Country::neighbour)
                .toList();
    }

    //- get countries in <continent> with population larger than <population> : -> returns list of Country objects
    public List<Country> getCountryWithPopulationGreaterThan(String continent, double population) {
        return listaTari.stream()
                .filter(c -> c.continent().equals(continent))
                .filter(c -> c.population() > population)
                .toList();
    }

    //tari care au vecin tara X
    public boolean hasNeighbour(Country c, String vecin) {
        return c.neighbour() != null && c.neighbour().size() > 0 && c.neighbour().stream()
                .anyMatch(v -> v.equals(vecin));
    }

    //tari care nu au vecin tara Y
    public boolean hasNotNeighbour(Country c, String vecin) {
        return c.neighbour() == null || c.neighbour().size() == 0 || c.neighbour().stream()
                .noneMatch(v -> v.equals(vecin));
    }
    //- get countries that neighbor X but not neighbor Y :-> returns list of Country objects

    public List<Country> getCountryWithNeighbourWithoutNeighbour(String tara1, String tara2) {
        return listaTari.stream()
                .filter(c -> hasNeighbour(c, tara1))
                .filter(c -> hasNotNeighbour(c, tara2))
                .toList();

    }


}
