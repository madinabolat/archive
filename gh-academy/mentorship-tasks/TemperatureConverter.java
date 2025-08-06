public class TemperatureConverter {
    public static void main(String[] args) {
        double tF = Double.parseDouble(args[0]);
        double tC = (tF - 32) * 5 / 9;
        System.out.println("Temperature in C: " + Math.round(tC));

        double tCel = Double.parseDouble(args[1]);
        double tFar = (tCel * 9 / 5) + 32;
        System.out.println("Temperature in Farenheit: " + Math.round(tFar));
    }
}
