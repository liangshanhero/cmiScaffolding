package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_variable_2 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_variable_2() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_import_1_22 = new TagInfo("java:import", //$NON-NLS-1$
            1, 22,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_1_89 = new TagInfo("java:import", //$NON-NLS-1$
            1, 89,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_1_144 = new TagInfo("java:import", //$NON-NLS-1$
            1, 144,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_1_212 = new TagInfo("c:get", //$NON-NLS-1$
            1, 212,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_3_6 = new TagInfo("java:import", //$NON-NLS-1$
            3, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_3_82 = new TagInfo("c:get", //$NON-NLS-1$
            3, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_4_10 = new TagInfo("java:import", //$NON-NLS-1$
            4, 10,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("private final static ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_1_22 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_1_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_1_22.setRuntimeParent(null);
        _jettag_java_import_1_22.setTagInfo(_td_java_import_1_22);
        _jettag_java_import_1_22.doStart(context, out);
        JET2Writer _jettag_java_import_1_22_saved_out = out;
        while (_jettag_java_import_1_22.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.Set");  //$NON-NLS-1$        
            _jettag_java_import_1_22.handleBodyContent(out);
        }
        out = _jettag_java_import_1_22_saved_out;
        _jettag_java_import_1_22.doEnd();
        out.write("<Class<?>> dataTypes = new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_1_89 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_1_89); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_1_89.setRuntimeParent(null);
        _jettag_java_import_1_89.setTagInfo(_td_java_import_1_89);
        _jettag_java_import_1_89.doStart(context, out);
        JET2Writer _jettag_java_import_1_89_saved_out = out;
        while (_jettag_java_import_1_89.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.HashSet");  //$NON-NLS-1$        
            _jettag_java_import_1_89.handleBodyContent(out);
        }
        out = _jettag_java_import_1_89_saved_out;
        _jettag_java_import_1_89.doEnd();
        out.write("<Class<?>>(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_1_144 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_1_144); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_1_144.setRuntimeParent(null);
        _jettag_java_import_1_144.setTagInfo(_td_java_import_1_144);
        _jettag_java_import_1_144.doStart(context, out);
        JET2Writer _jettag_java_import_1_144_saved_out = out;
        while (_jettag_java_import_1_144.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.Arrays");  //$NON-NLS-1$        
            _jettag_java_import_1_144.handleBodyContent(out);
        }
        out = _jettag_java_import_1_144_saved_out;
        _jettag_java_import_1_144.doEnd();
        out.write(".asList(new Class<?>[] { ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_212 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_212); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_212.setRuntimeParent(null);
        _jettag_c_get_1_212.setTagInfo(_td_c_get_1_212);
        _jettag_c_get_1_212.doStart(context, out);
        _jettag_c_get_1_212.doEnd();
        out.write(".class }));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    @");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_3_6 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_3_6.setRuntimeParent(null);
        _jettag_java_import_3_6.setTagInfo(_td_java_import_3_6);
        _jettag_java_import_3_6.doStart(context, out);
        JET2Writer _jettag_java_import_3_6_saved_out = out;
        while (_jettag_java_import_3_6.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.PersistenceContext");  //$NON-NLS-1$        
            _jettag_java_import_3_6.handleBodyContent(out);
        }
        out = _jettag_java_import_3_6_saved_out;
        _jettag_java_import_3_6.doEnd();
        out.write("(unitName = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_82.setRuntimeParent(null);
        _jettag_c_get_3_82.setTagInfo(_td_c_get_3_82);
        _jettag_c_get_3_82.doStart(context, out);
        _jettag_c_get_3_82.doEnd();
        out.write("\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_4_10 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_4_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_4_10.setRuntimeParent(null);
        _jettag_java_import_4_10.setTagInfo(_td_java_import_4_10);
        _jettag_java_import_4_10.doStart(context, out);
        JET2Writer _jettag_java_import_4_10_saved_out = out;
        while (_jettag_java_import_4_10.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.persistence.EntityManager");  //$NON-NLS-1$        
            _jettag_java_import_4_10.handleBodyContent(out);
        }
        out = _jettag_java_import_4_10_saved_out;
        _jettag_java_import_4_10.doEnd();
        out.write(" entityManager;");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
