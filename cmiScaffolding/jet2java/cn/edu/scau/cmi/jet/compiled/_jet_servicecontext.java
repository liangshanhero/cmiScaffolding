package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_servicecontext implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_servicecontext() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_25_40 = new TagInfo("c:get", //$NON-NLS-1$
            25, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_40 = new TagInfo("c:get", //$NON-NLS-1$
            26, 40,
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
        out.write("      xsi:schemaLocation=\"http://www.springframework.org/schema/beans ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/beans/spring-beans-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/aop ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/aop/spring-aop-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/tx ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/tx/spring-tx-3.0.xsd   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/context ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/context/spring-context-3.0.xsd   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/jee ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/jee/spring-jee-3.0.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/lang");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/lang/spring-lang-3.0.xsd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Scan for service layer annotated beans -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<context:component-scan base-package=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_40.setRuntimeParent(null);
        _jettag_c_get_25_40.setTagInfo(_td_c_get_25_40);
        _jettag_c_get_25_40.doStart(context, out);
        _jettag_c_get_25_40.doEnd();
        out.write(".service\" scoped-proxy=\"interfaces\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<context:component-scan base-package=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_40); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_40.setRuntimeParent(null);
        _jettag_c_get_26_40.setTagInfo(_td_c_get_26_40);
        _jettag_c_get_26_40.doStart(context, out);
        _jettag_c_get_26_40.doEnd();
        out.write(".utils\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
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
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</beans>");  //$NON-NLS-1$        
    }
}
