//Creado por: Jesus Gomez

public class Main {
    public static void main(String[] args) {
        //primera parte
        System.out.println(suma(5,10,15));

        //segunda parte
        coche miCoche = new coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
}
class coche
{
    int puertas = 0;
    public void agregarPuerta()
    {
        puertas++;
    }

}