
package autonoma.polemon.models;

/**
 * Esta será la clase interface, que heredará caracteristicas de la clase pokemon, es capaz de aprender muchos movimientos de fuego impresionantes, como Ascuas, Colmillo ígneo, Giro fuego, Humareda, Envite ígneo, pero también otros de tipo Normal e incluso Hada.
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public interface PokemonFuego {

    
    
    /**
    * el método abstract atacarPunioFuego, causa daño y tiene una probabilidad del 10% de quemar al objetivo.           Puño fuego aumenta su potencia en un 20% si es usado por un Pokémon con la habilidad puño férreo.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarPunioFuego();
    
    /**
    * el método abstract atacarAscuas, es el daño adicional causado cuando el Pokémon atacante usa un movimiento de ataque de su mismo tipo
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarAscuas();
    
    /**
    * el método abstract atacarLanzallamas, causa daño y tiene una probabilidad del 10% de quemar al objetivo.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarLanzallamas();
    
}
