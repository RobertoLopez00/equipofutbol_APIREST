Proyecto: DB Fútbol
Descripción
Este proyecto es una aplicación para gestionar datos relacionados con el fútbol. El objetivo es administrar la base de datos db_futbol usando MySQL, tanto en un entorno local como en Docker.

Pasos para Ejecutar el Proyecto
1. Clonar el Repositorio
bash
Copiar código
git clone https://github.com/usuario/nombre-del-repo.git
cd nombre-del-repo
2. Instalar MySQL Workbench
Asegúrate de tener MySQL Workbench instalado en tu computadora.

3. Crear la Base de Datos
Crea una base de datos vacía en MySQL con el siguiente nombre:

sql
Copiar código
CREATE DATABASE db_futbol;
4. Configurar el Archivo application.properties para Entorno Local
Dentro del proyecto, navega al archivo application.properties y edita los siguientes campos para configurar la conexión local a MySQL:

properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/db_futbol
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.port=8080
spring.jpa.properties.hibernate.format_sql=true
Nota: Reemplaza tu_usuario y tu_contraseña con las credenciales de tu base de datos MySQL local.

5. Ejecutar el Proyecto en Entorno Local
Con estos cambios, corre el proyecto para que se cree la base de datos en tu entorno local.

bash
Copiar código
./mvnw spring-boot:run
6. Cambiar la Configuración para Docker
Una vez que la base de datos esté configurada en local, cambia de nuevo el archivo application.properties para que use Docker. Asegúrate de que la conexión apunte a Docker:

properties
Copiar código
spring.datasource.url=jdbc:mysql://host.docker.internal:3306/db_futbol
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.port=8080
spring.jpa.properties.hibernate.format_sql=true
Nota: Reemplaza tu_usuario y tu_contraseña nuevamente con las credenciales correctas.

7. Ejecutar Docker Compose
Con la configuración de Docker, ejecuta el siguiente comando para iniciar el entorno:

bash
Copiar código
docker-compose up
Contribuir
Si deseas contribuir a este proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
Realiza tus cambios y haz commit (git commit -m 'Añadir nueva característica').
Haz push a tu rama (git push origin feature/nueva-caracteristica).
Abre un Pull Request.
Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.
