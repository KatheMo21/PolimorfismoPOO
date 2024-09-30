
package autonoma.polemon.models;

/**
 * Esta será la clase interface, que heredará caracteristicas de la clase pokemon, este pokemon fluye constantemente una energía que sana la mente y el cuerpo.
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public interface PokemonPlanta {
    
    /**
    * el método abstract atacarParalizar, reduce la Velocidad del Pokémon e impide que use sus movimientos en un 25% de los casos
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarParalizar();
    
    /**
    * el método abstract atacarDrenaje, causa daño y el usuario recupera el 50% de los PS quitados por el movimiento al objetivo.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarDrenaje();
    
     /**
    * el método abstract atacarHojaAfilada, aumenta su potencia un 50% más si es usado por un Pokémon con la habilidad cortante.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarHojaAfilada();
    
    /**
    * el método abstract atacarLatigoCepa, causa daño y no tiene ningún efecto secundario. El movimiento tiene una potencia de 35 y 10 PP.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarLatigoCepa();
    
}
