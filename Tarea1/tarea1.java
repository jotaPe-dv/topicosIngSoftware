import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        try (FileWriter writer = new FileWriter("nombre.txt")) {
            writer.write(nombre);
            System.out.println("Nombre guardado en nombre.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar el nombre: " + e.getMessage());
        }
    }
} 