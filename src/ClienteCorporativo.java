public class ClienteCorporativo extends Cliente{
    public ClienteCorporativo(String nombre, String dni){
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        double descuento = subtotal * 0.25;
        System.out.println("Cliente Corporativo: 25% de descuento aplicado");
        return subtotal - descuento;
    }
}
