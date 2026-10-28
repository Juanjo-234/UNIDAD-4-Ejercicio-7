//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cliente c1 = new ClienteRegular("Juan Pérez", "35111222");
    Cliente c2 = new ClientePremium("María Gómez", "28333444");
    Cliente c3 = new ClienteCorporativo("Tech Solutions S.A.", "30-71112223-9");

    List<Factura> historialFacturas = new ArrayList<>();

    historialFacturas.add(new Factura("F001-0001", c1, 15000.0));
    historialFacturas.add(new Factura("F001-0002", c2, 45000.0));
    historialFacturas.add(new Factura("F001-0003", c3, 120000.0));
    historialFacturas.add(new Factura("F001-0004", c2, 8500.0));

    System.out.println("=== PROCESAMIENTO DE FACTURACIÓN Y DESCUENTOS ===");

    for (Factura factura : historialFacturas) {
        factura.procesadorFactura();
    }
}
