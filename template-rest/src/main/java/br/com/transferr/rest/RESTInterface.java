package br.com.transferr.rest;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.transferr.core.model.Entidade;

public interface RESTInterface <T extends Entidade> {
	
	public Response doGet(@PathParam("id") long id);
	public Response save(T entity);
	public Response delete(@PathParam("id") long id);

}
