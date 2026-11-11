public class Ticket{
   private Producto [] productos;
   private double total;
   private double dineroRecibido;
   private double cambioRecibido;
   public Ticket(Producto[] productos, double dineroRecibido) {
    this.productos = productos;
    this.dineroRecibido = dineroRecibido;
    this.total=0;
    for(int i=0; i<productos.length; i++){
        this.total = this.total + productos[i].getPrecio();
    }
    this.cambioRecibido = dineroRecibido - this.total;
}
   public double getTotal() {
    return total;
   }
   public double getDineroRecibido() {
    return dineroRecibido;
   }
   public void setDineroRecibido(double dineroRecibido) {
    this.dineroRecibido = dineroRecibido;
   }
   public double getCambioRecibido() {
    return cambioRecibido;
   }
@Override
public String toString() {   
    String cadenaTicket ="========== TICKET DE COMPRA ==========\n" ;
    for (int i = 0; i < productos.length; i++) {
        cadenaTicket = cadenaTicket + productos[i].toString() + "\n";
    }
        cadenaTicket = cadenaTicket +  
           "--------------------------------------\n" +
           "TOTAL:            $" + this.total + "\n" +
           "EFECTIVO:         $" + this.dineroRecibido + "\n" +
           "CAMBIO:        $" + this.cambioRecibido + "\n" +
           "======================================";
           return cadenaTicket;
}
}