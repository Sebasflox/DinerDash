
package dinerdash;

public class DinerDash {

    public static void main(String[] args) {
        
        Cola_FilaEntrada Cola = new Cola_FilaEntrada();
        BusinessLogic Business = new BusinessLogic();
        Restaurante Rest = new Restaurante();

        Business.Random();
        Rest.Mesas();
    }
    
}
