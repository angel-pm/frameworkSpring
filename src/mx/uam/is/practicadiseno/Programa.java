package mx.uam.is.practicadiseno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;
import mx.uam.is.practicadiseno.vista.Ventana;

public class Programa {

	public static void main(String[] args) {
		
		//carga el aplication context
		new ClassPathXmlApplicationContext("mx/uam/is/practicadiseno/applicationContext.xml");
		
	}

}
