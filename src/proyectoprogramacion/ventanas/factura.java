package proyectoprogramacion.ventanas;
public class factura {
    protected int id_factura;
    protected String fecha;
    protected String cliente;
    protected String identificacion;
    protected String telefono;
    protected String repuestos;
    protected String reparacion;
    protected String valorTotal;
    public factura(int id_factura, String fecha, String cliente, String identificacion, String telefono, String repuestos, String reparacion, String valorTotal) {
        this.id_factura = id_factura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.repuestos = repuestos;
        this.reparacion = reparacion;
        this.valorTotal = valorTotal;
    }
}
