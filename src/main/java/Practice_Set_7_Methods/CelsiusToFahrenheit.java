package Practice_Set_7_Methods;

// Q7. Write a function to convert Celsius temperature into Fahrenheit.
// (0°C × 9/5) + 32 = 32°F

public class CelsiusToFahrenheit {

    static float fahrenheit(float celsius){
        float temp =0.0f;
        temp = (celsius * 9/5) + 32;
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(fahrenheit(29.5f));
    }
}
