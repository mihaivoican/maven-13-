package homework17;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Country> listaTari =  CountryReader.listCountries("files/countries2.txt");
        System.out.println(listaTari.toString());

        //listare obiecte tari
        CountryService serviceTari = new CountryService();
        System.out.println(serviceTari.getListaTari());

        //lista nume tari
        System.out.println(serviceTari.countriesNames());
    }


}
