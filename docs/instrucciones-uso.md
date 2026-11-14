# Instrucciones de uso

## 1. Inicio del programa

Al ejecutar el programa se muestra el menú principal, desde donde se puede acceder a la gestión de libros, socios y préstamos.

## 2. Gestión de libros

Desde este menú se pueden realizar las siguientes operaciones:

- **Registrar libro:** ingresar el código, título y autor.
- **Buscar libro:** permite seleccionar entre buscar por código o por título.
  - **Por código:** ingresar el código exacto del libro que se desea consultar.
  - **Por título:** ingresar el título completo o una parte del mismo. La búsqueda no distingue entre mayúsculas y minúsculas y puede devolver varios resultados.
- **Listar libros:** mostrar todos los libros registrados.
- **Eliminar libro:** ingresar el código del libro que se desea eliminar. No se permite eliminar un libro que se encuentre prestado.

### Formato de los códigos

Los códigos de los libros deben respetar el siguiente formato:

- **Títulos que comienzan con una letra:** se utiliza la inicial del título en mayúscula, seguida de cuatro dígitos. Ejemplo: `E0001`.
- **Títulos que comienzan con un número o símbolo:** se utiliza el prefijo `NN`, seguido de cuatro dígitos. Ejemplo: `NN0002`.
- La numeración es única y correlativa para todos los libros, independientemente del prefijo.
- No se permiten códigos duplicados.

Ejemplos:

| Título | Código |
|---|---|
| El principito | E0001 |
| Cien años de soledad | C0002 |
| 1984 | NN0003 |
| 2001: Odisea del espacio | NN0004 |

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
