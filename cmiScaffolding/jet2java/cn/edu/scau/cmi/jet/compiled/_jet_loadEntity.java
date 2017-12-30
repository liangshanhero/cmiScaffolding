package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_loadEntity implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_loadEntity() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_2_9 = new TagInfo("java:import", //$NON-NLS-1$
            2, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_2_50 = new TagInfo("c:get", //$NON-NLS-1$
            2, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_106 = new TagInfo("c:get", //$NON-NLS-1$
            2, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_10 = new TagInfo("c:get", //$NON-NLS-1$
            3, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_55 = new TagInfo("c:get", //$NON-NLS-1$
            3, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_13 = new TagInfo("c:get", //$NON-NLS-1$
            8, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_69 = new TagInfo("c:get", //$NON-NLS-1$
            8, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_10 = new TagInfo("c:get", //$NON-NLS-1$
            9, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_55 = new TagInfo("c:get", //$NON-NLS-1$
            9, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_2_9 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_2_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_2_9.setRuntimeParent(null);
        _jettag_java_import_2_9.setTagInfo(_td_java_import_2_9);
        _jettag_java_import_2_9.doStart(context, out);
        JET2Writer _jettag_java_import_2_9_saved_out = out;
        while (_jettag_java_import_2_9.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.Set");  //$NON-NLS-1$        
            _jettag_java_import_2_9.handleBodyContent(out);
        }
        out = _jettag_java_import_2_9_saved_out;
        _jettag_java_import_2_9.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_50.setRuntimeParent(null);
        _jettag_c_get_2_50.setTagInfo(_td_c_get_2_50);
        _jettag_c_get_2_50.doStart(context, out);
        _jettag_c_get_2_50.doEnd();
        out.write("> load");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_106); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_106.setRuntimeParent(null);
        _jettag_c_get_2_106.setTagInfo(_td_c_get_2_106);
        _jettag_c_get_2_106.doStart(context, out);
        _jettag_c_get_2_106.doEnd();
        out.write("s(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_10.setRuntimeParent(null);
        _jettag_c_get_3_10.setTagInfo(_td_c_get_3_10);
        _jettag_c_get_3_10.doStart(context, out);
        _jettag_c_get_3_10.doEnd();
        out.write("DAO.findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_55.setRuntimeParent(null);
        _jettag_c_get_3_55.setTagInfo(_td_c_get_3_55);
        _jettag_c_get_3_55.doStart(context, out);
        _jettag_c_get_3_55.doEnd();
        out.write("s();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Set<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_13.setRuntimeParent(null);
        _jettag_c_get_8_13.setTagInfo(_td_c_get_8_13);
        _jettag_c_get_8_13.doStart(context, out);
        _jettag_c_get_8_13.doEnd();
        out.write("> load");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_69); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_69.setRuntimeParent(null);
        _jettag_c_get_8_69.setTagInfo(_td_c_get_8_69);
        _jettag_c_get_8_69.doStart(context, out);
        _jettag_c_get_8_69.doEnd();
        out.write("s(int index,int size) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_10.setRuntimeParent(null);
        _jettag_c_get_9_10.setTagInfo(_td_c_get_9_10);
        _jettag_c_get_9_10.doStart(context, out);
        _jettag_c_get_9_10.doEnd();
        out.write("DAO.findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_55.setRuntimeParent(null);
        _jettag_c_get_9_55.setTagInfo(_td_c_get_9_55);
        _jettag_c_get_9_55.doStart(context, out);
        _jettag_c_get_9_55.doEnd();
        out.write("s(index,size);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
