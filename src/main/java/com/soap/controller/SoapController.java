package com.soap.controller;

import com.soap.client.SoapClient;
import com.soap.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SoapController {

    //Inyectamos
    @Autowired
    private SoapClient soapClient;

    //Mertodo
    @PostMapping ("/sumar")
    //Con esto decimos a Spring Boot que vamos a recibir estos valores como parametros de la petición
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {

        //Se agrega este Map para que me de la respuesta como Json
        Map<String, Integer> response = new HashMap<>();

        //vamos recibir estos numeros mediante una peticón y los vamos a sumar
        //Obtenemos la respuesta de la suma del numeroA y numeroB
        AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);

        //Este response hace parte de Map para la respuesta
        response.put("resultado", addResponse.getAddResult());

        //Retornar la respuesta
        return ResponseEntity.ok().body(response);
    }

    //Metodo para restar
    @PostMapping("/restar")
    public ResponseEntity<?> sumar(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);

        response.put("resultado", subtractResponse.getSubtractResult());

        return ResponseEntity.ok().body(response);
    }

    //Metodo para multiplicar
    @PostMapping("/multiplicar")
    public ResponseEntity<?> multiplicar(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);
        response.put("resultado", multiplyResponse.getMultiplyResult());
            return ResponseEntity.ok().body(response);
    }
    //Metodo para dividir
    @PostMapping("/dividir")
    public ResponseEntity<?> dividir(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();

        DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);
        response.put("resultado", divideResponse.getDivideResult());
        return ResponseEntity.ok().body(response);
    }
}
