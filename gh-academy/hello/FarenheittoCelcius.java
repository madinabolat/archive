public class FarenheittoCelcius {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        t = (t-32) * 5/9;
        System.out.println("Temperature in C: "+Math.round(t));
    }
}
