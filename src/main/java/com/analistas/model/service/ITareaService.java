package com.analistas.model.service;

import java.util.List;

import com.analistas.model.entitis.Tarea;

public interface ITareaService {

	//Ya nos da la pauta para cpor crear el codigo
	public List<Tarea> buscarTodo();

	public Tarea buscarPorId(Integer id);

	public void guardar(Tarea tarea);

	public void borrar(Integer id); 

	
}
