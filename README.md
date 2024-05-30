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
