public class ClientePremium extends Cliente{
    public ClientePremium(String nombre, String dni){
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        double descuento = subtotal * 0.15;
        System.out.println("Cliente Premium: 15% de descuento aplicado");
        return subtotal - descuento;
    }
}
