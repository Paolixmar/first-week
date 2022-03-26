package com.galleriaarte;

public class Quadro extends OperaDArte
{
    private double altezza;
    private double larghezza;

    public Quadro(String titolo, String artista, double altezza, double larghezza)
    {
        super(titolo, artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {return altezza;}

    public void setAltezza(double altezza) {this.altezza = altezza;}

    public double getLarghezza() {return larghezza;}

    public void setLarghezza(double larghezza) {this.larghezza = larghezza;}

    @Override
    public double printEncumbrance() {return larghezza*altezza;}
}
