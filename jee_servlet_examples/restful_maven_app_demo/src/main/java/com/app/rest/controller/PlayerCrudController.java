package com.app.rest.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.rest.model.Player;
import com.google.gson.Gson;

/**
 * Servlet implementation class PlayerCrudController
 */
public class PlayerCrudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static Map<Integer, Player> playerMap=new LinkedHashMap<>();
	private static int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlayerCrudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson=new Gson();
		int id=Integer.parseInt(request.getParameter("id"));
		PrintWriter out=response.getWriter();
		if(playerMap.containsKey(id)) {
			out.print(gson.toJson(playerMap.get(id)));
		}else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.print("No Player found with id = "+id);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson=new Gson();
		Player player=gson.fromJson(request.getReader(), Player.class);//which converts JSON to MODEL class
		player.setId(++count);
		playerMap.put(player.getId(), player);
		PrintWriter out=response.getWriter();
		out.print(gson.toJson(player));//conversion from Model to JSON
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson=new Gson();
		Player player=gson.fromJson(request.getReader(), Player.class);
		PrintWriter out=response.getWriter();
		if(playerMap.containsKey(player.getId())) {
			playerMap.put(player.getId(), player);
			out.print(gson.toJson(playerMap.get(player.getId())));
		}else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.print("No Player found to be updated with id = "+player.getId());
		}
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson=new Gson();
		int id=Integer.parseInt(request.getParameter("id"));
		PrintWriter out=response.getWriter();
		if(playerMap.containsKey(id)) {
			//out.print(gson.toJson(playerMap.get(id)));
			playerMap.remove(id);
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
		}else {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			out.print("No Player found with id = "+id);
		}
	}

}
