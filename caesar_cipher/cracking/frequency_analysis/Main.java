package cracking.frequency_analysis;

public class Main {
    public static void main(String[] args) {
        String text = "L DP EDWPDQ";
        CrackCaesar cc = new CrackCaesar();
        cc.crack(text);
    }
}
