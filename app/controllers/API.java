/**
 * 
 */
package controllers;

import java.util.List;

import models.JUG;
import play.mvc.Controller;

/**
 * @author chamerling
 * 
 */
public class API extends Controller {

	/**
	 * Get all the JUGs
	 */
	public static void repository() {
		List<JUG> jugs = JUG.findAll();
		renderJSON(jugs);
	}

}
