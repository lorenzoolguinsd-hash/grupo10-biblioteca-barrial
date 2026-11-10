# Requerimientos del sistema

## 1. Objetivo

Desarrollar un sistema de gestión para una biblioteca barrial que permita administrar libros, socios y préstamos mediante un programa escrito en Java.


## 2. Requerimientos funcionales

El sistema deberá permitir:

**Gestión de libros**
- RF01: Registrar nuevos libros.
- RF02: Eliminar libros del catálogo.
- RF03: Buscar libros por título o código identificador.
- RF04: Mostrar todos los libros registrados.

**Gestión de socios**
- RF05: Registrar nuevos socios.
- RF06: Buscar y consultar socios registrados.

**Gestión de préstamos**
- RF07: Registrar el préstamo de un libro a un socio.
- RF08: Registrar la devolución de un libro.
- RF09: Consultar los libros que tiene prestados cada socio.

## 3. Reglas del sistema

- Un libro que ya está prestado no puede volver a prestarse.
- Solo los socios registrados pueden solicitar préstamos.
- No se puede devolver un libro que no figure como prestado.
- Cada libro debe contar con un código identificador único.

## 4. Estructuras de datos

Se utilizarán listas de Java (`List` y `ArrayList`) para almacenar y administrar los libros y los socios.

Además, cada socio contará con una lista de libros prestados, implementando una estructura de colección de colecciones.

## 5. Alcance inicial

El sistema funcionará mediante una interfaz de consola y permitirá realizar las operaciones principales de administración de una biblioteca barrial.

No se contempla inicialmente el uso de bases de datos ni de interfaces gráficas.
