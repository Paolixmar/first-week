package com.galleriaarte;

public class TestGalleria
{
    public static void main(String[] args)
    {
        Galleria g1 = new Galleria("Moma");
        g1.addOpera(new Quadro("La Gioconda", "Leonardo", 12.3, 8.4));
        g1.addOpera(new Sculture("David", "Michelangelo", 132.2, 49.3, 20.2));
        g1.addOpera(new Quadro("La Nascita di Venere", "Sandro Botticelli", 50.2, 170));

        g1.stampaCollezione();
        g1.getRaccolta().stream().forEach(x-> System.out.println(x.printEncumbrance()));
    }
}
