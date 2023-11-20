package pl.edu.pw.mini.zpoif.piatyszekp.Medias;

public class TV extends ElectronicMedia {

    protected Boolean isInformative;

    public TV(String name, Short renown, int receivers, short veracity, Boolean isInformative) {
        super(name, renown, receivers, veracity);
        this.isInformative = isInformative;
    }

    @Override
    public String toString() {
        return "TV{" +
                "isInformative=" + isInformative +
                "} " + super.toString();
    }
}
