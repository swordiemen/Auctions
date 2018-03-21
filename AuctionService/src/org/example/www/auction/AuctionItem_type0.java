
/**
 * AuctionItem_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

package org.example.www.auction;

import java.util.Calendar;

/**
 * AuctionItem_type0 bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class AuctionItem_type0 implements org.apache.axis2.databinding.ADBBean {
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AuctionItem_type0) {
			AuctionItem_type0 other = (AuctionItem_type0) obj;
			return other.getItemName().equals(getItemName()) && other.getItemOwnerName().equals(getItemOwnerName());
		}
		return false;
	}
	
	public AuctionItem_type0 deepCopy() {
		AuctionItem_type0 auType = new AuctionItem_type0();
		auType.setItemName(getItemName());
		auType.setDescription(getDescription());
		auType.setItemOwnerName(getItemOwnerName());
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		auType.setEndTime((Calendar) c.clone());
		auType.setMinimumBid(getMinimumBid());
		return auType;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getItemName().hashCode() + getItemOwnerName().hashCode();
	}
	
	/*
	 * This type was generated from the piece of schema that had name =
	 * AuctionItem_type0 Namespace URI = http://www.example.org/Auction/ Namespace
	 * Prefix = ns1
	 */

	/**
	 * field for ItemOwnerName
	 */

	protected java.lang.String localItemOwnerName;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getItemOwnerName() {
		return localItemOwnerName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ItemOwnerName
	 */
	public void setItemOwnerName(java.lang.String param) {

		this.localItemOwnerName = param;

	}

	/**
	 * field for ItemName
	 */

	protected java.lang.String localItemName;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getItemName() {
		return localItemName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ItemName
	 */
	public void setItemName(java.lang.String param) {

		this.localItemName = param;

	}

	/**
	 * field for Description
	 */

	protected java.lang.String localDescription;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDescription() {
		return localDescription;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Description
	 */
	public void setDescription(java.lang.String param) {

		this.localDescription = param;

	}

	/**
	 * field for MinimumBid
	 */

	protected int localMinimumBid;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getMinimumBid() {
		return localMinimumBid;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MinimumBid
	 */
	public void setMinimumBid(int param) {

		this.localMinimumBid = param;

	}

	/**
	 * field for EndTime
	 */

	protected java.util.Calendar localEndTime;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getEndTime() {
		return localEndTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EndTime
	 */
	public void setEndTime(java.util.Calendar param) {

		this.localEndTime = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
			boolean serializeType)
			throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.example.org/Auction/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":AuctionItem_type0", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AuctionItem_type0",
						xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "itemOwnerName", xmlWriter);

		if (localItemOwnerName == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("itemOwnerName cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localItemOwnerName);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "itemName", xmlWriter);

		if (localItemName == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("itemName cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localItemName);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "description", xmlWriter);

		if (localDescription == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");

		} else {

			xmlWriter.writeCharacters(localDescription);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "minimumBid", xmlWriter);

		if (localMinimumBid == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException("minimumBid cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumBid));
		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "endTime", xmlWriter);

		if (localEndTime == null) {
			// write the nil attribute

			throw new org.apache.axis2.databinding.ADBException("endTime cannot be null!!");

		} else {

			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));

		}

		xmlWriter.writeEndElement();

		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://www.example.org/Auction/")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(
						prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to
			// write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName("", "itemOwnerName"));

		if (localItemOwnerName != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemOwnerName));
		} else {
			throw new org.apache.axis2.databinding.ADBException("itemOwnerName cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "itemName"));

		if (localItemName != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemName));
		} else {
			throw new org.apache.axis2.databinding.ADBException("itemName cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "description"));

		if (localDescription != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
		} else {
			throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
		}

		elementList.add(new javax.xml.namespace.QName("", "minimumBid"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumBid));

		elementList.add(new javax.xml.namespace.QName("", "endTime"));

		if (localEndTime != null) {
			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));
		} else {
			throw new org.apache.axis2.databinding.ADBException("endTime cannot be null!!");
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
				attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an element, it
		 * is a complex type and the reader is at the event just after the outer start
		 * element Postcondition: If this object is an element, the reader is positioned
		 * at its end element If this object is a complex type, the reader is positioned
		 * at the end element of its outer element
		 */
		public static AuctionItem_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
			AuctionItem_type0 object = new AuctionItem_type0();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"AuctionItem_type0".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (AuctionItem_type0) org.example.www.auction.ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "itemOwnerName").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "itemOwnerName" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setItemOwnerName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "itemName").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "itemName" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setItemName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "description").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "description" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "minimumBid").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "minimumBid" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setMinimumBid(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("", "endTime").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "endTime" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setEndTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid parameter was
					// passed
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

	public boolean hasExpired() {
		Calendar now = Calendar.getInstance();
		return now.compareTo(getEndTime()) > 0;
	}

}
