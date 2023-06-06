package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Person{

    //Attribute

    //Referenzen
    private Tadel[] tadelDesSchuelers;

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Schueler(String name, int alter) {
        super(name,alter);
        tadelDesSchuelers = new Tadel[3];
    }



    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs, Schueler s) {
        boolean wasBreaked = false;
        for (int i = 0; i < kurseDerPerson.length; i++) {
            if (kurseDerPerson[i] == null || kurseDerPerson[i] == neuerKurs) {
                kurseDerPerson[i] = neuerKurs;
                neuerKurs.addSchueler(s);
                wasBreaked = true;
                break;
            }
        }
        if(!wasBreaked){
            Kurs[] helparray = new Kurs[kurseDerPerson.length + 1];

            for (int i = 0; i < kurseDerPerson.length; i++) {
                helparray[i] = kurseDerPerson[i];
            }

            helparray[helparray.length-1] = neuerKurs;
            neuerKurs.addSchueler(s);

            kurseDerPerson = helparray;
        }
   }



    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    public void addTadel(Tadel neuerTadel){
        boolean  wasBreaked = false;
        for(int i = 0; i < tadelDesSchuelers.length; i++){
            if(tadelDesSchuelers[i] == null){
                tadelDesSchuelers[i] = neuerTadel;
                wasBreaked = true;
                break;
            }
        }
        if(!wasBreaked){
            Tadel[] helparray = new Tadel[tadelDesSchuelers.length + 1];

            for (int i = 0; i < tadelDesSchuelers.length; i++) {
                helparray[i] = tadelDesSchuelers[i];
            }

            helparray[helparray.length-1] = neuerTadel;


            tadelDesSchuelers = helparray;

        }
    }

    /**
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){

        String info;
//        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        info = "Name: " + getName() + "\n" + "Alter: " + getAlter() + "\n";
        for(Kurs i: kurseDerPerson){
            if(i != null) {
                info += "Kurs" + " " + i.getKursBezeichnung() + "\n";
            }
        }
        for(Tadel i: tadelDesSchuelers){
            if(i != null) {
                info += "Tadel:" + " " + i.getTadelBeschreibung() + "\n";
            }
        }
        return info;
    }

}
