import javax.swing.JOptionPane;
public class Entrega {
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito/Entregado):");
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido.");
        }
    }

    public String getNumeroGuia() { return numeroGuia; }
    public String getEstado() { return estado; }
    
}
