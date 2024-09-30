
package autonoma.pokemon.main;
import autonoma.polemon.models.Bulbasaur;
import autonoma.polemon.models.Charmander;
import autonoma.polemon.models.Pikachu;
import autonoma.polemon.models.Pokemon;
import autonoma.polemon.models.PokemonAgua;
import autonoma.polemon.models.PokemonElectrico;
import autonoma.polemon.models.PokemonFuego;
import autonoma.polemon.models.PokemonPlanta;
import autonoma.polemon.models.Squirtle;

/**
 * clase principal en donde se crearán los objetos.
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public class PokemonApp {
    
    public static void main (String[] args){
        
        // creacion de ojeto Pikachu:
        Pikachu pikachu = new Pikachu(025,"pika",6,"T1");  
       
        Pokemon pokemon = new Pikachu(1,"pika1",1,"T2"); 
        System.out.println(pokemon.atacarMordisco());
        System.out.println(pokemon.atacarAranazo());
        System.out.println(pokemon.atacarPlacaje());
        
        PokemonElectrico pokemonE = new Pikachu(2,"Pika2",2,"T3");
        System.out.println(pokemonE.atacarImpacTrueno());
        System.out.println(pokemonE.atacarPunioTrueno());
        System.out.println(pokemonE.atacarRayo());
        System.out.println(pokemonE.atacarRayoCarga());
        
        
        // creacion de ojeto Charmander:
        
        Charmander charmander = new Charmander(140,"Salamandra de fuego",8.5,"T2");
        Pokemon pokemonDos = new Charmander(140,"Salamandra de fuego",8.5,"T2");
        System.out.println(pokemonDos.atacarAranazo());
        System.out.println(pokemonDos.atacarMordisco());
        System.out.println(pokemonDos.atacarPlacaje());
        
        PokemonFuego pokemonF = new Charmander(140,"Salamandra de fuego",8.5,"T2");
        System.out.println(pokemonF.atacarAscuas());
        System.out.println(pokemonF.atacarLanzallamas());
        System.out.println(pokemonF.atacarPunioFuego());
        
        // creacion de ojeto Bulbasaur:
 
        Bulbasaur bulbasaur = new Bulbasaur(001,"Hiedra",6.0,"T1");
        Pokemon pokemonTres = new Bulbasaur(001,"Hiedra",6.0,"T1");
        System.out.println(pokemonTres.atacarAranazo());
        System.out.println(pokemonTres.atacarMordisco());
        System.out.println(pokemonTres.atacarPlacaje());
        
        PokemonPlanta pokemonP = new Bulbasaur(001,"Hiedra",6.0,"T1");
        System.out.println(pokemonP.atacarDrenaje());
        System.out.println(pokemonP.atacarHojaAfilada());
        System.out.println(pokemonP.atacarLatigoCepa());
        System.out.println(pokemonP.atacarParalizar());
        
        // creacion de ojeto Squirtle:
        
        Squirtle squirtle = new Squirtle(007,"el pokemon tortuguita",9,"T5");
        Pokemon pokemonCuatro = new Squirtle(007,"el pokemon tortuguita",9,"T5");
        System.out.println(pokemonCuatro.atacarAranazo());
        System.out.println(pokemonCuatro.atacarMordisco());
        System.out.println(pokemonCuatro.atacarPlacaje());
        
        PokemonAgua pokemonA = new Squirtle(007,"el pokemon tortuguita",9,"T5");
        System.out.println(pokemonA.atacarBurbuja());
        System.out.println(pokemonA.atacarHidrobomba());
        System.out.println(pokemonA.atacarHidropulso());
        System.out.println(pokemonA.atacarPistolaAgua());
        
        
        
        
        
       
    }
    
}
