package pl.edu.pw.mini.zpoif.piatyszekp;

import pl.edu.pw.mini.zpoif.piatyszekp.Medias.ElectronicMedia;
import pl.edu.pw.mini.zpoif.piatyszekp.Medias.MassMedia;
import pl.edu.pw.mini.zpoif.piatyszekp.Medias.TV;

import java.util.Comparator;
import java.util.List;

public class MediaSorter {

    private static Comparator<MassMedia> byType = (a, b) -> Boolean.compare(a instanceof TV, b instanceof TV);
    private static Comparator<MassMedia> byViewers = (a, b) -> (a instanceof ElectronicMedia && b instanceof ElectronicMedia) ?
            Integer.compare(((ElectronicMedia)a).getReceivers(), ((ElectronicMedia)b).getReceivers()) : 0;

    public static void sortMediasByType(List<MassMedia> medias) {
        medias.sort(byType);
    }

    public static void sortMediasByViewers(List<MassMedia> medias) {
        medias.sort(byViewers);
    }

}
