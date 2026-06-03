package models;

public class Caja <T>{
    private T objeto;

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
     public void guardar(T objeto){
        this.objeto = objeto;
    }
    public T obtener(){
        return objeto ;
    }
    public boolean estaVacia(){
        return objeto== null ;
    }

    @Override
    public String toString() {
        return "Caja [objeto=" + objeto + "]";
    }

   

}
