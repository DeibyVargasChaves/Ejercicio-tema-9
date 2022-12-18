
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 50;
        cliente.nombre = "Rodrigo";
        cliente.telefono = "555-444-333";
        cliente.credito = "$5000";

        System.out.println("Nombre:" + cliente.nombre);
        System.out.println("Edad:" + cliente.edad);
        System.out.println("Telefono:" + cliente.telefono);
        System.out.println("credito:" + cliente.credito);

        trabajador.edad = 28;
        trabajador.nombre = "Mario";
        trabajador.telefono = "111-222-888";
        trabajador.salario = "$10000";

        System.out.println("Nombre:" + trabajador.nombre);
        System.out.println("Edad:" + trabajador.edad);
        System.out.println("Telefono:" + trabajador.telefono);
        System.out.println("Salario:" + trabajador.salario);
}

public static class Persona {
    int edad;
    String nombre;
    String telefono;
    }


static class Cliente extends Persona{
    String credito;
}
static class Trabajador extends Persona{
        String salario;
}
}