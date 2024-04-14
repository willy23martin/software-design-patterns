/**
 * 
 */
package com.design.patterns.factorycreationalpattern.without;

/**
 * @author wchavez
 *
 */
public class TelemarketingContact implements IContact{

	private String cellPhone;
	
	public TelemarketingContact(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String callContact() {
		return cellPhone + "-CEL";
	}

}
