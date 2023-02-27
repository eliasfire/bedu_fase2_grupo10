public class SumarLos100Numeros {
    public static void main(String [] args) {

        int sumTotal = 0;

        for (int i = 1; i <= 100; i++) {
            sumTotal += i;
        }
        System.out.println("La suma de los primeros 100 numeros naturales es: " + sumTotal);
    }
}