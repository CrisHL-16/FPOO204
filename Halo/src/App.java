public class App {
    public static void main(String[] args) {
       
    Spartan jefeMaestro = new Spartan();
    Spartan reach = new Spartan();

    // asignamos los atributos del objeto
    jefeMaestro.nombre = "Elver Galarga ";
    jefeMaestro.salud = 100;
    jefeMaestro.escudo = 88;
    jefeMaestro.armaPrincipal = "cuete";

    reach.nombre = "Miver Gatieza";
    reach.salud = 100;
    reach.escudo = 76;
    reach.armaPrincipal = "picahielo";

    // asignamos sus metodos
    jefeMaestro.mostrarInfo();
    jefeMaestro.atacar(" Miver Gatieza");
    jefeMaestro.recargarArma(69);
    jefeMaestro.correr(true);

    reach.mostrarInfo();
    reach.atacar(" Elver Galarga");
    reach.recargarArma(70);
    reach.correr(true);

    }
} //llave de la clase
