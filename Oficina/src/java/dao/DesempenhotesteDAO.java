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
import model.Desempenhoteste;
import model.Integrante;
import model.Tipopista;

public class DesempenhotesteDAO {

    private static DesempenhotesteDAO instance = new DesempenhotesteDAO();

    public static DesempenhotesteDAO getInstance() {
        return instance;
    }

    private DesempenhotesteDAO() {
    }

    //CLASSES PADRÃO
    public void salvar(Desempenhoteste desempenhoTeste) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(desempenhoTeste);
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

    public void alterar(Desempenhoteste desempenhoTeste) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(desempenhoTeste);
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

    public Desempenhoteste getDesempenhoteste(Integer id) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        Desempenhoteste desempenhoTeste = null;
        try {
            tx.begin();
            desempenhoTeste = em.find(Desempenhoteste.class, id);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
        return desempenhoTeste;
    }

    public void excluir(Desempenhoteste desempenhoTeste) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.remove(em.getReference(Desempenhoteste.class, desempenhoTeste.getIdDesempenhoteste()));
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

    public static List<Desempenhoteste> obterDesempenhosteste() throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        List<Desempenhoteste> desempenhos = new ArrayList<Desempenhoteste>();
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from desempenhoteste");
            while (rs.next()) {

                Desempenhoteste desempenhoteste = new Desempenhoteste(rs.getInt("idDesempenhoteste"), rs.getString("nome"), rs.getString("data"),
                        rs.getString("hora"), rs.getFloat("aceleracaoMedia"), rs.getFloat("velocidadeMedia"), rs.getString("tempoPista"),
                        rs.getFloat("frenagem"));
                
                
                Automovel a = new Automovel();
                a.setIdAutomovel(rs.getInt("FK_automovel"));
                
                Integrante i = new Integrante();
                i.setMatricula(rs.getInt("FK_motorista"));
                
                Tipopista t = new Tipopista();
                t.setIdTipopista(rs.getInt("FK_tipopista"));
                
                
                desempenhoteste.setFKautomovel(a);
                desempenhoteste.setFKmotorista(i);
                desempenhoteste.setFKtipopista(t);
                
                
              
         
                desempenhos.add(desempenhoteste);

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
