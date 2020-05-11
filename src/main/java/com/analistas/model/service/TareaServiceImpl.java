package com.analistas.model.service;

import com.analistas.model.entitis.Tarea;
import com.analistas.model.repository.TareaRepository;

import java.util.List;

public class TareaServiceImpl implements ITareaService {


	//Ya nos da la pauta para cpor crear el codigo

	//Este repositor crea la lista con lso tres clientes
	TareaRepository repo = new TareaRepository();

	public List<Tarea> buscarTodo(){

		return repo.getTareas();
	
	};

	public Tarea buscarPorId(Integer id){

		return null;
	
	};

	public void guardar(Tarea tarea){
	
		repo.addTarea(tarea);

	};

	public void borrar(Integer id){

		
	}; 
	
}
