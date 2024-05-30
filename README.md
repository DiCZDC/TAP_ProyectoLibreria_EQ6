## Modelo

### Descripción de la Clase `Conexion`

La clase `Conexion` es una clase que se encarga de establecer la conexión con una base de datos MySQL. Define los parámetros necesarios para conectarse, como la URL de la base de datos, el usuario y la contraseña. También incluye un método para realizar la conexión y manejar posibles excepciones.

### Tabla de Métodos de la Clase `Conexion`

| Nombre del Método | Descripción |
|-------------------|-------------|
| `main(String[] args)` | Método principal que ejecuta la aplicación y prueba la conexión a la base de datos invocando el método `conectar()`. |
| `conectar()` | Este método establece la conexión a la base de datos utilizando los parámetros definidos (URL, usuario y contraseña). Si la conexión es exitosa, devuelve un objeto `Connection`. En caso de error, captura la excepción `SQLException` y muestra un mensaje de error. |

### Detalle de la Clase

1. **Variables de clase:**
   - `Connection con;` - Objeto para manejar la conexión a la base de datos.
   - `public static final String URL` - URL de la base de datos.
   - `public static final String USER` - Nombre de usuario para la base de datos.
   - `public static final String CLAVE` - Contraseña para la base de datos.

2. **Métodos:**
   - **`main(String[] args)`**: Método principal de la clase que se utiliza para probar la conexión.
   - **`conectar()`**: Método encargado de establecer la conexión a la base de datos MySQL y manejar excepciones en caso de fallo.

Esta clase es fundamental para la gestión de la base de datos en una aplicación, ya que centraliza la lógica de conexión, facilitando así la reutilización y mantenimiento del código.

### Descripción de la Clase `registroFunciones`

La clase `registroFunciones` maneja diversas operaciones relacionadas con la gestión de datos en una base de datos. Incluye métodos para leer datos, obtener identificadores, llenar listas desplegables y operaciones específicas para autores, editoriales y libros.

### Tabla de Métodos de la Clase `registroFunciones`

| Nombre del Método            | Descripción                                                                                                         |
|------------------------------|---------------------------------------------------------------------------------------------------------------------|
| `leerDatos(String tituloTabla, int ancho)` | Lee todos los datos de una tabla específica de la base de datos y los devuelve como una lista de arreglos de cadenas.                          |
| `getId(String tituloTabla, String referencia, String datoBusqueda, int pos)` | Obtiene el ID de un registro en una tabla específica basado en un criterio de búsqueda.                                                  |
| `cboArray(String tituloTabla, int pos)` | Llena una lista con los valores de una columna específica de una tabla en la base de datos.                                                  |
| `regAutor(String nombre, String pais, String idioma, String pagWeb)` | Registra un nuevo autor en la base de datos con los detalles proporcionados.                                                             |
| `editarAutor(String nombre, String pais, String idioma, String pagWeb, int id)` | Actualiza los detalles de un autor existente en la base de datos basado en su ID.                                                       |
| `regEditorial(String nombre, int telefono, String pagWeb, String email, String direccion)` | Registra una nueva editorial en la base de datos con los detalles proporcionados.                                                       |
| `editarEditorial(String nombre, int telefono, String pagWeb, String email, String direccion, int id)` | Actualiza los detalles de una editorial existente en la base de datos basado en su ID.                                                  |
| `regLibro(int idAutor, int idEditorial, long barcode, String ISBN, String titulo, Double precio)` | Registra un nuevo libro en la base de datos junto con las asociaciones correspondientes a autor y editorial.                            |

### Detalle de la Clase

1. **Variables de clase:**
   - `Conexion con` - Objeto de la clase `Conexion` para manejar la conexión a la base de datos.
   - `Connection cn` - Objeto de conexión que se obtiene a través del método `conectar` de la clase `Conexion`.

2. **Métodos:**
   - **`leerDatos(String tituloTabla, int ancho)`**: Este método ejecuta una consulta para leer todos los registros de una tabla específica y los almacena en una lista de arreglos de cadenas, donde cada arreglo representa una fila de la tabla.
   - **`getId(String tituloTabla, String referencia, String datoBusqueda, int pos)`**: Obtiene el ID de un registro en una tabla basada en una referencia y un valor de búsqueda. Utiliza una consulta preparada para evitar inyecciones SQL.
   - **`cboArray(String tituloTabla, int pos)`**: Llena una lista con los valores de una columna específica de una tabla, útil para listas desplegables en interfaces de usuario.
   - **`regAutor(String nombre, String pais, String idioma, String pagWeb)`**: Inserta un nuevo autor en la base de datos utilizando una consulta preparada. Muestra un mensaje de confirmación en caso de éxito.
   - **`editarAutor(String nombre, String pais, String idioma, String pagWeb, int id)`**: Actualiza los datos de un autor existente en la base de datos basado en su ID. Utiliza una consulta preparada y muestra un mensaje de confirmación.
   - **`regEditorial(String nombre, int telefono, String pagWeb, String email, String direccion)`**: Inserta una nueva editorial en la base de datos con los detalles proporcionados, utilizando una consulta preparada.
   - **`editarEditorial(String nombre, int telefono, String pagWeb, String email, String direccion, int id)`**: Actualiza los datos de una editorial existente en la base de datos basado en su ID. Usa una consulta preparada y muestra un mensaje de confirmación.
   - **`regLibro(int idAutor, int idEditorial, long barcode, String ISBN, String titulo, Double precio)`**: Inserta un nuevo libro en la base de datos y asocia el libro con un autor y una editorial. Utiliza consultas preparadas para las inserciones y muestra un mensaje de confirmación.

Esta clase facilita la interacción con la base de datos para operaciones comunes en una aplicación de gestión de librería, centralizando la lógica de acceso a datos y asegurando un manejo adecuado de las excepciones y la integridad de los datos.


### Descripción de la Clase `panelInfoLibro`

La clase `panelInfoLibro` es un componente de interfaz gráfica (JPanel) que muestra la información de un libro específico. La información mostrada incluye el título, autor, editorial, ISBN, existencia y precio. La clase utiliza una conexión a la base de datos para recuperar y mostrar esta información.

### Tabla de Métodos de la Clase `panelInfoLibro`

| Nombre del Método          | Descripción                                                                                                             |
|----------------------------|-------------------------------------------------------------------------------------------------------------------------|
| `panelInfoLibro()`         | Constructor que inicializa los componentes del panel y las variables de instancia con valores vacíos.                   |
| `setCodigoBarras(String cb)` | Establece el valor de la variable `codigo_barras` con el código de barras proporcionado.                                   |
| `actualizaDatos()`         | Actualiza los datos del libro en el panel utilizando el `codigo_barras` para buscar en la base de datos.                |
| `formMouseClicked(java.awt.event.MouseEvent evt)` | Método de evento que se ejecuta cuando el panel es clicado (aún sin implementación específica).                      |

### Detalle de la Clase

