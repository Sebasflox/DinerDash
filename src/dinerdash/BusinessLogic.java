
package dinerdash;
import java.util.Random;

public class BusinessLogic {
    Random generador = new Random();
    Cola_FilaEntrada app = new Cola_FilaEntrada();
    
        public void Random(){

        do {
            int indice_random = generador.nextInt(6); //Se logro quitar el cero, estar al tanto de esto
            app.enqueue(indice_random + 1);
        }
        while (app.contar() < 5);
        
        app.imprimir();
//        app.HalarInicio();
        
    }
    
}
