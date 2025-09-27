package cracking.brute_force;

public class Main {
    public static void main(String[] args) {
        BruteForceCracking bfc = new BruteForceCracking();
        String cipherText = "L DP EDWPDQ";
        bfc.crack(cipherText);
    }
}
