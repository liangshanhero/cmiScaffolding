package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findAllEntity_2 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findAllEntity_2() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_12 = new TagInfo("c:get", //$NON-NLS-1$
            1, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_71 = new TagInfo("c:get", //$NON-NLS-1$
            1, 71,
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
    private static final TagInfo _td_c_get_3_108 = new TagInfo("c:get", //$NON-NLS-1$
            3, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_3_197 = new TagInfo("java:import", //$NON-NLS-1$
            3, 197,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_5_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_12 = new TagInfo("c:get", //$NON-NLS-1$
            8, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_68 = new TagInfo("c:get", //$NON-NLS-1$
            8, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_116 = new TagInfo("c:get", //$NON-NLS-1$
            8, 116,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_176 = new TagInfo("c:get", //$NON-NLS-1$
            8, 176,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public Set<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_12.setRuntimeParent(null);
        _jettag_c_get_1_12.setTagInfo(_td_c_get_1_12);
        _jettag_c_get_1_12.doStart(context, out);
        _jettag_c_get_1_12.doEnd();
        out.write("> findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_71.setRuntimeParent(null);
        _jettag_c_get_1_71.setTagInfo(_td_c_get_1_71);
        _jettag_c_get_1_71.doStart(context, out);
        _jettag_c_get_1_71.doEnd();
        out.write("s() throws DataAccessException;");  //$NON-NLS-1$        
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
        out.write("> findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_108); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_108.setRuntimeParent(null);
        _jettag_c_get_3_108.setTagInfo(_td_c_get_3_108);
        _jettag_c_get_3_108.doStart(context, out);
        _jettag_c_get_3_108.doEnd();
        out.write("s(int startResult, int maxRows) throws ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_3_197 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_3_197); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_3_197.setRuntimeParent(null);
        _jettag_java_import_3_197.setTagInfo(_td_java_import_3_197);
        _jettag_java_import_3_197.doStart(context, out);
        JET2Writer _jettag_java_import_3_197_saved_out = out;
        while (_jettag_java_import_3_197.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
            _jettag_java_import_3_197.handleBodyContent(out);
        }
        out = _jettag_java_import_3_197_saved_out;
        _jettag_java_import_3_197.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_1.setRuntimeParent(null);
        _jettag_c_iterate_5_1.setTagInfo(_td_c_iterate_5_1);
        _jettag_c_iterate_5_1.doStart(context, out);
        while (_jettag_c_iterate_5_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_6_1.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_iterate_6_1.setTagInfo(_td_c_iterate_6_1);
            _jettag_c_iterate_6_1.doStart(context, out);
            while (_jettag_c_iterate_6_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_1.setRuntimeParent(_jettag_c_iterate_6_1);
                _jettag_c_if_7_1.setTagInfo(_td_c_if_7_1);
                _jettag_c_if_7_1.doStart(context, out);
                while (_jettag_c_if_7_1.okToProcessBody()) {
                    out.write("public Set<");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_12); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_12.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_12.setTagInfo(_td_c_get_8_12);
                    _jettag_c_get_8_12.doStart(context, out);
                    _jettag_c_get_8_12.doEnd();
                    out.write("> find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_68); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_68.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_68.setTagInfo(_td_c_get_8_68);
                    _jettag_c_get_8_68.doStart(context, out);
                    _jettag_c_get_8_68.doEnd();
                    RuntimeTagElement _jettag_c_get_8_116 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_116); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_116.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_116.setTagInfo(_td_c_get_8_116);
                    _jettag_c_get_8_116.doStart(context, out);
                    _jettag_c_get_8_116.doEnd();
                    out.write("s(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_176 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_176); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_176.setRuntimeParent(_jettag_c_if_7_1);
                    _jettag_c_get_8_176.setTagInfo(_td_c_get_8_176);
                    _jettag_c_get_8_176.doStart(context, out);
                    _jettag_c_get_8_176.doEnd();
                    out.write(",int start,int max);");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_7_1.handleBodyContent(out);
                }
                _jettag_c_if_7_1.doEnd();
                _jettag_c_iterate_6_1.handleBodyContent(out);
            }
            _jettag_c_iterate_6_1.doEnd();
            _jettag_c_iterate_5_1.handleBodyContent(out);
        }
        _jettag_c_iterate_5_1.doEnd();
    }
}
