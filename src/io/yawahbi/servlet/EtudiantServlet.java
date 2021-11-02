package io.yawahbi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.yawahbi.bean.Etudiant;
import io.yawahbi.model.CreerEtudiant;

@WebServlet("/creerEtudiant")
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public static final String ATT_USER = "etudiant";
    public static final String ATT_FORM = "form";

    public EtudiantServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEtudiant.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreerEtudiant form= new CreerEtudiant();
		
		Etudiant etudiant= form.creer(request);
		
		request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, etudiant );
		if(!form.getErreurs().isEmpty()) {
//			en cas d'erreurs de la creation
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEtudiant.jsp").forward(request, response);
		}else {
//			en cas succes de la creation
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/afficherEtudiant.jsp").forward(request, response);
		}
	}

}
