public class Main {
    public static void main(String[] args) {
        // Crear instancia de GestorEmpleados
        GestorEmpleados gestor = new GestorEmpleados();

        // Crear empleados
        Empleado empleado1 = new Empleado(1, "Juan", "Pérez", "Ventas", 30000);
        Empleado empleado2 = new Empleado(2, "Ana", "Gómez", "Recursos Humanos", 35000);

        // Agregar empleados al gestor
        gestor.agregarEmpleado(empleado1);
        gestor.agregarEmpleado(empleado2);

        // Mostrar todos los empleados
        gestor.mostrarEmpleados();
    }
}