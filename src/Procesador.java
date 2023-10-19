/*
Esta clase esta añadida a GIT
 /*

 */

public class Procesador {

            // Estados, atributos, propiedades
            public String marca;
            public String modelo;
            public Double precio;

            // Comportamiento o método (funciones)
            // public + método accesible desde cualquier otra clase
            // String: tipo devuelto por el método
            public String getNombreCompleto(){
                // Concatenar cadenas con +

                return marca + " "  + modelo + " " + precio;

            }
            public String getMarca(){
                return marca;

            }
            public String getModelo(){
                return modelo;

            }
            public Double getPrecio(){
                return precio;
            }
}


