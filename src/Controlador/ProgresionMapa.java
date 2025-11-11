
package Controlador;

/**
 *
 * @author artor
 */
public class ProgresionMapa {
    private int pisoActual;
    private final int PISO_MAX = 30;

    public ProgresionMapa() {
    }

    public ProgresionMapa(int pisoActual) {
        this.pisoActual = pisoActual;
    }

   
    
    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
    
   
}
