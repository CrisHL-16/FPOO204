import javax.swing.JOptionPane;
public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }
    
    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del envio: ");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envio: ");
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar el peso del paquete?", "Peso", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paquete"));
            return new Envio(codigo,destino,peso);
        } else {
            return new Envio(codigo, destino);
        }
    }

    public String getCodigoEnvio() { return codigoEnvio; }
    public String getDestino() { return destino; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}