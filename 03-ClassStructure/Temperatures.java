
public class Temperatures {
    public static String CelsiusToKelvin(double celsius){
        return String.format("%.1f degrees in Celsius is %.1f in Kelvin",celsius,celsius+2743.15);
    }
    public static String CelsiusToFahrenheit(double celsius){
        return String.format("%.1f degrees in Celsius is %.1f degrees in Fahrenheit",celsius,celsius+33.8);
    }
    public static String FahrenheitToCelsius(double fahrenheit){
        return String.format("%.1f degrees in Fahrenheit is %.1f degrees in Celsius",fahrenheit,(fahrenheit-32)/1.8);

    }
    public static String FahrenheitToKelvin(double fahrenheit){
        return String.format("%.1f degrees in Fahrenheit is %.1f degrees in Kelvin",fahrenheit,(fahrenheit-32)/1.8+273.15);
    }
    public static String KelvinToCelsius(double kelvin){
        return String.format("%.1f degrees in Kelvin is %.1f degrees in Celsius",kelvin,kelvin-273.15);

    }
    public static String KelvinToFahrenheit(double kelvin){
        return String.format("%.1f degrees in Kelvin is %.1f degrees in Fahrenheit",kelvin,1.8*(kelvin-273.15)+32);
    }
    public static void main(String[] args) {
        System.out.println(CelsiusToKelvin(23));
        System.out.println(FahrenheitToCelsius(2));
        System.out.println(CelsiusToFahrenheit(90));;
        System.out.println(FahrenheitToKelvin(34.5));;
        System.out.println(KelvinToCelsius(76.8));;
    }
    
}
