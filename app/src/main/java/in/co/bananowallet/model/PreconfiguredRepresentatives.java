package in.co.bananowallet.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import timber.log.Timber;

/**
 * Preconfigured representatives to choose from
 */

public class PreconfiguredRepresentatives {
    private static List<String> representatives = Arrays.asList(
            "ban_1cake36ua5aqcq1c5i3dg7k8xtosw7r9r7qbbf5j15sk75csp9okesz87nfn",
            "ban_3meme7r4zxbygg4j9b3ucgt6pqiaeh1i9hy5p918qatcaqbamnu9gjgx6f4c\t",
            "ban_1shazam6ffdmfm8axgqgz3qiw34eyyphm4b6x5uy9kc9ckj5wcgke1sxc4mf",
            "ban_1raizenpg6r7nyh1z8kgdw3by63hhidu89ogtpspugx4fo6jhgqxat5brph8",
            "ban_1happyoh3tsb75g1axdg7uinzxwzzeycqmnfhsqbc6oexg1s85ofrgd7zgr4",
            "ban_3binance1adje7uwzjmsyxsqxjt8c471i33xo39k94twkipntmrqt1ii5t57",
            "ban_1xrwxuerfnmbu3pzfmsprourcutzqmtkwodz5q3r3a6u6u6caqpcbmrho4ui"
    );

    public static String getRepresentative() {
        int index = new Random().nextInt(representatives.size());
        String rep = representatives.get(index);
        Timber.d("Representative: %s", rep);
        return rep;
    }
}
