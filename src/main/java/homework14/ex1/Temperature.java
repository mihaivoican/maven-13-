package homework14.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class Temperature {

    @Getter
    private double temperature;

    public static double fahreinhetToCelsius(double temperature){
        double result = (temperature -32) * 5/9;
        return result;
    }

    public  static double celsiusToFahreinhert(double temperature){
        double result = temperature*9/5 + 32;
        return  result;
    }

    public static void main(String[] args) {
        double tempC = 0;
//        Temperature temp = new Temperature(tempC);
        System.out.println(String.format(" %f grade C = %f grade F ",
                tempC, celsiusToFahreinhert(tempC)));
        tempC=50;
        System.out.println(String.format(" %f grade C = %f grades F ",
                tempC, celsiusToFahreinhert(tempC)));

        double tempF = 100;
        System.out.println(String.format(" %f grades F = %f grades  C",
                tempF, fahreinhetToCelsius(tempF)));


        tempF = 0;
        System.out.println(String.format(" %f grades F = %f grades  C",
                tempF, fahreinhetToCelsius(tempF)));


        tempF=50;
        System.out.println(String.format(" %f grades F = %f grades  C",
                tempF, fahreinhetToCelsius(tempF)));


    }

}
