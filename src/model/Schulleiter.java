package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schulleiter extends Lehrer{

    //Attribute


    //Referenzen

    /**
     * Ein Objekt der Klasse Schulleiter hebt sich von einem Lehrer einzig dadurch ab,
     * dass es einem Schüler einen Tadel ausstellen kann.
     * @param name
     * @param alter
     * @param besoldungsGruppe
     */
    public Schulleiter(String name, int alter, String besoldungsGruppe) {
        super(name,alter,besoldungsGruppe);
    }


    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */


    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */

    /**
     * Einem Schüler wird ein Tadel hinzugefügt.
     * @param s Der zu tadelnde Schüler.
     * @param t Der Tadel.
     */
    public void tadelEinenSchueler(Schueler s, Tadel t){
        s.addTadel(t);
    }

    /**
     * Methode erstellt aus den Informationen zum Schulleiter (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
//    public String getInfo(){
//        String info = "";
//        //TODO Kompakte Zeichenkette zu den Informationen eines Schulleiters - gut lesbar!
//        return info;
//    }
}
