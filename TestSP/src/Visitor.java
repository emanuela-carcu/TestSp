public interface Visitor {

    void visitFirma(Firma firma);
    void visitProgramator(Programator programator);
    void visitManager(Manager manager);
    void visitTester(Tester tester);

    void print();

}
