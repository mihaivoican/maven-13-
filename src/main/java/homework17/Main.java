package homework17;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        //listare obiecte tari
        CountryService serviceTari = new CountryService();      //instantiere serviciu-> aici incarc lista tari
        System.out.println(serviceTari.getListaTari());

        //lista nume tari
        System.out.println(serviceTari.countriesNames());

        //gasesc capitala tarii
        System.out.println(serviceTari.getCapital("Afghanistan"));
        System.out.println(serviceTari.getCapital("Austria"));
        System.out.println(serviceTari.getCapital("Astr"));

        //populatia tarii
        System.out.println(serviceTari.getPopulation("Romania"));
        System.out.println(serviceTari.getPopulation(null));

        //tari pe continent
        System.out.println(serviceTari.getCountryInContinent("Asia"));
        System.out.println(serviceTari.getCountryInContinent("Europe"));
        System.out.println(serviceTari.getCountryInContinent("ddd"));

        //lista vecini /tara
        System.out.println(serviceTari.getCountryNeighbours("Romania"));
        System.out.println(serviceTari.getCountryNeighbours("lll"));

        //lista tari in continent cu populatia mai mare decat...
        System.out.println(serviceTari.getCountryWithPopulationGreaterThan("Europe",0));
        System.out.println(serviceTari.getCountryWithPopulationGreaterThan("Europe",20000000));

        //tari vecine cu tara1, dar nu si cu tara2
        System.out.println(serviceTari.getCountryWithNeighbourWithoutNeighbour("ROU","HUN"));



    }


}
