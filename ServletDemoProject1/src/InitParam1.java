

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParam1
 */
public class InitParam1 extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.print("<h1>Init Parameters Names are: ");
		//Enumeration enumeration=getServletConfig().getInitParameterNames();
		Enumeration enumeration=getServletContext().getInitParameterNames();
		while(enumeration.hasMoreElements()){
			out.print(enumeration.nextElement()+" ");
		}
		//ServletConfig con1=getServletConfig();
		ServletContext con1=getServletContext();
		out.println("<h1>Company:"+con1.getInitParameter("Company"));
		out.println("Venue:"+con1.getInitParameter("Venue"));
		out.println("Training:"+con1.getInitParameter("Training"));
		out.println("<h1>Company:"+getServletConfig().getInitParameter("Company"));
		out.println("Venue:"+getServletConfig().getInitParameter("Venue"));
		out.println("Training:"+getServletConfig().getInitParameter("Training"));
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
