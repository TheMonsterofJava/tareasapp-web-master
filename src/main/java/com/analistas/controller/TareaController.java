package com.analistas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.analistas.model.entitis.Tarea;
import com.analistas.model.service.ITareaService;


@Controller
@RequestMapping({"", "/tareas"})
public class TareaController {

	//Para que nuetra clase se vuelva u controlador:
	
	
		
	@Autowired
	ITareaService tareaService;
	List<Tarea> tareas;
		
		@GetMapping({"", "/list"})
		public String listar(Model m) {
			
			tareas = tareaService.buscarTodo();
			
			m.addAttribute("lista","Listado De Tareas");
			m.addAttribute("tareas", tareas);
			
			return "tareas/list";
			
		}
		
	
	
	
}
