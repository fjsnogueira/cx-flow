//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.06.07 at 11:08:45 PM EST
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
 *         &lt;element name="CreateNewPresetResult" type="{http://Checkmarx.com}CxWSResponsePresetDetails" minOccurs="0"/>
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
    "createNewPresetResult"
})
@XmlRootElement(name = "CreateNewPresetResponse")
public class CreateNewPresetResponse {

    @XmlElement(name = "CreateNewPresetResult")
    protected CxWSResponsePresetDetails createNewPresetResult;

    /**
     * Gets the value of the createNewPresetResult property.
     *
     * @return
     *     possible object is
     *     {@link CxWSResponsePresetDetails }
     *
     */
    public CxWSResponsePresetDetails getCreateNewPresetResult() {
        return createNewPresetResult;
    }

    /**
     * Sets the value of the createNewPresetResult property.
     *
     * @param value
     *     allowed object is
     *     {@link CxWSResponsePresetDetails }
     *
     */
    public void setCreateNewPresetResult(CxWSResponsePresetDetails value) {
        this.createNewPresetResult = value;
    }

}
