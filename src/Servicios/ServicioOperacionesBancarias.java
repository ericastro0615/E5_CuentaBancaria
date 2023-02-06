package Servicios;

import Entidades.CuentaClass;

import java.util.Scanner;





/*
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.

f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

public class ServicioOperacionesBancarias {


    public static void Menu (CuentaClass c1 ) {
        int opciones;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        do{
            System.out.println("----HOME BANKING----\n" +
                    "1= Ingresar dinero \n" +
                    "2= Retirar dinero \n" +
                    "3= Extracción rápida \n" +
                    "4= Consultar saldo \n" +
                    "5= Consultar datos personales \n" +
                    "6= Salir");
            opciones = sc.nextInt();

            switch (opciones){
                case 1:
                    System.out.println("Ingresando dinero a su cuenta bancaria\n");
                    double ingresoDinero = sc.nextDouble();
                    ingresarDinero(ingresoDinero, c1);
                    break;
                case 2:
                    System.out.println("Retirar dinero de su cuenta bancaria\n");
                    double retiro= sc.nextDouble();
                    retirarDinero ( c1, retiro);
                    break;
                case 3:
                    System.out.println("Extracción EXPRESS \n");
                    System.out.println("Cuánto dinero necesirta retirar (sólo el 20%");
                    retiro = sc.nextDouble();
                    extraccionRapida (c1,  retiro );
                    break;
                case 4:
                    System.out.println("Consultando su saldo actual \n");
                    mostrarSaldo(c1);
                    break;
                case 5:
                    System.out.println("Consultando sus datos personales \n");
                    mostrarDatos (c1);
                    break;
                case 6:
                    System.out.println("SALIR");

            }

        }while (opciones!=6);

    }

    public static double ingresarDinero (double ingresoDinero, CuentaClass c1){
        System.out.println("Cuánto dinero querés ingresar a tu cuenta bancaria?");
        double saldoSumado = (double)c1.getSaldoActual()+ingresoDinero;
        c1.setSaldoActual( (int) Math.round(saldoSumado) );
        System.out.println("el saldo de su cuenta es: " + c1.getSaldoActual());
        return c1.getSaldoActual();
    }

    /*
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
     */




    public static void  mostrarSaldo (CuentaClass c1) {
        System.out.println("Saldo " + c1.getSaldoActual());
        //return (c1.getSaldoActual());
    }


    public static  boolean verificarSaldo (CuentaClass c1, double retiro ) {
        return c1.getSaldoActual()>=retiro;
    }

    public static int extraccionDinero (CuentaClass c1, double retiro) {
        //llamo al metodo donde se verifica si lo que se desea retirar es menor que saldo
        if ( verificarSaldo(c1, retiro ) ) {
            double saldoPostRetiro = (double) (c1.getSaldoActual() - retiro);
            //casteo de double (linea de arriba) a int, para enviarlo al setter p/actualizar valor de sald<o
            c1.setSaldoActual( (int) (Math.round(saldoPostRetiro)) );
           // return c1.getSaldoActual();
            //no se puede prencindir del return y hacerlo global?
            System.out.println("Procesando la operación de extracción ");
        } else {
            System.out.println("Su cuenta no posee suficiente. Por favor, intente retirar menor cantidad de $");
        //devuelvo nuevamente
        }
        return c1.getSaldoActual();
    }


    public static int retirarDinero ( CuentaClass c1, double retiro){
        //llamo al metodo donde se verifica si lo que se desea retirar es menor que saldo
        if ( verificarSaldo(c1, retiro ) ) {

            double saldoPostRetiro = (double) (c1.getSaldoActual() - retiro);
            //casteo de double (linea de arriba) a int, para enviarlo al setter p/actualizar valor de sald<o
            c1.setSaldoActual( (int) (Math.round(saldoPostRetiro)) );
            System.out.println("Procesando la operación de extracción ");
            // return c1.getSaldoActual();
            //no se puede prencindir del return y hacerlo global?
        } else {
            System.out.println("Su cuenta no posee suficiente. Por favor, intente retirar menor cantidad de $");
            //devuelvo nuevamente
        }
        return c1.getSaldoActual();
    }

    public static int extraccionRapida (CuentaClass c1, double retiro) {
        if ( verificarSaldo(c1, retiro) && (c1.getSaldoActual()*0.20 >= retiro ) ) {
            double extraccionExp= (double) c1.getSaldoActual() - retiro;
            c1.setSaldoActual( (int) Math.round(extraccionExp));
            System.out.println("Retirando dinero :) ");
        }else {
            System.out.println("Solo es posible retirar el 20% de su cuenta" + c1.getNombre());
        }
        return c1.getSaldoActual();
    }


    public static void mostrarDatos (CuentaClass c1) {
        System.out.println("Datos bancarios \n" +
                "Nombre " + c1.getNombre() +"\n+" +
                "DNI " + c1.getDni() +"\n"+
                "Num de cuenta "+ c1.getNumeroCuenta() + "\n" +
                "Saldo " + c1.getSaldoActual()   );
    }








}
