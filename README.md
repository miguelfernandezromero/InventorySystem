# InventorySystem

Descargar el repositorio en su maquina local
Agregar el proyecto en el editor de su preferencia, se sugiere spring tool suit
Levantar el servicio

#Apis contenidas en el servicio:
Base Url: /api

#1.	Registrar un activo:
•	Método: POST
•	URL: /activos
•	Parámetros de entrada: Información del activo (número de serie, descripción, nombre, fecha de compra, valor de compra)
•	Descripción: Permite registrar un nuevo activo en el sistema.

#2.	Actualizar información de un activo:
•	Método: PUT
•	URL: /activos/{id}
•	Parámetros de entrada: Identificador del activo (id), Información actualizada del activo
•	Descripción: Permite actualizar la información de un activo existente en el sistema.

#3.	Dar de baja un activo:
•	Método: DELETE
•	URL: /activos/{id}
•	Parámetros de entrada: Identificador del activo (id)
•	Descripción: Permite dar de baja un activo existente en el sistema.

#4.	Consultar información básica de un activo:
•	Método: GET
•	URL: /activos/{id}
•	Parámetros de entrada: Identificador del activo (id)
•	Descripción: Permite obtener la información básica de un activo (número de serie, descripción, nombre, fecha de compra, valor de compra).

#5.	Consultar depreciación de un activo:
•	Método: GET
•	URL: /activos/{id}/depreciacion
•	Parámetros de entrada: Identificador del activo (id)
•	Descripción: Permite obtener el valor de depreciación acumulada de un activo, calculada según el porcentaje establecido (4% anual).

#Ejemplo de body para ejecucion de apis:

{
    "serialNumber":"prueba",
    "description":"prueba",
    "name":"prueba",
    "buysDate": "2022-06-16T02:22:16",
    "buysValue": 2000
}
