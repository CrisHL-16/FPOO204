import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
      Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor();
        vehiculo.asignarConductor(conductor);
        Envio envio = Envio.crearEnvio();
        Entrega entrega = new Entrega(envio.getCodigoEnvio());
        
        JOptionPane.showMessageDialog(null, "Vehículo asignado con placa: " + vehiculo.getplaca() + "\nConductor: " + conductor.getNombre() + "\nEnvío a: " + envio.getDestino() + "\nEstado de la entrega: " + entrega.getEstado());
    
    }
}
