
# Hello World: AWS Lambda & Gateway Services en Java

## Crear la función lambda

Se crea la función desde Lambda:

<img width="2879" height="1549" alt="Captura de pantalla 2025-10-15 100406" src="https://github.com/user-attachments/assets/4df08882-4994-4229-95a2-e3a867422d04" />


Se carga el archivo .jar:


<img width="2879" height="1561" alt="Captura de pantalla 2025-10-15 101532" src="https://github.com/user-attachments/assets/3598463a-e861-4c3f-8f18-3784a2fa3d0f" />


Se indica la función a invocar:

<img width="2879" height="1551" alt="image" src="https://github.com/user-attachments/assets/1e98964d-6ec9-479f-be3e-b67028643571" />


Se crea una prueba, se guarda y se ejecuta:

<img width="2879" height="1549" alt="image" src="https://github.com/user-attachments/assets/ef81f1cc-7c32-44e0-a7a0-e361cd04aa6a" />


## Configuración de API Gateway para exponer servicio

Se crea el API:

<img width="2879" height="1543" alt="image" src="https://github.com/user-attachments/assets/3ae8e5aa-e9e1-417e-878b-f3acc699c4d4" />


Posteriormente se crea el recurso /mathservices/square y dentro de este la función lambda:


<img width="2879" height="1553" alt="image" src="https://github.com/user-attachments/assets/b088588c-3398-4cfd-bbd1-9429c01d0876" />

<img width="2879" height="1558" alt="image" src="https://github.com/user-attachments/assets/a93699af-0733-40d5-8128-3bb9a8a4b0eb" />


Se crea el parámetro de consulta value:

<img width="1731" height="1406" alt="image" src="https://github.com/user-attachments/assets/edc51caf-5cde-4af8-89df-81fb33b3a573" />


Ahora desde la opción de edición de solicitud de integración:


<img width="2865" height="408" alt="image" src="https://github.com/user-attachments/assets/610c9a9c-f520-452e-96ef-16169b4b8116" />

<img width="2879" height="1550" alt="image" src="https://github.com/user-attachments/assets/8f2e24ec-d599-4ceb-a113-aa66a6209001" />


Se hace una prueba:


<img width="2879" height="1556" alt="image" src="https://github.com/user-attachments/assets/07198153-3d05-4c23-8440-920d83ea72a5" />


Ahora se hace modifcación cambiando la constante 5 que se había dejado anteriormente:

<img width="2879" height="1547" alt="image" src="https://github.com/user-attachments/assets/8fcee8f7-9b77-42ba-a278-acefe0a1b4dc" />


Se hace prueba indicando el valor para value:

<img width="2879" height="1544" alt="image" src="https://github.com/user-attachments/assets/fbaf0d40-4ded-4a2f-9fe4-286b10420b40" />


Se despliega el API:

<img width="2879" height="1558" alt="image" src="https://github.com/user-attachments/assets/f7d5a7ac-87de-42c4-9f53-0258a72dac8b" />


Se copia la url:

<img width="2879" height="1642" alt="image" src="https://github.com/user-attachments/assets/239321ad-5537-42cd-85d7-a8fae18a7619" />


Y se hace la prueba desde el navegador:

<img width="1543" height="257" alt="image" src="https://github.com/user-attachments/assets/0d9f004c-f497-4afe-b1b1-ba2638467de6" />

<img width="870" height="410" alt="image" src="https://github.com/user-attachments/assets/c4b8b13d-482b-4007-acf8-345ec3be5dd1" />



## Security


Se crea nueva función lambda para login y se carga nuevamente el .jar actualizado con la implementación de la clase SecurityUtils:

<img width="2879" height="1554" alt="image" src="https://github.com/user-attachments/assets/1537071f-4bb2-49c6-8f3c-2b6218032028" />


Ahora se crea el recurso de login en el API Gateway y se realiza prueba:

<img width="2879" height="1560" alt="image" src="https://github.com/user-attachments/assets/1dfe7471-bb2a-41f3-9d06-fddc6c7c28ec" />