1. **Variables de instancia:**
   - `codigo_barras` - Código de barras del libro.
   - `titulo_libro` - Título del libro.
   - `nombre_autor` - Nombre del autor del libro.
   - `editorial` - Nombre de la editorial del libro.
   - `isbn` - ISBN del libro.
   - `existencia` - Existencia del libro.
   - `precio` - Precio del libro.
   - `Conexion con` - Objeto de la clase `Conexion` para manejar la conexión a la base de datos.
   - `Connection cn` - Objeto de conexión que se obtiene a través del método `conectar` de la clase `Conexion`.

2. **Métodos:**
   - **`panelInfoLibro()`**: Constructor que inicializa los componentes gráficos y las variables de instancia con valores vacíos.
   - **`setCodigoBarras(String cb)`**: Método para establecer el valor del código de barras del libro.
   - **`actualizaDatos()`**: Este método ejecuta varias consultas en la base de datos para obtener y actualizar la información del libro en el panel. Realiza las siguientes operaciones:
     - Busca el libro por su código de barras.
     - Obtiene el título, ISBN, existencia y precio del libro.
     - Busca la editorial del libro usando el ID de la editorial.
     - Busca el autor del libro usando el código de barras.
     - Actualiza las etiquetas (`lblTitulo`, `lblAutor`, `lblEditorial`, `lblIsbn`, `lblExistencia`, `lblPrecio`) con los datos obtenidos.
   - **`formMouseClicked(java.awt.event.MouseEvent evt)`**: Método de evento para manejar clics en el panel, actualmente sin una implementación específica.

### Componentes Gráficos

- **Etiquetas (`JLabel`):**
  - `lblTitulo` - Muestra el título del libro.
  - `lblAutor` - Muestra el nombre del autor del libro.
  - `lblEditorial` - Muestra el nombre de la editorial del libro.
  - `lblIsbn` - Muestra el ISBN del libro.
  - `lblExistencia` - Muestra la existencia del libro.
  - `lblPrecio` - Muestra el precio del libro.

Este componente es útil para mostrar de manera detallada la información de un libro en una aplicación gráfica, facilitando la visualización y actualización de los datos desde la base de datos.



### Descripción de la Clase `graficasBDD`

La clase `graficasBDD` es un componente de interfaz gráfica (JPanel) que permite la generación y visualización de gráficos basados en datos extraídos de una base de datos. Utiliza la biblioteca JFreeChart para crear gráficos de pastel y de barras.

### Tabla de Métodos de la Clase `graficasBDD`

| Nombre del Método                        | Descripción                                                                                                         |
|------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| `graficasBDD()`                          | Constructor que inicializa los componentes del panel.                                                               |
| `fillData(String tabla, int keyPos)`     | Llena un `HashMap` con datos de una tabla específica de la base de datos, contando la frecuencia de una clave dada.  |
| `fillTit(String tabla, int keyPos, int titPos)` | Llena un `HashMap` con títulos correspondientes a las claves dadas de una tabla específica en la base de datos.       |
| `panelEmpty()`                           | Verifica si el panel actual está vacío (sin componentes).                                                           |
| `transGrafica(JFreeChart tipoGrafico)`   | Transforma y actualiza el panel con el gráfico proporcionado.                                                       |
| `iniGraficaPastel(String Titulo)`        | Inicializa y muestra un gráfico de pastel basado en los datos cargados en los `HashMaps`.                           |
| `iniGraficaBarras(String Titulo)`        | Inicializa y muestra un gráfico de barras basado en los datos cargados en los `HashMaps`.                           |

### Detalle de la Clase

1. **Variables de instancia:**
   - `Conexion con` - Objeto de la clase `Conexion` para manejar la conexión a la base de datos.
   - `Connection cn` - Objeto de conexión que se obtiene a través del método `conectar` de la clase `Conexion`.
   - `HashMap<Long, Integer> hMapVal` - Mapa que almacena valores clave-frecuencia.
   - `HashMap<Long, String> hMapTit` - Mapa que almacena títulos correspondientes a las claves.
   - `ChartPanel panel` - Panel que contiene el gráfico a mostrar.

2. **Métodos:**
   - **`graficasBDD()`**: Constructor que inicializa los componentes gráficos del panel.
   - **`fillData(String tabla, int keyPos)`**: Este método ejecuta una consulta para obtener datos de una tabla específica y llena el `HashMap` `hMapVal` con la frecuencia de aparición de las claves especificadas por `keyPos`.
   - **`fillTit(String tabla, int keyPos, int titPos)`**: Este método ejecuta una consulta para obtener datos de una tabla específica y llena el `HashMap` `hMapTit` con títulos correspondientes a las claves especificadas por `keyPos` y `titPos`.
   - **`panelEmpty()`**: Verifica si el panel está vacío (sin componentes).
   - **`transGrafica(JFreeChart tipoGrafico)`**: Transforma y actualiza el panel actual con el gráfico proporcionado. Si el panel ya contiene un gráfico, lo elimina antes de agregar el nuevo.
   - **`iniGraficaPastel(String Titulo)`**: Inicializa un gráfico de pastel utilizando los datos cargados en los `HashMaps` `hMapVal` y `hMapTit`. Crea el gráfico con JFreeChart y lo muestra en el panel.
   - **`iniGraficaBarras(String Titulo)`**: Inicializa un gráfico de barras utilizando los datos cargados en los `HashMaps`. Crea el gráfico con JFreeChart y lo muestra en el panel.

### Componentes Gráficos

- **Paneles y Layouts:**
  - `JPanel` - El panel principal que contiene el gráfico.
  - `BorderLayout` - Layout utilizado para organizar los componentes dentro del panel.

Este componente es útil para visualizar datos estadísticos de manera gráfica, facilitando el análisis y la presentación de la información de la base de datos en una aplicación gráfica.


## Vista
### Descripción de la Clase `mainLogin`

La clase `mainLogin` es una ventana principal para el inicio de sesión en una aplicación. Utiliza `JFrame` de Swing para crear una interfaz gráfica de usuario que permite a los usuarios ingresar su nombre de usuario y contraseña, y luego iniciar sesión en la aplicación. La clase incluye métodos para manejar eventos de clic y para validar las credenciales del usuario a través de una clase de controlador.

### Tabla de Métodos de la Clase `mainLogin`

| Nombre del Método                        | Descripción                                                                                                         |
|------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| `mainLogin()`                            | Constructor que inicializa la ventana de inicio de sesión y la posiciona en la pantalla.                            |
| `initComponents()`                       | Método generado por el editor de formularios para inicializar los componentes de la interfaz gráfica.               |
| `windowHeaderMouseDragged(evt)`          | Mueve la ventana cuando se arrastra la cabecera de la ventana.                                                      |
| `windowHeaderMousePressed(evt)`          | Guarda las coordenadas del ratón cuando se presiona en la cabecera de la ventana.                                    |
| `btnExitActionPerformed(evt)`            | Cierra la aplicación cuando se hace clic en el botón de salida.                                                     |
| `txtUserMouseClicked(evt)`               | Limpia el campo de texto del usuario cuando se hace clic en él.                                                     |
| `btnSiguienteActionPerformed(evt)`       | Valida las credenciales del usuario y selecciona la ventana correspondiente según el tipo de usuario.               |
| `windowSelector(int i, int id)`          | Abre la ventana correspondiente basada en el tipo de usuario.                                                       |

