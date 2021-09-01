import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataEUA extends Data {

    public DataEUA(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    @Override
    public String toString() {
        Calendar c = Calendar.getInstance();
        c.set(super.ano, super.mes, super.dia);

        String diaDaSemana = new SimpleDateFormat("EEE", java.util.Locale.ENGLISH).format(c.getTime());

        return diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1)
                + ", " + Mes.getMes(super.mes).getNomeEUA()
                + " " + super.dia
                + ", " + super.ano;
    }
}
