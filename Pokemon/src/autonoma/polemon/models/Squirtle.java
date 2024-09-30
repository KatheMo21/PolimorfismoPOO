/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polemon.models;

/**
 * Esta clase heredará las caracteristicas de la clase padre(Pokemon) e implementará caracteristicas de la interfaz(PokemonAgua)
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public class Squirtle extends Pokemon implements PokemonAgua {
    
     @Override
    public String atacarAranazo() {
        return "Soy Squirtle y estoy lanzando un arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Squirtle y estoy lanzando un mordisco";
    }
    
    @Override
    public String atacarPlacaje() {
        return "Soy Squirtle y estoy atacando el placaje";
    }
    
    /////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////

    public Squirtle(int numPokeDex, String nombre, double peso, String temportada) {
        super(numPokeDex, nombre, peso, temportada);
    }
    
    //////////////////////////////////// METODOS /////////////////////////////////////////////
    
    @Override
    public String atacarHidrobomba(){
        return "Soy Squirtle y estoy atacando con la Hidrobomba";
    }
    
    @Override
    public String atacarPistolaAgua(){
        return "Soy Squirtle y estoy atacando con la pistóla de agua";
    }
    
    @Override
    public String atacarBurbuja(){
        return "Soy Squirtle y estoy atacando con la burbuja";
    }
    
    @Override
    public String atacarHidropulso(){
        return "Soy Squirtle y estoy atacando con el hidropulso";
    }   
}
