package ejercicio4_poo;

public class Vector {
 
    public int[] coordenadas;
    
    public Vector(int... coordenadas){
        this.coordenadas = coordenadas;
    }
    
    public Vector escalar(int x){
        
        int[] coordenadas_result = new int[coordenadas.length];
        int i = 0;
        
        for(int elemento : coordenadas){
            coordenadas_result[i] = elemento * x;
            i++;
        }
        
        return new Vector(coordenadas_result);
    }
    
    public Vector sumar(Vector v){
        int len = v.coordenadas.length;
        int[] suma;
        
        if (this.coordenadas.length == len){
            suma = new int[len];
            
            for (int i = 0 ; i < len; i++){
                suma[i] = this.coordenadas[i] + v.coordenadas[i];
            }
            
            return new Vector(suma);
        }
        
        System.out.println("Error. Los vectores deben tener la misma cantidad de elementos");
        return v;
    }
    
    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder("");
        
        for(int c : coordenadas){
            retorno.append(c + " ");
        }
        return '[' + retorno.toString() + "\b]";
    }
    
}
