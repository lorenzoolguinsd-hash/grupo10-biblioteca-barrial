# Diseño inicial del sistema

## 1. Introducción

El sistema de gestión de la biblioteca barrial se desarrollará utilizando Java y programación orientada a objetos.

Se propone organizar el programa mediante clases que representen los elementos principales de una biblioteca: libros, socios y préstamos.

Este diseño es inicial y podrá modificarse durante la etapa de desarrollo.

## 2. Clases principales

### Clase Libro

Representa cada libro registrado en la biblioteca.

Atributos propuestos:
- codigo: identificador del libro.
- titulo: título del libro.
- autor: autor del libro.
- disponible: indica si el libro puede prestarse.

### Clase Socio

Representa a una persona registrada en la biblioteca.

Atributos propuestos:
- numeroSocio: identificador del socio.
- nombre: nombre del socio.
- librosPrestados: lista de libros que tiene actualmente en préstamo.

### Clase Biblioteca

Se encarga de administrar los libros y los socios.

Responsabilidades:
- Registrar y eliminar libros.
- Buscar y listar libros.
- Registrar y buscar socios.
- Gestionar préstamos y devoluciones.

Atributos propuestos:
- libros: lista de libros registrados.
- socios: lista de socios registrados.

## 3. Estructuras de datos

Se utilizará `List` y `ArrayList` para almacenar los libros y socios.

Además, cada socio tendrá una lista de libros prestados. De esta manera, se trabajará con listas que contienen otras listas, cumpliendo con el requisito de colección de colecciones.

## 4. Relaciones entre las clases

- Una biblioteca administra varios libros.
- Una biblioteca registra varios socios.
- Un socio puede tener varios libros prestados.
- Un libro solo podrá estar prestado a un socio a la vez.

## 5. Funcionamiento general

El usuario interactuará con el sistema mediante un menú de consola.

Desde ese menú podrá seleccionar las operaciones disponibles para administrar libros, socios y préstamos.

## 6. Consideraciones

Este diseño representa una propuesta inicial. Los atributos, métodos y relaciones definitivos se establecerán durante el desarrollo del proyecto.
