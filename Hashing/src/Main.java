//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MD5 md5 = new MD5();
        SHA256 sha = new SHA256();

        String message = "You are not brave, man are brave.";

        System.out.println(md5.digest(message));
        System.out.println(sha.digest(message));
    }
}