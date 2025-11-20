
// Luka Vukovic 24/130, Fuad Delic 21/070, Stevan Perovic 24/124
//    Interfejs Collidable predstavlja svaki objekat koji može učestvovati
   // u koliziji. Klase koje ga implementiraju pravougaonik i krug  moraju
   // definisati logiku sudara sa drugim kolajderom.


package udg.edu.me;

public interface Collidable {
    boolean intersects(Collidable other);
}