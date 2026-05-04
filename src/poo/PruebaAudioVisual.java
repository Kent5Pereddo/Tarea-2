package poo;
import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {
        System.out.println("---- Listado de Contenidos ----");

        // Creamos el arreglo con capacidad para 5 elementos
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // Llenamos los 5 espacios para evitar el error NullPointerException
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Agregamos tus nuevas clases (Etapa 5 de tu tarea)
        contenidos[3] = new TikTok("Baile", 9, "Musical", "Jose_perez", "Cumbia");
        contenidos[4] = new Facebook("Receta", 11, "Cocina", "Cocinero", 4200);

        // Recorremos el arreglo y mostramos los detalles de cada uno
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
