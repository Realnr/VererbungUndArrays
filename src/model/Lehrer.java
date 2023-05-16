package model;

import java.util.Arrays;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends  Person{

    //Attribute

    protected String besoldungsGruppe;

    //Referenzen

    protected Unterrichtsfach[] faecherDerLehrkraft;

    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {
        super(name, alter);
        this.besoldungsGruppe = besoldungsGruppe;
        faecherDerLehrkraft = new Unterrichtsfach[3];
    }

    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }

    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * Sobald das Array erweitert wurde, muss dem Kurs noch mitgeteilt werden, dass dieser Lehrer den Kurs übernimmt.
     * @param neuerKurs
     */



    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        for(int i = 0; i < faecherDerLehrkraft.length; i++){
            if(faecherDerLehrkraft[i] == null){
               faecherDerLehrkraft[i] = neuesFach;
            }
        }
    }

    /**
     * Methode erstellt aus den Informationen zum Lehrer (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    @Override
    public String getInfo(){
       String info = "";
//        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        info = "Name: " + getName() + "Alter:" + getAlter() + "Besoldungsgruppe:" + getBesoldungsGruppe();
        for(Kurs i: kurseDerPerson){
            info += "Kurs" + i;
        }
        for(Unterrichtsfach i: faecherDerLehrkraft){
            info += "Fach" + i;
        }
        return info;
    }

}
