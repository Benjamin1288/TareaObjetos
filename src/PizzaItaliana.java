import java.util.List;

public class PizzaItaliana extends Pizza{
    private String salsa;
    private int tiempo;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes,String salsa,int tiempo) {
        super(nombre, precio, ingredientes);
        this.salsa=salsa;
        this.tiempo=tiempo;
    }
    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando la salsa " + salsa + " a la pizza " + getPizza());
        System.out.println("Horneando la pizza durante " + tiempo + " minutos.");
    }
    @Override
    public String toString() {
        return super.toString() + ", Salsa: " + salsa + ", Tiempo en horno: " + tiempo + " minutos";
    }
}
