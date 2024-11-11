# Evidencia 09 - Diseño y aplicación de GUIs + gestores de datos
###### Estudiantes: David Baez (defocuss) - Martín Carrasco (martingci) - Emilio Jaramillo (emiunu) - Sabrina López (Sunnaee)
## Ejercicio: Diseño y aplicación de POO para una cafetería orientada a objetos
***
### Descripción:
Una cafetería requiere gestionar cafés que posee a la venta, donde un café debe contener al menos la cantidad de gramos de café, mililitros de agua, tamaño (pequeño, mediano, grande) e ingredientes opcionales (Crema, Leche, Chocolate). La cafetería para poder promocionar sus productos contiene un nombre, dirección, redes sociales (Instagram, Facebook, Twitter, etc...) y la lista de cafés que posee a la venta.

Adicionalmente, se requiere desarrollar una lista de funcionalidades para la cafetería, las cuales son:

1. Agregar cafés con sus respectivas especificaciones en la cafetería.
2. Obtener una lista de cafés de la cafetería de acuerdo a algún tamaño y mostrarlos.
3. Discontinuar un café de la cafetería.
4. Modificar información de la cafetería para mantenerse actualizados.
5. Cada funcionalidad requiere comunicarse con un archivo de texto para poder acceder, eliminar y registrar la información de los diversos componentes del problema. El archivo de la cafetería se debe llamar cafetería.txt (o json) y el archivo de los cafés se debe llamar cafes.txt (o json).

### Desarrollo:

Implemente código en java que cumpla con las siguientes especificaciones:

#### Diagrama de clases:
Diagrama de clases debe estar detallado, cada clases con sus respectivos atributos, funcionalidades y relaciones.

#### Paquetes:
Para el desarrollo del problema se propone el siguiente conjunto de packages para gestionar su solución (Ver patrón de diseño MVC)

* `model`: Se incluyen las clases para el desarrollo del caso.
* `gui/vista`: Se incluyen las clases relacionadas con las interfaces gráficas que deberá incluir en el desarrollo del problema.
* `controller`: Se incluyen las clases que gestiona la lógica de la problemática para mostrar eventos en las ventanas gráficas.
* `data`: Se incluyen las clases que gestionan los datos de la problemática.
* `principal`: Se incluye la clase que inicializa el proyecto.

### Gestión de archivos:

El archivo de la cafetería se debe llamar cafeteria.txt y el archivo de los cafés se debe llamar cafes.txt

### Interfaces gráficas:

Cada funcionalidad se debe asociar a una interfaz gráfica que implemente el caso requerido. Esto incluye:

* Funcionalidad de la ventana (Al hacer click debe realizar algo / mostrar algo).
* Gestión de la ventana a través de un controlador o clase del modelo.
* Gestión de datos a través del controlador o clase del modelo.