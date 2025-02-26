import javax.swing.JOptionPane;
public class Conductor {
    private String nombre;
    private String identificacion;
    private String licencia;

    public Conductor() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del chofi:");
        this.identificacion = JOptionPane.showInputDialog("Ingrese la identificacion del chofi: ");
        this.licencia = JOptionPane.showInputDialog("Ingrese la licencia del chofi: ");
    }

    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getLicencia() { return licencia; }
}