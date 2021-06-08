public class MainFactory {


    private static Celular montarCelular(String tipo){
        CelularFactory cf = null;

        switch (tipo){
            case"seguro":
                cf= new CelularSegFactory();
                break;
            case "comum":
                cf = new CelularComumFactory();
        }
        Celular celular = new Celular();
        celular.setPelicula(cf.aplicarPelicula());
        celular.setCapinha(cf.aplicarCapinha());
        return celular;
    }

    public static void main(String[] args) {
        Celular celular1 = montarCelular("seguro");
        Celular celular2 = montarCelular("comum");
    }

}
