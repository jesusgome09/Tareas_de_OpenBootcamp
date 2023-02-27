package Tarea2_Introduccion;

public class Main {
    public static void main(String[] args) {
        int numeroif = 3;
        if(numeroif >= 1){
            System.out.println("numeroif es positivo");
        }
        else if(numeroif == 0){
            System.out.println("numeroif es cero");
        }
        else if (numeroif <= -1) {
            System.out.println("numeroif es negativo");
        } else {
            System.out.println("error");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);
        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
        String estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("estamos en " + estacion);
                break;
            case "primavera":
                System.out.println("estamos en " + estacion);
                break;
            case "otoño":
                System.out.println("estamos en " + estacion);
                break;
            case "invierno":
                System.out.println("estamos en " + estacion);
                break;
            default:
                break;

        }
    }

}
