/**
 * 
 */
package com.design.patterns.factorycreationalpattern.with;

/**
 * @author wchavez
 *
 */
public class TelemarketingContact implements IContact {

	private String cellPhone;

	public TelemarketingContact(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String callContact() {
		return this.cellPhone + "-CEL";
	}

	@Override
	public String getPhone() {
		return this.cellPhone;
	}

	@Override
	public void setPhone(String phone) {
		this.cellPhone = cellPhone;
	}

}
