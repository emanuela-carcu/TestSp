public class VisitorSalar implements Visitor{

    private int salariiDepartament;
    private int salariiFirma;
    private int salariiProgramatori;
    private int salariiTesteri;
    private int salariiManageri;

    public VisitorSalar() {
        salariiDepartament = 0;
        salariiFirma = 0;
        salariiManageri = 0;
        salariiProgramatori = 0;
        salariiTesteri = 0;
    }

    @Override
    public void visitFirma(Firma firma) {
        salariiFirma = salariiProgramatori + salariiTesteri + salariiManageri;
    }

    @Override
    public void visitProgramator(Programator programator) {
        salariiProgramatori += programator.getSalar();
    }

    @Override
    public void visitManager(Manager manager) {
        salariiManageri += manager.getSalar();
    }

    @Override
    public void visitTester(Tester tester) {
        salariiTesteri += tester.getSalar();
    }

    @Override
    public void print() {
        System.out.println("Salariu pe firma: "+salariiFirma);
        System.out.println("Salarii programatori: "+salariiProgramatori);
        System.out.println("Salarii testeri: "+salariiTesteri);
        System.out.println("Salarii manageri: "+salariiManageri);
    }
}
