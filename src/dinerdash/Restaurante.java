
package dinerdash;


public class Restaurante {
   
    private int Mesas [][] = new int [15][6];
    
    public void Mesas(){
        
        Cola_FilaEntrada app = new Cola_FilaEntrada();
        BusinessLogic sacar = new BusinessLogic();

    // enter array elements.
    for(int x = 0; x < Mesas.length; x++) {
      for (int y = 0; y < Mesas[x].length; y++) {
        Mesas[x][y] = app.Valor;
      }
    }

    for (int x = 0; x < Mesas.length; x++) {
      for (int y = 0; y < Mesas[x].length; y++) {
        System.out.print(Mesas[x][y] + "  ");
      }
      System.out.println();
    }
  }
    
}
