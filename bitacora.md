# Bitácora del proyecto

## Preparacion - Definición y organización

### Actividades realizadas

- Se definió el tema del proyecto: Clase 6 - Colecciones y Listas.
- Se seleccionó como emprendimiento una biblioteca barrial con catálogo de libros y gestión de préstamos.
- Se creó el repositorio del Grupo 10 en GitHub.
- Se creó el tablero de organización en Trello.
- Se establecieron las columnas de trabajo: Por hacer, En curso y Hecho.
- Se elaboró la presentación inicial del proyecto en el archivo README.md.
- Se documentaron los requerimientos funcionales y las reglas básicas del sistema.
- Se redactaron las historias de usuario.
- Se preparó el diseño inicial de las clases principales.

### Integrantes

- Lorenzo Olguin
- Ramiro Peralta
- Francisco Olivera
- Nestor Oviedo

### Herramientas utilizadas

- GitHub.
- Trello.
- Java (lenguaje previsto para el desarrollo).
- Eclipse (entorno previsto para el desarrollo).

### Estado actual

El proyecto se encuentra en etapa de planificación y análisis. Se cuenta con una primera versión de la documentación y la organización del trabajo.

Queda pendiente revisar las propuestas con todos los integrantes y confirmar las responsabilidades y el alcance definitivo del sistema.


# Bitácora – Día 1: Definición del proyecto

**Fecha:** 09/11/2026  
**Grupo:** 10 – Biblioteca barrial: catálogo de libros y préstamos.

## Actividades realizadas

Durante la primera jornada se realizó una reunión grupal para presentar y organizar el proyecto integrador.

Se explicó a los integrantes el funcionamiento de las herramientas de trabajo que utilizaremos durante el desarrollo:

- **GitHub:** se mostró cómo acceder al repositorio, editar documentos y guardar los cambios mediante commits.
- **Trello:** se explicó cómo utilizar el tablero Kanban, organizar las tareas, asignar responsables y actualizar sus estados.

Como parte de la demostración, se realizaron modificaciones en los documentos del repositorio, dejando commits de ejemplo con mensajes como «Demostración de cómo editar el documento».

También se conversó sobre el rumbo del proyecto, se confirmó la propuesta de la biblioteca barrial y se definieron las responsabilidades iniciales de cada integrante.

## Acuerdos del equipo

- Mantener el proyecto enfocado en la administración de libros, socios y préstamos.
- Utilizar GitHub como repositorio central del trabajo.
- Utilizar Trello para organizar y hacer seguimiento de las tareas.
- Distribuir las responsabilidades entre los integrantes.
- Mantener actualizados los documentos y registrar los avances mediante commits.

## Resultados de la jornada

- Se confirmó la orientación general del proyecto.
- Todos los integrantes recibieron una explicación inicial sobre el uso de GitHub y Trello.
- Se organizaron las tareas y se asignaron responsables.
- Se estableció una base de trabajo común para continuar con las siguientes etapas.

## Próximos pasos

Continuar con la etapa de análisis: confirmar los requerimientos, validar las historias de usuario y revisar la estructura inicial de las clases propuestas.


## Día 2 – Análisis del sistema

**Objetivo:** completar y validar el análisis del sistema, revisar las clases principales y organizar las actividades correspondientes al diseño.

### Actividades realizadas

- Se revisaron y confirmaron los requerimientos del sistema.
- Se revisaron y confirmaron las historias de usuario.
- Se verificaron las clases principales propuestas: `Libro`, `Socio` y `Biblioteca`, junto con sus atributos y responsabilidades.
- Se agregó la responsabilidad de **listar socios** a la clase `Biblioteca`, ya que esta funcionalidad no estaba contemplada inicialmente.
- Se realizaron modificaciones en los datos de los libros con el objetivo de facilitar y agilizar las búsquedas y el control de la información.
- Se revisó el diseño preliminar para comprobar que las clases propuestas respondan a las funcionalidades acordadas.

### Organización del trabajo

Se actualizaron las tarjetas correspondientes en el tablero de Trello, trasladando a «Hecho» las tareas que fueron completadas.

También se establecieron las actividades para el Día 3, correspondiente al diseño del sistema:

1. Diseñar el menú de consola.
2. Elaborar el diagrama de clases UML.
3. Definir los métodos de cada clase.
4. Definir las relaciones entre las clases.
5. Completar el documento de diseño.
6. Revisar y validar el diseño final.

Se acordó que los integrantes podrán elegir voluntariamente las tareas según sus conocimientos e intereses, evitando asignaciones anticipadas.

Para prevenir conflictos al trabajar sobre el mismo documento (`docs/diseno.md`), se estableció que cada integrante prepare su aporte por separado y que una sola persona se encargue de integrar los cambios en el repositorio. Posteriormente, el documento será revisado en conjunto.

### Estado al finalizar el día

