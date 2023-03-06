public class Calculadora {

    public float dividir(float a, float b){

        if(b == 0){
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }

        return a / b;
    }

}