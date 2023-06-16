package hn.uth.Calculadora_de_Areas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner entrada = new Scanner(System.in); 
    public static void main( String[] args )
    {
        int opc_ciclo = 0;
        
        do {
        	
        	System.out.println("******************************************");
        	System.out.println("********** CALCULADORA DE AREAS **********");
        	System.out.println("******************************************");
        	System.out.println("** 1.) Calcular el area de un circulo ****");
        	System.out.println("** 2.) Calcular el area de un cuadrado ***");
        	System.out.println("** 3.) Calcular el area de un rectangulo *");
        	System.out.println("** 4.) Calcular el area de un triangulo **");
        	System.out.println("** 5.) Salir                            **");
        	System.out.println("******************************************");
        	System.out.println("Ingrese una opcion: ");
        	opc_ciclo = entrada.nextInt();
        	
        	switch(opc_ciclo)
        	{
        	case 1: 
        		Double Area_circulo = Area_circulo(LeerDecimales("Ingrese el radio del circulo: "));
        		System.out.println("El area del circulo es: " + Area_circulo + "\n");
        		break;
        	case 2:
        		Double Area_cuadrado = Area_cuadrado(LeerDecimales("Ingrese el lado del cuadrado: "));
        		System.out.println("El area del cuadrado es: " + Area_cuadrado + "\n");
        		break;
        	case 3:
        		Double Area_rectangulo = Area_rectangulo(LeerDecimales("Ingrese el lado del rectangulo: "), LeerDecimales("Ingrese el ancho del rectangulo: "));
        		System.out.println("El area del rectangulo es: " + Area_rectangulo + "\n");
        		break;
        	case 4:
        		Double Area_triangulo = Area_triangulo(LeerDecimales("Ingrese la base del triangulo: "), LeerDecimales("Ingrese la altura del triangulo: "));
        		System.out.println("El area del rectangulo es: " + Area_triangulo + "\n");
        		break;
        	case 5:
        		break;
        	default:
        		System.out.println("Ingrese una de las opciones del menu");
        		break;	
        	}
        	
        } while(opc_ciclo != 5 || opc_ciclo > 5);
        
        
    }
    
    public static Double LeerDecimales(String mensaje) {
    	Scanner entrada = new Scanner(System.in);
    	System.out.println(mensaje);
    	return entrada.nextDouble();
    }
    
    public static Double Area_circulo(Double radio){
    	Double pi = 3.1416;
    	Double Result_Area =null;
    	
    	if(radio > 0) {
    		Result_Area = pi * (radio * radio);
    	} else {
    		System.err.println("El radio no puede ser negativo");
    	}
    	return Result_Area;
    }
    
    public static Double Area_cuadrado(Double lado){
    	Double Result_Area = null;
    	
    	if(lado > 0) {
    		Result_Area = lado * lado;
    	} else {
    		System.err.println("El lado no puede ser negativo");
    	}
    	return Result_Area;
    }
    
    public static Double Area_rectangulo(double Largo,double ancho) {
		 Double Result_Area = null;
		 if(Largo > 0 && ancho > 0) {
			 Result_Area = Largo * ancho;
		 }
		 else {
			 System.err.println("Los datos no pueden ser negativon");
		 }
		 return Result_Area;
	 }
    
	 public static Double Area_triangulo(double base,double altura) {
		 Double Result_Area = null;
		 if(base > 0 && altura > 0) {
			 Result_Area = (base * altura) / 2;
		 }
		 else {
			 System.err.println("Ni la base, ni la Altura pueden ser negativos");
		 }
		 return Result_Area;
	 }
    
}
