import java.util.Scanner;
/**
 * Ejercicio 3 de PROG03 de DAW
 * @author Donato Ramos Martínez
 */
public class TriangulosConPiedras {

    /**
     * @param args No son necesarios los argumentos del método Main
     */
    public static void main(String[] args) {
        // Declaración de variables
        int piedras;
        int piedrasTriangulo;
        Scanner leer=new Scanner(System.in);
        int fila;
        boolean exceso;
        int totalPiedras;
        int piedrasLado;
        
        // Programa
        do {            
            exceso=false;
            fila=0;
            piedrasTriangulo=0;
            totalPiedras=0;
            piedrasLado=0;
            piedras=leer.nextInt();
            if(piedras!=0){
                while(exceso==false){
                    fila++;
                    piedrasTriangulo+=fila;
                    if(piedrasTriangulo>piedras) exceso=true;
                    else{
                        totalPiedras=piedrasTriangulo;
                        piedrasLado=fila;
                        exceso=false;
                    }
                }
                System.out.println(piedrasLado+" "+(piedras-totalPiedras));
            }
        } while (piedras!=0);
    }
}
