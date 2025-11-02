import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        DiffieHellman diffieHellman = new DiffieHellman();
        BigInteger n = new BigInteger("37");
        BigInteger g = new BigInteger("13");
        diffieHellman.generatePrivateKeys(n, g);
        diffieHellman.generatePrivateKeys(new BigInteger("11"), new BigInteger("8"));
    }
}