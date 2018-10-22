<%-- 
    Document   : pesquisaPessoa
    Created on : 20/09/2016, 09:17:12
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de Pessoa</title>
        <link rel="shortcut icon" href="images/favicon.ico">
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <!--Import jQuery before materialize.js-->
        <script src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
       
          <nav>
            <div class="nav-wrapper black">
                <a href="#!" class="brand-logo">Oficina AutoCar</a>
                <ul class="right hide-on-med-and-down">
                    <!-- Dropdown Trigger -->
                    <li><a href="index.jsp">Início</a></li>
                    <li><a href="dashboard.jsp">Dashboard</a></li>
                    
                </ul>
            </div>
        </nav>

        
        <div class="container">
            <form>
                <h3 align="center">Pesquisa de Pessoa</h3>
                <table class="striped centered">
                    <thead>
                        <tr>
                            <th>Código Pessoa</th>
                            <th>Nome Pessoa</th>
                            <th>CPF</th>
                            <th>Logradouro</th>
                            <th>CEP</th>
                            <th>Bairro</th>
                            <th>UF</th>
                            <th>Número</th>
                            <th>Telefone</th>
                            <th colspan="2">Ação</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${pessoas}" var="pessoa">
                            <tr>
                                <td>${pessoa.idPessoa}</td>
                                <td>${pessoa.nome}</td>
                                <td>${pessoa.cpf}</td>
                                <td>${pessoa.logradouro}</td>
                                <td>${pessoa.cep}</td>
                                <td>${pessoa.bairro}</td>
                                <td>${pessoa.uf}</td>
                                <td>${pessoa.numero}</td>
                                <td>${pessoa.telefone}</td>

                                <td><a class="brown-text text-darken-4" href="ManterPessoaController?acao=prepararOperacao&operacao=Editar&idPessoa=${pessoa.idPessoa}">Editar</a></td>
                                <td><a class="brown-text text-darken-4" href="ManterPessoaController?acao=prepararOperacao&operacao=Excluir&idPessoa=${pessoa.idPessoa}">Excluir</a></td>
                            </tr>
                        </c:forEach>
                        <tr> 
                            <td  align="center" colspan="11">
                                <a class="waves-effect waves-light btn-large brown darken-4" id="imprimir">Imprimir <i class="material-icons right">print</i></a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        $('select').material_select();


        $('.dropdown-button').dropdown({
            constrainWidth: false, // Does not change width of dropdown to that of the activator
            hover: true // Activate on hover
        });

        $("#imprimir").click(function () {
            window.location.href = 'RelatorioController?relatorioNome=reportPessoa.jasper';
        });
    });
</script>