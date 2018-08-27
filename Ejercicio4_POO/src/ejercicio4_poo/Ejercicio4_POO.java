package ejercicio4_poo;

/*
Crear una clase Vector:
1.- Constructor reciba coordenadas
2.- Sobreescribir toString y mostrar elementos [x,y,z]
3.-Crear un método que reciba un número y devuleva un nuevo
vector con los elementos multiplicados por ese número
4.- Crear un método sumar que recibe otro vector, verifica
si tiene la misma cantidad de elementos  y devuelve un nuevo
vector con la suma de ambos. En caso de no tener la misma 
cantidad de elementos entonces imprime un mensaje de error y 
retorna el vector que se pasó como parámetro
*/

public class Ejercicio4_POO {

    public static void main(String[] args) {
        
       Vector z = new Vector(2,3,4,5);
       Vector y = new Vector (4,5,-3,0);
       int x = 0;
       
       Vector mul = z.escalar(x);
       Vector sum = z.sumar(y);
       System.out.println(mul);
        System.out.println(sum);
    }
    
}
