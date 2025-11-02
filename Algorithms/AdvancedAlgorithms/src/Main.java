//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EuclideanGCD gcd = new EuclideanGCD();
        System.out.println(gcd.gcd_recursion(54, 28));
        System.out.println(gcd.gcd_iteration(54, 28));

        ModularInverse modularInverse = new ModularInverse();
        System.out.println(modularInverse.Calculate(3, 11));

        ExtendedEuclideanMI eeuclid = new ExtendedEuclideanMI();
        int[] result = eeuclid.egcd(15, 56);
        System.out.println("GCD: " + result[0] + ", x: " + result[1] + ", y: " + result[2]);
    }

}