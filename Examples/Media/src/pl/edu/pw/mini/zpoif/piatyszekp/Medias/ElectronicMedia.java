package pl.edu.pw.mini.zpoif.piatyszekp.Medias;

public abstract class ElectronicMedia extends MassMedia {

    protected int receivers;
    protected short veracity;

    public ElectronicMedia(String name, Short renown, int receivers, short veracity) {
        super(name, renown);
        this.receivers = receivers;
        this.veracity = veracity;
    }

    @Override
    public String toString() {
        return "ElectronicMedia{" +
                "receivers=" + receivers +
                ", veracity=" + veracity +
                "} " + super.toString();
    }

    public int getReceivers() {
        return receivers;
    }
}
