package pl.edu.pw.mini.zpoif.piatyszekp.Medias;

public class Newspaper extends MassMedia {

    protected int circulation;
    protected short pages;

    public Newspaper(String name, Short renown, int circulation, short pages) {
        super(name, renown);
        this.circulation = circulation;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "circulation=" + circulation +
                ", pages=" + pages +
                "} " + super.toString();
    }
}
