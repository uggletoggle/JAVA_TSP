package ejercicio7_poo;

public class Mate {
 
    private int cebadas_restantes;
    private boolean estado; //false --> vacio , true --> lleno
    private boolean lavado;
    
    public Mate(int n){
        cebadas_restantes = n;
        estado = false;
    }
    
    public void cebar(){
        if (estado == true){
            System.out.println("Cuidado! Te quemaste!");
        } else{
            estado = true;
            cebadas_restantes --;
            if (cebadas_restantes < 0){
                lavado = true;
                cebadas_restantes = 0;
            }
        }
    }
    
    public void beber(){
        
        if (estado == false){
            System.out.println("El mate está vacío");
        } else{
            if (lavado == true){
                System.out.println("Advertencia! El mate está lavado");
            }
            estado = false;
        }
        
    }
    
}
