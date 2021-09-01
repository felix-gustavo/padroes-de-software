public enum Mes {
    Jan(1, "Janeiro", "January"),
    Fev(2, "Fevereiro", "February"),
    Mar(3, "Março", "March"),
    Abr(4, "Abril", "April"),
    Mai(5, "Maio", "May"),
    Jun(6, "Junho", "June"),
    Jul(7, "Julho", "July"),
    Ago(8, "Agosto", "August"),
    Set(9, "Setembro", "September"),
    Out(10, "Outubro", "October"),
    Nov(11, "Novembro", "November"),
    Dez(12, "Dezembro", "December");

    private int valor;
    private String nomeBR;
    private String nomeEUA;

    Mes(int i, String nomeBR, String nomeEUA) {
        this.valor = i;
        this.nomeBR = nomeBR;
        this.nomeEUA = nomeEUA;
    }

    public static Mes getMes(int numMes) {
        for (Mes mes: Mes.values()) {
            if(mes.valor == numMes) {
                return mes;
            }
        }
        return null;
    }

    public String getNomeBR() {
        return nomeBR;
    }

    public String getNomeEUA() {
        return nomeEUA;
    }
}