### Detalle de la Clase

1. **Variables de instancia:**
   - `int xMouse, yMouse` - Variables para almacenar las coordenadas del ratón cuando se arrastra la ventana.
   - Componentes gráficos como `JLabel`, `JPanel`, `JTextField`, `JPasswordField`, `JButton`, `JSeparator`.

2. **Métodos:**
   - **`mainLogin()`**: Constructor que establece la posición de la ventana y llama al método `initComponents()` para inicializar los componentes.
   - **`initComponents()`**: Método generado automáticamente por el editor de formularios para configurar y organizar los componentes de la interfaz gráfica.
   - **`windowHeaderMouseDragged(evt)`**: Permite arrastrar la ventana por la pantalla.
   - **`windowHeaderMousePressed(evt)`**: Guarda las coordenadas del ratón al presionar en la cabecera de la ventana.
   - **`btnExitActionPerformed(evt)`**: Cierra la aplicación al hacer clic en el botón de salida.
   - **`txtUserMouseClicked(evt)`**: Limpia el texto del campo de usuario al hacer clic en él.
   - **`btnSiguienteActionPerformed(evt)`**: Llama al método `iniSesion` de la clase `LoginFunciones` para validar las credenciales del usuario y selecciona la ventana correspondiente si las credenciales son correctas.
   - **`windowSelector(int i, int id)`**: Abre una ventana específica basada en el tipo de usuario (`i`) y el ID del usuario (`id`).

### Componentes Gráficos

- **Paneles y Layouts:**
  - `JPanel` - Panel principal y paneles secundarios para organizar los componentes.
  - `JTextField` - Campo de texto para el nombre de usuario.
  - `JPasswordField` - Campo de texto para la contraseña.
  - `JButton` - Botones para iniciar sesión y cerrar la aplicación.
  - `JLabel` - Etiquetas para mostrar textos y la imagen de fondo.
  - `JSeparator` - Líneas separadoras para mejorar la presentación de los campos de texto.



### Descripción de la clase `RegAutor`
La clase `RegAutor` es una ventana de diálogo (JDialog) en Java Swing que permite la gestión de registros de autores. Esta clase facilita la visualización, inserción, edición y eliminación de datos de autores en una tabla. Utiliza componentes de la biblioteca Swing para la interfaz gráfica y métodos de la clase `registroFunciones` para la manipulación de datos.

### Tabla de métodos de la clase

| Método                                      | Descripción                                                                                                                                                      |
|---------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `RegAutor(java.awt.Frame parent, boolean modal)` | Constructor de la clase que inicializa los componentes y muestra los datos.                                                                                        |
| `private void actualizar()`                 | Método privado que actualiza los datos mostrados en la tabla y limpia los campos de texto.                                                                        |
| `private void mostrarDatos()`               | Método privado que obtiene los datos de los autores y los muestra en la tabla.                                                                                     |
| `private void initComponents()`             | Método privado generado automáticamente que inicializa y configura los componentes de la interfaz gráfica.                                                        |
| `private void limpiarCampos()`              | Método privado que limpia el contenido de los campos de texto.                                                                                                     |
| `private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)` | Método que maneja el evento del botón "Aceptar" para registrar un nuevo autor.                                                                                     |
| `private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)` | Método que maneja el evento del botón "Cancelar" para limpiar los campos de texto.                                                                                 |
| `private void JTAutoresMouseClicked(java.awt.event.MouseEvent evt)`     | Método que maneja el evento de clic en la tabla de autores para cargar los datos seleccionados en los campos de texto.                                              |
| `private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)` | Método que maneja el evento del botón "Editar" para actualizar la información del autor seleccionado.                                                              |

### Detalle de la clase

#### Variables de instancia
- `registroFunciones regfun`: Instancia de la clase `registroFunciones` para interactuar con la base de datos.
- `private int fila`: Variable para almacenar el índice de la fila seleccionada en la tabla.

#### Constructor
```java
public RegAutor(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    mostrarDatos();
}
```
El constructor inicializa los componentes de la interfaz gráfica y carga los datos de los autores en la tabla.

#### Métodos principales

- `private void actualizar()`: Actualiza los datos de la tabla y limpia los campos de texto.
- `private void mostrarDatos()`: Lee los datos de los autores utilizando `regfun` y los muestra en la tabla `JTAutores`.
- `private void limpiarCampos()`: Limpia los campos de texto `txtNombre`, `txtPais`, `txtIdioma`, y `txtPagWeb`.

#### Métodos de eventos

- `private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)`: Registra un nuevo autor y actualiza la tabla.
- `private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)`: Limpia los campos de texto.
- `private void JTAutoresMouseClicked(java.awt.event.MouseEvent evt)`: Carga los datos del autor seleccionado en los campos de texto.
- `private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)`: Actualiza la información del autor seleccionado en la base de datos y en la tabla.

### Componentes gráficos

- **Paneles**
  - `bgPanel`: Panel principal que contiene todos los sub-paneles.
  - `panelTabla`: Panel que contiene la tabla de autores (`JTAutores`).
  - `panelAutor`: Panel que contiene los campos de texto para ingresar la información del autor.
  - Sub-paneles dentro de `panelAutor` para cada campo de texto (`panelNombre`, `panelPais`, `panelIdioma`, `panelPweb`).

- **Tabla**
  - `JTAutores`: Tabla que muestra la lista de autores con columnas para ID, Nombre, País, Idioma y Página web.

- **Campos de texto**
  - `txtNombre`, `txtPais`, `txtIdioma`, `txtPagWeb`: Áreas de texto para ingresar la información del autor.

- **Botones**
  - `btnAceptar`: Botón para registrar un nuevo autor.
  - `btnCancelar`: Botón para limpiar los campos de texto.
  - `btnEditar`: Botón para editar la información del autor seleccionado.

Estos componentes gráficos se configuran e inicializan en el método `initComponents()`, que es generado automáticamente y contiene el diseño y configuración detallada de cada componente.



### Descripción de la Clase `RegLibro`

La clase `RegLibro` es una ventana de diálogo (JDialog) que proporciona una interfaz gráfica para registrar libros en una aplicación. Permite al usuario ingresar información como el título, autor, editorial, ISBN, precio y código de barras del libro. También muestra una vista previa del código de barras generado.

### Tabla de Métodos de la Clase `RegLibro`

| Nombre del Método          | Descripción                                                                                                             |
|----------------------------|-------------------------------------------------------------------------------------------------------------------------|
| `RegLibro(Frame parent, boolean modal)`         | Constructor que inicializa la ventana de diálogo y sus componentes.                   |
| `inicbos()`         | Inicializa los combo boxes de autores y editoriales utilizando datos obtenidos de la base de datos.                |
| `limpiarCampos()`         | Limpia los campos de texto y restablece los valores predeterminados de los combo boxes.                   |
| `btnAceptarActionPerformed(ActionEvent evt)`         | Maneja el evento del botón "Aceptar", realiza la inserción de un nuevo libro en la base de datos.                |
| `CancelarActionPerformed(ActionEvent evt)`         | Maneja el evento del botón "Cancelar", limpia los campos de entrada de datos.                |
| `showBarcode(String code)`         | Genera una imagen de código de barras utilizando el código proporcionado y la muestra en la interfaz gráfica.                |

