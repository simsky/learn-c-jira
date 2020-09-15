package com.cshtong.jira;

import java.util.Properties;

import com.atlassian.extras.decoder.v1.Version1LicenseDecoder;
import com.atlassian.extras.decoder.v2.Version2LicenseDecoder;

public class CrackDemo {
	
	/**
	 * {
	 * Description=JIRA (Server): Evaluation, 
	 * CreationDate=2015-07-08, 
	 * jira.LicenseEdition=ENTERPRISE, 
	 * ContactEMail=kaiheye@gmail.com, 
	 * Evaluation=true, jira.LicenseTypeName=COMMERCIAL, 
	 * jira.active=true, 
	 * MaintenanceExpiryDate=2015-08-07, 
	 * licenseVersion=2, 
	 * Organisation=CSHTONG, SEN=SEN-L6079392, 
	 * ServerID=BIZX-EY7T-AK85-FAW7, jira.NumberOfUsers=-1, 
	 * LicenseID=LIDSEN-L6079392, 
	 * LicenseExpiryDate=2015-08-07, 
	 * PurchaseDate=2015-07-08}
	 * @param args
	 */
	
	public static void main(String[] args){
//		String a = "xxx\r\nyy";
//		String[] b = a.split("\\\r\\\n");
//		System.out.println(b.length);
		String str = "AAABLA0ODAoPeNptkMtOwzAQRff+CktsYOHKTSlJK1kiJAZS0qRKAgXExqRDa0icynmI/j1ug8RDXYw0oztz7tWcLGGFZ22BqYMpnVJ7OjrHnp9hiw7HyIc613LbyEqxWZC4+DQF3YE+e5li3omiFXsJeRoOjS8aYPtDQm1CHfQutRiEMgdVA1/JA4ZHGU8WSZBy5FWqEXnD50IW7EPIDezgcl2aaZBXJfoxYI1u4Q8t220hEiUwL57PeeIFbtjrhic76A+KfvcBdL2HWMgYqQaUUDnwz63Uu1+BHZMZxXotlKx7Uy+9zeLopudGbfkKOn67rw2NkSHqHxH47Cp4fiT8yc6Ie+eMybW7tFHKI2aKhBfUnowmFvqObdbDwD+mHM+zaHW+ETX8f+wXTh+MDDAsAhQWO9iaCCKRpOkuTBpbwQP8eswkewIUC01YCOqBnEwL2AiX+pFexXr9yKU=X02f3";
		Version2LicenseDecoder decoder = new Version2LicenseDecoder();
		Properties p = decoder.decode(str);
		System.out.println(p);
	}
}
