
package autonoma.polemon.models;

/**
 * Esta será la clase interface, que heredará caracteristicas de la clase pokemon, este pokemon  almacenan           electricidad estática en sus cuerpos y luego la liberan en forma de un ataque.
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public interface PokemonElectrico {
    
    
    /**
    * el método abstract atacarImpatrueno, Consiste en electrocutar a el enemigo con un alto nivel de electricidad
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarImpacTrueno();
    
    /**
    * el método abstract atacarPuniotrueno,  causa daño y tiene una probabilidad del 10% de paralizar al objetivo.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarPunioTrueno();
    
    /**
    * el método abstract atacarRayo,  causa daño al contrincante
    * @return retorna un String.
    */
    
    public abstract String atacarRayo();
    
    /**
    * el método abstract atacarRayoCarga, causa daño y tiene una probabilidad del 70% de aumentar en un nivel el ataque especial del usuario.
    * @return retorna un String.
    */
    
    public abstract String atacarRayoCarga();
    
    
   
    
}
