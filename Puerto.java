/**
 * Se crea una clase Puerto para representar los amarres de dicho puerto y el proceso de alquiler y liquidacion
 */
public class Puerto
{
  //constantes
  
  private static final int NUMERO_AMARRES = 4;      //Cantidad de amarres del puerto.
  
  //Atributos
  
  private Alquiler[] amarres;

    /**
     * Constructor de la clase Puerto.
     */
    public Puerto()
    {
        amarres = new Alquiler[NUMERO_AMARRES];
    }
  
  	/**
     * Imprime por pantalla el estado actual de todos los amarres.
     */
    public void verEstadoAmarres()
    {
        for (int i = 0; i < amarres.length; i++){
            if (amarres[i] != null){
                System.out.println(amarres[i] + "\n");
            }
            else{
                System.out.println("El amarre " + i + " esta libre\n");
            }
        }
    }
  
  /**
     * Recorre los amarres y retorna el 1º amarre que está libre o -1 si no hay ninguno libre
     * @return El nº del primer amarre libre o -1 si no hay ninguno libre
     */
    private int posicionPrimerAmarreLibre() {
        int primeraPoisicionLibre = -1;
        boolean buscando = true;
        int posicionAmarre = 0 ;
        while(posicionAmarre < amarres.length  && buscando){
            if (amarres[posicionAmarre] == null) {
                primeraPoisicionLibre = posicionAmarre;
                buscando = false;
            }
            posicionAmarre++;
        }
        return primeraPoisicionLibre;
    }
  
  /**
     * Metodo que comprueba si tenemos amarres libres.
     * 
     * @return libre devuelve un valor booleano en funcion de si hay amarres disponibles para alquilar.
     */
    private boolean hayAmarresLibres(){
       return posicionPrimerAmarreLibre() == -1 ? false : true;
    }
  
  /**
     * Metodo que mediante dos parametros, permite alquilar un amarre.
     * Primero se comprueba si hay amarres libres, si los hay, se crea un alquiler nuevo y se coloca en la posicion libre.
     * Devuelve el precio del alquiler.
     * @param numDias Numero de días que va a durar el alquiler
     * @param barco Barco que va a ocupar el amarre
     * @return El precio del alquiler o -1 en caso de que no haya amarres libres
     */
    public float alquilarAmarre(int numDias, Barco barco)
    {
        float alquiler = -1;
        if(hayAmarresLibres())
        {
            int primeraPosicion = posicionPrimerAmarreLibre();           
            Alquiler alquilerNuevo = new Alquiler(numDias, barco, primeraPosicion);         
            amarres[primeraPosicion] = alquilerNuevo;
            alquiler = alquilerNuevo.getPrecioAlquiler();
        }
        return alquiler;
    }
  
/**
     * Método que termina el alquiler del amarre dejando este libre.
     * @param posicionAmarre entero utilizado para saber el amarre que hay que liquidar.
     * @return devuelve el precio a pagar del alquiler o -1 si el amarre indicado no contiene un alquiler
     */
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float alquiler = -1;
        
        //Comprobamos que la posicion sea valida y el amarre estÃ© alquilado.
        if(!(posicionAmarre < 0 || posicionAmarre >= amarres.length) && amarres[posicionAmarre] !=null)
        {
            //metemos en la variable amarres el precio del amarre
            alquiler = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return alquiler;
    }

}