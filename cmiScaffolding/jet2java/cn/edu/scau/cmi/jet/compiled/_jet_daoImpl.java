package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_daoImpl implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_daoImpl() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_2_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            2, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "org.example", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_8 = new TagInfo("c:get", //$NON-NLS-1$
            4, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_format_6_1 = new TagInfo("java:format", //$NON-NLS-1$
            6, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_7_2 = new TagInfo("java:import", //$NON-NLS-1$
            7, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_7_72 = new TagInfo("c:get", //$NON-NLS-1$
            7, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_2 = new TagInfo("java:import", //$NON-NLS-1$
            8, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_14 = new TagInfo("c:get", //$NON-NLS-1$
            9, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_95 = new TagInfo("c:get", //$NON-NLS-1$
            9, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_3 = new TagInfo("c:get", //$NON-NLS-1$
            10, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_1 = new TagInfo("c:include", //$NON-NLS-1$
            11, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/variable.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_1 = new TagInfo("c:include", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/constructedFunction.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_1 = new TagInfo("c:include", //$NON-NLS-1$
            17, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/entityManager.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_20_1 = new TagInfo("c:include", //$NON-NLS-1$
            20, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/genericity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_23_1 = new TagInfo("c:include", //$NON-NLS-1$
            23, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/findEntityByPrimaryKeyColumns.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_1 = new TagInfo("c:include", //$NON-NLS-1$
            26, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/findEntityByAttributeColumns.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_1 = new TagInfo("c:include", //$NON-NLS-1$
            29, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/findEntityByPrimaryKey.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_32_1 = new TagInfo("c:include", //$NON-NLS-1$
            32, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/findAllEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_35_1 = new TagInfo("c:include", //$NON-NLS-1$
            35, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/daoImpl/canBeMerged.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(".dao;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_2_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_2_1.setRuntimeParent(null);
        _jettag_java_importsLocation_2_1.setTagInfo(_td_java_importsLocation_2_1);
        _jettag_java_importsLocation_2_1.doStart(context, out);
        _jettag_java_importsLocation_2_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_8.setRuntimeParent(null);
        _jettag_c_get_4_8.setTagInfo(_td_c_get_4_8);
        _jettag_c_get_4_8.doStart(context, out);
        _jettag_c_get_4_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_6_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_6_1.setRuntimeParent(null);
        _jettag_java_format_6_1.setTagInfo(_td_java_format_6_1);
        _jettag_java_format_6_1.doStart(context, out);
        JET2Writer _jettag_java_format_6_1_saved_out = out;
        while (_jettag_java_format_6_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("@");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_7_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_7_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_7_2.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_java_import_7_2.setTagInfo(_td_java_import_7_2);
            _jettag_java_import_7_2.doStart(context, out);
            JET2Writer _jettag_java_import_7_2_saved_out = out;
            while (_jettag_java_import_7_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("org.springframework.stereotype.Repository");  //$NON-NLS-1$        
                _jettag_java_import_7_2.handleBodyContent(out);
            }
            out = _jettag_java_import_7_2_saved_out;
            _jettag_java_import_7_2.doEnd();
            out.write("(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_7_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_72); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_72.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_get_7_72.setTagInfo(_td_c_get_7_72);
            _jettag_c_get_7_72.doStart(context, out);
            _jettag_c_get_7_72.doEnd();
            out.write("DAO\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("@");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_8_2 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_8_2.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_java_import_8_2.setTagInfo(_td_java_import_8_2);
            _jettag_java_import_8_2.doStart(context, out);
            JET2Writer _jettag_java_import_8_2_saved_out = out;
            while (_jettag_java_import_8_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("org.springframework.transaction.annotation.Transactional");  //$NON-NLS-1$        
                _jettag_java_import_8_2.handleBodyContent(out);
            }
            out = _jettag_java_import_8_2_saved_out;
            _jettag_java_import_8_2.doEnd();
            out.write(NL);         
            out.write("public class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_14.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_get_9_14.setTagInfo(_td_c_get_9_14);
            _jettag_c_get_9_14.doStart(context, out);
            _jettag_c_get_9_14.doEnd();
            out.write("DAOImpl extends AbstractJpaDao<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_95); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_95.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_get_9_95.setTagInfo(_td_c_get_9_95);
            _jettag_c_get_9_95.doStart(context, out);
            _jettag_c_get_9_95.doEnd();
            out.write("> implements");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_3.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_get_10_3.setTagInfo(_td_c_get_10_3);
            _jettag_c_get_10_3.doStart(context, out);
            _jettag_c_get_10_3.doEnd();
            out.write("DAO {");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_11_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_11_1.setTagInfo(_td_c_include_11_1);
            _jettag_c_include_11_1.doStart(context, out);
            _jettag_c_include_11_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_14_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_14_1.setTagInfo(_td_c_include_14_1);
            _jettag_c_include_14_1.doStart(context, out);
            _jettag_c_include_14_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_17_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_17_1.setTagInfo(_td_c_include_17_1);
            _jettag_c_include_17_1.doStart(context, out);
            _jettag_c_include_17_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_20_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_20_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_20_1.setTagInfo(_td_c_include_20_1);
            _jettag_c_include_20_1.doStart(context, out);
            _jettag_c_include_20_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_23_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_23_1.setTagInfo(_td_c_include_23_1);
            _jettag_c_include_23_1.doStart(context, out);
            _jettag_c_include_23_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_26_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_26_1.setTagInfo(_td_c_include_26_1);
            _jettag_c_include_26_1.doStart(context, out);
            _jettag_c_include_26_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_29_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_29_1.setTagInfo(_td_c_include_29_1);
            _jettag_c_include_29_1.doStart(context, out);
            _jettag_c_include_29_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_32_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_32_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_32_1.setTagInfo(_td_c_include_32_1);
            _jettag_c_include_32_1.doStart(context, out);
            _jettag_c_include_32_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_35_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_35_1.setRuntimeParent(_jettag_java_format_6_1);
            _jettag_c_include_35_1.setTagInfo(_td_c_include_35_1);
            _jettag_c_include_35_1.doStart(context, out);
            _jettag_c_include_35_1.doEnd();
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_java_format_6_1.handleBodyContent(out);
        }
        out = _jettag_java_format_6_1_saved_out;
        _jettag_java_format_6_1.doEnd();
    }
}
