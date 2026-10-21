-¿Qué responsabilidad añade `SuscripcionDecorator` al catálogo que envuelve?

Verifica los accesos y solo muestra lo que contiene sie l usuario tiene una suscripcion activa

- ¿Por qué `CatalogoDecorator` guarda una referencia de tipo `CatalogoPeliculas` y no de una clase concreta?

Para poder envolver cualquier otro catálogo

- ¿Qué ventaja tiene comprobar la suscripción al consultar el catálogo, en vez de generar una clase para cada combinación de suscripciones?

Nos ahorra tiempo en crear nuevas clases para cada combinacion posible

- ¿Qué cambiarías si un usuario pudiera acceder a varios catálogos con una única suscripción de paquete?

Crear una clase para verificar que el usuario tiene acceso a estos catálogos