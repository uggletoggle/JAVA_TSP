package ejercicio9_poo;

import java.util.Random;

public class Password {

    private int longitud;
    private String contrasena;
    
    public Password(){
        longitud = 8;
        contrasena = generarPassword();
    }
    
    public Password(int len){
        if (len < 1){
            longitud = 8;
        } else{
            longitud = len;
        }
    
        contrasena = generarPassword();
    }
    
    public boolean esFuerte(){
        
        boolean calculo = false;
        
        int len = contrasena.length();
        int contador_may = 0;
        int contador_min = 0;
        int contador_num = 0;
        
        for (int i = 0; i < len; i++){
            if (contrasena.codePointAt(i) >= 65 && contrasena.codePointAt(i) <= 90){
                contador_may ++;
            } else if (contrasena.codePointAt(i) >= 97 && contrasena.codePointAt(i) <= 122){
                contador_min ++;
            } else if(contrasena.codePointAt(i) >= 48 && contrasena.codePointAt(i) <= 57){
                contador_num ++;
            }
        }
        
        if (contador_may > 2 && contador_min > 1 && contador_num > 5){
            calculo = true;
        }
       
        return calculo;
    }

    public String generarPassword(){
        StringBuilder contra = new StringBuilder("");
        Random generador = new Random();
        int aleatorio;
        
        for (int i = 0; i < longitud; i++){
            do{    
                aleatorio = (int) Math.round((generador.nextDouble() * (122 - 48) + 48));
            } while((aleatorio > 57 && aleatorio < 65) || (aleatorio > 90 && aleatorio < 97));
            
            contra.appendCodePoint(aleatorio);
        }
        
        return contra.toString();
    }
    
    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        contrasena = generarPassword();
    }
}
