
package dinerdash;
import java.util.Random;

public class BusinessLogic {
    Random generador = new Random();
    
        public void Random(){
        Validaciones (); //Arreglar esta parte
        }
    
        public void Validaciones(int contador){
        Cola_FilaEntrada app = new Cola_FilaEntrada();
        do {
            int indice_random = generador.nextInt(6); //Se logro quitar el cero, estar al tanto de esto
            app.enqueue(indice_random + 1);
            app.contar();
        }
        while (contador < 5);
    }
    
}
