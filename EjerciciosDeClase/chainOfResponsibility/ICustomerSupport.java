package chainOfResponsibility;

public interface ICustomerSupport {
	enum Orden {
		NuevaFuncionalidad,
		Bugs,
		Costos,
		Infraestructura
	}
	void setNext(ICustomerSupport handler);
    ICustomerSupport next(); 
    void soporte(Orden criteria); 
}
