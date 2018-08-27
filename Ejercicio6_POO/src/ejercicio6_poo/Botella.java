package ejercicio6_poo;

public class Botella {

    private Corcho corcho;
    
    public Corcho getCorcho(){
        return corcho;
    }
    
    public Botella(){
        corcho = new Corcho();
        corcho.setEnBotella(true);
    }
    
}