### Detalle de la Clase

1. **Variables de instancia:**
   - `regfun` - Objeto de la clase `registroFunciones` para realizar operaciones relacionadas con la base de datos.

2. **Métodos:**
   - **`RegLibro(Frame parent, boolean modal)`**: Constructor que inicializa la ventana de diálogo y sus componentes.
   - **`inicbos()`**: Inicializa los combo boxes de autores y editoriales utilizando datos obtenidos de la base de datos.
   - **`limpiarCampos()`**: Limpia los campos de texto y restablece los valores predeterminados de los combo boxes.
   - **`btnAceptarActionPerformed(ActionEvent evt)`**: Maneja el evento del botón "Aceptar", realiza la inserción de un nuevo libro en la base de datos. También muestra una vista previa del código de barras generado.
   - **`CancelarActionPerformed(ActionEvent evt)`**: Maneja el evento del botón "Cancelar", limpia los campos de entrada de datos.
   - **`showBarcode(String code)`**: Genera una imagen de código de barras utilizando el código proporcionado y la muestra en la interfaz gráfica.

### Componentes Gráficos

- **Paneles (`JPanel`):**
  - `panelTitulo`, `panelAutor`, `panelEditorial`, `panelISBN`, `panelPrecio`, `panelBarcode`: Paneles que contienen etiquetas y campos de texto para ingresar información sobre el libro.
  - `panelBarcodeImg`: Panel que muestra la vista previa del código de barras generado.
  
- **Campos de Texto (`JTextField`):**
  - `txtTitulo`, `txtISBN`, `txtPrecio`, `txtBarcode`: Campos de texto para ingresar el título, ISBN, precio y código de barras del libro.
  
- **Combo Boxes (`JComboBox`):**
  - `cboAutor`, `cboEditorial`: Combo boxes para seleccionar el autor y la editorial del libro.

- **Botones (`JButton`):**
  - `btnAceptar`, `Cancelar`, `btnCopiar`: Botones para aceptar la inserción del libro, cancelar la operación y copiar el código de barras, respectivamente.
 

### Descripción de la Clase `RegEditorial`

La clase `RegEditorial` es una clase que extiende `JDialog` y proporciona una interfaz gráfica para gestionar las editoriales. Permite mostrar, agregar, editar y limpiar datos de editoriales mediante una conexión a la base de datos.

### Tabla de Métodos de la Clase `RegEditorial`

| Nombre del Método               | Descripción                                                                                         |
|---------------------------------|-----------------------------------------------------------------------------------------------------|
| `RegEditorial(java.awt.Frame parent, boolean modal)` | Constructor que inicializa los componentes del diálogo y muestra los datos de la tabla de editoriales. |
| `actualizar()`                  | Actualiza la tabla de datos y limpia los campos de entrada.                                          |
| `mostrarDatos()`                | Muestra los datos de las editoriales en la tabla a partir de la base de datos.                      |
| `limpiarCampos()`               | Limpia todos los campos de entrada en el formulario.                                                 |
| `btnAceptarActionPerformed(java.awt.event.ActionEvent evt)` | Maneja el evento de clic del botón "Aceptar", registrando una nueva editorial si los datos son válidos. |
| `btnEditarActionPerformed(java.awt.event.ActionEvent evt)` | Maneja el evento de clic del botón "Editar", actualizando los datos de una editorial seleccionada.     |
| `JTEditorialMouseClicked(java.awt.event.MouseEvent evt)` | Maneja el evento de clic en la tabla, cargando los datos de la editorial seleccionada en los campos.   |
| `btnCancelarActionPerformed(java.awt.event.ActionEvent evt)` | Maneja el evento de clic del botón "Cancelar", limpiando todos los campos de entrada.                    |

### Detalle de la Clase

1. **Variables de instancia:**
   - `registroFunciones regfun` - Objeto de la clase `registroFunciones` para realizar operaciones en la base de datos.
   - `int fila` - Índice de la fila seleccionada en la tabla.

2. **Métodos:**
   - **`RegEditorial(java.awt.Frame parent, boolean modal)`**: Constructor que inicializa los componentes gráficos y muestra los datos de las editoriales en la tabla.
   - **`actualizar()`**: Método privado que actualiza la tabla de datos y limpia los campos de entrada.
   - **`mostrarDatos()`**: Método privado que muestra los datos de las editoriales en la tabla, leyendo los datos desde la base de datos.
   - **`limpiarCampos()`**: Método público que limpia todos los campos de entrada en el formulario.
   - **`btnAceptarActionPerformed(java.awt.event.ActionEvent evt)`**: Método de evento para manejar el clic en el botón "Aceptar". Registra una nueva editorial en la base de datos si los datos ingresados son válidos y actualiza la tabla.
   - **`btnEditarActionPerformed(java.awt.event.ActionEvent evt)`**: Método de evento para manejar el clic en el botón "Editar". Edita los datos de la editorial seleccionada en la tabla y actualiza la base de datos.
   - **`JTEditorialMouseClicked(java.awt.event.MouseEvent evt)`**: Método de evento para manejar el clic en una fila de la tabla. Carga los datos de la editorial seleccionada en los campos de entrada.
   - **`btnCancelarActionPerformed(java.awt.event.ActionEvent evt)`**: Método de evento para manejar el clic en el botón "Cancelar". Limpia todos los campos de entrada del formulario.

### Componentes Gráficos

- **Paneles (`JPanel`):**
  - `bgPanel` - Panel de fondo que contiene todos los demás componentes.
  - `panelTabla` - Panel que contiene la tabla de editoriales.
  - `panelEditorial` - Panel que contiene los campos de entrada para los datos de la editorial.
  - `panelEmail`, `panelPweb`, `panelDireccion`, `panelTelefono`, `panelNombre` - Paneles que contienen etiquetas y campos de entrada específicos.

- **Tabla (`JTable`):**
  - `JTEditorial` - Tabla que muestra la lista de editoriales.

- **Botones (`JButton`):**
  - `btnAceptar` - Botón para aceptar y registrar una nueva editorial.
  - `btnCancelar` - Botón para cancelar y limpiar los campos de entrada.
  - `btnEditar` - Botón para editar los datos de la editorial seleccionada.

- **Campos de Texto (`JTextArea`):**
  - `txtDireccion`, `txtEmail`, `txtNombre`, `txtPagWeb`, `txtTelefono` - Campos de texto para ingresar los datos de la editorial (dirección, email, nombre, página web, teléfono).

Esta clase es fundamental para gestionar la información de las editoriales en una aplicación gráfica, permitiendo agregar, editar y visualizar las editoriales almacenadas en una base de datos.



