
package ejercicio3;

public abstract class  Persona {
 protected String nom;
 protected  int edad;
 protected  char sexo;

    public Persona(String nom, int edad, char sexo) {
        this.nom = nom;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
         return "Nombre:"+nom+" con "+edad+" años,sexo "+sexo;
       
        
    }
 
 
 
    
}
