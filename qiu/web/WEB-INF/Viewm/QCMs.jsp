<%@page import="Model.choix"%>
<%@page import="Model.Question"%>
<%@page import="java.util.List"%>
<%@include file="/WEB-INF/sharedenligne/Header.jsp" %>


                                                        <div>
								<img style="height:150px" />
							</div>
							<form action="QCMController" method="Post">
<%
                            int count=0;
                            if(request.getAttribute("resultats")!=null)
                            {
                                List<Question> list = (List<Question>)request.getAttribute("Question");
                                List<List<choix>> list2 = (List<List<choix>>)request.getAttribute("Reponse");
                                for(int i=0;i<list.size();i++){
                                            %>
<div>
							<section class="wrapper style5">
							<section class="inner">
                                                            <h3 style="margin-left: 50px"><%=i+1%>-<%=list.get(i).getEnonce()%></h3>
									<div style="margin-left: 150px" class="6u 12u$(small)">
                                                                            <% for(int k=0;k<list.get(i).getList2().size();k++){ %>
												<input type="checkbox" id="demo-copy" name="<%=list.get(i).getList2().get(k).getCorrect() %>">
												<label for="demo-copy"><%=list.get(i).getList2().get(k).getChoix()%></label><br>
											
									    <% } %>

							</section>
							</section>
                                                        <%}
}
%>
                                            <input style="margin-left: 1500px" class="button special small" type="submit" value="Valider" />
                                            <br><br><br>
                                            </form>





<%@include file="/WEB-INF/sharedenligne/Footer.jsp" %>