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

@WebServlet("/creerEmprunt")
public class EmpruntServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmpruntServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String submit=request.getParameter("submit");
		if(submit!=null) {
			String numApogee=request.getParameter("numApogee");
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String numTel=request.getParameter("numTel");
			String adresseMail=request.getParameter("adresseMail");
			String filiere=request.getParameter("filiere");
			
			String reference=request.getParameter("reference");
			String date=request.getParameter("date");
			String periode=request.getParameter("periode");
			
			if(numApogee.isEmpty() || nom.isEmpty() || numTel.isEmpty() || reference.isEmpty() || date.isEmpty() || periode.isEmpty()) {
				request.setAttribute("erreur", "Il faut remplir les champs oblegatoire !!");
				this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEmprunt.jsp").forward(request, response);
			}else {
				if(Long.parseLong(numApogee)<0) {
					request.setAttribute("erreur", "Le contenu de <b>Numero appogee</b> est non approprié!!");
					this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEmprunt.jsp").forward(request, response);
				}else if(Integer.parseInt(periode)!=7 && Integer.parseInt(periode)!=15) {
					request.setAttribute("erreur", "La <b>Periode</b>  doit etre 7 jours ou 15 jours!!");
					this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEmprunt.jsp").forward(request, response);
				}else {
					Etudiant etudiant=new Etudiant(numApogee,nom,prenom,numTel,adresseMail,filiere);
					request.setAttribute("etudiant", etudiant);
					
					Emprunt emprunt=new Emprunt(reference,date,Integer.parseInt(periode));
					request.setAttribute("emprunt", emprunt);
					
					this.getServletContext().getRequestDispatcher("/WEB-INF/view/afficherEmprunt.jsp").forward(request, response);
				}
			}
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/view/creerEmprunt.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
