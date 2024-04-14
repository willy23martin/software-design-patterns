/**
 * 
 */
package com.design.patterns.factorycreationalpattern.with;

/**
 * @author wchavez
 *
 */
public class RegularContact implements IContact {
	
	private String fixedPhone;

	public RegularContact(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	@Override
	public String callContact() {
		return fixedPhone + "-TEL";
	}

	@Override
	public String getPhone() {
		return this.fixedPhone;
	}

	@Override
	public void setPhone(String phone) {
		this.fixedPhone = phone;
	}

}
