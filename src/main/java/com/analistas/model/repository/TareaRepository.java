package com.analistas.model.repository;

//Importamos los List y Los Array;
import java.time.LocalDate;
import java.util.List;

import com.analistas.model.entitis.Tarea;

import java.util.ArrayList;

//Hacemos la Clase:
public class TareaRepository{

	//Hacemos una Lista que tenga nuestro objeto tarea;
	private List<Tarea> tareas;
	
	public TareaRepository() {

		//Creamos el arreglo con las tareas:
		tareas = new ArrayList<>();

		//Creamos la Coneccion Testing que se va a borrar cuando se cree una nueva 
		//Base de Datos

		tareas.add(new Tarea(1, "Hacer las Compras,", "Realizado", LocalDate.parse("2020-05-21")));
	
		
	}


	public void setTareas(List<Tarea> tareas){
		this.tareas = tareas;
	};

	public List<Tarea> getTareas() {
		
		return this.tareas;
		
	}

	public void addTarea(Tarea tarea){
		tareas.add(tarea);
	}

	

}
