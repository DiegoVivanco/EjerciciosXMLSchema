package biciPalma_JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import biciPalma_JAXB.Estacion;;
public class SalidaObjeto_biciPalma {
	public static void main(String[] args) {	
		try {
			final JAXBContext jc = JAXBContext.newInstance(Estacion.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
	        final JAXBElement<Estacion> menuElement = (JAXBElement<Estacion>)u.unmarshal(SalidaObjeto_biciPalma.class.getResourceAsStream("/estacion.xml"));
			System.out.println("Estacion: " + menuElement.getValue().getId());
			System.out.println("Direccion: " + menuElement.getValue().getDireccion());
			System.out.println("Numero de anclajes: " + menuElement.getValue().getNumeroAnclajes());
			System.out.println("Bicis y anclajes: " + menuElement.getValue().getAnclajes());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}