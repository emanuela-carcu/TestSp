import java.util.ArrayList;

public class Firma {

    private String nume;

        private ArrayList<Departament> departamente;
    private ArrayList<Element> angajati;

        public Firma(String nume) {
            this.nume = nume;
            departamente = new ArrayList<Departament>();
            angajati = new ArrayList<Departament>();
        }

    public ArrayList<Element> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Element> angajati) {
        this.angajati = angajati;
    }

    public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public ArrayList<Departament> getDepartamente() {
            return departamente;
        }

        public void setDepartamente(ArrayList<Departament> departamente) {
            this.departamente = departamente;
        }

        public void addDepartament(Departament d) {
            departamente.add(d);
        }

    @Override
    public void accept(Visitor visitor) {
        for(Departament d: departamente) {
            for(Element a: d.getAngajati()) {
                a.accept(visitor);
            }
        }
        visitor.visitFirma(this);
    }


    }

