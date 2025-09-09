import java.util.ArrayList;

public class klasa {
    private ArrayList<uczen> uczniowie;
    private Nauczyciel wychowawca;

    public klasa( Nauczyciel wychowawca) {
        this.wychowawca = wychowawca;
    }
    private void dodajUczniaKlasy(uczen uczen){
        if(uczniowie.contains(uczen))
            return;
        uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        String listauczniow = ""
        for(uczen:uczniowie)
        return "klasa{" +
                "wychowawca=" + wychowawca +
                '}';
    }
}
