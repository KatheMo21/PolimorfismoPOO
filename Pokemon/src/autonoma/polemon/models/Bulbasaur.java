/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polemon.models;

/**
 * Esta clase heredará las caracteristicas de la clase padre(Pokemon) e implementará caracteristicas de la interfaz(PokemonPlanta)
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    
    @Override
    public String atacarAranazo() {
        return "Soy Bulbasaur y estoy lanzando un arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Bulbasaur y estoy lanzando un mordisco";
    }
    
    @Override
    public String atacarPlacaje() {
        return "Soy Bulbasaur y estoy atacando el placaje";
    }
    
    /////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////
    public Bulbasaur(int numPokeDex, String nombre, double peso, String temportada) {
        super(numPokeDex, nombre, peso, temportada);
    }
    
    //////////////////////////////////// METODOS /////////////////////////////////////////////
    
    @Override
    public String atacarParalizar(){
        return "Soy Bulbasaur y estoy atacando con el paralizador";
    }
    
    @Override
    public String atacarDrenaje(){
        return "Soy Bulbasaur y estoy atacando con el drenaje";
    }
    
    @Override
    public String atacarHojaAfilada(){
        return "Soy Bulbasaur y estoy atacando con la hoja afilada";
    }
    
    @Override
    public String atacarLatigoCepa(){
        return "Soy Bulbasaur y estoy atacando con el latigo cepa";
    }
    
    public String saludar(){
        return "Hola soy Bulbasaur";
    }
    
}
