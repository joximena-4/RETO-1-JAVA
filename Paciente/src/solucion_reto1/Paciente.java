package solucion_reto1;

public class Paciente {
    String nombre;
    int edad;
    String num_expediente;

// vamos a definir metodo publico, sera void, solo imprimimos

  public void mostrarInformacion(){
      System.out.println("Informacion del(la) paciente");
      System.out.println("Paciente: " + nombre);
      System.out.println("Edad: " + edad);
      System.out.println("Num expediente: " + num_expediente);
  }
}


