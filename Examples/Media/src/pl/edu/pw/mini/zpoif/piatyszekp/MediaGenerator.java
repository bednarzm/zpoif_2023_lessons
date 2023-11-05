package pl.edu.pw.mini.zpoif.piatyszekp;

import pl.edu.pw.mini.zpoif.piatyszekp.Medias.MassMedia;
import pl.edu.pw.mini.zpoif.piatyszekp.Medias.Newspaper;
import pl.edu.pw.mini.zpoif.piatyszekp.Medias.Radio;
import pl.edu.pw.mini.zpoif.piatyszekp.Medias.TV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class MediaGenerator {

    @FunctionalInterface
    interface RadioGenerator {
        Radio create();
    }

    @FunctionalInterface
    interface NewspaperGenerator {
        Newspaper create();
    }

    @FunctionalInterface
    interface TVGenerator {
        TV create();
    }

    /**
     * Function to generate random medias
     * @param n number of medias each type
     * @return List of generated medias
     */
    public static List<MassMedia> generate(int n){
        List<String> tvNames = Arrays.asList("CNNW", "FoxNews", "NBCC", "NHHK", "Jetix2", "Khabara TV", "UTVa");
        List<String> radioNames = Arrays.asList("Rouge FMa", "China National Radio New", "City FM 899", "Radio Hauraki2", "JFNK","Today FM news");
        List<String> newspaperNames = Arrays.asList("El Universala", "La Prensaco", "Tal Cualana", "Barbadian2", "Pepper PunchX");
        Random random = new Random();

        RadioGenerator radioGenerator = () -> new Radio(
                radioNames.get(random.nextInt(radioNames.size())),
                (short) (1 + random.nextInt(100)),
                random.nextInt(1000000001),
                (short) (1 + random.nextInt(100)));

        NewspaperGenerator newspaperGenerator = () -> new Newspaper(
                newspaperNames.get(random.nextInt(newspaperNames.size())),
                (short) (1 + random.nextInt(100)),
                random.nextInt(1000001),
                (short) (1 + random.nextInt(100)));

        TVGenerator tvGenerator = () -> new TV(
                tvNames.get(random.nextInt(tvNames.size())),
                (short) (1 + random.nextInt(200)),
                random.nextInt(500000001),
                (short) (1 + random.nextInt(100)),
                random.nextBoolean()
        );

        List<MassMedia> medias = new ArrayList<MassMedia>();

        for (int i = 0; i < n; i++) {
            medias.add(tvGenerator.create());
            medias.add(radioGenerator.create());
            medias.add(newspaperGenerator.create());
        }

        return medias;
    }

}
