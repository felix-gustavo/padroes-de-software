import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataBrasil extends Data {
    public DataBrasil(int dia, int mes, int ano) {
        super(dia, mes, ano);
    }

    @Override
    public String toString() {
        Calendar c = Calendar.getInstance();
        c.set(super.ano, super.mes, super.dia);

        String diaDaSemana = new SimpleDateFormat("EEE").format(c.getTime());

        return diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1)
                + ", " + super.dia
                + " de " + Mes.getMes(super.mes).getNomeBR()
                + " de " + super.ano;
    }
}
