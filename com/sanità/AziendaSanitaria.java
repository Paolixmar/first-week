package com.sanità;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AziendaSanitaria
{
    private ArrayList<Medico> medici=new ArrayList<>();
    private ArrayList<Paziente> pazienti=new ArrayList<>();
    private Map<Medico, ArrayList<Paziente>> mutuati=new HashMap<>();

    public ArrayList<Medico> getMedici() {return medici;}

    public void setMedici(ArrayList<Medico> medici) {this.medici = medici;}

    public ArrayList<Paziente> getPazienti() {return pazienti;}

    public void setPazienti(ArrayList<Paziente> pazienti) {this.pazienti = pazienti;}

    public Map<Medico, ArrayList<Paziente>> getMutuati() {return mutuati;}

    public void setMutuati(Map<Medico, ArrayList<Paziente>> mutuati) {this.mutuati = mutuati;}

    public void addPaziente(Paziente p)
    {
        if(pazienti.stream().noneMatch(x->x.getTesseraSanitaria()==p.getTesseraSanitaria()))pazienti.add(p);
        if(medici.stream().noneMatch(x->x.getNominativo()==p.getmCurante().getNominativo()))medici.add(p.getmCurante());

        if(mutuati.get(p.getmCurante())==null)
        {
            ArrayList<Paziente> lPazienti=new ArrayList<>();
            lPazienti.add(p);
            mutuati.put(p.getmCurante(), lPazienti);
        }
        else if(mutuati.get(p.getmCurante())!=null)
        {
            ArrayList<Paziente> lPazienti=mutuati.get(p.getmCurante());
            lPazienti.add(p);
            mutuati.put(p.getmCurante(), lPazienti);
        }
    }

    public ArrayList listaMedico(Medico m) {return mutuati.get(m);}

    public Medico statMedico()
    {
        long cnt=0;
        Medico m1=new Medico();
        for(Medico m:mutuati.keySet())
        {
            long paz=mutuati.get(m).stream().count();
            if(paz>cnt)
            {
                m1=m;
                cnt=paz;
            }
        }
        System.out.println(cnt);
        return m1;
    }

    @Override
    public String toString()
    {
        String s="";
        for(Medico m:mutuati.keySet())
        {
            s+="Medico: "+m.getNominativo()+"\nPazienti: ";
            for(Paziente p:mutuati.get(m))
            {
                s+=p.getTesseraSanitaria()+"\n";
            }
        }
        return s;
    }
}
