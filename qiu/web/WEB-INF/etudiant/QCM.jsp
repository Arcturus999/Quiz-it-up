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
                            if(request.getAttribute("Question")!=null)
                            {
                                List<Question> list = (List<Question>)request.getAttribute("Question");
                                List<List<choix>> list2 = (List<List<choix>>)request.getAttribute("Reponse");
                                for(int i=0;i<list.size();i++){
                                            %>
<div>
							<section class="wrapper style5">
							<section class="inner">
                                                            <h3 style="margin-left: 50px"><%=i+1%>-<%=list.get(i).getEnonce()%></h3>
									
                                                                            <% for(int k=0;k<list2.get(i).size();k++){ %>
                                                                            <div style="margin-left: 150px" class="6u 12u$(xsmall)">
												<input type="checkbox" id="demo-priority-<%=k%>" value="<%=list2.get(i).get(k).getCorrect()%>">
												<label for="demo-priority-<%=k%>"><%=list2.get(i).get(k).getChoix()%></label>
											
										
                                                                        </div>
									    <% } %>	
							</section>
							</section>
                                                        <%}
}
%>
                                            <input style="margin-left: 1500px" class="button special small" type="submit" value="Valider" />
                                            <br><br><br>
                                            </form>
                                                        </div>





<%@include file="/WEB-INF/sharedenligne/Footer.jsp" %>