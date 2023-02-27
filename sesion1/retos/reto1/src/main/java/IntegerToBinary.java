public class IntegerToBinary {
    public static void main(String [] args) {

        int number = 5;

        String binary = Integer.toBinaryString(number);

        System.out.println("El entero " + number + " en binario es: " + binary);

        String binarioConEspacios = String.format("%32s", binary).replaceAll(" ", "0");  // 32-bit Integer
        System.out.println(binarioConEspacios);
    }
}