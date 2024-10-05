Pasos para poder correr el proyecto:

*1)Clonar el repositorio*
*2)Tener Mysql workbench instalado en la computadora*
*3)Crear una base de datos vacia, que se llame db_futbol*
*4)Dentro del proyecto, ir al archivo application.properties y editar el usuario y contraseña y la conexion de mysql (datasource):*

spring.datasource.url=spring.datasource.url=jdbc:mysql://localhost:3306/db_futbol
spring.datasource.username=(usuario)
spring.datasource.password=(contraseña)
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.port=8080
spring.jpa.properties.hibernate.format_sql=true

*5)Con estos cambios, correr el proyecto para que se cree la bd local, luego cerrar la ejecucion del proyecto*

*6)Cambiar de nuevo el application properties de nuevo, ya con una conexion de docker (datasource)*

spring.datasource.url=jdbc:mysql://host.docker.internal:3306/db_futbol
spring.datasource.username=(usuario)
spring.datasource.password=(contraseña)
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.port=8080
spring.jpa.properties.hibernate.format_sql=true

*7)Ya con estos cambios, correr el: Docker compose up*
