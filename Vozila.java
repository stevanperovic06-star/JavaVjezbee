// glavna klasa
public class Vozila {

    public static void main(String[] args) {
        // Kreiranje objekata različitih tipova vozila
        Automobil a = new Automobil("Bmw", 2005, 1900, "Crna", 5, "Dizel");
        Kamion k = new Kamion("Man", 2001, 3000, "Bijela", 10000, true);
        Kombi kb = new Kombi("Mercedes", 2015, 2200, "Plava", 9);

        // Pozivanje metoda za ispis
        a.ispisi();
        k.ispisi();
        kb.ispisi();
    }
}
class Vozilo {

    // Zajednički atributi za sva vozila
    private String proizvodjac;
    private int godinaProizvodnje;
    private int kubikaza;
    private String boja;

    // Konstruktor 
    public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
        this.proizvodjac = proizvodjac;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kubikaza = kubikaza;
        this.boja = boja;
    }

    // Geteri i seteri
    public String getProizvodjac() { return proizvodjac; }
    public void setProizvodjac(String proizvodjac) { this.proizvodjac = proizvodjac; }

    public int getGodinaProizvodnje() { return godinaProizvodnje; }
    public void setGodinaProizvodnje(int godinaProizvodnje) { this.godinaProizvodnje = godinaProizvodnje; }

    public int getKubikaza() { return kubikaza; }
    public void setKubikaza(int kubikaza) { this.kubikaza = kubikaza; }

    public String getBoja() { return boja; }
    public void setBoja(String boja) { this.boja = boja; }

    // Metoda koja računa osnovnu cijenu registracije
    public double cijenaRegistracije() {
        double cijena = 100; // osnovna cijena

        // povećanje cijene 
        if (godinaProizvodnje < 2010)
            cijena += 30;

        if (kubikaza > 2000)
            cijena += 50;

        return cijena;
    }

    // Metoda koja ispisuje osnovne podatke o vozilu
    public void ispisi() {
        System.out.println("Proizvodjac: " + proizvodjac);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
        System.out.println("Kubikaza: " + kubikaza);
        System.out.println("Boja: " + boja);
    }
}
class Automobil extends Vozilo {

    // Dodatni atributi samo za automobile
    private int brojVrata;
    private String tipMotora; // dizel ili benzin

    public Automobil(String proizvodjac, int godina, int kubikaza, String boja,
                     int brojVrata, String tipMotora) {
        super(proizvodjac, godina, kubikaza, boja); // poziv konstruktora iz super klase
        this.brojVrata = brojVrata;
        this.tipMotora = tipMotora;
    }

    // Override, dodavanje pravila za dizel
    @Override
    public double cijenaRegistracije() {
        double cijena = super.cijenaRegistracije();
        if (tipMotora.equalsIgnoreCase("dizel"))
            cijena += 20;
        return cijena;
    }

    @Override
    public void ispisi() {
        super.ispisi(); // ispis iz super klase
        System.out.println("Broj vrata: " + brojVrata);
        System.out.println("Tip motora: " + tipMotora);
        System.out.println("Cijena registracije: " + cijenaRegistracije() + " EUR\n");
    }
}
class Kamion extends Vozilo {

    private int kapacitetTereta;
    private boolean prikolica;

    public Kamion(String proizvodjac, int godina, int kubikaza, String boja,
                  int kapacitetTereta, boolean prikolica) {
        super(proizvodjac, godina, kubikaza, boja);
        this.kapacitetTereta = kapacitetTereta;
        this.prikolica = prikolica;
    }

    // kamion sa prikolicom +50 EUR
    @Override
    public double cijenaRegistracije() {
        double cijena = super.cijenaRegistracije();
        if (prikolica)
            cijena += 50;
        return cijena;
    }

    @Override
    public void ispisi() {
        super.ispisi();
        System.out.println("Kapacitet tereta: " + kapacitetTereta);
        System.out.println("Prikolica: " + (prikolica ? "Da" : "Ne"));
        System.out.println("Cijena registracije: " + cijenaRegistracije() + " EUR\n");
    }
}
class Kombi extends Vozilo {

    private int kapacitetPutnika;

    public Kombi(String proizvodjac, int godina, int kubikaza, String boja,
                 int kapacitetPutnika) {
        super(proizvodjac, godina, kubikaza, boja);
        this.kapacitetPutnika = kapacitetPutnika;
    }

    // Ako ima više od 8 putnika – dodatnih 30 EUR
    @Override
    public double cijenaRegistracije() {
        double cijena = super.cijenaRegistracije();
        if (kapacitetPutnika > 8)
            cijena += 30;
        return cijena;
    }

    @Override
    public void ispisi() {
        super.ispisi();
        System.out.println("Kapacitet putnika: " + kapacitetPutnika);
        System.out.println("Cijena registracije: " + cijenaRegistracije() + " EUR\n");
    }
}
