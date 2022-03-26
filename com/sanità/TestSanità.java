package com.sanità;

public class TestSanità
{
    public static void main(String[] args)
    {
        AziendaSanitaria a =new AziendaSanitaria();
        a.addPaziente(new Paziente(12214, new Medico("Marco")));
        a.addPaziente(new Paziente(12215, new Medico("Luca")));
        a.addPaziente(new Paziente(12216, new Medico("Paolo")));
        a.addPaziente(new Paziente(12217, new Medico("Marco")));
        a.addPaziente(new Paziente(12218, new Medico("Lorenzo")));
        a.addPaziente(new Paziente(12219, new Medico("Marco")));
        a.addPaziente(new Paziente(12220, new Medico("Luca")));
        a.addPaziente(new Paziente(12221, new Medico("Marco")));

        a.getMedici().stream().forEach(x-> System.out.println(x.getNominativo()));
        a.getPazienti().stream().forEach(x-> System.out.println(x.getTesseraSanitaria()));
        System.out.println(a.toString());
        System.out.println(a.statMedico().getNominativo());

    }
}