- Requerimientos e historias de usuario revisados y confirmados.
- Clases principales revisadas y responsabilidades ajustadas.
- Datos de libros y socios revisados.
- Documento de diseño preliminar existente, pendiente de completar con el diseño definitivo.
- Tareas del Día 3 definidas y organizadas en Trello.
- La tarea «Diseñar el menú de consola» permanece pendiente para la siguiente etapa.

**Conclusión:** se completó la etapa principal de análisis y se dejó preparada la organización del trabajo para comenzar con el diseño del sistema en el Día 3.

## Día 3 – Diseño del sistema

Se completó y aprobó el diseño del sistema Biblioteca Barrial tras una revisión final.

Durante esta etapa se definieron:
- Las clases principales (`Libro`, `Socio`, `Biblioteca` y `Main`).
- Los atributos y métodos de cada clase.
- Las relaciones y multiplicidades entre las clases.
- La estructura del menú de consola.
- El diagrama de clases UML.

El documento `docs/diseño.md` quedó confirmado como referencia para la etapa de desarrollo.

**Estado:** Día 3 finalizado.


## Día 4 – Desarrollo de las clases principales

**Fecha:** 12/11/2026

### Actividades realizadas

Durante esta jornada se comenzó con la etapa de desarrollo del sistema en Java, utilizando Eclipse como entorno de programación.

Se creó la estructura inicial del proyecto y se implementaron las tres clases principales:

- **`Libro`:** se definieron sus atributos, constructor, métodos getters y setter, y el método `toString()`.
- **`Socio`:** se implementaron sus atributos, constructor, getters y los métodos para agregar y quitar libros prestados.
- **`Biblioteca`:** se desarrollaron las operaciones para registrar, eliminar, buscar y listar libros y socios, además de gestionar los préstamos, las devoluciones y las consultas de libros prestados.

### Verificación

Se guardaron los archivos y se comprobó que las tres clases compilaran correctamente en Eclipse, sin errores.

### Estado al finalizar el día

- Estructura inicial del proyecto Java creada.
- Clases `Libro`, `Socio` y `Biblioteca` implementadas.
- Código incorporado al repositorio de GitHub.
- Compilación verificada correctamente.
- Clase `Main` y menú de consola pendientes para la siguiente jornada.

**Conclusión:** se completó la implementación inicial de las clases principales del sistema, dejando preparada la base para integrar las funcionalidades mediante el menú de consola en el Día 5.


## Día 5 – Integración y pruebas del sistema

**Fecha:** 13/11/2026

### Actividades realizadas

Durante esta jornada se completó el desarrollo de la clase `Main`, integrando las clases `Libro`, `Socio` y `Biblioteca` mediante un menú principal y sus respectivos submenús.

Se incorporaron las opciones para gestionar libros, socios y préstamos, permitiendo ejecutar las operaciones definidas durante la etapa de diseño.

También se realizaron pruebas funcionales para comprobar el funcionamiento de las distintas operaciones del sistema.

### Pruebas realizadas

Se verificaron las siguientes funcionalidades:

- Registro, búsqueda, listado y eliminación de libros.
- Registro, búsqueda y listado de socios.
- Registro de préstamos y devoluciones.
- Consulta de los libros prestados a un socio.

Las operaciones principales fueron ejecutadas correctamente durante las pruebas iniciales realizadas en Eclipse.

Posteriormente, los integrantes del grupo realizaron pruebas desde sus propias computadoras para comprobar que el proyecto pudiera descargarse y ejecutarse en diferentes entornos de desarrollo.

### Resultados y observaciones

Las pruebas permitieron comprobar que las funcionalidades principales del sistema funcionan, aunque también se identificaron algunos aspectos que necesitan mejoras:

- El programa permite registrar libros y socios con campos vacíos.
- Se permiten números de socio negativos.
- El ingreso de letras en campos numéricos provoca una excepción `InputMismatchException` y puede ocasionar el cierre del programa.
- Al intentar eliminar un libro prestado, se muestra un mensaje incorrecto indicando que el libro no existe.
- La búsqueda de libros por título no está disponible desde el menú, a pesar de estar contemplada en los requerimientos.

Uno de los integrantes no informó inconvenientes adicionales durante sus pruebas.

### Estado al finalizar el día

- Clase `Main` desarrollada e integrada.
- Menú principal y submenús implementados.
- Operaciones principales verificadas.
- Pruebas realizadas por los integrantes en diferentes equipos.
- Problemas y mejoras pendientes identificados.
- La tarea «Realizar pruebas y corregir errores» permanece **En curso**.

**Conclusión:** se completó la integración inicial del sistema y se realizaron pruebas funcionales tanto en el entorno de desarrollo como en otros equipos. Los resultados permitieron identificar errores de validación y una funcionalidad de búsqueda pendiente, que serán abordados en la siguiente jornada de trabajo.


## Día 6 – Corrección de errores y validación del sistema

**Fecha:** 14/11/2026

### Actividades realizadas

Durante esta jornada se trabajó sobre los problemas identificados en las pruebas realizadas al finalizar el Día 5.

