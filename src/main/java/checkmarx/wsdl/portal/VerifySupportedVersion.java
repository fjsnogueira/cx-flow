//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientType" type="{http://Checkmarx.com}CxClientType"/>
 *         &lt;element name="clientVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APIVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientType",
    "clientVersion",
    "apiVersion"
})
@XmlRootElement(name = "VerifySupportedVersion")
public class VerifySupportedVersion {

    @XmlElement(required = true)
    protected CxClientType clientType;
    protected String clientVersion;
    @XmlElement(name = "APIVersion")
    protected String apiVersion;

    /**
     * Gets the value of the clientType property.
     *
     * @return
     *     possible object is
     *     {@link CxClientType }
     *
     */
    public CxClientType getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     *
     * @param value
     *     allowed object is
     *     {@link CxClientType }
     *
     */
    public void setClientType(CxClientType value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the clientVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Sets the value of the clientVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

    /**
     * Gets the value of the apiVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAPIVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAPIVersion(String value) {
        this.apiVersion = value;
    }

}
