<%-- 
    Document   : Header
    Created on : Jun 15, 2017, 4:29:26 PM
    Author     : Ahmed Yassin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Spectral by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Spectral by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
                <script>
                function change_valeur(name,id) {
                var e = document.getElementById(name);
                var strUser = e.options[e.selectedIndex].value;
                document.getElementById(id).setAttribute("value",strUser);
                 }
        
    </script>
	</head>
	<body class="landing">

		<!-- Page Wrapper -->
			<div id="page-wrapper">

				<!-- Header -->
					<header id="header" class="alt">
						<h1><a href="index.html">Projet Voltaire</a></h1>
						<nav id="nav">
							<ul>
								<li class="special">
                                                                    <a href="#menu" class="menuToggle"><span>Bonjour, ${sessionScope.nom}</span></a>
									<div id="menu">
										<ul>
											<li><a href="HomeController">Accueil</a></li>
											<li><a href="AuthentificationController">Se deconnecter</a></li>
										</ul>
									</div>
								</li>
							</ul>
						</nav>
					</header>
