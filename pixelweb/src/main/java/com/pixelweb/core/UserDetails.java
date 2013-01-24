/**
 * 
 */
package com.pixelweb.core;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author yesh
 *
 */
@Entity
public class UserDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	Long uId;	
	private String uFName;	
	private String uLName;
	
	
	@Override
	public String toString() {
		return "UserDetails [uId=" + uId + ", uFName=" + uFName + ", uLName="
				+ uLName + "]";
	}
	
	
	

}
