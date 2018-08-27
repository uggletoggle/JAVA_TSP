package ejercicio9_poo;

public class Ejercicio9_POO {

    public static void main(String[] args) {
      
        Password contra = new Password(100);
        
        System.out.println(contra.getContrasena());
        System.out.println(contra.esFuerte());
        
    }   
    
}
