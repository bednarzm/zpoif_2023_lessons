package pl.edu.pw.mini.zpoif.piatyszekp.Medias;

public class Radio extends ElectronicMedia {
    public Radio(String name, Short renown, int receivers, short veracity) {
        super(name, renown, receivers, veracity);
    }

    @Override
    public String toString() {
        return "Radio{} " + super.toString();
    }
}
