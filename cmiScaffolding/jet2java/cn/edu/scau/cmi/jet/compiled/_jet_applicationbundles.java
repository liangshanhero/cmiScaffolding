package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_applicationbundles implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_applicationbundles() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_19 = new TagInfo("c:get", //$NON-NLS-1$
            2, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("# general");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("application.title=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_19.setRuntimeParent(null);
        _jettag_c_get_2_19.setTagInfo(_td_c_get_2_19);
        _jettag_c_get_2_19.doStart(context, out);
        _jettag_c_get_2_19.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("# navigation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("navigation.backToDashboard=Back to Dashboard");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("navigation.view=View");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
