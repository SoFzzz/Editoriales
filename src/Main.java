import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion = readOption(sc);
            sc.nextLine();
            System.out.println("Escriba el titulo: (La Dahlia Negra)");
            String titulo = sc.nextLine();
            double precio = readDouble(sc, "Ponga un precio:");
            Publicacion publicacion = crearPublicacion(sc, opcion, titulo, precio);
            System.out.println(publicacion);
        }
    }

    private static int readOption(Scanner sc) {
        System.out.println("Publicar: (1. Libro, 2. Disco, 3. Video)");
        while (true) {
            int opcion = readInt(sc, "Elija una de las siguientes opciones: (1, 2 o 3):");
            if (opcion >= 1 && opcion <= 3) {
                return opcion;
            }
            System.out.println("Elija una opcion valida.");
        }
    }

    private static Publicacion crearPublicacion(Scanner sc, int opcion, String titulo, double precio) {
        switch (opcion) {
            case 1:
                int numeroPaginas = readInt(sc, "Numero de paginas:");
                int aniPublicacion = readInt(sc, "Fecha de publicacion:");
                return new Libro(titulo, precio, numeroPaginas, aniPublicacion);
            case 2:
                int duracionMinutos = readInt(sc, "Duracion en minutos:");
                return new Disco(titulo, precio, duracionMinutos);
            default:
                float duracionHoras = (float) readDouble(sc, "Duracion en horas:");
                LENGUAJES idioma = readIdiomaVideo(sc);
                return new Video(titulo, precio, idioma, duracionHoras);
        }
    }

    private static LENGUAJES readIdiomaVideo(Scanner sc) {
        while (true) {
            int optionIdioma = readInt(sc, "Elija un lenguaje: (1. ESPANIOL, 2. INGLES, 3. PORTUGUES):");
            switch (optionIdioma) {
                case 1:
                    return LENGUAJES.ESPANIOL;
                case 2:
                    return LENGUAJES.INGLES;
                case 3:
                    return LENGUAJES.PORTUGUES;
                default:
                    System.out.println("Opcion Invalida, intente de nuevo.");
            }
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Numero invalido, Intente de nuevo:");
            sc.next();
        }
        int value = sc.nextInt();
        while (value < 0) {
            System.out.println("El valor no puede ser negativo, intente de nuevo:");
            while (!sc.hasNextInt()) {
                System.out.println("Valor invalido, intente de nuevo:");
                sc.next();
            }
            value = sc.nextInt();
        }
        return value;
    }

    private static double readDouble(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Numero invalido, intente de nuevo:");
            sc.next();
        }
        double value = sc.nextDouble();
        while (value < 0) {
            System.out.println("Este valor no puede ser negativo, intente de nuevo:");
            while (!sc.hasNextDouble()) {
                System.out.println("Valor invalido, intente de nuevo:");
                sc.next();
            }
            value = sc.nextDouble();
        }
        return value;
    }
}
