# Microservicio local con Spring Boot

Este es un programa desarrollado en Spring Boot que permite a los usuarios interactuar con un CRUD de automoviles, en una base H2 local,
que puede estar alojada en memoria o bien en un archivo local.

## Instalación

Antes de nada, asegúrate de tener instalado Java y Maven en tu sistema operativo.

1. Clona este repositorio en tu computadora.
2. La configuación por defecto, tiene los accesos del archivo h2, por lo que no es necesario configurar nada.
3. Ejecuta el siguiente comando en tu terminal para compilar el proyecto:  
    ```
    mvn clean package
    ```
4. Ejecuta cada microservicio, por defecto se ejecutan en el puerto 8080 (automoviles) y 8081 (items)

5. abre el collection de postman llamado **automoviles**, ahi podrás crear, listar, eliminar y consultar los automoviles, además mediante el uso de CrudRepository, podrás acceder a estos mismos mediante el segundo collection llamado **items**


### Crear autos
**mediante el collection automoviles**

3. llena el formulario del POST con los datos del auto que deseas crear, aparecerá "done" en la respuesta si se creó correctamente.


### listar autos

**mediante el collection automoviles**

4. usa el request QUERY para listar los autos, un JSON con todos los autos aparecerá en la respuesta.

**mediante el collection items**

5. usa el request QUERYITEMS para listar los autos, un JSON con todos los autos aparecerá en la respuesta.
6. También puedes usar GETITEMSAMOUNT para obtener la cantidad de autos en la base de datos.


### ubtener un auto por ID

**mediante el collection automoviles**

7. agregar el ID del auto que deseas obtener en el request GET, aparecerá un JSON con los datos del auto en la respuesta si este existe, de lo contrario aparecerá un mensaje null.


**mediante el collection items**

8. agregar el ID del auto que deseas obtener en el request GETITEM, aparecerá un JSON con los datos del auto en la respuesta si este existe, de lo contrario aparecerá un mensaje null.

### eliminar un auto por ID
**mediante el collection automoviles**

9. agregar el ID del auto que deseas eliminar en el request DELETE, aparecerá un mensaje de confirmación en la respuesta si este existe, de lo contrario aparecerá un mensaje null.


**mediante el collection items**

10. agregar el ID del auto que deseas eliminar en el request DELETEITEM, aparecerá un mensaje de confirmación en la respuesta si este existe, de lo contrario aparecerá un mensaje null.

## Contribuir

Si encuentras algún error o crees que podrías mejorar esta aplicación, no dudes en crear un pull request o reportar una issue. 

## Licencia

Este proyecto está bajo la Licencia MIT - ver [LICENSE](LICENSE) para detalles.
