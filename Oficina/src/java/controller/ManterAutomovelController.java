package controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.AutomovelDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Automovel;

/**
 *
 * @author Marco
 */
public class ManterAutomovelController extends HttpServlet {

    private Automovel automovel;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String acao = request.getParameter("acao");
        if (acao.equals("prepararOperacao")) {
            prepararOperacao(request, response);
        }
        if (acao.equals("confirmarOperacao")) {
            confirmarOperacao(request, response);
        }

    }

    public void prepararOperacao(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try {
            String operacao = request.getParameter("operacao");
            request.setAttribute("operacao", operacao);
            if (!operacao.equals("Incluir")) {
                int idAutomovel = Integer.parseInt(request.getParameter("idAutomovel"));
                automovel = AutomovelDAO.getInstance().getAutomovel(idAutomovel);
                request.setAttribute("automovel", automovel);
            }
            RequestDispatcher view = request.getRequestDispatcher("/manterAutomovel.jsp");
            view.forward(request, response);
        } catch (ServletException e) {
            throw e;
        } catch (IOException e) {
            throw new ServletException(e);
        }

    }

    public void confirmarOperacao(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int idAutomovel = Integer.parseInt(request.getParameter("txtIdAutomovel"));
        String cor = request.getParameter("txtCor");
        String nome = request.getParameter("txtNome");
        String dataTerminoProjeto = request.getParameter("txtDataTerminoProjeto");
        float pesoCarro = Float.parseFloat(request.getParameter("txtPesoCarro"));
        float pesoChassi = Float.parseFloat(request.getParameter("txtPesoChassi"));
        float custoTotal = Float.parseFloat(request.getParameter("txtCustoTotal"));
         Automovel automovel = new Automovel(idAutomovel, cor, nome, dataTerminoProjeto, pesoCarro, pesoChassi, custoTotal);
        try {
            AutomovelDAO.gravar(automovel);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManterAutomovelController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
         
               
                
        
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ManterAutomovelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ManterAutomovelController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
