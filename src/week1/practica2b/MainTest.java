package week1.practica2b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    private  Voetbalclub v;
    private  Voetbalclub v2;
    private  Voetbalclub v3;
    @BeforeEach
    public void init(){
        v = new Voetbalclub( null);
        v2 = new Voetbalclub("");
        v3 = new Voetbalclub("Ajax");

    }

    @Test
    void kijkenOfFCLeegIs() {
        assertEquals( "FC", v.getClubNaam());
        assertEquals("Ajax", v3.getClubNaam());
        assertEquals("FC", v2.getClubNaam());
        System.out.println("1.FC test geslaagd!");
    }

    @Test
    void FoutieveWaardesInvoer(){
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('a');
        v.verwerkResultaat('b');
        v.verwerkResultaat('1');
        assertEquals(2,v.getAantalGewonnen());
        assertEquals(0,v.getAantalGelijk());
        assertEquals(0,v.getAantalVerloren());
        System.out.println("2.Foutieve waardes Invoer geslaagd");

    }

    @Test
    void foutieve_Uitkomst(){
        Voetbalclub v = new Voetbalclub("Ajax");
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('g');
        v.verwerkResultaat('v');
        assertEquals("3 1 1",v.toString2Test());
        System.out.println("3.Foutieve_Uiktomst geslaagd");
    }


    @Test
    void herhadelijkVerwerken(){
        Voetbalclub v = new Voetbalclub("Ajax");
        v.setAantalGelijk(2);
        v.setAantalGewonnen(3);
        v.setAantalVerloren(7);
        assertEquals(11, v.aantalPunten());
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('g');
        v.verwerkResultaat('v');
        assertEquals(21, v.aantalPunten());
        System.out.println("4.Herhadelijk verwerken geslaagd");

    }
}