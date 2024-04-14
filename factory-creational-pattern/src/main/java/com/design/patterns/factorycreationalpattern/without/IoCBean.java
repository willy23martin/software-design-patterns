/**
 * 
 */
package com.design.patterns.factorycreationalpattern.without;

/**
 * @author William Martín Chávez González
 * Santiago de Cali, 26 de abril de 2020
 */
public class IoCBean {

	/** The contact related to this Bean */
	private IContact contact;
	
	/**The Bean´s constructor method
	 * Note that the contact is INJECTED.
	 * */
	public IoCBean(IContact contact) {
		this.contact = contact;
	}
	
	/**
	 * Calls the contact INJECTED by parameter in its 
	 * constructor method
	 * @return - the cellPhone or the telePhone of the INJECTED contact.
	 */
	public String callContact() {
		return this.contact.callContact();
	}

}
