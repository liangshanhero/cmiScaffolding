package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByPrimaryKey_2 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByPrimaryKey_2() {
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
    private static final TagInfo _td_c_get_5_8 = new TagInfo("c:get", //$NON-NLS-1$
            5, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_63 = new TagInfo("c:get", //$NON-NLS-1$
            5, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_126 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 126,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_193 = new TagInfo("c:if", //$NON-NLS-1$
            5, 193,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_436 = new TagInfo("c:get", //$NON-NLS-1$
            5, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_478 = new TagInfo("c:if", //$NON-NLS-1$
            5, 478,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_641 = new TagInfo("c:get", //$NON-NLS-1$
            5, 641,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_683 = new TagInfo("c:if", //$NON-NLS-1$
            5, 683,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_834 = new TagInfo("java:import", //$NON-NLS-1$
            5, 834,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_5_876 = new TagInfo("c:get", //$NON-NLS-1$
            5, 876,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_918 = new TagInfo("c:if", //$NON-NLS-1$
            5, 918,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_5_1069 = new TagInfo("java:import", //$NON-NLS-1$
            5, 1069,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_5_1117 = new TagInfo("c:get", //$NON-NLS-1$
            5, 1117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1159 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1159,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_1208 = new TagInfo("c:if", //$NON-NLS-1$
            5, 1208,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
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
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_8.setRuntimeParent(null);
        _jettag_c_get_5_8.setTagInfo(_td_c_get_5_8);
        _jettag_c_get_5_8.doStart(context, out);
        _jettag_c_get_5_8.doEnd();
        out.write(" find");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_63.setRuntimeParent(null);
        _jettag_c_get_5_63.setTagInfo(_td_c_get_5_63);
        _jettag_c_get_5_63.doStart(context, out);
        _jettag_c_get_5_63.doEnd();
        out.write("ByPrimaryKey(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_5_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_126); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_126.setRuntimeParent(null);
        _jettag_c_iterate_5_126.setTagInfo(_td_c_iterate_5_126);
        _jettag_c_iterate_5_126.doStart(context, out);
        while (_jettag_c_iterate_5_126.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_5_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_193); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_5_193.setRuntimeParent(_jettag_c_iterate_5_126);
            _jettag_c_if_5_193.setTagInfo(_td_c_if_5_193);
            _jettag_c_if_5_193.doStart(context, out);
            while (_jettag_c_if_5_193.okToProcessBody()) {
                out.write("String ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_436); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_436.setRuntimeParent(_jettag_c_if_5_193);
                _jettag_c_get_5_436.setTagInfo(_td_c_get_5_436);
                _jettag_c_get_5_436.doStart(context, out);
                _jettag_c_get_5_436.doEnd();
                _jettag_c_if_5_193.handleBodyContent(out);
            }
            _jettag_c_if_5_193.doEnd();
            RuntimeTagElement _jettag_c_if_5_478 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_478); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_5_478.setRuntimeParent(_jettag_c_iterate_5_126);
            _jettag_c_if_5_478.setTagInfo(_td_c_if_5_478);
            _jettag_c_if_5_478.doStart(context, out);
            while (_jettag_c_if_5_478.okToProcessBody()) {
                out.write("Integer ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_641 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_641); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_641.setRuntimeParent(_jettag_c_if_5_478);
                _jettag_c_get_5_641.setTagInfo(_td_c_get_5_641);
                _jettag_c_get_5_641.doStart(context, out);
                _jettag_c_get_5_641.doEnd();
                _jettag_c_if_5_478.handleBodyContent(out);
            }
            _jettag_c_if_5_478.doEnd();
            RuntimeTagElement _jettag_c_if_5_683 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_683); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_5_683.setRuntimeParent(_jettag_c_iterate_5_126);
            _jettag_c_if_5_683.setTagInfo(_td_c_if_5_683);
            _jettag_c_if_5_683.doStart(context, out);
            while (_jettag_c_if_5_683.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_5_834 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_834); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_5_834.setRuntimeParent(_jettag_c_if_5_683);
                _jettag_java_import_5_834.setTagInfo(_td_java_import_5_834);
                _jettag_java_import_5_834.doStart(context, out);
                JET2Writer _jettag_java_import_5_834_saved_out = out;
                while (_jettag_java_import_5_834.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.util.Date");  //$NON-NLS-1$        
                    _jettag_java_import_5_834.handleBodyContent(out);
                }
                out = _jettag_java_import_5_834_saved_out;
                _jettag_java_import_5_834.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_876 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_876); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_876.setRuntimeParent(_jettag_c_if_5_683);
                _jettag_c_get_5_876.setTagInfo(_td_c_get_5_876);
                _jettag_c_get_5_876.doStart(context, out);
                _jettag_c_get_5_876.doEnd();
                _jettag_c_if_5_683.handleBodyContent(out);
            }
            _jettag_c_if_5_683.doEnd();
            RuntimeTagElement _jettag_c_if_5_918 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_918); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_5_918.setRuntimeParent(_jettag_c_iterate_5_126);
            _jettag_c_if_5_918.setTagInfo(_td_c_if_5_918);
            _jettag_c_if_5_918.doStart(context, out);
            while (_jettag_c_if_5_918.okToProcessBody()) {
                RuntimeTagElement _jettag_java_import_5_1069 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_5_1069); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_import_5_1069.setRuntimeParent(_jettag_c_if_5_918);
                _jettag_java_import_5_1069.setTagInfo(_td_java_import_5_1069);
                _jettag_java_import_5_1069.doStart(context, out);
                JET2Writer _jettag_java_import_5_1069_saved_out = out;
                while (_jettag_java_import_5_1069.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                    _jettag_java_import_5_1069.handleBodyContent(out);
                }
                out = _jettag_java_import_5_1069_saved_out;
                _jettag_java_import_5_1069.doEnd();
                out.write(" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_1117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_1117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_1117.setRuntimeParent(_jettag_c_if_5_918);
                _jettag_c_get_5_1117.setTagInfo(_td_c_get_5_1117);
                _jettag_c_get_5_1117.doStart(context, out);
                _jettag_c_get_5_1117.doEnd();
                _jettag_c_if_5_918.handleBodyContent(out);
            }
            _jettag_c_if_5_918.doEnd();
            RuntimeTagElement _jettag_c_setVariable_5_1159 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1159); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_5_1159.setRuntimeParent(_jettag_c_iterate_5_126);
            _jettag_c_setVariable_5_1159.setTagInfo(_td_c_setVariable_5_1159);
            _jettag_c_setVariable_5_1159.doStart(context, out);
            _jettag_c_setVariable_5_1159.doEnd();
            RuntimeTagElement _jettag_c_if_5_1208 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_1208); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_5_1208.setRuntimeParent(_jettag_c_iterate_5_126);
            _jettag_c_if_5_1208.setTagInfo(_td_c_if_5_1208);
            _jettag_c_if_5_1208.doStart(context, out);
            while (_jettag_c_if_5_1208.okToProcessBody()) {
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_if_5_1208.handleBodyContent(out);
            }
            _jettag_c_if_5_1208.doEnd();
            _jettag_c_iterate_5_126.handleBodyContent(out);
        }
        _jettag_c_iterate_5_126.doEnd();
        out.write(");");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
