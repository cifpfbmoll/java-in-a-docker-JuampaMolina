# Java Multi-Stage Docker Build

Puedes encontrar la imagen publicada en 
[DockerHub](https://hub.docker.com/repository/docker/juampamolina/javadocker)

## Ejecutar la aplicacion
El contenedor es eliminado tan pronto la aplicación termina de ejecutarse.

```
docker run --rm juampamolina/javadocker
```

### Salida en pantalla
```
No abras la caja de Eyeholes!
Item: Eyeholes, Empaquetado: Caja, Precio: 25.0
Item: Turbulent Juice, Empaquetado: Tubo, Precio: 30.0
Precio pedido: 55.0

Smiggles per als nins!
Item: Smiggles, Empaquetado: Caja, Precio: 50.0
Item: Fleeb Juice, Empaquetado: Tubo, Precio: 35.0
Precio pedido: 85.0

Eyeholes con plumbus!
Item: Eyeholes, Empaquetado: Caja, Precio: 25.0
Item: Turbulent Juice, Empaquetado: Tubo, Precio: 30.0
Item: Plumbus, Empaquetado: Caja, Precio: 100.0
Precio pedido: 155.0
```