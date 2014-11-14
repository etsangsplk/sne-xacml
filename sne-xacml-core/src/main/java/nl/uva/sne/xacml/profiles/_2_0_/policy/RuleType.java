//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.01 at 04:14:23 PM CEST 
//


package nl.uva.sne.xacml.profiles._2_0_.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Description" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Target" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}Condition" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RuleId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Effect" use="required" type="{urn:oasis:names:tc:xacml:2.0:policy:schema:os}EffectType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleType", propOrder = {
        "description",
        "target",
        "condition"
})
public class RuleType {

    @XmlElement(name = "Condition")
    protected ConditionType condition;
    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "Effect", required = true)
    protected EffectType effect;
    @XmlAttribute(name = "RuleId", required = true)
    protected String ruleId;
    @XmlElement(name = "Target")
    protected TargetType target;

    /**
     * Gets the value of the condition property.
     *
     * @return possible object is {@link ConditionType }
     */
    public ConditionType getCondition() {
        return condition;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the value of the effect property.
     *
     * @return possible object is {@link EffectType }
     */
    public EffectType getEffect() {
        return effect;
    }

    /**
     * Gets the value of the ruleId property.
     *
     * @return possible object is {@link String }
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Gets the value of the target property.
     *
     * @return possible object is {@link TargetType }
     */
    public TargetType getTarget() {
        return target;
    }

    /**
     * Sets the value of the condition property.
     *
     * @param value allowed object is {@link ConditionType }
     */
    public void setCondition(ConditionType value) {
        this.condition = value;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Sets the value of the effect property.
     *
     * @param value allowed object is {@link EffectType }
     */
    public void setEffect(EffectType value) {
        this.effect = value;
    }

    /**
     * Sets the value of the ruleId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Sets the value of the target property.
     *
     * @param value allowed object is {@link TargetType }
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

}