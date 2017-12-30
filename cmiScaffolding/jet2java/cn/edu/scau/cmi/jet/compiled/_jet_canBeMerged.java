package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_canBeMerged implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_canBeMerged() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_28 = new TagInfo("c:get", //$NON-NLS-1$
            1, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public boolean canBeMerged(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_28.setRuntimeParent(null);
        _jettag_c_get_1_28.setTagInfo(_td_c_get_1_28);
        _jettag_c_get_1_28.doStart(context, out);
        _jettag_c_get_1_28.doEnd();
        out.write(" entity) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
    }
}
