/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class AutomovelDAO{

    private static AutomovelDAO instance = new AutomovelDAO();

    public static AutomovelDAO getInstance() {
        return instance;
    }

    private AutomovelDAO() {
    }

     public static void gravar(Automovel automovel) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        try {
            conexao = BD.getConexao();
            // caso de herança tem qeu fazer para as duas classes .
            String sql = "insert into automovel(id ,cor ,nome ,dataTerminoProjeto ,pesoCarro ,pesoChassi ,custoTotal) values(?,?,?,?,?,?,?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            
            

            comando.setInt(1, automovel.getIdAutomovel());
            comando.setString(2, automovel.getCor());
            comando.setString(3, automovel.getNome());
            comando.setString(4, automovel.getDataTerminoProjeto());

            comando.setFloat(5, automovel.getPesoCarro());
            comando.setFloat(6, automovel.getPesoChassi());
            comando.setFloat(7, automovel.getCustoTotal());
           

            
            comando.execute();
            comando.close();
            conexao.close();

        } catch (SQLException e) {

            throw e;
        }

    }

    public void alterar(Automovel automovel) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(automovel);
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

    public Automovel getAutomovel(Integer id) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        Automovel automovel = null;
        try {
            tx.begin();
            automovel
                    = em.find(Automovel.class,
                            id);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            PersistenceUtil.close(em);
        }
        return automovel;
    }

    public void excluir(Automovel automovel) {
        EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em
                    .remove(em.getReference(Automovel.class,
                            automovel.getIdAutomovel()));
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


    
    
    public static List<Automovel> obterAutomoveis() throws ClassNotFoundException {
        Connection conexao = null;
        Statement comando = null;
        List<Automovel> automoveis = new ArrayList<Automovel>();
        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select * from automovel");
            while (rs.next()) {

                Automovel automovel = new Automovel(rs.getInt("idAutomovel"), rs.getString("cor"), rs.getString("nome"),
                        rs.getString("dataTerminoProjeto"), rs.getFloat("pesoCarro"), rs.getFloat("pesoChassi"),
                        rs.getFloat("custoTotal"));

         
                automoveis.add(automovel);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);

        }
        return automoveis;
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
