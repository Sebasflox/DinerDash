
package dinerdash;

public class Cola_FilaCaja {
    
    private Nodo_FilaCaja first;
    private Nodo_FilaCaja last;
    
    Cola_FilaCaja (){
        first = last = null;
    }
    
    //Insertar final cola
    public void enqueue (int fila_de_la_caja) {
        Nodo_FilaCaja nuevo = new Nodo_FilaCaja();
        nuevo.fila_de_la_caja = fila_de_la_caja;
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
