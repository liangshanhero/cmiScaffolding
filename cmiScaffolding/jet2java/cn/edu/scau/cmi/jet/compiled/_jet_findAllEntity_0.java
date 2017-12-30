package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findAllEntity_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findAllEntity_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_2_9 = new TagInfo("java:import", //$NON-NLS-1$
            2, 9,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_2_51 = new TagInfo("c:get", //$NON-NLS-1$
            2, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_110 = new TagInfo("c:get", //$NON-NLS-1$
            2, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_34 = new TagInfo("c:get", //$NON-NLS-1$
            3, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_86 = new TagInfo("c:get", //$NON-NLS-1$
            3, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_131 = new TagInfo("c:get", //$NON-NLS-1$
            3, 131,
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
            out.write("java.util.List");  //$NON-NLS-1$        
            _jettag_java_import_2_9.handleBodyContent(out);
        }
        out = _jettag_java_import_2_9_saved_out;
        _jettag_java_import_2_9.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_51.setRuntimeParent(null);
        _jettag_c_get_2_51.setTagInfo(_td_c_get_2_51);
        _jettag_c_get_2_51.doStart(context, out);
        _jettag_c_get_2_51.doEnd();
        out.write("> findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_110); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_110.setRuntimeParent(null);
        _jettag_c_get_2_110.setTagInfo(_td_c_get_2_110);
        _jettag_c_get_2_110.doStart(context, out);
        _jettag_c_get_2_110.doEnd();
        out.write("s(Integer startResult, Integer maxRows){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn new java.util.ArrayList<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_34.setRuntimeParent(null);
        _jettag_c_get_3_34.setTagInfo(_td_c_get_3_34);
        _jettag_c_get_3_34.doStart(context, out);
        _jettag_c_get_3_34.doEnd();
        out.write(">(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_86.setRuntimeParent(null);
        _jettag_c_get_3_86.setTagInfo(_td_c_get_3_86);
        _jettag_c_get_3_86.doStart(context, out);
        _jettag_c_get_3_86.doEnd();
        out.write("DAO.findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_131 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_131); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_131.setRuntimeParent(null);
        _jettag_c_get_3_131.setTagInfo(_td_c_get_3_131);
        _jettag_c_get_3_131.doStart(context, out);
        _jettag_c_get_3_131.doEnd();
        out.write("s(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tstartResult, maxRows));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
