package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

	public static void index() {
		// get last registered JUG
		JUG jug = JUG.getLast();
		
		// get next events
		List<Event> nextEvents = null;
		
		// get last news
		List<News> lastNews = null;
		
		render(jug, nextEvents, lastNews);
	}

	public static void jugs() {
		List<JUG> jugs = JUG.findAll();
		render(jugs);
	}
	
	public static void jug(long id) {
		JUG jug = JUG.findById(id);
		if (jug == null) {
			flash.error("No jug has been found with the given ID");
			index();
		}
		render(jug);
	}


}