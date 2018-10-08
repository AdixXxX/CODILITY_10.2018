package PWPW;

import java.util.ArrayList;
import java.util.List;

public class Osoba
{
    public int Wiek;
    public String Imie;

    public int getWiek() {
        return Wiek;
    }

    public void setWiek(int wiek) {
        Wiek = wiek;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public Osoba(int wiek, String imie)
    {
        this.Wiek = wiek;
        this.Imie = imie;
    }
}