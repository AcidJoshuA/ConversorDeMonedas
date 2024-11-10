/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordemonedas;

/**
 *
 * @author jcplo
 */
public class Conversordemonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar cantidad en pesos mexicanos (MXN): ");
    double cantidadMXN = scanner.nextDouble();
    System.out.println("\nSeleccionar moneda a la que se desea convertir:");
    System.out.println("1. Dólar (USD)");
    System.out.println("2. Euro (EUR)");
    System.out.println("3. Baht (THB)");
    System.out.println("4. Yen (JPY)");
    System.out.println("5. Won (KRW)");
    System.out.println("6. Dólar Australiano (AUD)");
    System.out.println("7. Sol (PEN)");
    System.out.println("8. Dólar Canadiense (CAD)");
    System.out.println("9. Bolívar (VES)");
    System.out.println("10. Peso Argentino (ARS)");
    System.out.print("Ingresar el número de la opción (1-10): ");
    int opcion = scanner.nextInt();
    double resultado = 0;
    switch (opcion) {
    default:
    if (opcion == 1) 
    resultado = cantidadMXN * 0.056;
    System.out.println("La cantidad convertida es: " + resultado + " USD");
    }else if (opcion == 2) 
    resultado = cantidadMXN * 0.051;
    System.out.println("La cantidad convertida es: " + resultado + " EUR");
    }else if (opcion == )
    resultado = cantidadMXN * 1.78;
    System.out.println("La cantidad convertida es: " + resultado + " THB");
    }else if (opcion == 4) 
    resultado = cantidadMXN * 7.64;
    System.out.println("La cantidad convertida es: " + resultado + " JPY");
    }else if (opcion == 5) 
    resultado = cantidadMXN * 74.80;
    System.out.println("La cantidad convertida es: " + resultado + " KRW");
    }else if (opcion == 6) 
    resultado = cantidadMXN * 0.086;
    System.out.println("La cantidad convertida es: " + resultado + " AUD");
    }else if (opcion == 7)
    resultado = cantidadMXN * 0.22;
    System.out.println("La cantidad convertida es: " + resultado + " PEN");
    }else if (opcion == 8) 
    resultado = cantidadMXN * 0.075;
    System.out.println("La cantidad convertida es: " + resultado + " CAD");
    } else if (opcion == 9) 
    resultado = cantidadMXN * 25.45;
    System.out.println("La cantidad convertida es: " + resultado + " VES");
    } else if (opcion == 10) 
    resultado = cantidadMXN * 13.30;
    System.out.println("La cantidad convertida es: " + resultado + " ARS");
    }else{
    System.out.println("Opción no válida, seleccionar un número entre 1 y 10.");
    }
    break;
    }    
    scanner.close();
   }
    
}
