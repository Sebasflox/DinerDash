
package dinerdash;

public class Cola_FilaEntrada {
    
    private Nodo_FilaEntrada first; //Puntero al principio
    private Nodo_FilaEntrada last; //Puntero al final
    int Valor;
    
    Cola_FilaEntrada(){
        first = last = null;
    }
    
    //Insertar final cola
    public void enqueue (int fila_de_la_entrada) { //Insertar al final de la cola
        Nodo_FilaEntrada nuevo = new Nodo_FilaEntrada();
        nuevo.fila_de_la_entrada = fila_de_la_entrada;
        nuevo.siguiente = null;
        if (first == null) //Si el primero es null (No hay nada en la cola)
            first = last = nuevo; //Entonces al primero y ultimo le asigno el nuevo nodo
        else { //y si tiene un valor
            last.siguiente = nuevo; //Entonces apunta al final
            last = nuevo; //Y le asigno el nuevo nodo
        }
    }
    
    //Borrar Inicio Cola
    public void dequeue () { //Borra el primero de la cola
        if (first != null) //Si el primero es diferente a null (tiene un dato)
            first = first.siguiente; //El puntero first cambia de posicion
    } 
    
    
     public int contar()
    {
        int contador=0;
        Nodo_FilaEntrada c=this.first;
        while(c!=null)
    {
        contador++;
        c=c.siguiente;
    }
        //System.out.println("Numero de datos en la cola: "+contador);
        return contador;
    }
     
    public void imprimir (){
        
        System.out.println(first.fila_de_la_entrada);
        //return Valor;
    }
    
    
    
}
