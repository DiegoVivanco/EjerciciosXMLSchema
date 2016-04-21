//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.04.21 a las 12:22:42 PM CEST 
//


package biciPalma_JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Estacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Estacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.example.org/estacion}idtype"/&gt;
 *         &lt;element name="direccion" type="{http://www.example.org/estacion}direcciontype"/&gt;
 *         &lt;element name="numeroAnclajes" type="{http://www.example.org/estacion}numeroAnclajestype"/&gt;
 *         &lt;element name="anclajes" type="{http://www.example.org/estacion}anclajestype"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estacion", propOrder = {
    "id",
    "direccion",
    "numeroAnclajes",
    "anclajes"
})
public class Estacion {

    @XmlElement(required = true)
    protected String id;
    protected int direccion;
    protected int numeroAnclajes;
    @XmlElement(required = true)
    protected Anclajestype anclajes;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     */
    public int getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     */
    public void setDireccion(int value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAnclajes.
     * 
     */
    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    /**
     * Define el valor de la propiedad numeroAnclajes.
     * 
     */
    public void setNumeroAnclajes(int value) {
        this.numeroAnclajes = value;
    }

    /**
     * Obtiene el valor de la propiedad anclajes.
     * 
     * @return
     *     possible object is
     *     {@link Anclajestype }
     *     
     */
    public Anclajestype getAnclajes() {
        return anclajes;
    }

    /**
     * Define el valor de la propiedad anclajes.
     * 
     * @param value
     *     allowed object is
     *     {@link Anclajestype }
     *     
     */
    public void setAnclajes(Anclajestype value) {
        this.anclajes = value;
    }

}
