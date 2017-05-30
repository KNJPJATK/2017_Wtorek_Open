package eu.barcikowski.Utils;

import eu.barcikowski.Data.PartTypes;

/**
 * Created by GaskinPC on 24.05.2017.
 */
public class ItemValidator {


    public static boolean validate(String[] values) {

        return values[0].matches("(\\w|\\s)+?")
                && PartTypes.contains(values[1])
                && values[2].matches("^\\d+(,|.\\d{2})?$");

    }
}
