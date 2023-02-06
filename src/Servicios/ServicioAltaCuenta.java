package Servicios;

import Entidades.CuentaClass;

import java.util.Scanner;

public class ServicioAltaCuenta {
    public CuentaClass altaCuenta (){

        CuentaClass cb1 = new CuentaClass();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre: ");
        cb1.setNombre(sc.nextLine());
        System.out.println("hola " + cb1.getNombre());
        System.out.println("Ingrese su DNI : ");
        cb1.setDni(sc.nextInt());
        System.out.println("ingrese el dinero a ingresar a su cuenta bancaria ");
        cb1.setSaldoActual(sc.nextInt());
        System.out.println("su nCBU es " + cb1.getNumeroCuenta());
        return cb1;



    }



}
