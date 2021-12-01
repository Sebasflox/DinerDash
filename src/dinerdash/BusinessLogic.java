
package dinerdash;
import java.util.Random;

public class BusinessLogic {
    Random generador = new Random();
    Cola_FilaEntrada app = new Cola_FilaEntrada();
    
        public void Random(){

            int indice_random = generador.nextInt(6); //Se logro quitar el cero, estar al tanto de esto
            app.enqueue(indice_random + 1);
            System.out.println(indice_random);
            
            System.out.println();
    }
    
}
