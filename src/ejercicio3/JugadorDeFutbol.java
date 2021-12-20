
package ejercicio3;


public class JugadorDeFutbol extends Persona {
    
 protected EquipoDeFutbol NomE;

    public JugadorDeFutbol(EquipoDeFutbol NomE, String nom, int edad, char sexo) 
    {
        super(nom, edad, sexo);
        this.NomE = NomE;
    }

   
    

    public EquipoDeFutbol getNomE() {
        return NomE;
    }

    @Override
    public String toString() {
        return super.toString()+ ",nombre de equipo:" + NomE.getNomE();
    }


    
}
