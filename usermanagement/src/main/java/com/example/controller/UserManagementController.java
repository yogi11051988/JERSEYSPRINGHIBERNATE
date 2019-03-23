package com.example.controller;

/**
 * 
 * @author Yogesh potdar
 *
 */

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.exceptionHandlerUtility.ExceptionHandler;
import com.example.model.UserModel;
import com.example.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class UserManagementController {	
	
	//Logger 
	
	Logger logger = LoggerFactory.getLogger(UserManagementController.class);
	//Service layer variable ref
	public IService service;
		
	/**
	 * 
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@POST
	@Path("user.json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response savePaymentData(UserModel model) throws Exception {
		logger.info("Save user from controller started");
        try {
		service.save(model);
		logger.info("controller save completed");
		return Response.status(200).build();
        }catch(Exception ex) {
        	logger.error("Exception save method with :"+ex.getMessage());
    		throw new ExceptionHandler(ex.getMessage());
        }
	}

    /**
     *
     * @param service
     */
	public void setService(IService service) {
		this.service = service;
	}

}