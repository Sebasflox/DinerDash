
package dinerdash;

public class Cola_DespachoPedidos {
    
    private Nodo_DespachoPedidos first;
    private Nodo_DespachoPedidos last;
    
    Cola_DespachoPedidos(){
    first = last = null;
    } 
    //Insertar al final de la cola
    public void enqueue (int salida_pedido) {
        Nodo_DespachoPedidos nuevo = new Nodo_DespachoPedidos();
        nuevo.salida_pedido = salida_pedido;
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
    
}
