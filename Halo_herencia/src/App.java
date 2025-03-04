public class App {

    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("Jhon", 100, "Rifle de asalto", 0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Denis");
        jefeMaestro.recibirDaño(50);
        jefeMaestro.recargarEscudo();
        

    }
    }