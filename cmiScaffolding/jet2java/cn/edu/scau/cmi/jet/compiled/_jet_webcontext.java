package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_webcontext implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_webcontext() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_79_40 = new TagInfo("c:get", //$NON-NLS-1$
            79, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_80_40 = new TagInfo("c:get", //$NON-NLS-1$
            80, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<beans xmlns=\"http://www.springframework.org/schema/beans\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:tx=\"http://www.springframework.org/schema/tx\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:aop=\"http://www.springframework.org/schema/aop\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:jee=\"http://www.springframework.org/schema/jee\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:context=\"http://www.springframework.org/schema/context\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:lang=\"http://www.springframework.org/schema/lang\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:security=\"http://www.springframework.org/schema/security\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     xmlns:mvc=\"http://www.springframework.org/schema/mvc\"\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t xsi:schemaLocation=\"http://www.springframework.org/schema/beans ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      http://www.springframework.org/schema/aop ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       http://www.springframework.org/schema/aop/spring-aop-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/tx");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/tx/spring-tx-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/context");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/context/spring-context-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/jee");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/jee/spring-jee-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t   http://www.springframework.org/schema/lang");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       http://www.springframework.org/schema/lang/spring-lang-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       http://www.springframework.org/schema/mvc");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       http://www.springframework.org/schema/security");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("       http://www.springframework.org/schema/security/spring-security-3.0.xsd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(" \t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Spring 3.0 configuration -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t<mvc:annotation-driven/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Allows for mapping the DispatcherServlet to \"/\" by forwarding static resource requests to the container's default Servlet -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<mvc:default-servlet-handler/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Mark bean transactions as annotation driven -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<tx:annotation-driven transaction-manager=\"transactionManager\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Register Multi Part Resolve -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<bean id=\"multipartResolver\" class=\"org.skyway.spring.util.web.binary.ModelBindingMultipartResolver\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Register Streamed Binary Content View -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<bean id=\"streamedBinaryContentView\" class=\"org.skyway.spring.util.web.binary.ModelAttributeStreamer\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Bean Name View Resolver used to Redirect to Beans by id, required by Binary Content View -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<bean id=\"beanNameViewResolver\" class=\"org.springframework.web.servlet.view.BeanNameViewResolver\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<bean id=\"viewResolver\" class=\"org.springframework.web.servlet.view.UrlBasedViewResolver\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<property name=\"viewClass\" value=\"org.springframework.web.servlet.view.JstlView\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"prefix\" value=\"/WEB-INF/pages/\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</bean>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<bean id=\"iPhoneUserAgentViewResolver\" class=\"org.skyway.spring.util.viewresolution.UserAgentViewResolver\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"viewClass\" value=\"org.springframework.web.servlet.view.JstlView\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"agentSubstring\" value=\"iPhone\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"prefix\" value=\"/WEB-INF/iphone/\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"order\" value=\"0\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </bean>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<bean id=\"webInfViewResolver\" class=\"org.skyway.spring.util.viewresolution.AbsolutePathViewResolver\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"viewClass\" value=\"org.springframework.web.servlet.view.JstlView\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"order\" value=\"-1\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </bean>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Scan for web layer annotated beans -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<context:component-scan base-package=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_79_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_79_40.setRuntimeParent(null);
        _jettag_c_get_79_40.setTagInfo(_td_c_get_79_40);
        _jettag_c_get_79_40.doStart(context, out);
        _jettag_c_get_79_40.doEnd();
        out.write(".web\" scoped-proxy=\"interfaces\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<context:component-scan base-package=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_80_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_80_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_80_40.setRuntimeParent(null);
        _jettag_c_get_80_40.setTagInfo(_td_c_get_80_40);
        _jettag_c_get_80_40.doStart(context, out);
        _jettag_c_get_80_40.doEnd();
        out.write(".RS\" scoped-proxy=\"interfaces\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</beans>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
