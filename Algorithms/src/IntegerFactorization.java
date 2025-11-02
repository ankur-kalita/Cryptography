public class IntegerFactorization {
    public void Factor(int num) {
        int limit = (int) Math.floor(Math.sqrt(num));
        for(int i = 1; i <= limit; i++) {
            if(num % i == 0) {
                System.out.println(i + " " + num / i);
            }
        }
    }
}
