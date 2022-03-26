package com.galleriaarte;

public abstract class OperaDArte
{
    protected String titolo;
    protected String artista;

    public OperaDArte(String titolo, String artista)
    {
        this.titolo = titolo;
        this.artista = artista;
    }

    public String getTitolo() {return titolo;}

    public void setTitolo(String titolo) {this.titolo = titolo;}

    public String getArtista() {return artista;}

    public void setArtista(String artista) {this.artista = artista;}

    public abstract double printEncumbrance();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperaDArte that = (OperaDArte) o;
        return titolo.equals(that.titolo) && artista.equals(that.artista);
    }

    @Override
    public String toString()
    {
        return "OperaDArte{"+"titolo='"+titolo+'\''+", artista='"+artista+'\''+'}';
    }
}