Entendido, voy a crear las descripciones y las tablas de métodos para las clases proporcionadas en el código.

### Descripción de la Clase `regEmpleado`

La clase `regEmpleado` es un diálogo modal que permite registrar nuevos empleados en un sistema. Proporciona un formulario interactivo donde se pueden ingresar los detalles del empleado, como nombre, teléfono, RFC, sueldo, fecha de nacimiento, tipo de usuario, entre otros. Además, la clase incluye funcionalidades para validar la entrada del usuario y almacenar la información en una base de datos.

### Tabla de Métodos de la Clase `regEmpleado`

| Nombre del Método                    | Descripción                                                                                                                                                                    |
|-------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `regEmpleado(java.awt.Frame parent, boolean modal)` | Constructor de la clase que inicializa el diálogo de registro de empleados, estableciendo el padre y la modalidad del diálogo.                                              |
| `cboTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt)` | Método de evento que se activa cuando se selecciona un elemento en el combo box de tipo de usuario. Controla la habilitación/deshabilitación de otros campos según el tipo de usuario seleccionado. |
| `btnAceptarActionPerformed(java.awt.event.ActionEvent evt)` | Método de evento que se activa cuando se hace clic en el botón "Aceptar" del formulario. Realiza la validación de los campos ingresados por el usuario y guarda la información en la base de datos. |
| `mostrarUsuarios()`                 | Método que muestra todos los empleados registrados en una tabla dentro del diálogo. Obtienen los datos de la base de datos y los muestran en la tabla.                            |
| `agregarGerente(int idEmpleado)`    | Método que agrega un empleado como gerente en la base de datos.                                                                                                                |
| `agregarCajero(int idEmpleado, int numCaja)` | Método que agrega un empleado como cajero en la base de datos.                                                                                                                  |
| `agregarEmpleadoBodega(int idEmpleado,int idAlmacen)` | Método que agrega un empleado como empleado de bodega en la base de datos.                                                                                                      |
| `limpiarCampos()`                   | Método que limpia todos los campos del formulario.                                                                                                                              |
| `cargarAlmacenes()`                 | Método que carga los almacenes disponibles en un combo box dentro del formulario, obteniéndolos de la base de datos.                                                          |
| `main(String args[])`               | Método principal de la clase que inicia la aplicación y muestra el diálogo de registro de empleados.                                                                            |

### Detalle de la Clase `regEmpleado`

1. **Variables de Instancia:**
   - `Conexion con` - Objeto de la clase `Conexion` para manejar la conexión a la base de datos.
   - `Connection cn` - Objeto de conexión que se obtiene a través del método `conectar` de la clase `Conexion`.

2. **Componentes Gráficos:**
   - Varias instancias de componentes de interfaz gráfica, como etiquetas, campos de texto, combo boxes y botones, utilizados para recopilar información del usuario y mostrar datos.

Esta clase facilita el registro de empleados en un sistema mediante un formulario interactivo y realiza operaciones de validación y almacenamiento de datos en una base de datos.


### Descripción de la Clase `VentanaBodega`

La clase `VentanaBodega` representa una ventana de interfaz gráfica que permite gestionar el movimiento de libros en un sistema de inventario de una bodega. Esta ventana muestra opciones para realizar entradas y salidas de libros, seleccionando el libro mediante su código de barras y especificando la cantidad. Además, proporciona la opción de seleccionar la dirección del almacén donde se realizarán las operaciones.

### Tabla de Métodos de la Clase `VentanaBodega`

| Nombre del Método            | Descripción                                                                                                                                              |
|------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| `inicbo()`                   | Inicializa los ComboBox con los datos recuperados de la base de datos (libros y almacenes).                                                              |
| `salidaValida(int sal)`      | Verifica si la cantidad especificada para una salida de libros es válida.                                                                                 |
| `salidaBodega()`             | Realiza la operación de salida de libros de la bodega, actualizando las existencias tanto en la bodega como en la tienda.                               |
| `entradaBodega()`            | Realiza la operación de entrada de libros a la bodega, actualizando las existencias en el almacén correspondiente.                                       |
| `limpiarCampos()`            | Limpia los campos de entrada después de realizar una operación de entrada o salida de libros.                                                             |
| `btnEntradaActionPerformed()`| Maneja el evento de clic en el botón "Entrada", ejecutando la operación de entrada de libros y limpiando los campos después de la operación.         |
| `btnSalidaActionPerformed()` | Maneja el evento de clic en el botón "Salida", ejecutando la operación de salida de libros y limpiando los campos después de la operación.           |
| `main(String[] args)`        | Método principal que crea y muestra la ventana `VentanaBodega` cuando se ejecuta la aplicación.                                                          |

### Detalle de la Clase `VentanaBodega`

1. **Variables de Instancia:**
   - `con` - Objeto de la clase `Conexion` para manejar la conexión a la base de datos.
   - `cn` - Objeto de conexión a la base de datos.
   - `idActAlm` - Almacena el ID del almacén actual seleccionado.

2. **Métodos:**
   - **`inicbo()`**: Recupera los datos de libros y almacenes de la base de datos y los inicializa en los ComboBox correspondientes.
   - **`salidaValida(int sal)`**: Verifica si la cantidad especificada para la salida de libros es válida comparándola con el límite de existencias en el almacén.
   - **`salidaBodega()`**: Realiza la operación de salida de libros de la bodega, actualizando las existencias tanto en el almacén como en la tienda.
   - **`entradaBodega()`**: Realiza la operación de entrada de libros a la bodega, actualizando las existencias en el almacén correspondiente.
   - **`limpiarCampos()`**: Limpia los campos de entrada después de realizar una operación de entrada o salida de libros.
   - **`btnEntradaActionPerformed()`**: Maneja el evento de clic en el botón "Entrada", ejecutando la operación de entrada de libros y limpiando los campos después de la operación.
   - **`btnSalidaActionPerformed()`**: Maneja el evento de clic en el botón "Salida", ejecutando la operación de salida de libros y limpiando los campos después de la operación.
   - **`main(String[] args)`**: Método principal que crea y muestra la ventana `VentanaBodega` cuando se ejecuta la aplicación.

3. **Componentes Gráficos:**
   - `panelDatos` - Panel que contiene los componentes para ingresar datos de entrada y salida de libros.
   - `cboBarcode` - ComboBox para seleccionar el código de barras del libro.
   - `cboAlmacen` - ComboBox para seleccionar la dirección del almacén.
   - `jsCantidad` - Spinner para ingresar la cantidad de libros.
   - `btnEntrada` - Botón para realizar una operación de entrada de libros.
   - `btnSalida` - Botón para realizar una operación de salida de libros.
   - `panelInfo` - Panel de información del libro (`panelInfoLibro`) para mostrar los detalles del libro seleccionado.


### Descripción de la Clase `VentanaCajero`

La clase `VentanaCajero` representa la interfaz gráfica de un sistema de punto de venta para un cajero. Permite al cajero realizar transacciones de compra, generar tickets de compra en formato PDF, enviar tickets por correo electrónico y actualizar la base de datos con las transacciones realizadas.

