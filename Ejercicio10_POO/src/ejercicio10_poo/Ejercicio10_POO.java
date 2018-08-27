package ejercicio10_poo;

public class Ejercicio10_POO {

    public static void main(String[] args) {
        
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        int contador_entregas = 0;
        int masHoras = 0, masTemporadas = 0; // Almacenan valores de atributos mayores
        int indiceMasHoras = 0, indiceMasTemporadas = 0; // Almacena posicion en el arreglo para atributos mayores 
        
        series[0] = new Serie();
        series[1] = new Serie("Breaking Bad", "Vince Gilligan");
        series[2] = new Serie();
        series[3] = new Serie("Better Call Saul", "Vince Gilligan", "Drama/Policiaco", 4);
        series[4] = new Serie();
        
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego();
        videojuegos[2] = new Videojuego();
        videojuegos[3] = new Videojuego("Monkey Island", 40);
        videojuegos[4] = new Videojuego("Mortal Kombat",  10, "Accion/Peleas", "Midway");
        
        
        series[1].entregar();
        videojuegos[4].entregar();
        videojuegos[2].entregar();
        series[2].entregar();
        
        for (int i = 0; i < 5; i++){
            if (videojuegos[i].isEntregado()){
                contador_entregas ++;
            }
            
            if (series[i].isEntregado()){
                contador_entregas ++;
            }
            
            if (videojuegos[i].getHoras() > masHoras){
                masHoras = videojuegos[i].getHoras();
                indiceMasHoras = i;
            }
            
            if (series[i].getTemporadas() > masTemporadas){
                masTemporadas = series[i].getTemporadas();
                indiceMasTemporadas = i;
            }
        }
        
        System.out.println("Entregas: " + contador_entregas);
        System.out.println("Serie con mas temporadas: " + series[indiceMasTemporadas].getTitulo());
        System.out.println("Videojuego con mas horas estimadas: " + videojuegos[indiceMasHoras].getTitulo());
        
    }
    
}
