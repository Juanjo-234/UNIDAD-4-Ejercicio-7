public class ClienteRegular extends Cliente{
    public ClienteRegular(String nombre, String dni){
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        System.out.println("Cliente regular no tiene descuento aplicado");
        return subtotal;
    }
}
