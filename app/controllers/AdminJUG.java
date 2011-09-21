package controllers;

import models.JUG;
import play.mvc.With;

@CRUD.For(JUG.class)
@With(Secure.class)
public class AdminJUG extends CRUD {

}
