package com.galleriaarte;

public class Sculture extends OperaDArte
{
    private double altezza;
    private double larghezza;
    private double profondità;

    public Sculture(String titolo, String artista, double altezza, double larghezza, double profondità)
    {
        super(titolo, artista);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondità = profondità;
    }

    public double getAltezza() {return altezza;}

    public void setAltezza(double altezza) {this.altezza = altezza;}

    public double getLarghezza() {return larghezza;}

    public void setLarghezza(double larghezza) {this.larghezza = larghezza;}

    public double getProfondità() {return profondità;}

    public void setProfondità(double profondità) {this.profondità = profondità;}

    @Override
    public double printEncumbrance() {return altezza*larghezza*profondità;}
}
