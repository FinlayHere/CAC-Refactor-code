package printer;

import java.text.NumberFormat;
import java.util.Locale;

public interface Printer {
    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
    String print();
}
