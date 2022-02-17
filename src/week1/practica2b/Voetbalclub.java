package week1.practica2b;

public class Voetbalclub {
    public String naam;
    public int aantalGewonnen;
    public int aantalGelijk;
    public int aantalVerloren;
    public int aantalGespeeld;
    public int aantalPunten;
    public Voetbalclub(String nm){
        naam = nm;
    }


    public void verwerkResultaat(char ch) {
        aantalGespeeld = aantalGespeeld + 1;
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld() {return aantalGespeeld;}

    public int aantalPunten() {return aantalPunten;}
    public String toString(){
        String s = naam +" "+ aantalGespeeld +" "+ aantalGewonnen +" "+ aantalGelijk +" "+ aantalVerloren +" "+ aantalPunten;
    return s;}
}
