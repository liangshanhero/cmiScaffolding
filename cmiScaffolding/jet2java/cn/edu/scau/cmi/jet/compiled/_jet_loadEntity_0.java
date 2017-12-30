package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_loadEntity_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_loadEntity_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_1_8 = new TagInfo("java:import", //$NON-NLS-1$
            1, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_1_49 = new TagInfo("c:get", //$NON-NLS-1$
            1, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_105 = new TagInfo("c:get", //$NON-NLS-1$
            1, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_3_8 = new TagInfo("java:import", //$NON-NLS-1$
            3, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_3_49 = new TagInfo("c:get", //$NON-NLS-1$
            3, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_105 = new TagInfo("c:get", //$NON-NLS-1$
            3, 105,
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
            out.write("java.util.Set");  //$NON-NLS-1$        
            _jettag_java_import_1_8.handleBodyContent(out);
        }
        out = _jettag_java_import_1_8_saved_out;
        _jettag_java_import_1_8.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_49.setRuntimeParent(null);
        _jettag_c_get_1_49.setTagInfo(_td_c_get_1_49);
        _jettag_c_get_1_49.doStart(context, out);
        _jettag_c_get_1_49.doEnd();
        out.write("> load");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_105); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_105.setRuntimeParent(null);
        _jettag_c_get_1_105.setTagInfo(_td_c_get_1_105);
        _jettag_c_get_1_105.doStart(context, out);
        _jettag_c_get_1_105.doEnd();
        out.write("s();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_3_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_3_8.setRuntimeParent(null);
        _jettag_java_import_3_8.setTagInfo(_td_java_import_3_8);
        _jettag_java_import_3_8.doStart(context, out);
        JET2Writer _jettag_java_import_3_8_saved_out = out;
        while (_jettag_java_import_3_8.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.Set");  //$NON-NLS-1$        
            _jettag_java_import_3_8.handleBodyContent(out);
        }
        out = _jettag_java_import_3_8_saved_out;
        _jettag_java_import_3_8.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_49.setRuntimeParent(null);
        _jettag_c_get_3_49.setTagInfo(_td_c_get_3_49);
        _jettag_c_get_3_49.doStart(context, out);
        _jettag_c_get_3_49.doEnd();
        out.write("> load");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_105); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_105.setRuntimeParent(null);
        _jettag_c_get_3_105.setTagInfo(_td_c_get_3_105);
        _jettag_c_get_3_105.doStart(context, out);
        _jettag_c_get_3_105.doEnd();
        out.write("s(int index,int size);");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
