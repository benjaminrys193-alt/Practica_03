public class Departamento{
private String[] dep;
public Departamento(){
this.dep= new String[]{
    "Ropa", "Elecetronica y tecnologia", "Higiene y cuidado personal", "Alimentos"
};
}
public String obtenerDepartamento(int indice){
    if (indice >= 0 && indice < this.dep.length) {
        return this.dep[indice];
    } else {
        return "Departamento desconocido";
    }
}
}