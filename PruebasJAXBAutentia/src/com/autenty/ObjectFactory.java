//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.21 a las 10:04:41 AM CEST 
//


package com.autenty;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.autenty package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewElement_QNAME = new QName("http://www.example.org/autentia-schema", "NewElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.autenty
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Libro }
     * 
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Libro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/autentia-schema", name = "NewElement")
    public JAXBElement<Libro> createNewElement(Libro value) {
        return new JAXBElement<Libro>(_NewElement_QNAME, Libro.class, null, value);
    }

}
