package chainOfResponsibility;

import chainOfResponsibility.ICustomerSupport.Orden;

public class Client {

	public static void main(String[] args) {
		Management man = new Management();
		man.soporte(Orden.Infraestructura);
	}

}

/*
(Chain of Responsability) Se tiene un servicio de software puesto 
en producción, cuando elcliente realiza una solicitud a la empresa
 se tiene que si la solicitud es relacionada a infraestructura el
encargado de resolverlo es el DevOps (pide información sobre el error),
 si es de tipo Bug o Mejora elencargado de evaluarlo en el QA 
 (aísla el error), si la petición es de una nueva funcionalidad el
encargado es el Developer (estima la nueva funcionalidad), 
si la petición es relaciona a Costos el encargado son los de Finanzas,
 en cualquier otro caso lo revisa el Support.
 
 
 *
 */
