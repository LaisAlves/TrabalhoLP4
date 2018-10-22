/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import model.Automovel;
import model.Desempenho;
import model.Desempenho;
import model.Integrante;
import model.Pessoa;
import model.Tipopista;

public class DesempenhoDAO {

    private static DesempenhoDAO instance = new DesempenhoDAO();

    public static DesempenhoDAO getInstance() {
        return instance;
    }

    private DesempenhoDAO() {
    }

    //CLASSES PADRÃO
    public void salvar(Desempenho desempenho) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(desempenho);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
    }

    public void alterar(Desempenho desempenho) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(desempenho);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
    }

    public Desempenho getDesempenho(Integer id) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        Desempenho desempenho = null;
        try {
            tx.begin();
            desempenho = em.find(Desempenho.class, id);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
        return desempenho;
    }

    public void excluir(Desempenho desempenho) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.remove(em.getReference(Desempenho.class, desempenho.getIdDesempenho()));
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
    }

  public static List<Desempenho> obterDesempenhos() throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        List<Desempenho> desempenhos = new ArrayList<Desempenho>();
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from desempenho");
            while (rs.next()) {

                Desempenho desempenho = new Desempenho(rs.getInt("idDesempenho"), rs.getString("nome"), rs.getString("data"),
                        rs.getString("hora"), rs.getFloat("aceleracaoMedia"), rs.getFloat("velocidadeMedia"), rs.getString("tempoPista"),
                        rs.getFloat("frenagem"));
                
                
                Automovel a = new Automovel();
                a.setIdAutomovel(rs.getInt("FK_automovel"));
                
                Integrante i = new Integrante();
                i.setMatricula(rs.getInt("FK_motorista"));
                
                Tipopista t = new Tipopista();
                t.setIdTipopista(rs.getInt("FK_tipopista"));
                
                
                desempenho.setFKautomovel(a);
                desempenho.setFKmotorista(i);
                desempenho.setFKtipopista(t);
                
                
              
         
                desempenhos.add(desempenho);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);

        }
        return desempenhos;
    }

    private static void fecharConexao(Connection conexao, Statement comando) {
        try {
            if (comando != null) {
                comando.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {

        }

    }
}
