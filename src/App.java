import models.Caja;
import models.Par;
public class App {
    public static void main(String[] args) throws Exception {
        
         Caja<String> caja = new Caja<>("Hola Cara de Bola");
         Caja<Integer> numeroEntero = new Caja<>( 100);
         Caja<Double> numeroDecimal = new Caja<>( 9.75);
         Caja<Boolean> caja_3 = new Caja<>( false);
         
            System.out.println( "Caja de texto:" + caja.getObjeto());
            System.out.println("Caja de entero:" + numeroEntero.getObjeto());
            System.out.println("Caja de decimal:" + numeroDecimal.getObjeto());
            System.out.println( " la caja esta vacia " + caja_3.getObjeto());
        Par<Integer, String> estudiante = new Par<>(1, "Juan Pérez");
        Par<String, Integer> edad = new Par<>("Edad", 20);
        Par<String, Double> promedio = new Par<>("Promedio", 8.75);
        
        System.out.println("Clave: " + estudiante.getClave()+ " | Valor: " + estudiante.getValor());
        System.out.println("Clave: " + edad.getClave()+ " | Valor: " + edad.getValor());
        System.out.println("Clave: " + promedio.getClave()+ " | Valor: " + promedio.getValor());
    }
}

           
         
    

