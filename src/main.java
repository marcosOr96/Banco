import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Consola sc = new Consola();
        Banco b1 = new Banco(sc.leerEntero("cantidad de cuentas"));
        CuentaCorriente c1 = new CuentaCorriente();
        CuentaCorriente c2 = new CuentaCorriente();

        for (int i = 0; i < b1.getCuentas().length; i++) {
            c1.setNombreUsuario(sc.leerCadena("Nombre Usuario: "));
            c1.setNumeroCuentaCorriente((long) (Math.random() * 1000000000 + 1));
            sc.imprimir("Cuenta N°: " + c1.getNumeroCuentaCorriente());
            c1.setSaldoInicial(sc.leerDouble("Saldo: "));

            System.out.println("Saldo actual: "+c1.devolverSaldo());
            c1.ingresarDinero(sc.leerDouble("Valor a ingresar: "));
            c1.retirarDinero(sc.leerDouble("Valor a retirar: "));

            System.out.println("Saldo actual: "+c1.devolverSaldo());

            c2.setNumeroCuentaCorriente(sc.leerLong("Cuenta a transferir: "));
            c1.tranferencia(sc.leerDouble("Valor de transferencia: "), c1, c2);

            System.out.println("Saldo actual: "+c1.devolverSaldo());
            b1.agregarCuentaCorriente(c1);

            System.out.println(b1.agregarCuentaCorriente(c1));
        }
    }
}
