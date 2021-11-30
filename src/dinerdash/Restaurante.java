package dinerdash;

public class Restaurante {
    Cola_FilaEntrada app = new Cola_FilaEntrada();
    private int Mesas [][] = new int [15][6];
    
    public void Mesas(){

        for(int x = 0; x < Mesas.length; x++) {
            for (int y = 0; y < Mesas[x].length; y++) {
                Mesas[x][y] = app.valor;//estamos teniendo problemas con éste valor, no retorna el valor del primero de la cola
                //hola
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