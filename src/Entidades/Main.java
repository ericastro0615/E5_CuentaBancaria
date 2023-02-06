package Entidades;

import Servicios.ServicioAltaCuenta;
import Servicios.ServicioOperacionesBancarias;

public class Main {
    public static void main(String[] args) {

        ServicioAltaCuenta sc = new ServicioAltaCuenta();
        CuentaClass c1 = sc.altaCuenta();
        System.out.println(c1.toString());
        ServicioOperacionesBancarias.Menu(c1);



    }

}
