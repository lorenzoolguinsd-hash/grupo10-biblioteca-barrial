# Requerimientos del sistema

## 1. Objetivo

Desarrollar un sistema de gestión para una biblioteca barrial que permita administrar libros, socios y préstamos mediante un programa escrito en Java.

## 2. Requerimientos funcionales

El sistema deberá permitir:

**Gestión de libros**
- RF01: Registrar libros indicando la cantidad de ejemplares. Cada ejemplar tendrá un código identificador único generado automáticamente.
- RF02: Eliminar ejemplares del catálogo mediante su código identificador, siempre que estén disponibles.
- RF03: Buscar libros por título o código identificador. La búsqueda por título mostrará los resultados agrupados por título y autor, mientras que la búsqueda por código identificará un ejemplar específico.
- RF04: Mostrar el catálogo de libros agrupado por título y autor, indicando la cantidad total de ejemplares, disponibles y prestados.

**Gestión de socios**
- RF05: Registrar nuevos socios.
- RF06: Buscar y consultar socios registrados.

**Gestión de préstamos**
- RF07: Registrar el préstamo de un libro a un socio.
- RF08: Registrar la devolución de un libro.
- RF09: Consultar los libros que tiene prestados cada socio.

## 3. Reglas del sistema

- Un ejemplar que ya está prestado no puede volver a prestarse.
- Solo los socios registrados pueden solicitar préstamos.
- No se puede devolver un ejemplar que no figure como prestado por el socio.
- Cada ejemplar debe contar con un código identificador único.
- Los códigos de los ejemplares se generan automáticamente a partir de la primera letra del título.
- Cada ejemplar físico se administra individualmente, aunque se muestre agrupado junto con otros ejemplares del mismo libro.

## 4. Estructuras de datos

Se utilizarán listas de Java (`List` y `ArrayList`) para almacenar y administrar los libros y los socios.

Además, cada socio contará con una lista de libros prestados, implementando una estructura de colección de colecciones.

## 5. Alcance inicial

El sistema funcionará mediante una interfaz de consola y permitirá realizar las operaciones principales de administración de una biblioteca barrial.

No se contempla inicialmente el uso de bases de datos ni de interfaces gráficas.
