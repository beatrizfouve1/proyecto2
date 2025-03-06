# Mi Proyecto Java

## Descripción
Este proyecto es un ejemplo de una aplicación Java utilizando Maven.

## Instalación y Compilación
1. Clona el repositorio.
2. Navega a la carpeta del proyecto.
3. Ejecuta `mvn clean install` para compilar el proyecto.

## Ejecución de Pruebas
Ejecuta `mvn test` para ejecutar las pruebas unitarias.

## Funcionalidades Implementadas
- Cálculo del área de un triángulo.
- Pruebas unitarias con JUnit 5.
- Mocking con Mockito.

## Aplicación de TDD (Opcional)
## Aplicación de TDD

### Secuencia TDD Aplicada
1. **Escribir la Prueba (Rojo)**: Comenzamos escribiendo una prueba unitaria para el método `calcularPerimetro` en la clase `Triangulo`. Esta prueba inicialmente falló porque el método `calcularPerimetro` no estaba implementado.

2. **Implementar el Código Mínimo para que Pase (Verde)**: Implementamos el método `calcularPerimetro` con el código mínimo necesario para que la prueba pase. En este caso, simplemente sumamos la base y la altura dos veces.

3. **Refactorizar manteniendo Verdes los Tests**: Mejoramos el método `calcularPerimetro` para que sea más claro y mantenemos todas las pruebas en verde. En este paso, cambiamos la fórmula a `2 * (base + altura)`.

### Experiencia con TDD
- **Dificultades**: Al principio, puede ser complicado pensar en escribir las pruebas antes que el código, especialmente cuando se está acostumbrado a desarrollar de forma tradicional. También puede ser un desafío identificar todas las posibles pruebas necesarias para cubrir completamente la funcionalidad.
- **Ventajas**: Aplicar TDD asegura que el código esté siempre probado y funcionando correctamente a medida que se desarrolla. Ayuda a identificar errores desde el principio y promueve un diseño de código más limpio y modular.



## Enlace al Repositorio
[Enlace al repositorio](https://github.com/beatrizfouve1/proyecto2)
