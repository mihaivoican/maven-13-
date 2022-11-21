package homework17;

import java.io.IOException;
import java.util.List;

public class CountryService {
    List<Country> listaTari = CountryReader.listCountries("files/countries2.txt");

    //constructor
    public CountryService() throws IOException {
    }

    public List<Country> getListaTari() {
        return listaTari;
    }

    public List<String> countriesNames(){
        return listaTari.stream()
                .map(c->c.name())
                .toList();
    }

}
