<%-- 
    Document   : pesquisaDesempenhoTeste
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
        <title>Pesquisa de Desempenho Teste</title>
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
        <!-- Dropdown Structure -->
       
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
                <h3 align="center">Pesquisa de Desempenho Teste</h3>
                <table class="striped centered">
                    <thead>
                        <tr>
                            <th>Código Desempenho Teste</th>
                            <th>Automovel</th>
                            <th>Tipo Pista</th>
                            <th>Motorista</th>
                            <th>Desempenho Teste</th>
                            <th>Data</th>
                            <th>Hora</th>
                            <th>Aceleração Média</th>
                            <th>Velocidade Média</th>
                            <th>Tempo Corrida</th>
                            <th>Frenagem</th>
                            <th colspan="2">Ação</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${desempenhosteste}" var="desempenhoteste">
                            <tr>
                                <td>${desempenhoteste.idDesempenhoteste}</td>
                                <td>${desempenhoteste.FKautomovel.nome}</td>
                                <td>${desempenhoteste.FKtipopista.nome}</td>
                                <td>${desempenhoteste.FKmotorista.FKpessoa.nome}</td>
                                <td>${desempenhoteste.nome}</td>
                                <td>${desempenhoteste.data}</td>
                                <td>${desempenhoteste.hora}</td>
                                <td>${desempenhoteste.aceleracaoMedia}</td>
                                <td>${desempenhoteste.velocidadeMedia}</td>
                                <td>${desempenhoteste.tempoPista}</td>
                                <td>${desempenhoteste.frenagem}</td>
                                <td><a class="brown-text text-darken-4" href="ManterDesempenhotesteController?acao=prepararOperacao&operacao=Editar&idDesempenhoteste=${desempenhoteste.idDesempenhoteste}">Editar</a></td>
                                <td><a class="brown-text text-darken-4" href="ManterDesempenhotesteController?acao=prepararOperacao&operacao=Excluir&idDesempenhoteste=${desempenhoteste.idDesempenhoteste}">Excluir</a></td>
                            </tr>
                        </c:forEach>
                        <tr> 
                            <td  align="center" colspan="13">
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
            window.location.href = 'RelatorioController?relatorioNome=reportDesempenhoTeste.jasper';
        });
    });
</script>