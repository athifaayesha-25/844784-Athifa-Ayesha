

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
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
	protected void doPost(HttpServletRequest request1, HttpServletResponse response1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response1.getWriter();
		String user=request1.getParameter("u1");
		String pass=request1.getParameter("p1");
		String gen1=request1.getParameter("r1");
		out.println("<h1>Username:"+user+ "Password:"+pass+ " "+"Gender: "+gen1);
		String[] lang1=request1.getParameterValues("c1");
		for(int i=0;i<lang1.length;i++)
		{
			out.println("<h1>Language: "+lang1[i]);
		}
		String[] qual1=request1.getParameterValues("s1");
		for(int i=0;i<qual1.length;i++){
			out.println("<h1>Qualification:" +qual1[i]);
	}

}
}
