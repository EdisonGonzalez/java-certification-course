package bundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * The priority always goes from the most specific to the most generic.
 */
public class PriorityKeysInBundles {
    public static void main(String[] args) {
        // var loc = Locale.US;
        // Locale loc = new Locale("en", "US", "POSIX");
        Locale loc = new Locale.Builder().setLanguage("en").setRegion("US").setVariant("POSIX").build();
        var bundle = ResourceBundle.getBundle("ResourceBundle", loc);
        var enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            var key = enumeration.nextElement();
            var val = bundle.getString(key);
            System.out.println(key + "=" + val);
        }
    }
}
