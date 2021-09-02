import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;

public class DataEUA extends Data {
    public DataEUA(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    @Override
    public String toString() {
        LocalDate ld = LocalDate.of(super.ano, super.mes, super.dia);
        String data = ld.format(DateTimeFormatter.ofPattern("EEE, MMMM dd, yyyy", Locale.US));
 
        return data;
    }
}
