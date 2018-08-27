package ejercicio5_poo;

public class Papel {

    private String texto="";
    
    public void escribir(String s){
        texto += s;
    }
    
    public void escribir(char c){
        texto += c;
    }
    
    @Override
    public String toString(){
        return texto;
    }

}
