<%@include file="/WEB-INF/sharedenligne/Header.jsp" %>


<div>
								<img style="height:150px" />
							</div>
							<form action="QCMController" method="Post">
							<section class="wrapper style5">
							<section class="inner">
							    <p>Type QCM:  
												    <div id="u96" class="ax_default droplist">
					              <select id="20" onchange="change_valeur('20',21);">
					                <option value="Formatif">Formatif</option>
					                <option value="Certificatif">Certificatif</option>
					                <option value="Normatif">Normatif</option>
					              </select>
					            </div></p>
					            <input id="21" type="hidden" name="typeq" value="Formatif"/>
							    
							        <input class="button special small" type="submit" value="Commencer l'évaluation" />
					</section>
					</section>
					</form>





<%@include file="/WEB-INF/sharedenligne/Footer.jsp" %>