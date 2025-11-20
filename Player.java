/*
    Klasa Player predstavlja glavnog igraca u igri i nasleđuje GameObject,
     ima poziciju i kolajder za provjeru kolizije.
     Player ima dodatne atribute koji su  samo
    za igraca – ime i health .

    Klasa obezbjeđuje validaciju unosa imena (ne smije biti null, prazno
    i ograničava razmake), kao i dozvoljeni opseg health vrijednosti (0–100).
    Metoda decreaseHealth smanjuje igracevo zdravlje nakon napada neprijatelja,
    dok getDisplayName vraća prikaz imena igraca u čitljivom formatu.

    Player je jedan od glavnih objekata u igri, učestvuje u kolizijama,
    prima udarce od neprijatelja (Attacker objekata) i služi kao centralna
    tačka za logiku u Game klasi.
*/




package udg.edu.me;

public class Player extends GameObject {

    private String name;
    private int health; 

    public Player(double x, double y, Collidable collider, String name, int health) {
        super(x, y, collider);
        setName(name);
        setHealth(health);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Obavezno ime.");
        }

        String trimmed = name.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("Prazno ime.");
        }

        
        String[] dijelovi = trimmed.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String dio : dijelovi) {
            sb.append(Character.toUpperCase(dio.charAt(0)))
              .append(dio.substring(1).toLowerCase())
              .append(" ");
        }
        this.name = sb.toString().trim();
    }

    public int getHealth() { return health; }

    public void setHealth(int health) {
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException("Health mora biti: 0–100.");
        }
        this.health = health;
    }

    public void decreaseHealth(int amount) {
        if (amount < 0) amount = 0;
        this.health -= amount;
        if (this.health < 0) this.health = 0;
    }

    @Override
    public String getDisplayName() {
        return "Player[" + name + "]";
    }

    @Override
    public String toString() {
        return getDisplayName() + " @(" + getX() + "," + getY() + ") HP=" + health;
    }
}


