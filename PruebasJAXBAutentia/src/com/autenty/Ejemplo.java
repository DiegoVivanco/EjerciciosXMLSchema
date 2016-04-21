package com.autenty;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Ejemplo {

	public static void main(String[] args) {
		try {
			final JAXBContext jc = JAXBContext.newInstance(Libro.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
			final JAXBElement<Libro> menuElement = (JAXBElement<Libro>)u.unmarshal(Ejemplo.class.getResourceAsStream("/autentia-books.xml"));
			System.out.println("Nombre: " + menuElement.getValue().getNombre());
			System.out.println("ISBN: " + menuElement.getValue().getNewElement());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}

