import java.util.Scanner;
public class Cajero {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

       System.out.println("===========CAJERO============");

       System.out.println("Ingrese la cantidad de productos a registrar: ");
       int n_productos = scanner.nextInt();
       scanner.nextLine(); 
       Producto[] listadeCompras= new Producto[n_productos];
       for (int i = 0; i < listadeCompras.length; i++) {
        System.out.println("\n--- Datos del Producto #" + (i + 1) + " ---");
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Departaamentos disponibles:");
        System.out.println("  [0] Ropa");
        System.out.println("  [1] Electronica y tecnologia");
        System.out.println("  [2] Higiene y cuidado personal");
        System.out.println("  [3] Alimentos");
        System.out.print("Selecciona el numero de departamento: ");
        int deptoNum = scanner.nextInt();

        System.out.print("Ingrese el precio: $");
        double precio = scanner.nextDouble();
        scanner.nextLine(); 
        listadeCompras[i] = new Producto(nombre, deptoNum, precio);
    }
        System.out.println("====================================\n");
        System.out.println("Dinero recibido: ");
        double efectivo = scanner.nextDouble();
        Ticket ticketActual = new Ticket(listadeCompras, efectivo);
        System.out.println(ticketActual);
    }
}
