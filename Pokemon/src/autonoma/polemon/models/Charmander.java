/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polemon.models;

/**
 * Esta clase heredará las caracteristicas de la clase padre(Pokemon) e implementará caracteristicas de la interfaz(PokemonFuego)
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public class Charmander extends Pokemon implements PokemonFuego {
    
    @Override
    public String atacarAranazo() {
        return "Soy Charmander y estoy lanzando un arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Charmander y estoy lanzando un mordisco";
    }
    
    @Override
    public String atacarPlacaje() {
        return "Soy Charmander y estoy atacando el placaje";
    }
    
    /////////////////////////////// CONTRUSCTOR ///////////////////////

    public Charmander(int numPokeDex, String nombre, double peso, String temportada) {
        super(numPokeDex, nombre, peso, temportada);
    }
    
    /////////////////////////////// SOBREESCRITURA DE METODOS///////////////////////

    @Override
    public String atacarPunioFuego(){
        return "Soy charmander y estoy atacando con Puño Fuego";
    }
    
    
    @Override
   public String atacarAscuas(){
        return "Soy charmander y estoy atacando con Puño Ascuas" ;
    }
    
    @Override
    public String atacarLanzallamas(){
        return"Soy charmander y estoy atacando con Lanzallamas";
    }
    
    public String saludar(){
        return "Hola soy charmander";
    }
}
    




