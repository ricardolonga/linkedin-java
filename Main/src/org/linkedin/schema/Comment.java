/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package org.linkedin.schema;



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
 *         &lt;element ref="{}creation-timestamp"/>
 *         &lt;element ref="{}creator"/>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}relation-to-viewer"/>
 *         &lt;element ref="{}text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Comment
    extends SchemaEntity
{


    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getCreationTimestamp();

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCreationTimestamp(Long value);

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Creator }
     *     
     */
    Creator getCreator();

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creator }
     *     
     */
    void setCreator(Creator value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the relationToViewer property.
     * 
     * @return
     *     possible object is
     *     {@link RelationToViewer }
     *     
     */
    RelationToViewer getRelationToViewer();

    /**
     * Sets the value of the relationToViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationToViewer }
     *     
     */
    void setRelationToViewer(RelationToViewer value);

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getText();

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setText(String value);

}
