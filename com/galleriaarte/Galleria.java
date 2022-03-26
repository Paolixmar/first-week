package com.galleriaarte;

import java.util.HashSet;
import java.util.Set;

public class Galleria
{
    private String nome;
    private Set<OperaDArte> raccolta=new HashSet<>();

    public Galleria(String nome, Set<OperaDArte> raccolta)
    {
        this.nome = nome;
        this.raccolta = raccolta;
    }

    public Galleria(String nome){this.nome = nome;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Set<OperaDArte> getRaccolta() {return raccolta;}

    public void setRaccolta(Set<OperaDArte> raccolta) {this.raccolta = raccolta;}

    public void addOpera(OperaDArte o){raccolta.add(o);}

    public void stampaCollezione() {raccolta.forEach(x-> System.out.println(x.toString()));}

    public void stampaIngombro(OperaDArte o)
    {
        if(o instanceof Quadro || o instanceof Sculture) System.out.println(o.printEncumbrance());
        else System.out.println("Opera non presente!");
    }
}