### Tabla de Métodos de la Clase `VentanaCajero`

| Nombre del Método          | Descripción                                                                                                      |
|----------------------------|------------------------------------------------------------------------------------------------------------------|
| `VentanaCajero()`          | Constructor que inicializa la ventana del cajero, establece el ID del cajero y llama al método `iniTab()`.       |
| `iniTab()`                 | Inicializa la tabla de productos en la interfaz gráfica del cajero.                                             |
| `dataExists()`             | Verifica si los datos del producto ya existen en la tabla de productos.                                         |
| `updateTabla()`            | Actualiza la tabla de productos con los datos del producto ingresado.                                            |
| `copiasMinimas()`          | Verifica si hay suficientes copias disponibles de un producto en la tienda.                                     |
| `updateLbl()`              | Actualiza los campos de subtotal, IVA y total en la interfaz gráfica del cajero.                                 |
| `btnAgregarActionPerformed()` | Maneja el evento de agregar un producto a la tabla de productos.                                                |
| `txtBarcodeActionPerformed()` | Maneja el evento de presionar "Enter" en el campo de código de barras, actualizando la información del libro.  |
| `btnEliminarActionPerformed()` | Maneja el evento de eliminar un producto de la tabla de productos.                                               |
| `pdfGen()`                 | Genera un archivo PDF con los datos de la transacción y retorna el archivo generado.                             |
| `envioCorreo()`            | Configura y envía un correo electrónico con el archivo PDF adjunto.                                             |
| `updateDatabase()`         | Actualiza la base de datos con la información de la transacción.                                                 |
| `btnAceptarActionPerformed()` | Maneja el evento de aceptar la transacción, generando el PDF, enviando el correo y actualizando la base de datos. |
| `txtPagoActionPerformed()` | Maneja el evento de ingresar el monto de pago e indica el cambio a devolver.                                     |

### Detalle de la Clase

1. **Variables de instancia:**
   - `con` - Objeto de la clase `Conexion` para manejar la conexión a la base de datos.
   - `cn` - Objeto de conexión a la base de datos.
   - `modelo` - Modelo de tabla (`DefaultTableModel`) para la tabla de productos.
   - `idCaja` - ID del cajero actual.

2. **Métodos:**
   - **`VentanaCajero(java.awt.Frame parent, boolean modal, int idCajero)`**: Constructor que inicializa la ventana del cajero, establece el ID del cajero y llama al método `iniTab()`.
   - **`iniTab()`**: Inicializa la tabla de productos en la interfaz gráfica del cajero.
   - **`dataExists()`**: Verifica si los datos del producto ya existen en la tabla de productos.
   - **`updateTabla()`**: Actualiza la tabla de productos con los datos del producto ingresado.
   - **`copiasMinimas()`**: Verifica si hay suficientes copias disponibles de un producto en la tienda.
   - **`updateLbl()`**: Actualiza los campos de subtotal, IVA y total en la interfaz gráfica del cajero.
   - **`btnAgregarActionPerformed()`**: Maneja el evento de agregar un producto a la tabla de productos.
   - **`txtBarcodeActionPerformed()`**: Maneja el evento de presionar "Enter" en el campo de código de barras, actualizando la información del libro.
   - **`btnEliminarActionPerformed()`**: Maneja el evento de eliminar un producto de la tabla de productos.
   - **`pdfGen()`**: Genera un archivo PDF con los datos de la transacción y retorna el archivo generado.
   - **`envioCorreo()`**: Configura y envía un correo electrónico con el archivo PDF adjunto.
   - **`updateDatabase()`**: Actualiza la base de datos con la información de la transacción.
   - **`btnAceptarActionPerformed()`**: Maneja el evento de aceptar la transacción, generando el PDF, enviando el correo y actualizando la base de datos.
   - **`txtPagoActionPerformed()`**: Maneja el evento de ingresar el monto de pago e indica el cambio a devolver.

3. **Componentes Gráficos:**
   - Varios componentes gráficos como botones, etiquetas, campos de texto y una tabla para mostrar la información y manejar las transacciones.
  

### Descripción de la Clase `VentanaGerente`

La clase `VentanaGerente` es una interfaz gráfica que proporciona funcionalidades específicas para el rol de gerente en un sistema de gestión de una librería. Permite al gerente registrar libros, editar la tabla de editoriales, editar la tabla de autores, visualizar las ventas y visualizar gráficas relacionadas con las ventas.

### Tabla de Métodos de la Clase `VentanaGerente`

| Nombre del Método          | Descripción                                                                                               |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `VentanaGerente()`         | Constructor que inicializa la ventana del gerente y sus componentes gráficos.                            |
| `btnRegLibroActionPerformed()`   | Maneja el evento de hacer clic en el botón "Registrar libro" para abrir la ventana de registro de libros (`RegLibro`). |
| `btnRegEditorialActionPerformed()` | Maneja el evento de hacer clic en el botón "Editar tabla editorial" para abrir la ventana de edición de editoriales (`RegEditorial`). |
| `btnRegAutorActionPerformed()`     | Maneja el evento de hacer clic en el botón "Editar tabla autor" para abrir la ventana de edición de autores (`RegAutor`). |
| `btnVentanaVentasActionPerformed()` | Maneja el evento de hacer clic en el botón "Visualizar ventas" para abrir la ventana de visualización de ventas (`VentanaVentas`). |
| `btnVentanaGraficasActionPerformed()` | Maneja el evento de hacer clic en el botón "Visualizar Gráficas" para abrir la ventana de visualización de gráficas (`VentanaGraficas`). |

### Detalle de la Clase

1. **Componentes Gráficos:**
   - `btnRegLibro` - Botón para registrar un nuevo libro.
   - `btnRegEditorial` - Botón para editar la tabla de editoriales.
   - `btnRegAutor` - Botón para editar la tabla de autores.
   - `btnVentanaVentas` - Botón para visualizar las ventas.
   - `btnVentanaGraficas` - Botón para visualizar gráficas relacionadas con las ventas.

2. **Métodos:**
   - **`VentanaGerente()`**: Constructor que inicializa la ventana del gerente y sus componentes gráficos.
   - **`btnRegLibroActionPerformed()`**: Maneja el evento de hacer clic en el botón "Registrar libro" para abrir la ventana de registro de libros (`RegLibro`).
   - **`btnRegEditorialActionPerformed()`**: Maneja el evento de hacer clic en el botón "Editar tabla editorial" para abrir la ventana de edición de editoriales (`RegEditorial`).
   - **`btnRegAutorActionPerformed()`**: Maneja el evento de hacer clic en el botón "Editar tabla autor" para abrir la ventana de edición de autores (`RegAutor`).
   - **`btnVentanaVentasActionPerformed()`**: Maneja el evento de hacer clic en el botón "Visualizar ventas" para abrir la ventana de visualización de ventas (`VentanaVentas`).
   - **`btnVentanaGraficasActionPerformed()`**: Maneja el evento de hacer clic en el botón "Visualizar Gráficas" para abrir la ventana de visualización de gráficas (`VentanaGraficas`).

