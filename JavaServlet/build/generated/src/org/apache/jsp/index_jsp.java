package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>INSERCCION DE UN NUEVO LIBRO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>INSERTAR LIBRO</h1>\n");
      out.write("        <form action=\"Servlet\" method=\"post\">\n");
      out.write("             <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("             background-color: cadetblue;\n");
      out.write("             text-align: center;\n");
      out.write("            }\n");
      out.write("            .error\n");
      out.write("            {\n");
      out.write("                color:  cyan\n");
      out.write("            }\n");
      out.write("            input.error\n");
      out.write("            {\n");
      out.write("                background-color: darkviolet\n");
      out.write("            }\n");
      out.write("            div\n");
      out.write("            {\n");
      out.write("                color: chartreuse;\n");
      out.write("            }\n");
      out.write("            form\n");
      out.write("            {\n");
      out.write("                color: cyan;\n");
      out.write("                border-bottom-style: solid;\n");
      out.write("                border-radius: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <div>INSERCCIÓN DE UN NUEVO LIBRO</div>\n");
      out.write("        <form id=\"form1\" action =\"ruta/\">\n");
      out.write("            \n");
      out.write("             Titulo del Libro:<input type=\"text\" name=\"nombre\" />\n");
      out.write("             <label for=\"nombre\" />\n");
      out.write("             Autor:<input type=\"text\" name=\"Autor\" value=\"\" />\n");
      out.write("              \n");
      out.write("             Numero de Referencia:\n");
      out.write("             <input type=\"text\" name=\"edad\" />\n");
      out.write("             <br>\n");
      out.write("             Fecha de Publicación:<input type=\"date\" name=\"bday\">\n");
      out.write("             Email:<input type=\"text\" name=\"correo\" placeholder=\"ejemplo @hotmail.com\" />\n");
      out.write("             \n");
      out.write("             <br> \n");
      out.write("             <input type=\"submit\" value=\"aceptar\" />\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            $(\"#form1\").validate(\n");
      out.write("                     \n");
      out.write("               {\n");
      out.write("                   rules:\n");
      out.write("                           {\n");
      out.write("                       nombre:\n");
      out.write("                               {\n");
      out.write("                           \n");
      out.write("                             required: true\n");
      out.write("                             \n");
      out.write("                               },\n");
      out.write("                               edad:\n");
      out.write("                               {\n");
      out.write("                                    required: true,\n");
      out.write("                                    digits:true\n");
      out.write("                               }\n");
      out.write("                            },\n");
      out.write("                            messages:\n");
      out.write("                                   {\n");
      out.write("                                nombre:\n");
      out.write("                                        {\n");
      out.write("                                    required: \"porfavor digite solo su nombre\"\n");
      out.write("                                        },\n");
      out.write("                                        edad:\n");
      out.write("                                                {\n");
      out.write("                                              required: \"por favor digite su edad\",\n");
      out.write("                                             digits:\"por favor digite solo numeros\"\n");
      out.write("                                                \n");
      out.write("                                                 }\n");
      out.write("                                   }\n");
      out.write("              }\n");
      out.write("              \n");
      out.write("               \n");
      out.write("              );\n");
      out.write("            \n");
      out.write("        \n");
      out.write("             \n");
      out.write("        </script> \n");
      out.write("              \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
