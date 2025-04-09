package solucion_reto1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //creación objetos
     Scanner input = new Scanner(System.in);
     //creación objeto paciente
        Paciente p1 = new Paciente();

     System.out.println("Ingrese el primer numero: ");
     //mando a traer la string
      p1.nombre = input.nextLine();

      System.out.println("Ingrese la edad: ");
      //para traer un entero
      p1.edad = input.nextInt();
      //limpiar el buffer
        input.nextLine();


      System.out.println("Ingrese el número del expediente: ");
      p1.num_expediente = input.nextLine();

      input.close();

      p1.mostrarInformacion();
    }
}
