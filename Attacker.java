
//Interfejs Attacker označava svaki objekat koji može da nanese štetu.
//Klase koje ga implementiraju moraju definisati metodu getEffectiveDamage(),
//koja vraća  štetu koju objekat nanosi.
  
package udg.edu.me;
public interface Attacker {
	
    int getEffectiveDamage();
}
