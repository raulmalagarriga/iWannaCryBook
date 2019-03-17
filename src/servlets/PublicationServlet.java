package servlets;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import utility.StandardResponse;

/**
 * Servlet implementation class PublicationServlet
 */
@WebServlet("/PublicationServlet")
@MultipartConfig
public class PublicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper objMapper = new ObjectMapper();
    	@SuppressWarnings("rawtypes")
		StandardResponse<?> resp = new StandardResponse();
		HttpSession session = request.getSession();
		PreparedStatement stmt = null;
		Integer option = Integer.parseInt(request.getParameter("option"));
		switch(option) {
		case 1:
			break;
		case 2:
			break;
		case 3:	
			break;
		default:
			System.out.println("Error Case");
			resp.setStatus(500);
    		resp.setMessage("Forbiden. Reload The Page.");
    		System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objMapper.writeValueAsString(resp)));
        	response.getWriter().print(objMapper.writeValueAsString(resp));
			break;
		}
		doGet(request, response);
	}

}
