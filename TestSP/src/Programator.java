public class Programator implements Element{

    private String name;
    private int salar;

    public Programator(String name, int salar) {
        this.name = name;
        this.salar = salar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }
}
