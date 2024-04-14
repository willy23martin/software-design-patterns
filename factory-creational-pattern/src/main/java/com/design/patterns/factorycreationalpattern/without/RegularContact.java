/**
 * 
 */
package com.design.patterns.factorycreationalpattern.without;

/**
 * @author wchavez
 *
 */
public class RegularContact implements IContact{

	private String fixedPhone;
	
	/**
	 * 
	 */
	public RegularContact(String fixedPhone) {
		this.fixedPhone = fixedPhone; 
	}

	@Override
	public String callContact() {
		return fixedPhone + "-TEL";
	}

}
