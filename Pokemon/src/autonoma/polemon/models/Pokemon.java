
package autonoma.polemon.models;

/**
 * Esta será la clase padre, que heredará caracteristicas a las demás clases 
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public abstract class Pokemon {
    
    /**
    * el atributo numPokedex de tipo int se refiere al numero de pokemons que un entrenador ha caputarado.
    */
    private int numPokeDex;
    
    /**
    * el atributo nombre de tipo String  será el nombre del pokemon.
    */
    private String nombre; 
    
    /**
    * el atributo peso de tipo double será el peso del pokemon.
    */
    private double peso; 
    
    /**
    * el atributo temporada de tipo String será la temporada a la que hace parte.
    */
    private String temportada; 

    
    ////////////////////////////////////// CONSTRUCTOR /////////////////////////////////////////////
    public Pokemon(int numPokeDex, String nombre, double peso, String temportada) {
        this.numPokeDex = numPokeDex;
        this.nombre = nombre;
        this.peso = peso;
        this.temportada = temportada;
    }
    ///////////////////////////////////// / METODOS DE ACCESO ///////////////////////////////////////
    public int getNumPokeDex() {
        return numPokeDex;
    }

    public void setNumPokeDex(int numPokeDex) {
        this.numPokeDex = numPokeDex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPerso() {
        return peso;
    }

    public void setPerso(double perso) {
        this.peso = perso;
    }

    public String getTemportada() {
        return temportada;
    }

    public void setTemportada(String temportada) {
        this.temportada = temportada;
    }
    
    //////////////////////////////////////// METODOS//////////////////////////////////////
    
    
    /**
    * el método toString devuelve  una cadena con todas
sus propiedades.
    * @param  no recibe parámetros.
    * @return retorna una cadena con todas las características de la figura.
    */
    
    
    @Override
    public String toString() {
        return "Pokemon{" + "numPokeDex=" + numPokeDex + ", nombre=" + nombre + ", peso=" + peso + ", temportada=" + temportada + '}';
    }
    
    /**
    * el método abstract atacarPlacaje, atacará el placaje de los demas pokemones 
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarPlacaje();
    
    /**
    * el método abstract atacarAranazo, araña a los demas pokemones 
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    public abstract String atacarAranazo();
    
    /**
    * el método abstract atacarMordiscos, muerde a los demas pokemones 
    * @param  no recibe parámetros.
    * @return retorna un String.
    */
    
    public abstract String atacarMordisco();
    

}
