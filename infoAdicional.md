# ¿Cómo distribuir el código fuente?

Para distribuir o categorizar el código que estamos creando, debemos especificar un ¿*namespace*?, un nombre de paquete.

```kt
package egb.appgestion.usuarios
```

Para usar el código escrito en este paquete, necesitaremos importar en el fichero especificado:

```kt
import egb.appgestion.usuarios
```

# Creando un JAR desde JetBrains

File > Project Structure > Artifacts > Add.. JAR

Seleccionr la Clase Principal y proyecto principal... 

Build > Build Artifacts > Build

Aparecerá en nuestro directorio out/artifacts un JAR para explorar nuestro proyecto.
