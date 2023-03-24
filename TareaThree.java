package Tarea3_Introduccion;

public class TareaThree {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(17);
        persona.setNombre("Jesus");
        persona.setTelefono(332346318);

        System.out.println("nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Telefono: "+persona.getTelefono());
    }
    static class Persona{

        private int edad;
        private String nombre;
        private long telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
    }
}
