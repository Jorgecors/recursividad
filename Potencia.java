public class Potencia {


    public static void main(String[] args) {
        System.out.println(potencia(5, 1));
    }

    public static int potencia(int base, int exponente) {
        return exponente == 0 ? 1 : base * potencia(base, exponente - 1);
       
    }
    
  
}