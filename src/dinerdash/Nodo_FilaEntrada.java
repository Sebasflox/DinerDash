
package dinerdash;
import java.util.Random;

public class Nodo_FilaEntrada {
    public Nodo_FilaEntrada siguiente;
    public int fila_de_la_entrada;
    
    Random random = new Random();
    
    
    public void Nodo_FilaEntrada(){ //Buscar la menera de temporizar la entrada de clientes
        Cola_FilaEntrada app = new Cola_FilaEntrada();
    
        int indice_random = random.nextInt(6);
        app.enqueue(indice_random);
        
    }
    
}

