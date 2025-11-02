import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FermatPrimeTest algorithm = new FermatPrimeTest();
        System.out.println(algorithm.isPrime(BigInteger.valueOf(2147483647), 10));

        IntegerFactorization factorization = new IntegerFactorization();
        factorization.Factor(100);

        DiscreteLogarithm dl = new DiscreteLogarithm();
        BigInteger b = new BigInteger("5");
        BigInteger c = new BigInteger("948603");
        BigInteger m = new BigInteger("9048610007");

        System.out.println(dl.modularExponentiation(b, c, m));

        BigInteger a = new BigInteger("3668993056");
        System.out.println(dl.discreteLogarithm(a, b, m));
    }
}