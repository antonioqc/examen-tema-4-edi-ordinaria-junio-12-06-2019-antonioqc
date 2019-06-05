# Examen Tema 4 Entornos de Desarrollo Ordinaria - 1DAW

***Refactorización, Documentación y control de versiones***

Sigue detalladamente las instrucciones del examen. Cualquier duda, pregunta a tu profesor.

1. En el repositorio tienes en código fuente que será la base sobre la cual desarrollaremos el examen. Dividiremos el examen en 3 partes, y las utilizaremos para desarrollar las versiones de git y github. Evidentemente, usaremos las buenas prácticas de git y github que hemos estado trabajando durante el curso

## Ramas y Merge I

1. Para el workflow del examen, utilizaremos las siguientes ramas: desarrollo, refactorización, documentación. Crealas cuando se te indique. 
   
2. Crea la rama "desarrollo"


### Refactorización

3. Crea la rama "refactorizacion" a partir de la rama desarrollo y cambiate a esa rama ***(0.25 puntos)***
   
4. Haz las refactorizaciones que necesites para que "Miau" sea un campo de la clase Gato llamado "maulla". Compromete el estado actual con el mensaje "Refactorizacion 1 Gato - Nombre y Apellidos" ***(0.5 puntos)***
   
5. Extrae una superclase a partir de la clase "Estudiante" llamada "Persona" con los campos: 
   
   1. nombre
   2. apellidos
   3. nif
   
   y los métodos

   1. getNombre(), setNombre()
   2. getApellidos(), setApellidos()
   3. getNif(), setNif()
   
   y compromete el estado actual con el mensaje "Refactorizacion 2 Superclase Persona - Nombre y Apellidos". ***(1.25 puntos)***
   
6. Fusiona la rama "refactorizacion" en la rama "desarrollo" ***(0.5 puntos)***
   
### Documentación
   
7. Crea la rama "documentacion" a partir de la rama desarrollo y cambiate a esa rama ***(0.25 puntos)***
   
8. Documenta en Javadoc las clases y las funciones para que aparezcan sus descripciones, autor, y descripción de los parámetros y devoluciones de cada método. Compromete el estado actual con el mensaje "Documentación 1 - Nombre y Apellidos" ***(1.25 puntos)***
    
9.  Genera el Javadoc y Guárdalo en tu repositorio en una carpeta que se llame "doc". Compromete el estado actual con el mensaje "Documentación 2 Javadoc - Nombre y Apellidos" ***(0.75 puntos)***
    
10. Fusiona la rama "documentacion" en la rama "desarrollo" ***(0.5 puntos)***
    
## Pull Request

13. Actualiza tu repositorio, si no lo has hecho ya.
    
14. Realiza un fork del repositorio del examen a tu cuenta de github. ***(0.5 puntos)***
    
15. En el repositorio forkado, ve a la rama de documentación y modifica la etiqueta title del index.html con tu nombre y apellidos
    
16. Compromete los cambios con la etiqueta "pull request Nombre y apellidos" ***(0.25 puntos)***
    
17. Realiza un pull request de la rama **documentacion** de tu repositorio forkado sobre la rama **desarrollo** del repositorio del examen ***(1 punto)***
    
18. Acepta los cambios y haz un merge de tu pull request ***(0.25 puntos)***
    
19. No borres el repositorio de tu cuenta hasta que el examen esté corregido

## Issues

19. Observa los issues que deberías tener en tu repositorio de examen.
    
20. Cierralos con un solo commit que contenga en la etiqueta "Cerrando Issues - Nombre y Apellidos" ***(1 punto)***
    
## Ramas y Merge II
    
21.  Fusiona la rama desarrollo en la rama master ***(0.5 puntos)***

## Github Pages

22.  Crea una página con tu repositorio de la rama master. En la url "iesgrancapitan-entornos.github.io/repositorioexamen/doc" debe aparecer tu javadoc ***(0.5 puntos)***
    
## Releases

23. Crea un release de la rama master con lo datos de tu repositorio ***(0.75 puntos)***

##  Nota

***En caso de cualquier duda y/o errata, será resuelta durante la realización del examen***