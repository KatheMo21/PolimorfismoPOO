/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.polemon.models;

/**
 * Esta clase heredará las caracteristicas de la clase padre(Pokemon) e implementará caracteristicas de la interfaz(PokemonElectrico)
 * @author Katherin Monroy 
 * @version 1.0.0
 * @since 2024 09 30
 */
public class Pikachu extends Pokemon implements PokemonElectrico   {

    @Override
    public String atacarAranazo() {
        return "Soy pikachu y estoy lanzando un arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy pikachu y estoy lanzando un mordisco";
    }
    
    @Override
    public String atacarPlacaje() {
        return "Soy pikachu y estoy atacando el placaje";
    }
    
    /////////////////////////////// CONTRUSCTOR ///////////////////////
    public Pikachu(int numPokeDex, String nombre, double peso, String temportada) {
        super(numPokeDex, nombre, peso, temportada);
    }

    @Override
    public String atacarImpacTrueno() {
        return "Soy pikachu y estoy lanzando un trueno"; 
    }

    @Override
    public String atacarRayo() {
        return "Soy pikachu y estoy lanzando un rayo";
    }
    
    @Override
    public String atacarPunioTrueno() {
        return "Soy pikachu y estoy lanzando un puño trueno";
    }
    
    @Override
    public String atacarRayoCarga() {
        return "Soy pikachu y estoy lanzando un rayo carga";
    }
    
    public String saludar(){
        return "Hola soy Pikachu";
    }
    
    
}
