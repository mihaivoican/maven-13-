package homework14.ex1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static homework14.ex1.Temperature.celsiusToFahreinhert;
import static homework14.ex1.Temperature.fahreinhetToCelsius;

public class TDDTemperature {
    @Test
    public void instantiateClass() {
        Temperature temperatures = new Temperature(0);

    }

    @Test
    public void callMethod() {
        Temperature temperatures = new Temperature(0);
        fahreinhetToCelsius(0.0);
    }

    @Test
    @DisplayName("WHEN temperature in grades Celsius is given THEN transform in grades Fahreinhert")
    public void methodCelsiusToFahreinhert() {
        //GIVEN
        double t = 0;
        Temperature temperatures = new Temperature(t);

        //WHEN
        //double result = temperatures.celsiusToFahreinhert(t) ;
        double result = celsiusToFahreinhert(t);
        //THEN
        Assertions.assertThat(result).isEqualTo(32.000000);
    }

    @Test
    @DisplayName("WHEN temperature in grades Fahreinhert is given THEN transform in grades Celsius")
    public void methodFahreinhertToCelsius() {
        //GIVEN
        double t = 0;
        Temperature temperatures = new Temperature(t);

        //WHEN
        double result = fahreinhetToCelsius(t);

        //THEN
        Assertions.assertThat(result).isEqualTo(-17.77777777777778);
    }
}
