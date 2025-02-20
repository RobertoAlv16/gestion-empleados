import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    // Lista para almacenar empleados
    private List<Empleado> empleados;

    // Constructor
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.mostrarInformacion());
        }
    }
}