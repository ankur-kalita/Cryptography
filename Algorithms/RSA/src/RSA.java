import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
    private BigInteger publicKey;

    private BigInteger privateKey;

    private BigInteger n;

    private SecureRandom random;

    public RSA() {
        this.random = new SecureRandom();
    }

    public void generateKeys(int keyDigits) {
        BigInteger p = BigInteger.probablePrime(keyDigits, random);
        BigInteger q = BigInteger.probablePrime(keyDigits, random);

        n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        BigInteger e = generatePublicFactor(phi);
        BigInteger d = e.modInverse(phi);

        this.publicKey = e;
        this.privateKey = d;
    }

    private BigInteger generatePublicFactor(BigInteger phi) {
        BigInteger e = new BigInteger(phi.bitLength(), random);

        while(!e.gcd(phi).equals(BigInteger.ONE)) {
            e = new BigInteger(phi.bitLength(), random);
        }
        return e;
    }

    public BigInteger encryptMessage(String message) {
        return encrypt(publicKey, n, message);
    }

    private BigInteger encrypt(BigInteger e, BigInteger n, String message) {
        byte[] messageBytes = message.getBytes();
        BigInteger messageInt = new BigInteger(messageBytes);
        // we have to use modular exponentiation
        // so the cipher text = message ^ e mod n
        return messageInt.modPow(e, n);
    }

    public String decryptMessage(BigInteger message) {
        return decrypt(privateKey, n, message);
    }

    private String decrypt(BigInteger d, BigInteger n, BigInteger cipherText) {
        // we have to use modular exponentiation
        // so the message = cipher text ^ d mod n
        BigInteger messageInt = cipherText.modPow(d, n);
        byte[] messageBytes = messageInt.toByteArray();
        return new String(messageBytes);
    }
}
