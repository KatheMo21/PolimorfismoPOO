
package autonoma.polemon.models;

/**
 * Esta será la clase interface, que heredará caracteristicas de la clase pokemon, el pokemonAgua resultan especialmente débiles frente a los tipo planta, sin embargo, muchos Pokémon de agua son también tipo hielo o pueden aprender ataques de hielo, que resultan efectivos con los de planta; disminuyendo así su desventaja. Algunos Pokémon necesitan la piedra agua para evolucionar.
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public interface PokemonAgua {
    
    /**
    * el método abstract atacarHidrobomba,causa daño y no tiene ningún efecto secundario.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarHidrobomba();
    
    /**
    * el método abstract atacarPistolaAgua, la pistola de agua inflige daño al objetivo . En combate doble, la          pistola de agua puede atacar a cualquier Pokémon que se encuentre cerca del usuario. En combate triple, la        pistola de agua solo puede atacar a un Pokémon que se encuentre adyacente al usuario.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarPistolaAgua();
    
    /**
    * el método abstract atacarBurbuja, causa daño y tiene una probabilidad del 10% de bajar en un nivel la velocidad del objetivo. En combates dobles el ataque afecta a ambos oponentes, mientras que en combates triples afecta a los oponentes adyacentes. Burbuja tiene una potencia de 20.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarBurbuja();
    
    /**
    * el método abstract atacarHidropulso, En batallas de Gimnasio e Incursiones, inflige 70 de daño y costs 50 energía. En la Liga de Combates GO, Hidropulso inflige 80 de daño y costs 55 energía.
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarHidropulso();
}
