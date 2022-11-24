public class Main {
    public static void main(String[] args) {
        Firma a = new Firma("Nokia");
        Departament d = new Departament("5G");
        d.add(new Manager("Stefan", 10000));
        d.add(new Programator("Andrei", 15000));
        d.add(new Programator("Mirel", 45000));
        a.addDepartament(d);
        Visitor calculSalar = new VisitorSalar();
        a.accept(calculSalar);
        calculSalar.print();
    }
}

