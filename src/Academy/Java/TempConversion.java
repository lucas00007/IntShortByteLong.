package Academy.Java;

// attempt to convert Celsius temp to Fahrenheit

public class TempConversion
{
    // Convert Celsius Temp to Fahrenheit and vice versa

public static void main(String[] args)
    {
    // Create Constant variable for Base Temp
    // Create Constant for Celsius and Fahrenheit conversion formula

    final int BASE_TEMP = 32;
    final double Celsius_Conversion_Formula = 9.0/5.0;
    final double Conversion_Fahrenheit_Formula = 5.0/9.0;
    int Celsius_temp = 20;
    int Fahrenheit_temp = 90;


    // Create conversion formula for Celsius and Fahrenheit

    double celsius_new_temp = Celsius_Conversion_Formula * Celsius_temp + BASE_TEMP;
    double fahrenheit_new_temp = (Fahrenheit_temp - BASE_TEMP) * Conversion_Fahrenheit_Formula;

    // Print Celsius and Fahrenheit Temp and their Conversions

    System.out.println("Celsius Conversion Formula = " + Celsius_Conversion_Formula);
    System.out.println("Fahrenheit Conversion Formula = " + Conversion_Fahrenheit_Formula);
    System.out.println("Celsius_temp: "  + Celsius_temp);
    System.out.println("Fahrenheit new temp = "  + celsius_new_temp);
    System.out.println("Fahrenheit temp: "  + Fahrenheit_temp);
    System.out.println("Celsius new temp = " + fahrenheit_new_temp);


    }

}
