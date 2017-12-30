package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_jaxwswebcontext implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_jaxwswebcontext() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_1_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_replaceStrings_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_1_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_1_1.setTagInfo(_td_c_replaceStrings_1_1);
        _jettag_c_replaceStrings_1_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_1_1_saved_out = out;
        while (_jettag_c_replaceStrings_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("%Left_angle_brackets?xml version=\"1.0\" encoding=\"UTF-8\"?%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<beans xmlns=\"http://www.springframework.org/schema/beans\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:context=\"http://www.springframework.org/schema/context\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:jaxws=\"http://cxf.apache.org/jaxws\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:cxf=\"http://cxf.apache.org/core\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:http=\"http://cxf.apache.org/transports/http/configuration\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txsi:schemaLocation=\"http://www.springframework.org/schema/beans ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\thttp://www.springframework.org/schema/beans/spring-beans-3.0.xsd");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\thttp://www.springframework.org/schema/context ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\thttp://www.springframework.org/schema/context/spring-context-3.0.xsd");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\thttp://cxf.apache.org/jaxws http://cxf.apache.org/schemas/jaxws.xsd");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\thttp://cxf.apache.org/core http://cxf.apache.org/schemas/core.xsd");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\thttp://cxf.apache.org/transports/http/configuration http://cxf.apache.org/schemas/configuration/http-conf.xsd\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<import resource=\"classpath:META-INF/cxf/cxf.xml\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<import resource=\"classpath:META-INF/cxf/cxf-extension-soap.xml\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<import resource=\"classpath:META-INF/cxf/cxf-servlet.xml\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    <bean id=\"org.skyway.spring.util.webservice.cxf.WSSecurityOutInterceptor\" class=\"org.skyway.spring.util.webservice.cxf.WSSecurityOutInterceptor\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    <cxf:bus>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <cxf:outInterceptors>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            <ref bean=\"org.skyway.spring.util.webservice.cxf.WSSecurityOutInterceptor\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        </cxf:outInterceptors>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        %Left_angle_brackets!-- Uncomment to enable logging of incoming/outgoing requests");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<cxf:features > ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<cxf:logging /> ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</cxf:features>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t--%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </cxf:bus>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("  \t<http:conduit name=\"*.http-conduit\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  \t\t<http:basicAuthSupplier class=\"org.skyway.spring.util.webservice.cxf.HttpBasicAuthenticationSupplier\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  \t</http:conduit>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("</beans>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_1_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_1_1_saved_out;
        _jettag_c_replaceStrings_1_1.doEnd();
    }
}
