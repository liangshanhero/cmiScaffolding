package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_webxml implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_webxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_5_16 = new TagInfo("c:get", //$NON-NLS-1$
            5, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_16 = new TagInfo("c:get", //$NON-NLS-1$
            32, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_17 = new TagInfo("c:get", //$NON-NLS-1$
            38, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_16 = new TagInfo("c:get", //$NON-NLS-1$
            49, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_17 = new TagInfo("c:get", //$NON-NLS-1$
            58, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_27 = new TagInfo("c:get", //$NON-NLS-1$
            64, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_81_17 = new TagInfo("c:get", //$NON-NLS-1$
            81, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<web-app xmlns=\"http://java.sun.com/xml/ns/javaee\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"3.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<display-name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_16.setRuntimeParent(null);
        _jettag_c_get_5_16.setTagInfo(_td_c_get_5_16);
        _jettag_c_get_5_16.doStart(context, out);
        _jettag_c_get_5_16.doEnd();
        out.write("</display-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<listener>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<listener-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\torg.springframework.web.context.ContextLoaderListener");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</listener-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</listener>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<listener>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<listener-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\torg.springframework.web.context.request.RequestContextListener");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</listener-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</listener>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<filter>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <filter-name>encoding</filter-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <filter-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            org.springframework.web.filter.CharacterEncodingFilter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        </filter-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <init-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <param-name>encoding</param-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            <param-value>utf-8</param-value>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        </init-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </filter>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <filter-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <filter-name>encoding</filter-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <url-pattern>/*</url-pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </filter-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<filter>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>generated-persistence-filter</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<filter-name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_16.setRuntimeParent(null);
        _jettag_c_get_32_16.setTagInfo(_td_c_get_32_16);
        _jettag_c_get_32_16.doStart(context, out);
        _jettag_c_get_32_16.doEnd();
        out.write("Filter</filter-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<filter-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\torg.springframework.orm.jpa.support.OpenEntityManagerInViewFilter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</filter-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<init-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<param-name>entityManagerFactoryBeanName</param-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<param-value>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_17.setRuntimeParent(null);
        _jettag_c_get_38_17.setTagInfo(_td_c_get_38_17);
        _jettag_c_get_38_17.doStart(context, out);
        _jettag_c_get_38_17.doEnd();
        out.write("</param-value>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</init-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</filter>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<filter>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>generated-sitemesh-filter</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<filter-name>Sitemesh Filter</filter-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<filter-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcom.opensymphony.module.sitemesh.filter.PageFilter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</filter-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</filter>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<filter-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<filter-name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_16.setRuntimeParent(null);
        _jettag_c_get_49_16.setTagInfo(_td_c_get_49_16);
        _jettag_c_get_49_16.doStart(context, out);
        _jettag_c_get_49_16.doEnd();
        out.write("Filter</filter-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<url-pattern>/*</url-pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</filter-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<filter-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<filter-name>Sitemesh Filter</filter-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<url-pattern>/*</url-pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</filter-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<servlet>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>generated-servlet</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<servlet-name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_58_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_58_17.setRuntimeParent(null);
        _jettag_c_get_58_17.setTagInfo(_td_c_get_58_17);
        _jettag_c_get_58_17.doStart(context, out);
        _jettag_c_get_58_17.doEnd();
        out.write(" Servlet</servlet-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<servlet-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\torg.springframework.web.servlet.DispatcherServlet");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</servlet-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<init-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<param-name>contextConfigLocation</param-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<param-value>classpath:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_64_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_64_27.setRuntimeParent(null);
        _jettag_c_get_64_27.setTagInfo(_td_c_get_64_27);
        _jettag_c_get_64_27.doStart(context, out);
        _jettag_c_get_64_27.doEnd();
        out.write("-web-context.xml</param-value>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</init-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<load-on-startup>1</load-on-startup>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</servlet>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<servlet>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>generated-resources-servlet</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<servlet-name>Resource Servlet</servlet-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<servlet-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\torg.springframework.js.resource.ResourceServlet");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</servlet-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<load-on-startup>1</load-on-startup>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</servlet>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<servlet-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<servlet-name>Resource Servlet</servlet-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<url-pattern>/resources/*</url-pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</servlet-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<servlet-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<servlet-name>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_81_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_81_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_81_17.setRuntimeParent(null);
        _jettag_c_get_81_17.setTagInfo(_td_c_get_81_17);
        _jettag_c_get_81_17.doStart(context, out);
        _jettag_c_get_81_17.doEnd();
        out.write(" Servlet</servlet-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<url-pattern>/</url-pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</servlet-mapping>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<context-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<param-name>contextConfigLocation</param-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<param-value>classpath:applicationContext.xml</param-value>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</context-param>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<welcome-file-list>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<welcome-file>index.jsp</welcome-file>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</welcome-file-list>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</web-app>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
