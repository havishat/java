import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// public class PythagoreamTheorem {
//     public static void main(String args[]) {
//         double a = 4.0;
//         double b = 4.0;
//         double hypot = sqrt(pow(b,2) + pow(a,2));
//         System.out.println(hypot);
//     } 
// }

public class PythagoreamTheorem {
    public double getPythagoreamTheorem() {
        double a = 4.0;
        double b = 4.0;
        double hypot = sqrt(pow(b,2) + pow(a,2));
        // System.out.println(hypot);
        return hypot;
    } 
}