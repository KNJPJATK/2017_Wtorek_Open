package eu.barcikowski.Data;

/**
 * Created by GaskinPC on 24.05.2017.
 */
public enum PartTypes {

    WHEELS,
    FRAME,
    HANDLEBARS,
    SADDLE,
    OTHER;

    public static boolean contains(String s) {
        for (PartTypes part : values())
            if (part.name().equals(s.toUpperCase()))
                return true;
        return false;
    }
}
