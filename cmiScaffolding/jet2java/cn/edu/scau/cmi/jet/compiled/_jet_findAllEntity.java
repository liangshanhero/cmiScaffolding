package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findAllEntity implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findAllEntity() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_13 = new TagInfo("c:get", //$NON-NLS-1$
            2, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_72 = new TagInfo("c:get", //$NON-NLS-1$
            2, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_17 = new TagInfo("c:get", //$NON-NLS-1$
            4, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_13 = new TagInfo("c:get", //$NON-NLS-1$
            9, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_72 = new TagInfo("c:get", //$NON-NLS-1$
            9, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_161 = new TagInfo("java:import", //$NON-NLS-1$
            9, 161,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_10_42 = new TagInfo("c:get", //$NON-NLS-1$
            10, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_11_14 = new TagInfo("java:import", //$NON-NLS-1$
            11, 14,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_11_65 = new TagInfo("c:get", //$NON-NLS-1$
            11, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_14_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            14, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_2 = new TagInfo("c:if", //$NON-NLS-1$
            16, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_13 = new TagInfo("c:get", //$NON-NLS-1$
            18, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_69 = new TagInfo("c:get", //$NON-NLS-1$
            18, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_117 = new TagInfo("c:get", //$NON-NLS-1$
            18, 117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_177 = new TagInfo("c:get", //$NON-NLS-1$
            18, 177,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_43 = new TagInfo("c:get", //$NON-NLS-1$
            19, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_101 = new TagInfo("c:get", //$NON-NLS-1$
            19, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_166 = new TagInfo("c:get", //$NON-NLS-1$
            19, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_29 = new TagInfo("c:get", //$NON-NLS-1$
            20, 29,
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
        out.write("\tpublic Set<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_13.setRuntimeParent(null);
        _jettag_c_get_2_13.setTagInfo(_td_c_get_2_13);
        _jettag_c_get_2_13.doStart(context, out);
        _jettag_c_get_2_13.doEnd();
        out.write("> findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_72); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_72.setRuntimeParent(null);
        _jettag_c_get_2_72.setTagInfo(_td_c_get_2_72);
        _jettag_c_get_2_72.doStart(context, out);
        _jettag_c_get_2_72.doEnd();
        out.write("s() throws DataAccessException {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_17.setRuntimeParent(null);
        _jettag_c_get_4_17.setTagInfo(_td_c_get_4_17);
        _jettag_c_get_4_17.doStart(context, out);
        _jettag_c_get_4_17.doEnd();
        out.write("s(-1, -1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Set<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_13.setRuntimeParent(null);
        _jettag_c_get_9_13.setTagInfo(_td_c_get_9_13);
        _jettag_c_get_9_13.doStart(context, out);
        _jettag_c_get_9_13.doEnd();
        out.write("> findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_72); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_72.setRuntimeParent(null);
        _jettag_c_get_9_72.setTagInfo(_td_c_get_9_72);
        _jettag_c_get_9_72.doStart(context, out);
        _jettag_c_get_9_72.doEnd();
        out.write("s(int startResult, int maxRows) throws ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_9_161 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_161); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_9_161.setRuntimeParent(null);
        _jettag_java_import_9_161.setTagInfo(_td_java_import_9_161);
        _jettag_java_import_9_161.doStart(context, out);
        JET2Writer _jettag_java_import_9_161_saved_out = out;
        while (_jettag_java_import_9_161.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.dao.DataAccessException");  //$NON-NLS-1$        
            _jettag_java_import_9_161.handleBodyContent(out);
        }
        out = _jettag_java_import_9_161_saved_out;
        _jettag_java_import_9_161.doEnd();
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = createNamedQuery(\"findAll");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_42); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_42.setRuntimeParent(null);
        _jettag_c_get_10_42.setTagInfo(_td_c_get_10_42);
        _jettag_c_get_10_42.doStart(context, out);
        _jettag_c_get_10_42.doEnd();
        out.write("s\", startResult, maxRows);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_11_14 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_11_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_11_14.setRuntimeParent(null);
        _jettag_java_import_11_14.setTagInfo(_td_java_import_11_14);
        _jettag_java_import_11_14.doStart(context, out);
        JET2Writer _jettag_java_import_11_14_saved_out = out;
        while (_jettag_java_import_11_14.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.LinkedHashSet");  //$NON-NLS-1$        
            _jettag_java_import_11_14.handleBodyContent(out);
        }
        out = _jettag_java_import_11_14_saved_out;
        _jettag_java_import_11_14.doEnd();
        out.write("<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_65.setRuntimeParent(null);
        _jettag_c_get_11_65.setTagInfo(_td_c_get_11_65);
        _jettag_c_get_11_65.doStart(context, out);
        _jettag_c_get_11_65.doEnd();
        out.write(">(query.getResultList());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_14_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_14_2.setRuntimeParent(null);
        _jettag_c_iterate_14_2.setTagInfo(_td_c_iterate_14_2);
        _jettag_c_iterate_14_2.doStart(context, out);
        while (_jettag_c_iterate_14_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_2.setRuntimeParent(_jettag_c_iterate_14_2);
            _jettag_c_iterate_15_2.setTagInfo(_td_c_iterate_15_2);
            _jettag_c_iterate_15_2.doStart(context, out);
            while (_jettag_c_iterate_15_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_16_2.setRuntimeParent(_jettag_c_iterate_15_2);
                _jettag_c_if_16_2.setTagInfo(_td_c_if_16_2);
                _jettag_c_if_16_2.doStart(context, out);
                while (_jettag_c_if_16_2.okToProcessBody()) {
                    out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic Set<");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_13); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_13.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_18_13.setTagInfo(_td_c_get_18_13);
                    _jettag_c_get_18_13.doStart(context, out);
                    _jettag_c_get_18_13.doEnd();
                    out.write("> find");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_69); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_69.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_18_69.setTagInfo(_td_c_get_18_69);
                    _jettag_c_get_18_69.doStart(context, out);
                    _jettag_c_get_18_69.doEnd();
                    RuntimeTagElement _jettag_c_get_18_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_117); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_117.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_18_117.setTagInfo(_td_c_get_18_117);
                    _jettag_c_get_18_117.doStart(context, out);
                    _jettag_c_get_18_117.doEnd();
                    out.write("s(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_177 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_177); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_177.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_18_177.setTagInfo(_td_c_get_18_177);
                    _jettag_c_get_18_177.doStart(context, out);
                    _jettag_c_get_18_177.doEnd();
                    out.write(",int start,int max)throws DataAccessException{");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\tQuery query = createNamedQuery(\"findAll");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_19_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_43); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_43.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_19_43.setTagInfo(_td_c_get_19_43);
                    _jettag_c_get_19_43.doStart(context, out);
                    _jettag_c_get_19_43.doEnd();
                    RuntimeTagElement _jettag_c_get_19_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_101); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_101.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_19_101.setTagInfo(_td_c_get_19_101);
                    _jettag_c_get_19_101.doStart(context, out);
                    _jettag_c_get_19_101.doEnd();
                    out.write("s\", start, max,");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_19_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_166.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_19_166.setTagInfo(_td_c_get_19_166);
                    _jettag_c_get_19_166.doStart(context, out);
                    _jettag_c_get_19_166.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\treturn new LinkedHashSet<");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_29); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_29.setRuntimeParent(_jettag_c_if_16_2);
                    _jettag_c_get_20_29.setTagInfo(_td_c_get_20_29);
                    _jettag_c_get_20_29.doStart(context, out);
                    _jettag_c_get_20_29.doEnd();
                    out.write(">(query.getResultList());");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_16_2.handleBodyContent(out);
                }
                _jettag_c_if_16_2.doEnd();
                _jettag_c_iterate_15_2.handleBodyContent(out);
            }
            _jettag_c_iterate_15_2.doEnd();
            _jettag_c_iterate_14_2.handleBodyContent(out);
        }
        _jettag_c_iterate_14_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
    }
}
