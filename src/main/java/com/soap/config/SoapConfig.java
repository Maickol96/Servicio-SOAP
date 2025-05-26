package com.soap.config;

import com.soap.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    //Esta configuración se usa para convertir lo que enviamos en clases Java a XML
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.wsdl");
        return marshaller;
    }

    @Bean
    //Declaramos nuestro cliente
    public SoapClient getSoapClient(Jaxb2Marshaller marshaller) {
        SoapClient soapClient = new SoapClient();
        soapClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");//La ruta del servicio que vamos a consumir
        soapClient.setMarshaller(marshaller);//configuramos la serializacion
        soapClient.setUnmarshaller(marshaller);//Configuramos la deserializacion

        return soapClient;
    }

}
