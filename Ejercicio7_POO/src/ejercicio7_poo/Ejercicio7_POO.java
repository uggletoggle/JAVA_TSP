package ejercicio7_poo;

/*
Crear una clase Mate que contenga:
1.- Cantidad de cebadas restantes hasta estar lavado(int)
2.- Estado(lleno o vacio)
3.- Constructor que reciba cantidad maxima de cebadas en base a la
    cantidad de yerba vertida
4.- Método cebar(). Cebar con el mate lleno imprime mensaje "Cuidado! te quemaste!"
5.- Método beber() vacía el mate y le resta una cebada. Imprime error si se intenta
    usar con el mate vacío.
6.- Es posible seguir cebando con el mate lavado. La cant de cebadas se mantendrá 
    en 0 y al beber() se debe imprimir un mensaje de aviso: "El mate está lavado"
*/

public class Ejercicio7_POO {

    public static void main(String[] args) {
       
        Mate rosamonte = new Mate(5);
        
        rosamonte.beber();
        rosamonte.cebar();
        rosamonte.cebar();
        rosamonte.beber();
        
        rosamonte.cebar();
        rosamonte.beber();
        rosamonte.cebar();
        rosamonte.beber();
        rosamonte.cebar();
        rosamonte.beber();
        rosamonte.cebar();
        rosamonte.beber();
        rosamonte.cebar();
        rosamonte.beber();
    }
    
}
