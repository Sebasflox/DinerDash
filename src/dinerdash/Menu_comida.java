
package dinerdash;

import java.util.Random;

public class Menu_comida {
    
    Random random = new Random();
    private String [] Menu = {"Pizza", "Hamburguesa", "Sushi"};
    
    public void Menu_comida(){
        Cola_FilaEntrada app = new Cola_FilaEntrada();
        
        for(int x=0; x<app.dequeue(); x++){
            int indice_random = random.nextInt(Menu.length);
        }
        
    }
       
}
