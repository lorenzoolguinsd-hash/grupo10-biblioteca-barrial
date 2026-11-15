# Instrucciones de uso

## 1. Inicio del programa

Al ejecutar el programa se muestra el menú principal, desde donde se puede acceder a la gestión de libros, socios y préstamos.

## 2. Gestión de libros

Desde este menú se pueden realizar las siguientes operaciones:

- **Registrar libro:** ingresar el título, el autor y la cantidad de ejemplares que se desean registrar. El sistema genera automáticamente un código único para cada ejemplar.
- **Buscar libro:** permite seleccionar entre buscar por código o por título.
  - **Por código:** ingresar el código exacto del ejemplar que se desea consultar. Se muestra su información individual y disponibilidad.
  - **Por título:** ingresar el título completo o una parte del mismo. La búsqueda no distingue entre mayúsculas y minúsculas. Los resultados se muestran agrupados por título y autor, indicando la cantidad total de ejemplares, disponibles y prestados.
- **Listar libros:** muestra el catálogo agrupado por título y autor, indicando la cantidad total de ejemplares, disponibles y prestados.
- **Eliminar libro:** ingresar el código del ejemplar que se desea eliminar. No se permite eliminar un ejemplar que se encuentre prestado.

### Formato de los códigos

Los códigos de los ejemplares se generan automáticamente siguiendo estas reglas:

- **Títulos que comienzan con una letra:** se utiliza la inicial del título en mayúscula, seguida de cuatro dígitos.
- **Títulos que comienzan con una letra acentuada:** se utiliza la letra base sin acento. Por ejemplo, Á se convierte en A.
- **Títulos que comienzan con Ñ:** se utiliza la letra N.
- **Títulos que comienzan con un número o símbolo:** se utiliza el prefijo `NN`, seguido de cuatro dígitos.
- Cada prefijo tiene su propia numeración correlativa e independiente.
- No se permiten códigos duplicados.
- Cada ejemplar tiene un código propio, aunque comparta título y autor con otros ejemplares.

Ejemplos:

| Título | Código |
|---|---|
| El principito | E0001 |
| El principito | E0002 |
| Cien años de soledad | C0001 |
| 1984 | NN0001 |
| 2001: Odisea del espacio | NN0002 |

La numeración se mantiene durante la ejecución del programa. Al reiniciarlo, los contadores vuelven a comenzar porque la información se almacena en memoria.

## 3. Gestión de socios

Permite:

- Registrar un socio ingresando su número y nombre.
- Buscar un socio por su número.
- Listar todos los socios registrados.

Los números de socio deben ser enteros positivos y no pueden repetirse.

## 4. Gestión de préstamos

Permite realizar tres operaciones:

- **Registrar préstamo:** ingresar el número de socio y el código del libro.
- **Registrar devolución:** ingresar el número de socio y el código del libro que devuelve.
- **Consultar préstamos:** ingresar el número de socio para visualizar los libros que tiene prestados.

Para registrar un préstamo, el socio debe estar registrado y el libro debe existir y encontrarse disponible.

Cuando se registra un préstamo correctamente, el libro pasa a figurar como no disponible. Al registrar su devolución, vuelve a estar disponible.

## 5. Validaciones de entrada

El sistema incorpora validaciones para evitar ingresos incorrectos:

- Las opciones de los menús deben ingresarse mediante números enteros.
- Si se ingresan letras u otros caracteres en un campo numérico, el sistema informa el error y solicita nuevamente el dato.
- Los números de socio deben ser mayores que cero.
- Los campos de texto, como código, título, autor y nombre del socio, no pueden quedar vacíos.
- Los espacios en blanco al principio y al final de los textos se eliminan automáticamente.

## 6. Consideraciones generales

- Los códigos de los libros deben respetarse exactamente, incluyendo mayúsculas y minúsculas.
- No se pueden registrar dos libros con el mismo código ni dos socios con el mismo número.
- No se puede prestar un libro que ya se encuentre prestado.
- No se puede devolver un libro que no figure entre los préstamos del socio indicado.
- La información se almacena temporalmente en memoria. Al cerrar o reiniciar el programa, los registros realizados durante esa ejecución se pierden.
- La opción `0` permite regresar al menú anterior o salir del sistema, según corresponda.
