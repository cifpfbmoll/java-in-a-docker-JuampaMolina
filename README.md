# Fast Break Truck

En este kata pondremos en práctica los patrones de diseño y los principios SOLID.

### Problema
El problema de este Kata es la creación de distintos tipos de desayuno, queremos evitar la creación de los mismos mediante infinidad de subclases o el uso de construcotres telescópicos. 

En lugar de crear todos los tipos de desayuno, haremos que el desayuno se conponga de distintos items, cada item puede representar un tipo de cereales, bebida o juguete.

### Builder Pattern
Este patrón se ajusta a nuestro problema a la perfección, ya que nos permite la creación de objetos complejos (desayuno) a partir de objetos más pequeños (items). 

Esto nos permite crear todos los tipos de desayuno deseados sin necesidad de cambiar el código existente, únicamente extendiéndolo.

**El enunciado del Kata:**

[https://github.com/dfleta/fastbreaktruck](https://github.com/dfleta/fastbreaktruck)