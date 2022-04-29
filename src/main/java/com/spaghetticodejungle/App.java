package com.spaghetticodejungle;

import com.spaghetticodejungle.pojo.Gnocchi;
import com.spaghetticodejungle.pojo.LongAndMediumLength;
import com.spaghetticodejungle.pojo.PastaSize;
import com.spaghetticodejungle.pojo.ShortCut;
import com.spaghetticodejungle.pojo.Soup;
import com.spaghetticodejungle.pojo.Stretched;
import com.spaghetticodejungle.pojo.WithFilling;
import java.util.List;

/**
 *  Java 17 - Sealed Classes
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        createLongAndMediumLength();
        createShortCut();
        createStretched();
        createSoup();
        createWithFilling();
        createGnocchi();
    }

    public static void createLongAndMediumLength() {
        List<LongAndMediumLength> longAndMediums = List.of(
            new LongAndMediumLength(PastaSize.LONG_AND_MEDIUM_LENGTH,"Bavette",
                "Narrower version of tagliatelle","Bibs",
                "Baverine, bavettine, lasagneddi (in Sicily)","Liguria"),
            new LongAndMediumLength(PastaSize.LONG_AND_MEDIUM_LENGTH,"Fettuccine",
                "Ribbon of pasta approximately 6.5 millimeters wide.",
                "Little ribbons","Lasagnette, fettucce, ramicce, sagne",
                "Rome"),
            new LongAndMediumLength(PastaSize.LONG_AND_MEDIUM_LENGTH,"Spaghetti",
                "A long, thin, cylindrical pasta of Italian origin, made of semolina or flour and water.",
                "Little strings", "Fide/fidi, fidelini, ristoranti, vermicelloni, filatelli, vermicelloni giganti[",
                "Sicily")
        );

      longAndMediums.stream().forEach(System.out::println);
    }

    public static void createShortCut(){
        List<ShortCut> shortCuts = List.of(
            new ShortCut(PastaSize.SHORT_CUT,"Anelli","Short tubular, or annular-shaped, pasta",
                "Small Rings","Anelloni, anellini, anelletti, anelloni d'Africa (large rings)",
                "Sicily"),
            new ShortCut(PastaSize.SHORT_CUT,"Macaroni","Tubes, either bent or straight",
                "From Greek for food made from barley", "Macaroni", "Naples"),
            new ShortCut(PastaSize.SHORT_CUT,"Farfalle","Bow tie- or butterfly-shaped ",
                "Butterflies", "fiochetti, fiocconi, farfalloni, galla genovese",
                "Northern Italy")
        );
        shortCuts.stream().forEach(System.out::println);
    }

    public static void createStretched() {
        List<Stretched> stretcheds = List.of(
            new Stretched(PastaSize.STRETCHED,"Cencioni","Petal shaped, slightly curved with rough convex side",
                "Little rags","Mischiglio (Basilicata)","Southern Italy"),
            new Stretched(PastaSize.STRETCHED,"Corzetti","Flat figure-eight stamped from Liguria",
                "The name derives from a 14th century Genovese coin, the corzetto.","Curzetti (Genoa); "
                + "crosets (Piedmont); crosetti (Emilia-Romagna); croxetti, torsellini", "Val Polcevera"),
            new Stretched(PastaSize.STRETCHED,"Orecchiette","Irregular disc with a central dome and a "
                + "slightly thicker crown.","Little ears","strascinate; recchini (Rome); recchietele (Campania,"
                + " Molise and Basilicata)","Apulia")
        );
        stretcheds.stream().forEach(System.out::println);
    }

    public static void createSoup() {
        List<Soup> soups = List.of(
            new Soup(PastaSize.SOUP,"Anelli","Small rings of pasta (not to be confused with Calamaretti)",
                "Small rings","Aneletti, anidduzzi, cerchionetti, taraduzzi","Sicily"),
            new Soup(PastaSize.SOUP,"Cuscussu ","Minuscule dots reminding of couscous",
                "Minuscule dots","Scucuzzu. Kusksu in Malta","Liguria"),
            new Soup(PastaSize.SOUP,"Ptitim","Rice grains, spheres or other forms",
                "Flakes","Israeli couscous, Jerusalem couscous, giant couscous, pearl couscous.",
                "Israel")
        );
        soups.stream().forEach(System.out::println);
    }

    public static void createWithFilling() {
        List<WithFilling> withFillings = List.of(
            new WithFilling(PastaSize.WITH_FILLING, "Casoncelli", "A stuffed pasta with various fillings.",
                "Possibly from casa.(house)", "Casonsei, Casonziei, Ciaroncie", "Lombardi, Italy"),
            new WithFilling(PastaSize.WITH_FILLING, "Pansotti", "Triangular shape with a bulging center, does not contain meat.",
                "Big bellies", "Ravioli di magro.", "Liguria"),
            new WithFilling(PastaSize.WITH_FILLING, "Caccavelle", "Large bowl-like pasta intended for stuffing ",
                "From Latin cacabus,(pot)", "Pentole (Naples)", "Naples")
        );
        withFillings.stream().forEach(System.out::println);
    }

    public static void createGnocchi() {
        List<Gnocchi> gnocchis = List.of(
            new Gnocchi(PastaSize.GNOCCHI, "Canederli", "Small balls of dough. Usually made of bread crumbs, "
                + "but sweet variants would have a potato base.", "From the German Knödel", "Gnocchi di pane, "
                + "canedeli, knödel", "Trentino-Alto Adige"),
            new Gnocchi(PastaSize.GNOCCHI, "Donderet", "Elongated, narrow dumpling", "narrow dumpling",
                "Dandolarini, strangolapreti piemontesi", "Piedmont, more particularly Cuneo province and Valle "
                + "Colla."),
            new Gnocchi(PastaSize.GNOCCHI, "Gnocchi", "various thick, small, and soft dough dumplings",
                "Possibly from nocca, meaning (knuckle)", "Gnocchetti, gnocchi alla romana, gnudi, malfatti, "
                + "strangulaprievete, cavatelli, malloreddus ", "various places")
        );
        gnocchis.stream().forEach(System.out::println);
    }
}
