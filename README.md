# Biblioteca barrial – Catálogo de libros y préstamos

## 1. Información del proyecto

- **Grupo:** 10
- **Materia:** Algoritmos y Estructuras de Datos 2 (AED2)
- **Tema:** Clase 6 – Colecciones y Listas
- **Lenguaje:** Java
- **Entorno de desarrollo:** Eclipse IDE
- **Integrantes:**
  - Lorenzo Olguin
  - Ramiro Peralta
  - Francisco Olivera
  - Nestor Oviedo

## 2. Descripción del emprendimiento

El proyecto consiste en el desarrollo de un sistema de gestión para una biblioteca barrial. La propuesta busca facilitar la administración de los libros, el registro de socios y el control de los préstamos y las devoluciones.

## 3. Problema identificado

Las bibliotecas barriales pueden tener dificultades para llevar un registro ordenado de sus libros, socios y préstamos cuando utilizan anotaciones manuales o registros dispersos.

Esto puede provocar pérdidas de información, confusiones sobre qué ejemplares están disponibles y dificultades para identificar quién tiene cada libro prestado.

## 4. Solución propuesta y justificación

Se propone desarrollar un programa en Java que permita administrar un catálogo de libros, registrar socios y controlar los préstamos y las devoluciones mediante una interfaz de consola.

Se eligió esta propuesta porque permite aplicar los contenidos de la Clase 6, Colecciones y Listas, utilizando estructuras como `List` y `ArrayList`.

Además, se implementa una colección de colecciones mediante la lista de libros prestados que mantiene cada socio, permitiendo relacionar los préstamos con sus respectivos titulares.

## 5. Tecnologías y herramientas utilizadas

- **Java:** lenguaje utilizado para desarrollar el sistema.
- **Eclipse IDE:** entorno de desarrollo.
- **Git:** control de versiones.
- **GitHub:** alojamiento del repositorio y documentación del proyecto.
- **Trello:** organización y seguimiento de las tareas mediante un tablero Kanban.

## 6. Funcionalidades principales

### Gestión de libros

- Registrar libros indicando título, autor y cantidad de ejemplares.
- Generar automáticamente un código único para cada ejemplar.
- Buscar libros por título o código identificador.
- Mostrar el catálogo agrupado por título y autor.
- Consultar la cantidad total de ejemplares, disponibles y prestados.
- Eliminar ejemplares disponibles mediante su código.

### Gestión de socios

- Registrar nuevos socios.
- Buscar socios por su número identificador.
- Listar los socios registrados.

### Gestión de préstamos

- Registrar préstamos de libros a socios.
- Registrar devoluciones.
- Consultar los libros que tiene prestados cada socio.
- Controlar la disponibilidad de cada ejemplar.

### Validaciones

- Evitar campos de texto vacíos.
- Validar los ingresos numéricos.
- Evitar números de socio negativos o repetidos.
- Impedir que un libro prestado vuelva a prestarse.
- Impedir la eliminación de ejemplares prestados.
- Validar las opciones ingresadas en los menús.

## 7. Estructuras de datos utilizadas

El sistema utiliza las siguientes estructuras:

- `List<Libro>`: almacena los ejemplares registrados en la biblioteca.
- `List<Socio>`: almacena los socios registrados.
- `List<Libro>` dentro de cada objeto `Socio`: almacena los libros que tiene prestados cada socio.
- `ArrayList`: implementación utilizada para crear y administrar las listas.
- `int[]`: arreglo utilizado para mantener los contadores de generación automática de códigos.

La relación entre la lista de socios y la lista de libros prestados de cada socio representa la colección de colecciones solicitada para el trabajo práctico.

## 8. Instrucciones de ejecución

Para ejecutar el programa desde Eclipse:

1. Descargar o clonar el repositorio de GitHub.
2. Abrir Eclipse IDE.
3. Importar el proyecto Java desde la carpeta descargada.
4. Dentro del proyecto, ingresar a `src/biblioteca`.
5. Abrir el archivo `Main.java`.
6. Ejecutar el programa mediante **Run As → Java Application**.

Al iniciar, se mostrará el menú principal desde el cual se podrá acceder a la gestión de libros, socios y préstamos.

**Repositorio:** [Grupo 10 – Biblioteca barrial](https://github.com/lorenzoolguinsd-hash/grupo10-biblioteca-barrial)

## 9. Documentación

El repositorio contiene los siguientes documentos complementarios:

- `docs/requerimientos.md`: descripción de los requerimientos funcionales y reglas del sistema.
- `docs/historias-de-usuario.md`: historias de usuario del proyecto.
- `docs/diseño.md`: diseño de clases, métodos, relaciones y diagrama UML.
- `docs/instrucciones-uso.md`: explicación detallada del funcionamiento del programa.
- `pruebas/casos-de-prueba.md`: registro de los casos de prueba realizados.
- `bitacora.md`: registro de las actividades desarrolladas durante cada jornada.

## 10. Pruebas realizadas

Se realizaron pruebas funcionales y de validación para comprobar el comportamiento del sistema.

Se verificaron las operaciones de registro, búsqueda, listado y eliminación de libros; registro y consulta de socios; préstamos, devoluciones y consultas de préstamos.

También se probaron las validaciones de entrada, la generación automática de códigos, el registro de múltiples ejemplares y la visualización agrupada del catálogo.

Se documentaron **17 casos de prueba**, todos confirmados como aprobados.

El detalle de las pruebas se encuentra en `pruebas/casos-de-prueba.md`.

## 11. Capturas de pantalla

En esta sección se incorporarán capturas del funcionamiento del programa, mostrando:

- Menú principal.
- Gestión y registro de libros.
- Búsqueda y listado de libros.
- Gestión de socios.
- Registro de préstamos y devoluciones.
- Consulta de préstamos de un socio.

Las capturas de seguimiento del trabajo y del tablero Kanban se encuentran en la carpeta `kanban` del repositorio.

## 12. Conclusiones

El desarrollo del proyecto permitió aplicar los conceptos de colecciones y listas en Java mediante un sistema que representa las operaciones principales de una biblioteca barrial.

Se trabajó con programación orientada a objetos, separación de responsabilidades entre clases, administración de colecciones y validación de datos ingresados por el usuario.

También se utilizaron herramientas de trabajo colaborativo como GitHub y Trello para organizar las tareas, registrar los avances y mantener la documentación del proyecto.

Finalmente, las pruebas realizadas permitieron verificar el funcionamiento de las funcionalidades implementadas y corregir los errores detectados durante el desarrollo.
