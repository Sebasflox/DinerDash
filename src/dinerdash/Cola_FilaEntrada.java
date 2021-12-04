
package dinerdash;

public class Cola_FilaEntrada {
    
    public Nodo_FilaEntrada first; //Puntero al principio
    private Nodo_FilaEntrada last; //Puntero al final
    
    
    public Cola_FilaEntrada(){
        first = last = null;
    }
    
    //Insertar final cola
    public void enqueue (int fila_de_la_entrada) { 
        Nodo_FilaEntrada nuevo = new Nodo_FilaEntrada();
        nuevo.fila_de_la_entrada = fila_de_la_entrada;
        nuevo.siguiente = null;
        if (first == null) 
            first = last = nuevo; 
        else { 
            last.siguiente = nuevo; 
            last = nuevo; 
        }
    }
    
    //Borrar Inicio Cola
    public void dequeue () { 
        if (first != null) 
            first = first.siguiente; 
    }
    
    public int contar(){ //Para saber cuantos nodos hay en la cola
        int contador = 0;
        Nodo_FilaEntrada c = this.first;
        while (c!=null){
            contador ++;
            c = c.siguiente;
        }
        System.out.println("Hay un total de " + contador + " nodos");
        return contador;
    }
    public void imprimir (){
        System.out.println(first.fila_de_la_entrada);
        
    }

}   

