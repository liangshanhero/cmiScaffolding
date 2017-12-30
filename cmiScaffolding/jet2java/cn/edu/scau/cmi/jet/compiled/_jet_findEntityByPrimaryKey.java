package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByPrimaryKey implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByPrimaryKey() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_2_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_9 = new TagInfo("c:get", //$NON-NLS-1$
            7, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_64 = new TagInfo("c:get", //$NON-NLS-1$
            7, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_127 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 127,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_194 = new TagInfo("c:if", //$NON-NLS-1$
            7, 194,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_437 = new TagInfo("c:get", //$NON-NLS-1$
            7, 437,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_164 = new TagInfo("c:get", //$NON-NLS-1$
            8, 164,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_1 = new TagInfo("c:if", //$NON-NLS-1$
            9, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_152 = new TagInfo("java:import", //$NON-NLS-1$
            9, 152,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_194 = new TagInfo("c:get", //$NON-NLS-1$
            9, 194,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_1 = new TagInfo("c:if", //$NON-NLS-1$
            10, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_10_152 = new TagInfo("java:import", //$NON-NLS-1$
            10, 152,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_10_200 = new TagInfo("c:get", //$NON-NLS-1$
            10, 200,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_242 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 242,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_291 = new TagInfo("c:if", //$NON-NLS-1$
            10, 291,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_10 = new TagInfo("c:get", //$NON-NLS-1$
            11, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_52 = new TagInfo("c:get", //$NON-NLS-1$
            11, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_115 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 115,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_182 = new TagInfo("c:get", //$NON-NLS-1$
            11, 182,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_217 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 217,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num+(-1)", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_262 = new TagInfo("c:if", //$NON-NLS-1$
            11, 262,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$num>0", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_1.setRuntimeParent(null);
        _jettag_c_iterate_2_1.setTagInfo(_td_c_iterate_2_1);
        _jettag_c_iterate_2_1.doStart(context, out);
        while (_jettag_c_iterate_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_1.setRuntimeParent(_jettag_c_iterate_2_1);
            _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
            _jettag_c_setVariable_3_1.doStart(context, out);
            _jettag_c_setVariable_3_1.doEnd();
            _jettag_c_iterate_2_1.handleBodyContent(out);
        }
        _jettag_c_iterate_2_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_5_1.setRuntimeParent(null);
        _jettag_c_setVariable_5_1.setTagInfo(_td_c_setVariable_5_1);
        _jettag_c_setVariable_5_1.doStart(context, out);
        _jettag_c_setVariable_5_1.doEnd();
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_9.setRuntimeParent(null);
        _jettag_c_get_7_9.setTagInfo(_td_c_get_7_9);
        _jettag_c_get_7_9.doStart(context, out);
        _jettag_c_get_7_9.doEnd();
        out.write(" find");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_64.setRuntimeParent(null);
        _jettag_c_get_7_64.setTagInfo(_td_c_get_7_64);
        _jettag_c_get_7_64.doStart(context, out);
        _jettag_c_get_7_64.doEnd();
        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_7_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_127); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_127.setRuntimeParent(null);
        _jettag_c_iterate_7_127.setTagInfo(_td_c_iterate_7_127);
        _jettag_c_iterate_7_127.doStart(context, out);
        while (_jettag_c_iterate_7_127.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_7_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_194); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_7_194.setRuntimeParent(_jettag_c_iterate_7_127);
            _jettag_c_if_7_194.setTagInfo(_td_c_if_7_194);
            _jettag_c_if_7_194.doStart(context, out);
            while (_jettag_c_if_7_194.okToProcessBody()) {
                out.write("String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_437 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_437); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_437.setRuntimeParent(_jettag_c_if_7_194);
                _jettag_c_get_7_437.setTagInfo(_td_c_get_7_437);
                _jettag_c_get_7_437.doStart(context, out);
                _jettag_c_get_7_437.doEnd();
                _jettag_c_if_7_194.handleBodyContent(out);
            }
            _jettag_c_if_7_194.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_1.setRuntimeParent(_jettag_c_iterate_7_127);
            _jettag_c_if_8_1.setTagInfo(_td_c_if_8_1);
            _jettag_c_if_8_1.doStart(context, out);
            while (_jettag_c_if_8_1.okToProcessBody()) {
                out.write("Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_164 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_164); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_164.setRuntimeParent(_jettag_c_if_8_1);
                _jettag_c_get_8_164.setTagInfo(_td_c_get_8_164);
                _jettag_c_get_8_164.doStart(context, out);
                _jettag_c_get_8_164.doEnd();
                _jettag_c_if_8_1.handleBodyContent(out);
            }
            _jettag_c_if_8_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_9_1.setRuntimeParent(_jettag_c_iterate_7_127);
            _jettag_c_if_9_1.setTagInfo(_td_c_if_9_1);
            _jettag_c_if_9_1.doStart(context, out);
            while (_jettag_c_if_9_1.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_9_152 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_152); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_9_152.setRuntimeParent(_jettag_c_if_9_1);
                _jettag_java_import_9_152.setTagInfo(_td_java_import_9_152);
                _jettag_java_import_9_152.doStart(context, out);
                JET2Writer _jettag_java_import_9_152_saved_out = out;
                while (_jettag_java_import_9_152.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Date");  //$NON-NLS-1$        
                    _jettag_java_import_9_152.handleBodyContent(out);
                }
                out = _jettag_java_import_9_152_saved_out;
                _jettag_java_import_9_152.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_194 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_194); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_194.setRuntimeParent(_jettag_c_if_9_1);
                _jettag_c_get_9_194.setTagInfo(_td_c_get_9_194);
                _jettag_c_get_9_194.doStart(context, out);
                _jettag_c_get_9_194.doEnd();
                _jettag_c_if_9_1.handleBodyContent(out);
            }
            _jettag_c_if_9_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_if_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_1.setRuntimeParent(_jettag_c_iterate_7_127);
            _jettag_c_if_10_1.setTagInfo(_td_c_if_10_1);
            _jettag_c_if_10_1.doStart(context, out);
            while (_jettag_c_if_10_1.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_10_152 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_10_152); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_10_152.setRuntimeParent(_jettag_c_if_10_1);
                _jettag_java_import_10_152.setTagInfo(_td_java_import_10_152);
                _jettag_java_import_10_152.doStart(context, out);
                JET2Writer _jettag_java_import_10_152_saved_out = out;
                while (_jettag_java_import_10_152.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                    _jettag_java_import_10_152.handleBodyContent(out);
                }
                out = _jettag_java_import_10_152_saved_out;
                _jettag_java_import_10_152.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_200 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_200); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_200.setRuntimeParent(_jettag_c_if_10_1);
                _jettag_c_get_10_200.setTagInfo(_td_c_get_10_200);
                _jettag_c_get_10_200.doStart(context, out);
                _jettag_c_get_10_200.doEnd();
                _jettag_c_if_10_1.handleBodyContent(out);
            }
            _jettag_c_if_10_1.doEnd();
            RuntimeTagElement _jettag_c_setVariable_10_242 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_242); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_10_242.setRuntimeParent(_jettag_c_iterate_7_127);
            _jettag_c_setVariable_10_242.setTagInfo(_td_c_setVariable_10_242);
            _jettag_c_setVariable_10_242.doStart(context, out);
            _jettag_c_setVariable_10_242.doEnd();
            RuntimeTagElement _jettag_c_if_10_291 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_291); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_10_291.setRuntimeParent(_jettag_c_iterate_7_127);
            _jettag_c_if_10_291.setTagInfo(_td_c_if_10_291);
            _jettag_c_if_10_291.doStart(context, out);
            while (_jettag_c_if_10_291.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_10_291.handleBodyContent(out);
            }
            _jettag_c_if_10_291.doEnd();
            _jettag_c_iterate_7_127.handleBodyContent(out);
        }
        _jettag_c_iterate_7_127.doEnd();
        out.write("){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_10.setRuntimeParent(null);
        _jettag_c_get_11_10.setTagInfo(_td_c_get_11_10);
        _jettag_c_get_11_10.doStart(context, out);
        _jettag_c_get_11_10.doEnd();
        out.write("DAO.find");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_52.setRuntimeParent(null);
        _jettag_c_get_11_52.setTagInfo(_td_c_get_11_52);
        _jettag_c_get_11_52.doStart(context, out);
        _jettag_c_get_11_52.doEnd();
        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_11_115 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_115); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_115.setRuntimeParent(null);
        _jettag_c_iterate_11_115.setTagInfo(_td_c_iterate_11_115);
        _jettag_c_iterate_11_115.doStart(context, out);
        while (_jettag_c_iterate_11_115.okToProcessBody()) {
            RuntimeTagElement _jettag_c_get_11_182 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_182); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_182.setRuntimeParent(_jettag_c_iterate_11_115);
            _jettag_c_get_11_182.setTagInfo(_td_c_get_11_182);
            _jettag_c_get_11_182.doStart(context, out);
            _jettag_c_get_11_182.doEnd();
            RuntimeTagElement _jettag_c_setVariable_11_217 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_217); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_11_217.setRuntimeParent(_jettag_c_iterate_11_115);
            _jettag_c_setVariable_11_217.setTagInfo(_td_c_setVariable_11_217);
            _jettag_c_setVariable_11_217.doStart(context, out);
            _jettag_c_setVariable_11_217.doEnd();
            RuntimeTagElement _jettag_c_if_11_262 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_262); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_11_262.setRuntimeParent(_jettag_c_iterate_11_115);
            _jettag_c_if_11_262.setTagInfo(_td_c_if_11_262);
            _jettag_c_if_11_262.doStart(context, out);
            while (_jettag_c_if_11_262.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_11_262.handleBodyContent(out);
            }
            _jettag_c_if_11_262.doEnd();
            _jettag_c_iterate_11_115.handleBodyContent(out);
        }
        _jettag_c_iterate_11_115.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
