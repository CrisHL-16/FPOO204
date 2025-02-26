import javax.swing.JOptionPane;
public class Vehiculo {
    private String placa;
    private String modelo;
    private int capacidad;
    private Conductor Conductor;

    public Vehiculo() {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del grosero: ");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del grosero");
        this.capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad para el groserote"));
    }

    public String getplaca() { return placa; }
    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }
    public Conductor getConductor() { return Conductor; }

    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public void asignarConductor(Conductor conductor) {
        if (this.Conductor == null) {
            this.Conductor = conductor;
        } else {
            JOptionPane.showMessageDialog(null, "Ese grosero ya tiene un chofi asignado");
        }
    }
}
