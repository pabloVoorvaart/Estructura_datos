import java.util.Scanner;

public class Menu {
    private Scanner reader = new Scanner(System.in);  // Reading from System.in

    public void showMenu(){
        System.out.println("Opciones:");
        System.out.println("1) Mostrar grupo.");
        System.out.println("2) Añadir alumno.");
        System.out.println("3) Mostrar media de la clase");
        System.out.println("4) Mostrar maxima calificacion");
        System.out.println("5) Salir.");
    }
    public boolean menuSub(GrupoAlumnos _grupo, int optionSub){
        switch(optionSub) {
            case 1:
                //Mostar Alumno
                _grupo.mostrarGrupo();
                return false;

            case 2:
                //Añadir alumno
                System.out.println("Introduzca los datos del alumno:");

                System.out.print("\tApellidos: ");
                String Apellidos = reader.nextLine();
                System.out.print("\n");

                System.out.print("\tNombre: ");
                String Nombre = reader.next();
                System.out.print("\n");

                System.out.print("\tMatricula: ");
                String Matricula = reader.next();
                System.out.print("\n");

                System.out.print("\tCalificacion: ");
                String Calificacion = reader.next();
                System.out.print("\n");

                Alumno x = new Alumno(Apellidos, Nombre, Matricula, Double.parseDouble(Calificacion));
                _grupo.insertarAlumno(x);

                return false;

            case 3:
                _grupo.mediaCalif();
                return false;

            case 4:
                _grupo.maxCalif();
                return false;

            case 5:
                System.out.println("Exiting....");
                return true;

            default:
                System.out.println("Exiting....");
                return true;
        }
    }
}