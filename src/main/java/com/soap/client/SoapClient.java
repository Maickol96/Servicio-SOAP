package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SoapClient extends WebServiceGatewaySupport {
//Aca es donde nosostros empezamos a definir nuestros metodos

    /**
     * Metodo que se encarga de sumar 2 numero
     *
     * @param numberA
     * @param numberB
     * @return addResponse
     */

    public AddResponse getAddResponse(int numberA, int numberB) {

        //Creamos el objeto con el cual vamos a hacer la solictud
        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

//Ponemos el metodo que se va ejecutar -> ponemos la Url del WSDL, seguido de nombre del metodo que vamos a ejecutar en este caso Add
        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

//Recibimos la respuesta, espesificamos la direccipn donde vamos a consumir el servicio, se encuentra en el location en el WSDL
        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

        //Retornamos la respuesta
        return addResponse;
    }

    /**
     * Metodo que se encarga de restar 2 numeros
     *
     * @param numberA
     * @param numberB
     * @return subtractResponse
     */
    public SubtractResponse getSubtractResponse(int numberA, int numberB) {

        Subtract subtractRequest = new Subtract();
        //Setemos los numeros
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest, soapActionCallback);

        return subtractResponse;

    }

    /**
     * Metodo encargado de multiplicar 2 numeros
     *
     * @param numberA
     * @param numberB
     * @return multiplyResponse
     */

    public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {

        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numberA);
        multiplyRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiplyRequest, soapActionCallback);

        return multiplyResponse;
    }

    /**
     * Metodo encargado de Dividir 2 numereos
     * @param numberA
     * @param numberB
     * @return divideResponse
     */

    public DivideResponse getDivideResponse(int numberA, int numberB) {

        Divide divideRequest = new Divide();
        divideRequest.setIntA(numberA);
        divideRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);

        return divideResponse;
    }

}
