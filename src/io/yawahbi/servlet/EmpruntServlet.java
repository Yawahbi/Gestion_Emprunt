package io.yawahbi.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.yawahbi.bean.Emprunt;
import io.yawahbi.bean.Etudiant;
import io.yawahbi.model.CreerEmprunt;
import io.yawahbi.model.CreerEtudiant;

@WebServlet("/creerEmprunt")
public class EmpruntServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public static final String ATT_ETUDIANT = "etudiant";
    public static final String ATT_EMPRUNT = "emprunt";
    public static final String ATT_FORM = "form";
    public static final String ATT_FORM_ETUDIANT = "formEtudiant";
    public static final String ATT_FORM_EMPRUNT = "formEmprunt";

    public EmpruntServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEmprunt.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CreerEtudiant formEtudiant= new CreerEtudiant();
		CreerEmprunt formEmprunt= new CreerEmprunt();
		
		Etudiant etudiant= formEtudiant.creer(request);
		Emprunt emprunt= formEmprunt.creer(request);
		
		request.setAttribute( ATT_FORM_ETUDIANT, formEtudiant );
		request.setAttribute( ATT_FORM_EMPRUNT, formEmprunt );
        request.setAttribute( ATT_ETUDIANT, etudiant );
        request.setAttribute( ATT_EMPRUNT, emprunt );
		if(!(formEtudiant.getErreurs().isEmpty() && formEmprunt.getErreurs().isEmpty())) {
//			en cas d'erreurs de la creation
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEmprunt.jsp").forward(request, response);
		}else {
//			en cas succes de la creation
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/afficherEmprunt.jsp").forward(request, response);
		}
		doGet(request, response);
	}

}
