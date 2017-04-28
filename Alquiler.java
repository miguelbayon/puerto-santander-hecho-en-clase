/**
 * Clase que representa cada uno de los alquileres realizados en el Puerto
 * que depende del barco sobre el que se aplique el metodo.
 */
public class Alquiler
{

    private static final int VALOR_MULTIPLICADOR_ESCALA = 10;       //Se usa para la formula del coste de alquiler
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;      //Se usa para la formula del csote de alquiler  
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
  
     /**
     * Constructor de nuestra clase al que se le pasan los parametros referentes al numero de dias que se alquila el barco, el objeto Barco y la posicion del amarre que se va a
     * ocupar.
     * 
     * @param numDias son el numero de dias que se va a ocupar el amarre.
     * @param barco representa el obejto Barco que va a hacer el aqluiler.
     * @param posicionAmarre es la posicion del primer amarre libre que se va a utiliar para hacer el alquiler
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre){
        diasOcupacion = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }
  
  /**
     * Method toString that returns the info of the rent
     * @return Toda la informacion relativa al alquiler, incluyendo el barco y la el propietario del mismo
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += "Dias ocupacion: " + diasOcupacion + "\n";
        textoADevolver += "Posicion amarre: " +posicionAmarre + "\n";
        textoADevolver += barco;
        return textoADevolver;
    }
  
  
  /**
     * Metodo que devuelve el precio de un determinado alquiler.
     * @return Devuelve el precio de alquiler.
     */
     public float getPrecioAlquiler()
    {
        return  diasOcupacion * (10 * (float)barco.getEslora()) + VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua();
     }
    
  
}