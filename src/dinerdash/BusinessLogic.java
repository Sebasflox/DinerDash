
package dinerdash;
import java.util.Random;

public class BusinessLogic {

    
       public void Random(){
            Random generador = new Random();
            Cola_FilaEntrada app = new Cola_FilaEntrada();

        do {
            int indice_random = generador.nextInt(6); //Se logro quitar el cero, estar al tanto de esto
            app.enqueue(indice_random + 1);
        }
        while (app.contar() < 5);
            app.contar(); //este imprime el contador de los datos en la cola

    }

}
        

