/**
 * 
 */
package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

/**
 * @author chamerling
 *
 */
@Entity
public class JUG extends Model {
	
	public long registeredAt;
	
	public String name;
	
	public String description;
	
	public String city;
	
	public String country;
	
	public String longitude;
	
	public String latitude;
	
	public String website;
	
	public String twitter;
	
	public String email;
	
	public String api;
	
	public String apiVersion;
	
	public static JUG getLast() {
		return JUG.find("order by registeredAt DESC").first();
	}

}
