package uni1a;

public class Facebook {


	public class Facebook extends ContenidoAudioVisual {
	    private String pagina;
	    private int vecesCompartido;

	    public FacebookVideo(String titulo, int duracionEnMinutos, String genero, String pagina, int vecesCompartido) {
	        super(titulo, duracionEnMinutos, genero);
	        this.pagina = pagina;
	        this.vecesCompartido = vecesCompartido;
	    }

	    @Override
	    public void mostrarDetalles() {
	        System.out.println("Detalles del Video de Facebook:");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Página: " + pagina);
	        System.out.println("Compartido: " + vecesCompartido + " veces");
	        System.out.println("Género: " + getGenero());
	        System.out.println();
	    }
	    
	    }

	}
	
