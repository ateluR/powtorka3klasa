public class uczen extends osoba{
    private static int liczbaUczniow = 0;
    private int nrUcznia;
    public uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        nrUcznia = liczbaUczniow;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        uczen.liczbaUczniow = liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "uczen{" +
                "nrUcznia=" + nrUcznia +
                '}';
    }
}

