package pl.edu.pw.mini.zpoif.piatyszekp.Medias;

public abstract class MassMedia {
    protected String name;
    protected Short renown;

    public MassMedia(String name, Short renown) {
        this.name = name;
        this.renown = renown;
    }

    @Override
    public String toString() {
        return "MassMedia{" +
                "name='" + name + '\'' +
                ", renown=" + renown +
                '}';
    }
}
