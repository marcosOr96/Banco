import java.util.Arrays;

public class Banco {
    private CuentaCorriente cuentas[];

    public Banco(int cantCuentas) {
        cuentas = new  CuentaCorriente[cantCuentas];
    }

    public CuentaCorriente[] getCuentas() {
        return cuentas;
    }

    public String agregarCuentaCorriente(CuentaCorriente c1) {
        return c1.devolverDatosCuenta();
    }
}
