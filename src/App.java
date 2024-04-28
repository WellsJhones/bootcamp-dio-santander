import edu.wells.metodos.Metodos;
import edu.wells.operadores.Operadores;

public class App {
    public static void main(String[] args) {
        Operadores operadores = new Operadores();
        operadores.operadoresAritmeticos();
        operadores.ternario();
        Metodos metodos = new Metodos();
        metodos.aumentarVolume();
        metodos.ligarTv();
        metodos.desligarTv();
        metodos.aumentarVolume();
    }
}
