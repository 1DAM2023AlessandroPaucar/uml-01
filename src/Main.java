import javax.swing.event.InternalFrameListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard();
        motherboard.setId(1);
        motherboard.setModel("Model-01");
        motherboard.setManufacturer("ASUS");

        Processor processor = new Processor();
        processor.setMarca("Intel");
        processor.setModelo("I7");
        processor.setPrecio(299.99);

        System.out.println(processor.getMarca());
        System.out.println(processor.getModelo());
        System.out.println(processor.getPrecio());

        System.out.println(motherboard.getId());
        System.out.println(motherboard.getModel());
        System.out.println(motherboard.getManufacturer());
    }
}

