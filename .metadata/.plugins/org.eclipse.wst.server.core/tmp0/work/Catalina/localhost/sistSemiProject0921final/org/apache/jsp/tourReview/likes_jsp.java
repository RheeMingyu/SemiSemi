/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-21 01:49:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tourReview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import data.dao.TourSpotReviewDao;
import data.dto.TourReviewDto;
import data.dto.GuestReviewDto;
import org.json.simple.JSONObject;
import data.dao.GuestTourSpotReviewDao;

public final class likes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("data.dao.GuestTourSpotReviewDao");
    _jspx_imports_classes.add("data.dao.TourSpotReviewDao");
    _jspx_imports_classes.add("org.json.simple.JSONObject");
    _jspx_imports_classes.add("data.dto.TourReviewDto");
    _jspx_imports_classes.add("data.dto.GuestReviewDto");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 

	/* String numString = request.getParameter("num");

	
	if(numString != null && !numString.isEmpty()){
		
		//dao
		GuestTourSpotReviewDao dao=new GuestTourSpotReviewDao();
		
		// numString을 인수로 사용하여 updateLikes 메서드 호출
		dao.updateLikes(numString);
		
		 // numString을 다시 정수로 변환
        int num = Integer.parseInt(numString);
		 
        // 증가된 likes값을 json형식으로 변환
        GuestReviewDto review=dao.getData(Integer.toString(num));
       String likes = review.getLikes();
        
        JSONObject ob = new JSONObject();
        ob.put("likes", likes);
        
        // JSON 응답 출력
        response.setContentType("application/json");
        response.getWriter().write(ob.toString());
    } else {
        // numString이 유효하지 않은 경우 오류 처리
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        response.getWriter().write("Invalid num parameter");
		
	
	}
	
	  // 'ob' 변수를 'if' 블록 외부에서도 사용하려면 여기서 정의해야 함
    JSONObject ob = new JSONObject();
    ob.put("likes", 0);  */
	
	String num=request.getParameter("num");
	 //dao
	GuestTourSpotReviewDao dao=new GuestTourSpotReviewDao();
	TourSpotReviewDao tourspotreviewdao = new TourSpotReviewDao();
	
	dao.updateLikes(num);
	
	/* int likes=dao.getData(num).getLikes(); */
	int likes=Integer.parseInt(tourspotreviewdao.getData(num).getLikes());
	
	
	JSONObject ob=new JSONObject();
	ob.put("likes",likes);
	
	

      out.write('\r');
      out.write('\n');
      out.print(ob.toString() );
      out.write(' ');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
