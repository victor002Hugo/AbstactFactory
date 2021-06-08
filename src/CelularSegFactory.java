public class CelularSegFactory extends CelularFactory{



    public Pelicula aplicarPelicula() {
        return new Pelicula3D();
    }


    public Capinha aplicarCapinha() {
        return new CapinhaAntiImpacto();
    }

}
