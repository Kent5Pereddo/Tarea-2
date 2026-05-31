# Tarea-2
Este proyecto fue desarrollado en Java aplicando conceptos de Programación Orientada a Objetos (POO), como herencia, asociación, agregación y composición. Permite gestionar distintos tipos de contenidos audiovisuales como películas, series y documentales.
# Catálogo Audiovisual - Tarea de POO (Unidad 2)

**Estudiante:** Kent Pereddo
**Universidad:** Universidad Politécnica Salesiana (UPS)
**Materia:** Programación Orientada a Objetos

---

## ¿De qué trata este proyecto?
Este es el código de mi tarea para simular un catálogo de videos (como películas, series y documentales). Lo hice en Java para practicar los temas de la Unidad 2, especialmente la herencia y cómo conectar las clases entre sí usando Agregación, Composición y Asociación.

## Lo que le agregué al código base
Para cumplir con las etapas 2 y 4 de la rúbrica, hice estos cambios:
* **Agregación:** Uní la clase `Actor` con `Pelicula` (el actor existe por su cuenta, independiente de la película).
* **Composición:** Hice que la clase `Temporada` se cree directamente por dentro de `SerieDeTV` y también en mi nueva clase `Anime`.
* **Asociación:** Conecté la clase `Investigador` con el `Documental`.
* **Clases propias (Herencia):** Agregué dos clases nuevas llamadas `Anime` y `VideoStreaming` que heredan de la clase principal `ContenidoAudiovisual`.
* **Pruebas:** Actualicé el archivo `PruebaAudioVisual.java` para crear los objetos de prueba, guardarlos y ver que no salgan errores.

## Cómo ejecutar el proyecto
1. Clona este repositorio o descarga la carpeta en tu computadora.
2. Abre Eclipse y ve a `File > Import > General > Existing Projects into Workspace`.
3. Selecciona la carpeta `poo_unidad1`.
4. Busca el archivo principal en la ruta `src/poo/PruebaAudioVisual.java`.
5. Dale clic derecho a ese archivo y elige **Run As > Java Application**.
6. En la consola de Eclipse vas a ver cómo se imprimen los datos de todos los contenidos.

## Mejoras extra
* **Para no repetir código:** En lugar de imprimir cada video uno por uno, guardé todas las películas, series y directos en un solo arreglo general. Así, con un simple bucle `for`, recorro todo y llamo al método `mostrarDetalles()` una sola vez para que el código quede más limpio.
* **Reutilización:** Aproveché la clase `Temporada` que ya habíamos creado y la reutilicé dentro de mi clase inventada `Anime` para organizar los arcos o temporadas sin tener que programar todo desde cero.
