import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // these are all public: the ECC and the generator point
        ECC ecc = new ECC(3, 7);
        Point generator = new Point(-2, 1);
        Random random = new Random();

        // Elliptic Curve Diffie-Hellman Algorithm
        // random number for Alice
        int a = random.nextInt(10000);
        // random number for Bob
        int b = random.nextInt(10000);

        // public keys with the double and add algorithm
        // these are points on the elliptic curve
        Point alicePublicKey = ecc.doubleAndAdd(a, generator);
        Point bobPublicKey = ecc.doubleAndAdd(b, generator);

        Point aliceSharedSecret = ecc.doubleAndAdd(a, bobPublicKey);
        Point bobSharedSecret = ecc.doubleAndAdd(b,  alicePublicKey);

        System.out.println(aliceSharedSecret);
        System.out.println(bobSharedSecret);



        System.out.println(ecc.pointAddition(generator, generator));
        System.out.println(ecc.doubleAndAdd(100, generator));


    }
}