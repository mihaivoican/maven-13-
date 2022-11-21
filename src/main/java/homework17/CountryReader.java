package homework17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {

    private final static List<Country> listCountries = new ArrayList<>();
    private String pathfile;

    public static List<Country> listCountries(String pathfile) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathfile));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            listCountries.add(countryFromLine(line));
        }
        return listCountries;
    }

    private static Country countryFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));
        if(line.endsWith("|")){
            return new Country(newId(),tokens[0], tokens[1],Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]),tokens[4],null);

        }
        return new Country(newId(),tokens[0], tokens[1],Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]),tokens[4],neighbours(tokens[5]));
    }

    private static int newId() {

        return listCountries.size() + 1;
    }

    private static List<String> neighbours(String sir){

        String[] token =sir.split(Pattern.quote("~"));
        List<String> result = List.of(token);
        return result;
    }
}
