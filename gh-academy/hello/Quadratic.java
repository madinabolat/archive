public class Quadratic  {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        // ax^2+bx+c=0
        double d = Math.sqrt(b*b-4*c);
        double root1 = (-b +d) / 2;
        double root2 = (-b - d) / 2;
        System.out.println("roots are: "+root1+" ,"+root2);
    }
}
