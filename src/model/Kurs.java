package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Kurs {

    //Attribute
    private String kursBezeichnung;

    //Referenzen
    private Unterrichtsfach fach;
    private Lehrer lehrkraft;
    private Schueler[] schuelerDesKurses;

    /**
     * In einem Kurs wird ein Unterrichtsfach unterricht. Diesem Kurs kann später ein Lehrer hinzugefügt werden.
     * Schüler werden einzeln hinzugefügt.
     * @param kursName
     */
    public Kurs(Unterrichtsfach fach, String kursName){
        this.fach = fach;
        this.kursBezeichnung = kursName;
        this.schuelerDesKurses = new Schueler[30];
    }

    public String getKursBezeichnung() {
        return kursBezeichnung;
    }

    public Unterrichtsfach getFach() {
        return fach;
    }

    public Lehrer getLehrkraft() {
        return lehrkraft;
    }

    public void setLehrkraft(Lehrer lehrkraft) {
        this.lehrkraft = lehrkraft;
    }


    /**
     * Ein Schüler wird der Menge der Schüler hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerSchueler
     */
    public void addSchueler(Schueler neuerSchueler){

        for(int i = 0; i < schuelerDesKurses.length; i++){
            if(schuelerDesKurses[i] == null){
                schuelerDesKurses[i] = neuerSchueler;
                break;
            }
        }
    }
    public boolean checkSchulerVorhanden(Schueler neuerSchueler){
        for(int i = 0; i < schuelerDesKurses.length; i++){
            if(neuerSchueler == schuelerDesKurses[i]){
                return true;
            }
        }
        return false;
    }
    public void addLehrer(Lehrer lehrer){
       if(lehrkraft == null){
           lehrkraft = lehrer;
       }
    }

    /**
     * Methode erstellt aus den Informationen zum Kurs (Kursbezeichnung, Fach, Lehrer, Schülernamen) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "";
        info = "Bezeichnung des Kurses:"+ " " + getKursBezeichnung() + "\n" + "Fach:" + " " + getFach().getFachBezeichnung() + "\n" + "Lehrkraft:" + " " + getLehrkraft().getName() + "\n";
        for(Schueler s: schuelerDesKurses){
           if(s != null){
                info += "Schueler" + " " + s.getName() + "\n";
           }

        }
        return info;
    }
}
