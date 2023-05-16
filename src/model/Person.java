package model;

public class Person {

    //Attribute
    protected String name;
    protected int alter;

    //Referenzen
    protected Kurs[] kurseDerPerson;


    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.kurseDerPerson = new Kurs[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs, Person p) {
        for (int i = 0; i < kurseDerPerson.length; i++) {
            if (kurseDerPerson[i] == null) {

                if (p instanceof Schueler ){

                    if(!neuerKurs.checkSchulerVorhanden((Schueler) p)){
                        kurseDerPerson[i] = neuerKurs;
                        neuerKurs.addSchueler((Schueler) p);
                    }
                } else if (p instanceof Lehrer) {
                    neuerKurs.addLehrer((Lehrer) p);
                }
                break;
            }
        }
    }


    public String getInfo(){
        String info = "";
        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        info = "Name: " + getName() + "Alter:" + getAlter();
        for(Kurs i: kurseDerPerson){
            info += "Kurs" + i;
        }
        return info;
    }

    public Kurs[] getKurseDerPerson() {
        return kurseDerPerson;
    }
}
