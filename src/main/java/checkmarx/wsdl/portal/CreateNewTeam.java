//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentTeamID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newTeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ldapGroupMappings" type="{http://Checkmarx.com}ArrayOfCxWSLdapGroupMapping" minOccurs="0"/>
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
    "sessionID",
    "parentTeamID",
    "newTeamName",
    "ldapGroupMappings"
})
@XmlRootElement(name = "CreateNewTeam")
public class CreateNewTeam {

    protected String sessionID;
    protected String parentTeamID;
    protected String newTeamName;
    protected ArrayOfCxWSLdapGroupMapping ldapGroupMappings;

    public CreateNewTeam() { }

    public CreateNewTeam(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * Gets the value of the sessionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the parentTeamID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentTeamID() {
        return parentTeamID;
    }

    /**
     * Sets the value of the parentTeamID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentTeamID(String value) {
        this.parentTeamID = value;
    }

    /**
     * Gets the value of the newTeamName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNewTeamName() {
        return newTeamName;
    }

    /**
     * Sets the value of the newTeamName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNewTeamName(String value) {
        this.newTeamName = value;
    }

    /**
     * Gets the value of the ldapGroupMappings property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *
     */
    public ArrayOfCxWSLdapGroupMapping getLdapGroupMappings() {
        return ldapGroupMappings;
    }

    /**
     * Sets the value of the ldapGroupMappings property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *
     */
    public void setLdapGroupMappings(ArrayOfCxWSLdapGroupMapping value) {
        this.ldapGroupMappings = value;
    }

}
