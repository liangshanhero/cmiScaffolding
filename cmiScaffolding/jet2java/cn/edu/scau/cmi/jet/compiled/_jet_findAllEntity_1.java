package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findAllEntity_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findAllEntity_1() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_1_8 = new TagInfo("java:import", //$NON-NLS-1$
            1, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_1_50 = new TagInfo("c:get", //$NON-NLS-1$
            1, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_109 = new TagInfo("c:get", //$NON-NLS-1$
            1, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_1_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_1_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_1_8.setRuntimeParent(null);
        _jettag_java_import_1_8.setTagInfo(_td_java_import_1_8);
        _jettag_java_import_1_8.doStart(context, out);
        JET2Writer _jettag_java_import_1_8_saved_out = out;
        while (_jettag_java_import_1_8.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.List");  //$NON-NLS-1$        
            _jettag_java_import_1_8.handleBodyContent(out);
        }
        out = _jettag_java_import_1_8_saved_out;
        _jettag_java_import_1_8.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_50.setRuntimeParent(null);
        _jettag_c_get_1_50.setTagInfo(_td_c_get_1_50);
        _jettag_c_get_1_50.doStart(context, out);
        _jettag_c_get_1_50.doEnd();
        out.write("> findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_109); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_109.setRuntimeParent(null);
        _jettag_c_get_1_109.setTagInfo(_td_c_get_1_109);
        _jettag_c_get_1_109.doStart(context, out);
        _jettag_c_get_1_109.doEnd();
        out.write("s(Integer startResult, Integer maxRows);");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