Esta clase ofrece una interfaz intuitiva y fácil de usar para que el gerente pueda realizar las tareas administrativas relacionadas con la gestión de libros y el seguimiento de las ventas.


### Descripción de la Clase `VentanaGraficas`

La clase `VentanaGraficas` es una interfaz gráfica que muestra diversas gráficas relacionadas con la gestión de una librería. Permite al usuario visualizar gráficas como los libros más vendidos, libros por editorial, cantidad de libros por autor y cantidad de empleados por tipo.

### Tabla de Métodos de la Clase `VentanaGraficas`

| Nombre del Método          | Descripción                                                                                               |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `VentanaGraficas()`        | Constructor que inicializa la ventana de gráficas y sus componentes gráficos.                             |
| `btnLibrosVendidosActionPerformed()`   | Maneja el evento de hacer clic en el botón "Libros más vendidos" para mostrar una gráfica de pastel con los libros más vendidos. |
| `btnLibrosEditorialActionPerformed()` | Maneja el evento de hacer clic en el botón "Libros por editorial" para mostrar una gráfica de barras con la cantidad de libros por editorial. |
| `btnLibrosPAutorActionPerformed()`     | Maneja el evento de hacer clic en el botón "Cantidad de libros p/ Autor" para mostrar una gráfica de barras con la cantidad de libros disponibles por autor. |
| `btnTipoEmpleadosActionPerformed()`    | Maneja el evento de hacer clic en el botón "Tipos de empleados" para mostrar una gráfica de pastel con la cantidad de empleados por tipo. |

### Detalle de la Clase

1. **Componentes Gráficos:**
   - `panelGraficas` - Panel que muestra las gráficas generadas.
   - `btnLibrosVendidos` - Botón para mostrar la gráfica de los libros más vendidos.
   - `btnLibrosEditorial` - Botón para mostrar la gráfica de libros por editorial.
   - `btnLibrosPAutor` - Botón para mostrar la gráfica de cantidad de libros por autor.
   - `btnTipoEmpleados` - Botón para mostrar la gráfica de cantidad de empleados por tipo.

2. **Métodos:**
   - **`VentanaGraficas()`**: Constructor que inicializa la ventana de gráficas y sus componentes gráficos.
   - **`btnLibrosVendidosActionPerformed()`**: Maneja el evento de hacer clic en el botón "Libros más vendidos" para mostrar una gráfica de pastel con los libros más vendidos.
   - **`btnLibrosEditorialActionPerformed()`**: Maneja el evento de hacer clic en el botón "Libros por editorial" para mostrar una gráfica de barras con la cantidad de libros por editorial.
   - **`btnLibrosPAutorActionPerformed()`**: Maneja el evento de hacer clic en el botón "Cantidad de libros p/ Autor" para mostrar una gráfica de barras con la cantidad de libros disponibles por autor.
   - **`btnTipoEmpleadosActionPerformed()`**: Maneja el evento de hacer clic en el botón "Tipos de empleados" para mostrar una gráfica de pastel con la cantidad de empleados por tipo.

Esta clase brinda una forma visualmente atractiva y fácil de comprender para que los usuarios puedan analizar diferentes aspectos relacionados con la gestión de la librería mediante gráficas.


### Descripción de la Clase `VentanaVentas`

La clase `VentanaVentas` es una interfaz gráfica que permite visualizar las ventas realizadas en una tienda, así como los productos asociados a cada venta. Permite buscar una venta específica por su ID y mostrar los detalles de los productos vendidos en esa transacción.

### Tabla de Métodos de la Clase `VentanaVentas`

| Nombre del Método          | Descripción                                                                                               |
|----------------------------|-----------------------------------------------------------------------------------------------------------|
| `VentanaVentas()`          | Constructor que inicializa la ventana de ventas y sus componentes gráficos.                                |
| `mostrarVentas()`          | Método para mostrar las ventas en la tabla de ventas.                                                      |
| `mostrarProductos(String idVenta)` | Método para mostrar los productos asociados a una venta específica.                                       |

### Detalle de la Clase

1. **Componentes Gráficos:**
   - `tablaVentas` - Tabla que muestra las ventas realizadas, con detalles como el ID de la venta, nombre del cliente, fecha de venta, correo del cliente y el cajero.
   - `tablaProductos` - Tabla que muestra los productos asociados a una venta específica, con detalles como el código de barras, título, ISBN, precio, cantidad y subtotal.

2. **Métodos:**
   - **`VentanaVentas()`**: Constructor que inicializa la ventana de ventas y sus componentes gráficos. También muestra las ventas al inicializar la ventana.
   - **`mostrarVentas()`**: Método que recupera las ventas de la base de datos y las muestra en la tabla de ventas.
   - **`mostrarProductos(String idVenta)`**: Método que recupera los productos asociados a una venta específica identificada por su ID, y los muestra en la tabla de productos.

3. **Funcionalidades Adicionales:**
   - **Búsqueda por ID de Venta**: Permite al usuario buscar una venta específica por su ID, y muestra los detalles de los productos asociados a esa venta.

Esta clase proporciona una interfaz fácil de usar para visualizar y buscar ventas, así como ver los detalles de los productos asociados a cada venta.


### Descripción de la Clase `registroCapacitaciones`

La clase `registroCapacitaciones` es una interfaz gráfica que permite agregar capacitaciones para empleados de bodega. Los datos ingresados se registran en la base de datos.

### Tabla de Métodos de la Clase `registroCapacitaciones`

| Nombre del Método                            | Descripción                                                                                               |
|----------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| `registroCapacitaciones()`                   | Constructor que inicializa la ventana de registro de capacitaciones y sus componentes gráficos.           |
| `setIdEmpleadoBodega(int idEmpleado)`        | Establece el ID del empleado de bodega para el cual se agregarán las capacitaciones.                      |
| `agregarCapacitacionEmpleadoBodega()`        | Agrega la capacitación ingresada para el empleado de bodega en la base de datos.                          |

### Detalle de la Clase

1. **Componentes Gráficos:**
   - `lblId` - Etiqueta que muestra el ID del empleado de bodega para el cual se agregarán las capacitaciones.
   - `txtCapacitacion` - Campo de texto para ingresar el nombre y la descripción de la capacitación.
   - `btnAgregar` - Botón para agregar la capacitación ingresada.

2. **Métodos:**
   - **`registroCapacitaciones()`**: Constructor que inicializa la ventana de registro de capacitaciones y sus componentes gráficos.
   - **`setIdEmpleadoBodega(int idEmpleado)`**: Establece el ID del empleado de bodega para el cual se agregarán las capacitaciones.
   - **`agregarCapacitacionEmpleadoBodega()`**: Método que agrega la capacitación ingresada para el empleado de bodega en la base de datos.

3. **Funcionalidades Adicionales:**
   - **Registro de Capacitaciones**: Permite al usuario ingresar el nombre y la descripción de una capacitación y agregarla para un empleado de bodega específico.

Esta clase proporciona una interfaz para registrar nuevas capacitaciones para empleados de bodega en la base de datos.


