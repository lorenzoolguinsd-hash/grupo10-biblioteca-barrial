# Instrucciones de uso

## 1. Inicio del programa

Al ejecutar el programa se muestra el menú principal, desde donde se puede acceder a la gestión de libros, socios y préstamos.

## 2. Gestión de libros

Desde este menú se pueden realizar las siguientes operaciones:

- **Registrar libro:** ingresar el código, título y autor.
- **Buscar libro:** ingresar el código del libro que se desea consultar.
- **Listar libros:** mostrar todos los libros registrados.
- **Eliminar libro:** ingresar el código del libro que se desea eliminar.

**Importante:** los códigos deben ingresarse respetando exactamente las mayúsculas y minúsculas. Por ejemplo, `L002` y `l002` se consideran códigos diferentes.

## 3. Gestión de socios

Permite:

- Registrar un socio ingresando su número y nombre.
- Buscar un socio por su número.
- Listar todos los socios registrados.

## 4. Gestión de préstamos

Permite realizar tres operaciones:

- **Registrar préstamo:** ingresar el número de socio y el código del libro.
- **Registrar devolución:** ingresar el número de socio y el código del libro que devuelve.
- **Consultar préstamos:** ingresar el número de socio para visualizar los libros que tiene prestados.

Para registrar un préstamo, el socio debe estar registrado y el libro debe existir y encontrarse disponible.

Cuando se registra un préstamo correctamente, el libro pasa a figurar como no disponible. Al registrar su devolución, vuelve a estar disponible.

## 5. Consideraciones generales

- Las opciones de los menús deben ingresarse mediante números.
- Los códigos de los libros deben respetarse exactamente, incluyendo mayúsculas y minúsculas.
- No se pueden registrar dos libros con el mismo código ni dos socios con el mismo número.
- La información se almacena temporalmente en memoria. Al cerrar o reiniciar el programa, los registros realizados durante esa ejecución se pierden.
- La opción `0` permite regresar al menú anterior o salir del sistema, según corresponda.
