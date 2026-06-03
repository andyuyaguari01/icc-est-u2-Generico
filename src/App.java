import models.Caja;

public class App {
    public static void main(String[] args) throws Exception {
        
         Caja<String> caja = new Caja<>("Hola Cara de Bola");
         Caja<Integer> numeroEntero = new Caja( 100);
         Caja<Double> numeroDecimal = new Caja( 9.75);
         Caja<Boolean> caja_3 = new Caja( "¿ la caja esta vacia" + false);
         
            System.out.println(caja);
            System.out.println(numeroEntero);
            System.out.println(numeroDecimal);
            System.out.println(caja_3);

           
         
    }
}
