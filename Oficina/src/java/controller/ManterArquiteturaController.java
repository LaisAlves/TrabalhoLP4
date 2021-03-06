package controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.ArquiteturaDAO;
import dao.AutomovelDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Arquitetura;
import model.Automovel;

/**
 *
 * @author Marco
 */
public class ManterArquiteturaController extends HttpServlet {

    private Arquitetura arquitetura;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        if (acao.equals("prepararOperacao")) {
            try {
                prepararOperacao(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManterArquiteturaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (acao.equals("confirmarOperacao")) {
            confirmarOperacao(request, response);
        }

    }

    public void prepararOperacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, ClassNotFoundException {
        try {
            String operacao = request.getParameter("operacao");
            request.setAttribute("operacao", operacao);
            //chave estrangeira
            request.setAttribute("automoveis", AutomovelDAO.obterAutomoveis());
            //fim chave estrangeira
            if (!operacao.equals("Incluir")) {
                Integer idArquitetura = Integer.parseInt(request.getParameter("idArquitetura"));
                arquitetura = ArquiteturaDAO.getInstance().getArquitetura(idArquitetura);
                request.setAttribute("arquitetura", arquitetura);
            }
            RequestDispatcher view = request.getRequestDispatcher("/manterArquitetura.jsp");
            view.forward(request, response);
        } catch (ServletException e) {
            throw e;
        } catch (IOException e) {
            throw new ServletException(e);
        }

    }

    public void confirmarOperacao(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String operacao = request.getParameter("operacao");
            int idArquitetura = Integer.parseInt(request.getParameter("txtIdArquitetura"));
            String caminhoImagem = request.getParameter("txtCaminhoImagem");
            //chave estrangeira
            Integer idAutomovel = Integer.parseInt(request.getParameter("selectAutomovel"));
            Automovel automovel = null;
            if (idAutomovel != 0) {
                automovel = AutomovelDAO.getInstance().getAutomovel(idAutomovel);
            }
            //fim chave estrangeira
            switch (operacao) {
                case "Incluir":
                    arquitetura = new Arquitetura(idArquitetura, caminhoImagem, automovel);
                    ArquiteturaDAO.getInstance().salvar(arquitetura);
                    break;
                case "Editar":
                    arquitetura.setCaminhoImagem(caminhoImagem);
                    arquitetura.setFKautomovel(automovel);
                    ArquiteturaDAO.getInstance().alterar(arquitetura);
                    break;
                case "Excluir":
                    ArquiteturaDAO.getInstance().excluir(arquitetura);
                    break;
                default:
                    break;
            }
            RequestDispatcher view = request.getRequestDispatcher("PesquisarArquiteturaController");
            view.forward(request, response);

        } catch (ServletException e) {
            throw e;
        } catch (IOException e) {
            throw new ServletException(e);
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
        processRequest(request, response);

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
        processRequest(request, response);

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
