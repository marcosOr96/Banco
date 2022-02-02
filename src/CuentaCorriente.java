public class CuentaCorriente {
    private String nombreUsuario;
    private double saldoInicial;
    private long numeroCuentaCorriente;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombreUsuario, double saldoInicial, long numeroCuentaCorriente) {
        this.nombreUsuario = nombreUsuario;
        this.saldoInicial = saldoInicial;
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public long getNumeroCuentaCorriente() {
        return numeroCuentaCorriente;
    }

    public void setNumeroCuentaCorriente(long numeroCuentaCorriente) {
        this.numeroCuentaCorriente = numeroCuentaCorriente;
    }

    public void ingresarDinero(double dineroIngreso) {
        saldoInicial = getSaldoInicial() + dineroIngreso;
    }

    public void retirarDinero(double dineroRetiro) {
        saldoInicial = saldoInicial - dineroRetiro;
    }

    public double devolverSaldo() {
        return saldoInicial;
    }

    public String devolverDatosCuenta() {
        return "nombreUsuario= " + nombreUsuario +
                "\nsaldoInicial= " + saldoInicial +
                "\nnumeroCuentaCorriente= " + numeroCuentaCorriente;
    }

    public void tranferencia(double dineroTransferencia, CuentaCorriente c1, CuentaCorriente c2) {
        c1.saldoInicial = c1.saldoInicial - dineroTransferencia;
        c2.saldoInicial = c2.saldoInicial + dineroTransferencia;
    }
}
