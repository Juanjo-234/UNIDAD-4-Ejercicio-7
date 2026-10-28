Resolucion del ejercicio N°7 de la unidad 4 de programación 2.
Clase Abstracta (Cliente):

Funciona como el modelo base que define los atributos de identidad compartidos por todos los compradores, tales como nombre y dni.

Declara el método abstracto double aplicarDescuento(double subtotal), obligando a cada subclase a definir su propia regla y porcentaje de rebaja.

Clases Concretas (Subclases):

ClienteRegular: Aplica un porcentaje de descuento base (o nulo) correspondiente a clientes estándar.

ClientePremium: Implementa una alícuota de rebaja más atractiva por fidelización o membresía.

ClienteCorporativo: Aplica un descuento diferencial corporativo mayor debido a volumen o acuerdos comerciales.

Clase Coordinadora (Factura):

Actúa como el procesador de la compra. Recibe una referencia genérica de tipo Cliente y calcula el monto total a pagar invocando de forma polimórfica el método aplicarDescuento().

Diseño limpio: No requiere uso de condicionales ni operadores de tipo (instanceof) para saber qué clase está procesando.

Clase Principal (Main):

Instancia diferentes perfiles de clientes, simula compras con distintos subtotales y muestra el desglose del monto final por consola.
<img width="530" height="628" alt="Captura de pantalla 2026-10-28 102425" src="https://github.com/user-attachments/assets/8c85c58c-ed92-46d3-9dd3-66debb0e91af" />
