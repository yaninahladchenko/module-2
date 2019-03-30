public class QuadraticEquation {
    public static void main(String[] args) {
        calculate(1, 14, 10); // 2 roots
        calculate(1, 14, 49); // 1 root
        calculate(2, 14, 49); // no solution
    }

    private static void calculate(double a, double b, double c) {
        System.out.println(String.format("a=%s b=%s c=%s", a, b , c));
        double x1;
        double x2;
        double discriminant = (b * b) - (4 * a * c);

        /*a=1, b=14, c =10
        14*14-4*1*49=196-40= 56*/
        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(Math.abs(discriminant))) / (2 * a);
            x2 = (-b - Math.sqrt(Math.abs(discriminant))) / (2 * a);
            System.out.println("Two Distinct Real Roots Exists");
            System.out.println(String.format("x1=%s x2=%s", x1, x2));
        }

        /*a=1, b=14, c =49
        14*14-4*1*49=196-196= 0*/

        else if (discriminant == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("There is only 1 root");
            System.out.println(String.format("x1=%s x2=%s", x1, x2));
        }

        /*a=2, b=14, c =49
        14*14-4*2*49=196-1372= -1176*/
        else if (discriminant < 0) {
            System.out.println("There is no solution");
        }
    }
}
