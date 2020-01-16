
/**
 * Objeto que representa la Abstracción del Objeto Hora.
 * 
 * @author Roberto Salazar Márquez
 * @version 1.1
 */
public class Hora
{
    // instance variables - Atributos de la Abstracción
    private int horas;
    private int minutos;
    private int segundos;

    /**
     * Constructor para objetos de la clase Hora sin Argumentos
     */

    public Hora()
    {
        // initialise instance variables
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
    
    /**
     * Constructor para objetos de la clase Hora recibiendo
     * horas.
     */

    public Hora(int h)
    {
        // initialise instance variables
        setHora(h);
        setMinutos(0);
        setSegundos(0);
    }
    
    /**
     * Constructor para objetos de la clase Hora recibiendo
     * horas y minutos.
     */

    public Hora(int h, int m)
    {
        // initialise instance variables
        setHora(h);
        setMinutos(m);
        setSegundos(0);
    }
    
    /**
     * Constructor para objetos de la clase Hora recibiendo
     * horas minutos y segundos.
     */

    public Hora(int h, int m, int s)
    {
        // initialise instance variables
        setHora(h);
        setMinutos(m);
        setSegundos(s);
    }
    
    /**
     * Este método recibe una nueva hora para el objeto
     * La nueva hora deberá estar entre 0 y 23.
     * 
     * @param      h       Nueva hora para asignar
     * @return     Nada. 
     */
    public void setHora(int h)
    {
        horas = (h >= 0 && h <= 23) ? h : 0;
    }
    
    /**
     * Este método recibe un nuevo minuto para el objeto
     * El nuevo minuto deberá estar entre 0 y 59.
     * 
     * @param      m       Nuevo minuto para asignar
     * @return     Nada. 
     */
    public void setMinutos(int m)
    {
        minutos = (m >= 0 && m <= 59) ? m : 0;
    }
    
    /**
     * Este método recibe un nuevo minuto para el objeto
     * El nuevo minuto deberá estar entre 0 y 59.
     * 
     * @param      s       Nuevo segundo para asignar
     * @return     Nada. 
     */
    public void setSegundos(int s)
    {
        segundos = (s >= 0 && s <= 59) ? s : 0;
    }
    
    /**
     * Este método envía al exterior el valor del atributo Horas
     * 
     * @param      Ninguno
     * @return     Un int que representa las horas del objeto. 
     */
    public int getHoras()
    {
        return horas;
    }
    
    /**
     * Este método envía al exterior el valor del atributo Minutos
     * 
     * @param      Ninguno
     * @return     Un int que representa los minutos del objeto. 
     */
    public int getMinutos()
    {
        return minutos;
    }
    
    /**
     * Este método envía al exterior el valor del atributo segundos
     * 
     * @param      Ninguno
     * @return     Un int que representa los segundos del objeto. 
     */
    public int getSegundos()
    {
        return segundos;
    }
    
    /**
     * Este método recibe una nueva hora modificando los atributos preexistentes
     * La nueva hora deberá estar entre 0 y 23
     * El nuevo minutos y segundos deberá estar entre 0 y 59.
     * 
     * @param       h       Nueva hora para asignar
     * @param       m       Nuevos minutos para asignar
     * @param       s       Nuevos para asignar
     * @return      Nada. 
     */
    public void setHoras(int h, int m, int s)
    {
        setHora(h);
        setMinutos(m);
        setSegundos(s);
    }
       
    /**
     * Este método recibe convierte los atributos del objeto a una cadena con formato AM-PM
     * El nuevo minuto deberá estar entre 0 y 59.
     * 
     * @param      Nada
     * @return     Una cadena que representa la Hora con el formato AM-PM. 
     */
    public String toString()
    {
        return ((horas == 12  || horas == 0) ? 12 : horas % 12) +
                 ":" + (minutos < 10 ? "0" : "") + minutos +
                 ":" + (segundos < 10 ? "0" : "") + segundos +
                 (horas < 12 ? " AM" : " PM");
    }

}
