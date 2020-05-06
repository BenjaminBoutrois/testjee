

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Utilisateur;
import service.GestionService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Etape 1 : Récupération des paramètres de la requête
		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		
		// Etape 2 : Soumettre les paramètres de la requête à la couche service
		boolean estAutorise = GestionService.authentifier(login, pwd);
		
		// Etape 3 : Réponse à l'utilisateur
		
		RequestDispatcher dispatcher;
		
		if (estAutorise)
		{
			Utilisateur utilisateur = new Utilisateur(login, pwd);
			HttpSession session = request.getSession();
			session.setAttribute("utilisateur", utilisateur);
			dispatcher = request.getRequestDispatcher("accueil.jsp");
		}
		else
			dispatcher = request.getRequestDispatcher("login.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
