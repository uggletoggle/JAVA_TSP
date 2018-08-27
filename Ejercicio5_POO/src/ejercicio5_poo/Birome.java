package ejercicio5_poo;

public class Birome {
    
    private int tinta;
    
    public Birome(){
        tinta = 100;
    }
    
    public void escribir(String s, Papel p){
        int len = s.length();
        int i = 0;
        
        while(tinta>0 && i < len){
            p.escribir(s.charAt(i));
            if (s.charAt(i) != ' '){
                tinta -= 1;
            } 
            i++;
        }
        
        if (tinta == 0){
            System.out.println("Se acabó la tinta!!");
        }
    }
    
    
}
