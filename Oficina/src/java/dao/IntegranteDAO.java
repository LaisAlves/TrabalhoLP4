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
import model.Integrante;
import model.Pessoa;

public class IntegranteDAO {

    private static IntegranteDAO instance = new IntegranteDAO();

    public static IntegranteDAO getInstance() {
        return instance;
    }

    private IntegranteDAO() {
    }

    //CLASSES PADRÃO
    public void salvar(Integrante integrante) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(integrante);
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

    public void alterar(Integrante integrante) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            em.merge(integrante);
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

    public Integrante getIntegrante(Integer id) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        Integrante integrante = null;
        try {
            tx.begin();
            integrante = em.find(Integrante.class, id);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
        return integrante;
    }

    public void excluir(Integrante integrante) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.remove(em.getReference(Integrante.class, integrante.getMatricula()));
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

    public static List<Integrante> obterIntegrantes() throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        List<Integrante> integrantes = new ArrayList<Integrante>();
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from integrante");
            while (rs.next()) {

                Pessoa p = new Pessoa();
                Integrante i = new Integrante();
                i.setMatricula(rs.getInt("matricula"));
                i.setCargaHorariaDisponivel(rs.getString("cargaHorariaDisponivel"));
                p.setIdPessoa(rs.getInt("FK_pessoa"));
                i.setFKpessoa(p);

                integrantes.add(i);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);

            return integrantes;
        }
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


