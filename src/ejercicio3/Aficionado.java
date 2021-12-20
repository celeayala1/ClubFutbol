
package ejercicio3;

public class Aficionado extends Persona{
    
    private EquipoDeFutbol equipof;
    private JugadorDeFutbol jugadorf;

    public Aficionado(EquipoDeFutbol equipof, JugadorDeFutbol jugadorf, String nom, int edad, char sexo) {
        super(nom, edad, sexo);
        
        this.equipof = equipof;
        this.jugadorf = jugadorf;
    }
    
   
   
    public EquipoDeFutbol getEquipof() {
        return equipof;
    }

    public void setEquipof(EquipoDeFutbol equipof) {
        this.equipof= equipof;
    }

    public JugadorDeFutbol getJugadorf() {
        return jugadorf;
    }

   

    public void setJugadorf(JugadorDeFutbol jugadorf) {
        this.jugadorf = jugadorf;
    }

    @Override
    public String toString() {
        return super.toString() + ",equipo Favorito: " + equipof.getNomE() + " y jugador favorito: " + jugadorf.getNom();
    }


    
}
