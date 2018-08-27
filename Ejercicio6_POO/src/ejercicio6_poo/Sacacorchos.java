package ejercicio6_poo;

public class Sacacorchos {

    private boolean tieneCorcho;
    
    public void destapar(Botella b){
        if(tieneCorcho == true || b.getCorcho().isEnBotella() == false){
            System.out.println("Error. La botella ya está destapada o el sacacorchos ha sido usado previamente");
        } else{
            b.getCorcho().setEnBotella(false);
            tieneCorcho = true;
        }
    }
    
    public void limpiar(){
        tieneCorcho = false;
    }
}
