public class Producto{
    private String nombre;
    private String departamento;
    private double precio;
    public Producto (String nombre, int indiceDepartamento, double precio){
        this.nombre = validarNombre(nombre);
        Departamento depAux =new Departamento();
        this.departamento=depAux.obtenerDepartamento(indiceDepartamento);
        this.precio = validarPrecio(precio);
}
private String validarNombre(String nombrerecb){
    if(nombrerecb.equals("") || nombrerecb.equals(" ")){
        return "Producto desconocido";
    }
    return nombrerecb;
}
private double validarPrecio(double preciorecb){
    if(preciorecb<=0){
        return 100.0;
    }
    return preciorecb;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=validarNombre(nombre);
}
public String getDepartamento(){
    return departamento;
}
public double getPrecio(){
    return precio;
}
public void setPrecio(double precio){
    this.precio=validarPrecio(precio);
}
@Override 
public String toString(){
    return "Nombre: "+this.nombre+ " Departaento: "+this.departamento+ " Precio:$"+this.precio;
}
}