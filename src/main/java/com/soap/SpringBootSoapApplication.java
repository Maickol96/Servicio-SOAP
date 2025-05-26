package com.soap;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapApplication {

// Creamos logger para poder imprimir el resultado
//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}
// Configuramos para probar
//	@Bean
//	CommandLineRunner init(SoapClient soapClient) {
//		return args -> {
//		//Expresion lamda
//
//			//SoapClient va a llamar la metodo getAddResponse y va e ejecutar el proceso
//			AddResponse addResponse = soapClient.getAddResponse(4 , 4);
//
//			//Imprimimos el resultado
//			LOGGER.info("El resultado de la suma de los numeros {} y {} es: {}", 4, 4, addResponse.getAddResult());
//
//		};
//	}
}