## Controlador


### Descripción de la Clase `LoginFunciones`

La clase `LoginFunciones` es una clase de controlador que proporciona funcionalidades relacionadas con el inicio de sesión en un sistema. Esta clase se encarga de validar las credenciales de un usuario (nombre de usuario y contraseña) comparándolas con los registros almacenados en una base de datos. Si las credenciales son válidas, la clase devuelve información adicional sobre el usuario, como su identificador y tipo de empleado.

### Tabla de Métodos de la Clase `LoginFunciones`

| Nombre del Método                   | Descripción                                                                                                                                                                                |
|------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `iniSesion(String username,String givenPW)` | Método que inicia sesión de un usuario en el sistema. Recibe como parámetros el nombre de usuario y la contraseña proporcionados por el usuario al intentar iniciar sesión. Devuelve un array de enteros que contiene información sobre el resultado del inicio de sesión. |

### Detalle de la Clase `LoginFunciones`

1. **Variables de Instancia:**
   - `con` - Instancia de la clase `Conexion` que gestiona la conexión a la base de datos.
   - `cn` - Objeto de conexión a la base de datos obtenido mediante el método `conectar` de la clase `Conexion`.

2. **Métodos:**
   - **`iniSesion(String username,String givenPW)`**: Método que verifica las credenciales de inicio de sesión proporcionadas por el usuario comparándolas con los registros de la base de datos. Realiza las siguientes operaciones:
     - Ejecuta una consulta SQL para buscar un empleado con el nombre de usuario proporcionado.
     - Si se encuentra un empleado con ese nombre de usuario, recupera su contraseña y su tipo de empleado.
     - Compara la contraseña recuperada con la contraseña proporcionada por el usuario.
     - Si las contraseñas coinciden, devuelve un array de enteros con el ID del empleado y su tipo de empleado. Si no coinciden, devuelve valores especiales para indicar un fallo en el inicio de sesión.

Este componente es útil para manejar el proceso de inicio de sesión de usuarios en un sistema, validando sus credenciales y proporcionando información adicional sobre el usuario en caso de un inicio de sesión exitoso.


### Descripción de la Clase `pdfGenerator`

La clase `pdfGenerator` es una utilidad que permite generar un archivo PDF para crear tickets de compra. Esta clase utiliza la biblioteca iText para generar el archivo PDF con un formato específico que incluye un título, texto descriptivo, y un mensaje de despedida. Además, proporciona métodos para agregar texto dinámicamente al ticket.

### Tabla de Métodos de la Clase `pdfGenerator`

| Nombre del Método    | Descripción                                                                                                                                                                      |
|----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `addText(String nuevaLinea)` | Método que permite agregar una nueva línea de texto al ticket de compra. Recibe como parámetro la nueva línea de texto que se desea agregar.                          |
| `getTicket()`        | Método que genera y devuelve un archivo PDF que representa el ticket de compra.                                                                                                  |
| `crearPDF(File fof)` | Método interno que crea el PDF con el formato del ticket de compra. Recibe como parámetro un archivo donde se almacenará el PDF generado y devuelve el mismo archivo. |

### Detalle de la Clase `pdfGenerator`

1. **Variables de Instancia:**
   - `titulo` - Párrafo que contiene el título del ticket de compra.
   - `texto1` - Párrafo que contiene el texto descriptivo del ticket de compra.
   - `despedida` - Párrafo que contiene el mensaje de despedida del ticket de compra.

2. **Métodos:**
   - **`addText(String nuevaLinea)`**: Permite agregar una nueva línea de texto al ticket de compra. Este método es útil para agregar información dinámica al ticket, como detalles de los productos comprados.
   - **`getTicket()`**: Genera y devuelve un archivo PDF que representa el ticket de compra. Este método invoca al método interno `crearPDF` para generar el PDF.
   - **`crearPDF(File fof)`**: Método interno que crea el PDF con el formato del ticket de compra. Utiliza la biblioteca iText para crear el documento PDF con el título, texto y mensaje de despedida. Retorna el archivo donde se ha almacenado el PDF generado.

Esta clase proporciona una forma sencilla de generar tickets de compra en formato PDF, permitiendo agregar texto dinámico y personalizado al ticket antes de generarlo.


### Descripción de la Clase `EmailButton`

La clase `EmailButton` es una extensión de `JButton` que proporciona funcionalidad para enviar correos electrónicos desde una aplicación Java. Este botón está diseñado para ser agregado a interfaces gráficas de usuario (GUI) y permite al usuario enviar correos electrónicos de manera rápida y sencilla haciendo clic en el botón.
**Para utilizar este boton es necesario generar un passcode con tu correo, aqui hay un tutorial de  como hacerlo https://youtu.be/kTcmbZqNiGw?si=jknVQVlOURRZOhJ6**

### Tabla de Métodos de la Clase `EmailButton`

| Nombre del Método | Descripción                                                                                                                  |
|-------------------|------------------------------------------------------------------------------------------------------------------------------|
| `setEmail(String email)`          | Establece la dirección de correo electrónico del destinatario del correo.                                                  |
| `setSubject(String subject)`      | Establece el asunto del correo electrónico.                                                                                 |
| `setMessage(String message)`      | Establece el cuerpo del mensaje del correo electrónico.                                                                      |
| `setAttachedFile(File attachedFile)` | Adjunta un archivo al correo electrónico.                                                                                    |
| `sendEmail()`                      | Envía el correo electrónico con los parámetros especificados (destinatario, asunto, mensaje y archivo adjunto) utilizando las credenciales de autenticación proporcionadas. |

### Detalle de la Clase `EmailButton`

1. **Variables de Instancia:**
   - `email` - La dirección de correo electrónico del destinatario.
   - `subject` - El asunto del correo electrónico.
   - `message` - El cuerpo del mensaje del correo electrónico.
   - `attachedFile` - El archivo adjunto al correo electrónico.

2. **Métodos:**
   - **`setEmail(String email)`**: Establece la dirección de correo electrónico del destinatario.
   - **`setSubject(String subject)`**: Establece el asunto del correo electrónico.
   - **`setMessage(String message)`**: Establece el cuerpo del mensaje del correo electrónico.
   - **`setAttachedFile(File attachedFile)`**: Adjunta un archivo al correo electrónico.
   - **`sendEmail()`**: Envía el correo electrónico utilizando las credenciales de autenticación proporcionadas y los parámetros especificados (destinatario, asunto, mensaje y archivo adjunto).

3. **Método `actionPerformed(ActionEvent e)`**:
   - Este método se ejecuta cuando se hace clic en el botón.
   - No se realiza ninguna acción específica en este método, ya que el proceso de envío de correo electrónico se maneja en el método `sendEmail()`. Se puede agregar lógica adicional aquí si es necesario.

### Detalles Adicionales

- La clase utiliza las bibliotecas JavaMail API para enviar correos electrónicos y MimeBodyPart para adjuntar archivos al correo electrónico.
- Se proporciona una notificación al usuario mediante cuadros de diálogo JOptionPane para informar sobre el estado del envío del correo electrónico.