Se incorporaron validaciones de entrada en la clase `Main`, evitando que el programa se cierre cuando se ingresan letras en campos numéricos y rechazando los campos de texto vacíos.

También se corrigió el comportamiento al intentar eliminar libros prestados, permitiendo mostrar un mensaje específico en lugar de indicar incorrectamente que el libro no existe.

Además, se incorporó la búsqueda de libros por título desde el menú de gestión de libros, permitiendo realizar búsquedas parciales y sin distinguir entre mayúsculas y minúsculas.

Se actualizaron los documentos `diseño.md` e `instrucciones-uso.md` para reflejar los cambios realizados en el sistema.

### Pruebas realizadas

Se realizaron pruebas de las validaciones incorporadas y se solicitó a los integrantes del grupo que descargaran y ejecutaran el proyecto desde sus propios equipos.

Ramiro informó que, durante sus pruebas, no aparecieron otras fallas generales, aunque identificó dos detalles pendientes:

- El programa todavía acepta códigos de libros que no respetan el formato establecido, como `abc`.
- Al ingresar una opción inexistente en el menú de gestión de libros, el programa vuelve al menú sin mostrar el mensaje «Opción inválida».

### Resultados y observaciones

Las correcciones realizadas permitieron mejorar la validación de datos, el manejo de errores y las opciones de búsqueda del sistema.

Los dos detalles señalados por Ramiro quedaron registrados para ser corregidos durante el Día 7. La validación del formato de los códigos ya estaba prevista para esa jornada, mientras que también se incorporará el aviso correspondiente para las opciones inválidas.

No se informaron otras fallas durante las pruebas recibidas.

### Estado al finalizar el día

- Validaciones de entrada incorporadas.
- Mensaje de eliminación de libros prestados corregido.
- Búsqueda de libros por título incorporada al menú.
- Documentación del proyecto actualizada.
- Pruebas realizadas por los integrantes.
- Dos detalles pendientes de corrección para el Día 7.
- La tarea «Realizar pruebas y corregir errores» permanece **En curso**.

**Conclusión:** durante esta jornada se corrigieron los principales problemas detectados en las pruebas anteriores y se mejoró el funcionamiento general del sistema. Las pruebas realizadas permitieron identificar dos últimos detalles que serán abordados durante la jornada final, junto con las verificaciones y preparativos para la entrega y defensa del proyecto.


## Día 7 – Finalización del desarrollo y validación del sistema

**Fecha:** 15/11/2026

### Actividades realizadas

Durante esta jornada se completaron las últimas mejoras funcionales del sistema y se realizaron las verificaciones finales de las operaciones implementadas.

Se incorporó la generación automática de códigos para los ejemplares de libros. Cada copia recibe un identificador único compuesto por una letra inicial y cuatro dígitos correlativos. También se contempló la normalización de letras acentuadas, la letra Ñ y los títulos que comienzan con números o símbolos.

Se implementó el registro de múltiples ejemplares de un mismo libro, permitiendo indicar la cantidad deseada y generar un código diferente para cada copia.

Además, se modificó la presentación del catálogo para agrupar los ejemplares que comparten título y autor, mostrando las cantidades totales, disponibles y prestadas. Esta presentación se incorporó tanto al listado general como a la búsqueda por título, manteniendo la consulta individual mediante código.

Por último, se corrigió el comportamiento del menú de gestión de libros para que, al ingresar una opción inexistente, se muestre el mensaje «Opción inválida» y vuelva a presentarse el submenú correspondiente.

Se actualizaron los documentos de requerimientos, diseño, historias de usuario e instrucciones de uso para reflejar las funcionalidades incorporadas.

También se organizó la documentación de las pruebas y se incorporaron capturas de pantalla del funcionamiento del programa en la carpeta `kanban/funcionamiento`.

### Pruebas realizadas

Se verificaron las funcionalidades incorporadas y las operaciones generales del sistema.

Se comprobaron especialmente:

- La generación automática y correlativa de códigos.
- El registro de múltiples ejemplares.
- La búsqueda de libros por título y por código.
- La visualización agrupada del catálogo y sus cantidades.
- El comportamiento ante opciones inexistentes en el menú.
- Las operaciones de registro, búsqueda y listado de socios.
- El registro de préstamos, devoluciones y consulta de préstamos.

Se completaron 17 casos de prueba, cuyos resultados fueron verificados durante el desarrollo.

### Estado al finalizar el día

- Funcionalidades principales del sistema implementadas.
- Generación automática de códigos incorporada.
- Registro de múltiples ejemplares implementado.
- Catálogo agrupado por título y autor.
- Validación de opciones del menú corregida.
- Documentación funcional y técnica actualizada.
- 17 casos de prueba verificados.
- Capturas del funcionamiento incorporadas a `kanban/funcionamiento`.

**Conclusión:** se completó el desarrollo de las funcionalidades previstas para el sistema de biblioteca barrial y se verificó su comportamiento mediante pruebas funcionales. Se dejaron organizadas las evidencias y la documentación para preparar la entrega final del proyecto.
