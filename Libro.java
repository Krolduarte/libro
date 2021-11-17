
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean indicarSiEsLibroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = indicarSiEsLibroDeTexto;

    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void imprimeAutor(){
        System.out.println(autor);
    }

    public void imprimeTitulo(){
        System.out.println(titulo);
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroReferencia( String numeroDeReferencia){
        if(numeroReferencia.length() >= 3 ){
            numeroReferencia = numeroDeReferencia;
        }
        else{
            System.out.println("Numero de referencia debe tener minimo 3 caracteres");
        }

    }

    public void imprimirDetalles(){
       String esLibro;
        if(esLibroDeTexto== true){
            esLibro = "si";
        }
        else{
            esLibro = "no";
        }
        
        if (numeroReferencia !=""){
            String detalles = "Titulo: " + titulo + "," + "Autor: " + autor + ", " + "Paginas: " + numeroPaginas + "," + "Numero de referencia: " + numeroReferencia + "Veces prestado: " + vecesPrestado + "Es libro de texto: " + esLibro + ".";
            System.out.println(detalles);
        }
        else{
            String detalles = "Titulo: " + titulo + "," + "Autor: " + autor + ", " + "Paginas: " + numeroPaginas + "," + "Numero de referencia: ZZZ "+ "Veces prestado: " + vecesPrestado + "Es libro de texto: " + esLibro + ".";
            System.out.println(detalles);
        }

    }

    public String getDetalles(){
        String esLibro;
        if(esLibroDeTexto== true){
            esLibro = "si";
        }
        else{
            esLibro = "no";
        }
        if (numeroReferencia != ""){
            String detalles = "Titulo: " + titulo + "," + "Autor: " + autor + ", " + "Paginas: " + numeroPaginas + "," + "Numero de referencia: " + numeroReferencia + "Veces prestado: " + vecesPrestado  + "Es libro de texto: " + esLibro + ".";
            return(detalles);
        }
        else{
            String detalles = "Titulo: " + titulo + "," + "Autor: " + autor + ", " + "Paginas: " + numeroPaginas + ","+ "Numero de referencia: ZZZ " + "Veces prestado: " + vecesPrestado  + "Es libro de texto: " + esLibro + ".";
            return(detalles);
        }
    }

    public String getNumeroReferencia(){
        return numeroReferencia;        
    }

    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }

    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public boolean getEsLibroTexto(){
        return esLibroDeTexto; 
    }
}