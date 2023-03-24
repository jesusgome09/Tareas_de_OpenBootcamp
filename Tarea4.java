package Tarea4_Introduccion;

public class Tarea4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "jesus";
        System.out.println("Nombre: "+cliente.nombre);
        cliente.edad = 17;
        System.out.println("Edad: "+cliente.edad);
        cliente.telefono = 32346318;
        System.out.println("Telefono: "+cliente.telefono);
        cliente.credito = 2000;
        System.out.println("Creditos: "+cliente.credito);





    }
}
class Persona{
    public int edad;
    public String nombre;
    public long telefono;
}

class Cliente extends Persona{
    public int credito;

}

class Trabajador extends Persona{
    public int salario;
}