package lista_metodos_e_campos_estaticos.exercicio7;

public class ConversaoDeTemperatura {

    static double celsiusParaFahrenheit(double celsius){
        return (9/5d * celsius) + 32;
    }

    static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    static double celsiusParaKelvin(double celsius){
        return celsius + 273.15;
    }

    static double kelvinParaCelsius(double kelvin){
        return kelvin - 273.15;
    }

    static double celsiusParaReaumur(double celsius){
        return 4/5d * celsius;
    }

    static double  reaumurParaCelsius(double reaumur){
        return 5/4d * reaumur;
    }

    static double kelvinParaRankine(double kelvin){
        return kelvin * 1.8;
    }

    static double rankineParaKelvin(double rankine){
        return rankine/1.8;
    }







}
