
package org.datacontract.schemas._2004._07.common_payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLINEITEM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLINEITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LINEITEM" type="{http://schemas.datacontract.org/2004/07/Common.Payment.Common}LINEITEM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLINEITEM", propOrder = {
    "lineitem"
})
public class ArrayOfLINEITEM {

    @XmlElement(name = "LINEITEM", nillable = true)
    protected List<LINEITEM> lineitem;

    /**
     * Gets the value of the lineitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLINEITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LINEITEM }
     * 
     * 
     */
    public List<LINEITEM> getLINEITEM() {
        if (lineitem == null) {
            lineitem = new ArrayList<LINEITEM>();
        }
        return this.lineitem;
    }

}
