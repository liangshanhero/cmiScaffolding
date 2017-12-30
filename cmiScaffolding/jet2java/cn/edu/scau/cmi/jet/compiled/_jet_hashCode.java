package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_hashCode implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_hashCode() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_5_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_38 = new TagInfo("c:get", //$NON-NLS-1$
            6, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_105 = new TagInfo("c:get", //$NON-NLS-1$
            6, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t@Override");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic int hashCode() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfinal int prime = 31;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint result = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_3.setRuntimeParent(null);
        _jettag_c_iterate_5_3.setTagInfo(_td_c_iterate_5_3);
        _jettag_c_iterate_5_3.doStart(context, out);
        while (_jettag_c_iterate_5_3.okToProcessBody()) {
            out.write("\t\tresult = (int) (prime * result + ((");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_38); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_38.setRuntimeParent(_jettag_c_iterate_5_3);
            _jettag_c_get_6_38.setTagInfo(_td_c_get_6_38);
            _jettag_c_get_6_38.doStart(context, out);
            _jettag_c_get_6_38.doEnd();
            out.write(" == null) ? 0 : ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_105); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_105.setRuntimeParent(_jettag_c_iterate_5_3);
            _jettag_c_get_6_105.setTagInfo(_td_c_get_6_105);
            _jettag_c_get_6_105.doStart(context, out);
            _jettag_c_get_6_105.doEnd();
            out.write(".hashCode()));");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_5_3.handleBodyContent(out);
        }
        _jettag_c_iterate_5_3.doEnd();
        out.write("\t\treturn result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
