# Casos de prueba – Biblioteca barrial

## 1. Objetivo

Registrar las pruebas funcionales realizadas durante el desarrollo del sistema Biblioteca Barrial, indicando el comportamiento esperado y los resultados obtenidos.

Las pruebas permiten comprobar el funcionamiento de las operaciones de gestión de libros, socios y préstamos, además de las validaciones incorporadas.

## 2. Pruebas funcionales

### CP01 – Registrar libros

- **Funcionalidad:** Registro de libros.
- **Resultado esperado:** El sistema incorpora el libro al catálogo y confirma el registro.
- **Resultado obtenido:** Se comprobó que el sistema registra correctamente los libros y confirma la operación.
- **Estado:** Aprobada.

### CP02 – Buscar libros por código

- **Funcionalidad:** Búsqueda de libros mediante su código identificador.
- **Resultado esperado:** El sistema encuentra y muestra el ejemplar correspondiente.
- **Resultado obtenido:** Se comprobó que el sistema encuentra y muestra correctamente el ejemplar correspondiente al código ingresado.
- **Estado:** Aprobada.

### CP03 – Buscar libros por título

- **Funcionalidad:** Búsqueda de libros por título.
- **Resultado esperado:** El sistema muestra los libros cuyo título coincide total o parcialmente con el texto ingresado, sin distinguir entre mayúsculas y minúsculas.
- **Resultado obtenido:** Se comprobó que la búsqueda permite encontrar los libros correspondientes al título ingresado.
- **Estado:** Aprobada.

### CP04 – Listar libros

- **Funcionalidad:** Listado del catálogo.
- **Resultado esperado:** El sistema muestra los libros registrados.
- **Resultado obtenido:** Se comprobó que el sistema muestra correctamente los libros registrados en el catálogo.
- **Estado:** Aprobada.

### CP05 – Eliminar libros

- **Funcionalidad:** Eliminación de ejemplares.
- **Resultado esperado:** El sistema elimina un ejemplar disponible e impide eliminar uno que se encuentre prestado.
- **Resultado obtenido:** Se comprobó que el sistema permite eliminar ejemplares disponibles e impide eliminar los que se encuentran prestados. Durante el Día 6 se corrigió el mensaje mostrado al intentar eliminar un libro prestado.
- **Estado:** Aprobada.

### CP06 – Registrar socios

- **Funcionalidad:** Registro de socios.
- **Resultado esperado:** El sistema incorpora al socio y evita registrar números de socio repetidos.
- **Resultado obtenido:** Se comprobó que el sistema registra correctamente los socios y evita la duplicación de números de socio.
- **Estado:** Aprobada.

### CP07 – Buscar y listar socios

- **Funcionalidad:** Consulta de socios registrados.
- **Resultado esperado:** El sistema permite encontrar un socio por su número y mostrar los socios registrados.
- **Resultado obtenido:** Se comprobó que el sistema permite buscar socios por número y listar correctamente los socios registrados.
- **Estado:** Aprobada.

### CP08 – Registrar préstamos

- **Funcionalidad:** Préstamo de libros.
- **Resultado esperado:** El sistema registra el préstamo cuando el socio está registrado y el libro se encuentra disponible.
- **Resultado obtenido:** Se comprobó que el sistema registra correctamente los préstamos cuando se cumplen las condiciones requeridas.
- **Estado:** Aprobada.

### CP09 – Registrar devoluciones

- **Funcionalidad:** Devolución de libros.
- **Resultado esperado:** El sistema registra la devolución y vuelve a marcar el ejemplar como disponible.
- **Resultado obtenido:** Se comprobó que el sistema registra correctamente las devoluciones y actualiza la disponibilidad del ejemplar.
- **Estado:** Aprobada.

### CP10 – Consultar préstamos de un socio

- **Funcionalidad:** Consulta de libros prestados.
- **Resultado esperado:** El sistema muestra los ejemplares que tiene prestados el socio seleccionado.
- **Resultado obtenido:** Se comprobó que el sistema muestra correctamente los préstamos correspondientes al socio consultado.
- **Estado:** Aprobada.

## 3. Pruebas de validación y corrección de errores

### CP11 – Ingreso de datos no numéricos en campos numéricos

- **Resultado esperado:** El sistema informa el error y solicita nuevamente el dato, sin cerrarse.
- **Resultado obtenido:** Se comprobó que el sistema detecta los datos no numéricos, informa el error y solicita nuevamente el ingreso.
- **Estado:** Aprobada.

### CP12 – Ingreso de campos de texto vacíos

- **Resultado esperado:** El sistema rechaza los campos vacíos y solicita nuevamente la información.
- **Resultado obtenido:** Se comprobó que el sistema rechaza los campos vacíos y vuelve a solicitar la información.
- **Estado:** Aprobada.

### CP13 – Eliminación de un libro prestado

- **Resultado esperado:** El sistema impide eliminar el ejemplar y muestra un mensaje que informa que no está disponible para su eliminación.
- **Resultado obtenido:** Se comprobó que el sistema impide eliminar ejemplares prestados y muestra el mensaje correspondiente, luego de la corrección realizada durante el Día 6.
- **Estado:** Aprobada.

### CP14 – Ingreso de una opción inexistente en el menú de libros

- **Resultado esperado:** El sistema muestra «Opción inválida» y vuelve a presentar el submenú de gestión de libros.
- **Resultado obtenido:** Se comprobó que al ingresar una opción inexistente, como `99`, el sistema muestra el mensaje correspondiente y vuelve a presentar el submenú.
- **Estado:** Aprobada.

## 4. Pruebas incorporadas durante el Día 7

### CP15 – Generación automática de códigos

- **Resultado esperado:** El sistema genera códigos únicos utilizando la inicial del título y una numeración correlativa de cuatro dígitos.
- **Resultado obtenido:** Se comprobó la generación automática de códigos únicos, incluyendo la normalización de letras acentuadas, la letra Ñ y el prefijo `NN` para títulos que comienzan con números o símbolos.
- **Estado:** Aprobada.

### CP16 – Registro de múltiples ejemplares

- **Resultado esperado:** El sistema permite indicar una cantidad de ejemplares y genera un código diferente para cada uno.
- **Resultado obtenido:** Se comprobó que el sistema permite registrar varios ejemplares de un mismo libro y genera un código único para cada copia.
- **Estado:** Aprobada.

### CP17 – Visualización agrupada del catálogo

- **Resultado esperado:** Los ejemplares con el mismo título y autor se muestran agrupados, indicando cantidades totales, disponibles y prestadas.
- **Resultado obtenido:** Se comprobó que el listado y la búsqueda por título muestran correctamente los ejemplares agrupados y sus cantidades correspondientes.
- **Estado:** Aprobada.

## 5. Observaciones

Durante las pruebas realizadas en las distintas jornadas se identificaron errores y aspectos que fueron corregidos durante el desarrollo.

Entre ellos se encontraron problemas de validación de datos, mensajes incorrectos al eliminar libros prestados, ausencia de búsqueda por título desde el menú y falta de aviso ante opciones inexistentes.

Las correcciones se incorporaron progresivamente y quedaron registradas en la bitácora del proyecto.

Al finalizar el Día 7, se completaron las 17 pruebas funcionales y de validación previstas. Los resultados obtenidos permitieron comprobar el funcionamiento de las funcionalidades implementadas y las correcciones realizadas durante el desarrollo.
