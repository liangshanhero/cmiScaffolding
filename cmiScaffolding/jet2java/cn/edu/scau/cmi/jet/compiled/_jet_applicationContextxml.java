package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_applicationContextxml implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_applicationContextxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_7_30 = new TagInfo("c:get", //$NON-NLS-1$
            7, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_30 = new TagInfo("c:get", //$NON-NLS-1$
            8, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_30 = new TagInfo("c:get", //$NON-NLS-1$
            9, 30,
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
        out.write("<beans xmlns=\"http://www.springframework.org/schema/beans\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:p=\"http://www.springframework.org/schema/p\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.1.xsd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("\t<import resource=\"classpath:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_30.setRuntimeParent(null);
        _jettag_c_get_7_30.setTagInfo(_td_c_get_7_30);
        _jettag_c_get_7_30.doStart(context, out);
        _jettag_c_get_7_30.doEnd();
        out.write("-dao-context.xml\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<import resource=\"classpath:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_30.setRuntimeParent(null);
        _jettag_c_get_8_30.setTagInfo(_td_c_get_8_30);
        _jettag_c_get_8_30.doStart(context, out);
        _jettag_c_get_8_30.doEnd();
        out.write("-security-context.xml\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<import resource=\"classpath:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_30.setRuntimeParent(null);
        _jettag_c_get_9_30.setTagInfo(_td_c_get_9_30);
        _jettag_c_get_9_30.doStart(context, out);
        _jettag_c_get_9_30.doEnd();
        out.write("-service-context.xml\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</beans>");  //$NON-NLS-1$        
    }
}
