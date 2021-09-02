import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataBrasil extends Data {
    public DataBrasil(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    @Override
    public String toString() {
        LocalDate ld = LocalDate.of(super.ano, super.mes, super.dia);
        String data = ld.format(DateTimeFormatter.ofPattern("EEE, dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR")));
 
        return data.substring(0, 1).toUpperCase().concat(data.substring(1));
    }
}