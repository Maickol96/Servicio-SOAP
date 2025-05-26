# Servicio SOAP con Spring Boot 🚀

Proyecto que consume un servicio web SOAP (Simple Object Access Protocol) para realizar operaciones matemáticas básicas (sumar, restar, multiplicar, dividir) utilizando el WSDL público de [DNEOnline Calculator](http://www.dneonline.com/calculator.asmx?WSDL).

## Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Web Services (SOAP)**
- **Lombok** (para reducir código boilerplate)
- **Postman** (para pruebas de endpoints)

## Configuración del Proyecto ⚙️

### Requisitos
- JDK 17
- Maven 3.9+
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Instalación
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Maickol96/Servicio-SOAP.git
   
## Endpoints REST 📡

| Método HTTP | Endpoint      | Parámetros               | Ejemplo de Uso                    |
|-------------|---------------|--------------------------|------------------------------------|
| `POST`      | `/sumar`      | `numberA`, `numberB`     | `/sumar?numberA=5&numberB=3`      |
| `POST`      | `/restar`     | `numberA`, `numberB`     | `/restar?numberA=10&numberB=4`    |
| `POST`      | `/multiplicar`| `numberA`, `numberB`     | `/multiplicar?numberA=6&numberB=7`|
| `POST`      | `/dividir`    | `numberA`, `numberB`     | `/dividir?numberA=20&numberB=5`   |

## Pruebas 🧪
- **mporta docs/postman_collection.json en Postman**
- **jecuta requests contra http://localhost:8080**


## Estructura 📂
```text
src/
├── main/
│   ├── java/com/soap/
│   │   ├── client/       # SOAP client configuration
│   │   ├── controller/   # REST controllers
│   │   └── wsdl/         # Generated WSDL classes
│   └── resources/        # Configuration files
└── test/                 # Unit tests                 # Pruebas



