package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_body_5 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_body_5() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_4_4 = new TagInfo("c:include", //$NON-NLS-1$
            4, 4,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/view/table.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div id=\"contentarea\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<div id=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_4_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_4_4.setRuntimeParent(null);
        _jettag_c_include_4_4.setTagInfo(_td_c_include_4_4);
        _jettag_c_include_4_4.doStart(context, out);
        _jettag_c_include_4_4.doEnd();
        out.write("\t\t\t<div class=\"clear\">&nbsp;</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
