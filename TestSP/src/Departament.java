import java.util.ArrayList;

public class Departament {

    private String name;
    private ArrayList<Element> angajati;

    public Departament(String name) {
        this.name = name;
        this.angajati = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Element> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Element> angajati) {
        this.angajati = angajati;
    }

    public void add(Element a){
        angajati.add(a);
    }
}
