
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
     Persona[]asistentesc=new Persona[5];
     
    
      // Persona p= new Persona("Lionel",30,'M') {};
        EquipoDeFutbol e =new EquipoDeFutbol("River");
        EquipoDeFutbol equip =new EquipoDeFutbol("Racing");
        JugadorDeFutbol j=new JugadorDeFutbol(e,"Lionel",30,'M');
        JugadorDeFutbol jug=new JugadorDeFutbol(e,"Paulo",27,'M');
        Aficionado a = new Aficionado(e,j,"Tomas",27,'M');
        
        asistentesc[0]=new Aficionado(e,j,"Tomas",27,'M');
        asistentesc[1]= new Aficionado(e,j,"Camila", 22, 'F');
        asistentesc[2]= new Aficionado (equip,jug,"Joaquin",24,'M');
        asistentesc[3]= new JugadorDeFutbol (e,"Lionel",32,'M');
        asistentesc[4]= new JugadorDeFutbol(equip,"Paulo",27,'M');
   
        
        for(int i=0;i<asistentesc.length;i++)
           
        {
        
            System.out.println(asistentesc[i].toString());
        
        }
        
        
    }
    
}
