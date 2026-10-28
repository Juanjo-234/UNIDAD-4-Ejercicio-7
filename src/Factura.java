public class Factura {
    private String numeroFactura;
    private Cliente cliente;
    private double subtotal;

    public Factura(String numeroFactura, Cliente cliente, double subtotal) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public void procesadorFactura(){
        System.out.println("==================================================");
        System.out.println("NUMERO DE FACTURA: " + this.numeroFactura);
        System.out.println("TITULAR: " + cliente.getNombre() + "| CUIL/DNI : " + cliente.getDni());
        System.out.println("SUBTOTAL: " + subtotal);

        double totalFinal = cliente.aplicarDescuento(subtotal);
        System.out.printf(" TOTAL A PAGAR: $%,10.2f%n", totalFinal);
        System.out.println("==================================================\n");
    }
}
