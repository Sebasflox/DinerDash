
package dinerdash;

public class Pila_EntregaPedidos {
    
    private Nodo_EntregaPedidos cima;
    
    Pila_EntregaPedidos (){
        cima = null;
    }
    
    //Funcion para insertar un elemento al inicio
    public void incluir_elemento (int platillo){
        
        Nodo_EntregaPedidos nuevo = new Nodo_EntregaPedidos();
        nuevo.platillo = platillo;
        nuevo.siguiente = null;
        
        if (cima ==  null)
            cima = nuevo;
        else {
            nuevo.siguiente = cima;
            cima = nuevo;
        }
    }
    
   //Funcion para borrar un elemento
    public void Eliminar_elemento (){
    
        if (cima != null)
            cima = cima.siguiente;      
    }
    
    //Funcion para saber si la pila esta vacia
    public boolean Bandera (){
        return (cima == null);
    }
}
    
