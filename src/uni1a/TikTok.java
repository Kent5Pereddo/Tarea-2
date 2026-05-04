package uni1a;

public class TikTok {


	public class TikTok extends ContenidoAudiovisual {
	    private String usuario;
	    private String musica;

	    public TikTok(String titulo, int duracionEnMinutos, String genero, String usuario, String musica) {
	        super(titulo, duracionEnMinutos, genero); 
	        this.usuario = usuario;
	        this.musica = musica;
	    }

	    @Override
	    public void mostrarDetalles() {
	        System.out.println("Detalles de TikTok:");
	        System.out.println("ID: " + getId());
	        System.out.println("Título: " + getTitulo());
	        System.out.println("Usuario: @" + usuario);
	        System.out.println("Música: " + musica);
	        System.out.println();
	    }
	}
}
