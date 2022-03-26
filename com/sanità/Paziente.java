package com.sanità;

public class Paziente
{
    private int tesseraSanitaria;
    private Medico mCurante;

    public Paziente(int tesseraSanitaria, Medico mCurante)
    {
        this.tesseraSanitaria = tesseraSanitaria;
        this.mCurante = mCurante;
    }

    public int getTesseraSanitaria() {return tesseraSanitaria;}

    public void setTesseraSanitaria(int tesseraSanitaria) {this.tesseraSanitaria = tesseraSanitaria;}

    public Medico getmCurante() {return mCurante;}

    public void setmCurante(Medico mCurante) {this.mCurante = mCurante;}
}
