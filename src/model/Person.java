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
        this.kurseDerPerson = new Kurs[2];
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
