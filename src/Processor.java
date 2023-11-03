/*
Esta clase esta añadida a GIT
 /*

 */

public class Processor {

    // Estados, atributos, propiedades
    private String marca;
    private String modelo;
    private Double precio;

    // Comportamiento o método (funciones)
    // public + método accesible desde cualquier otra clase
    // String: tipo devuelto por el método
    public String getNombreCompleto() {
        // Concatenar cadenas con +

        return marca + " " + modelo + " " + precio;

    }

    public String getMarca() {
        return marca;

    }

    public String getModelo() {
        return modelo;

    }

    public Double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;

    }



