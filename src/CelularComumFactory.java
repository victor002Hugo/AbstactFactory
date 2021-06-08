public class CelularComumFactory  extends CelularFactory{




    public Pelicula aplicarPelicula() {
        return new PeliculaSimples();
    }


    public Capinha aplicarCapinha() {
        return new CapinhaSimples();
    }

}
