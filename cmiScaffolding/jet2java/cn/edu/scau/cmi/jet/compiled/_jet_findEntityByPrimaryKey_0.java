package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_findEntityByPrimaryKey_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_findEntityByPrimaryKey_0() {
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
                "pk", //$NON-NLS-1$
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
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_8 = new TagInfo("c:get", //$NON-NLS-1$
            7, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_63 = new TagInfo("c:get", //$NON-NLS-1$
            7, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_126 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 126,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_193 = new TagInfo("c:if", //$NON-NLS-1$
            7, 193,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_436 = new TagInfo("c:get", //$NON-NLS-1$
            7, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_478 = new TagInfo("c:if", //$NON-NLS-1$
            7, 478,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_641 = new TagInfo("c:get", //$NON-NLS-1$
            7, 641,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_683 = new TagInfo("c:if", //$NON-NLS-1$
            7, 683,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_7_834 = new TagInfo("java:import", //$NON-NLS-1$
            7, 834,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_7_876 = new TagInfo("c:get", //$NON-NLS-1$
            7, 876,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_918 = new TagInfo("c:if", //$NON-NLS-1$
            7, 918,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_7_1069 = new TagInfo("java:import", //$NON-NLS-1$
            7, 1069,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_7_1117 = new TagInfo("c:get", //$NON-NLS-1$
            7, 1117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_1159 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 1159,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1208 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1208,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_8 = new TagInfo("c:get", //$NON-NLS-1$
            9, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_63 = new TagInfo("c:get", //$NON-NLS-1$
            9, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_126 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 126,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_193 = new TagInfo("c:if", //$NON-NLS-1$
            9, 193,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_436 = new TagInfo("c:get", //$NON-NLS-1$
            9, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_478 = new TagInfo("c:if", //$NON-NLS-1$
            9, 478,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_641 = new TagInfo("c:get", //$NON-NLS-1$
            9, 641,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_683 = new TagInfo("c:if", //$NON-NLS-1$
            9, 683,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_834 = new TagInfo("java:import", //$NON-NLS-1$
            9, 834,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_876 = new TagInfo("c:get", //$NON-NLS-1$
            9, 876,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_918 = new TagInfo("c:if", //$NON-NLS-1$
            9, 918,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_1069 = new TagInfo("java:import", //$NON-NLS-1$
            9, 1069,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_1117 = new TagInfo("c:get", //$NON-NLS-1$
            9, 1117,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$num", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_1 = new TagInfo("c:if", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_8 = new TagInfo("c:get", //$NON-NLS-1$
            13, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_63 = new TagInfo("c:get", //$NON-NLS-1$
            13, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_126 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 126,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_193 = new TagInfo("c:if", //$NON-NLS-1$
            13, 193,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_436 = new TagInfo("c:get", //$NON-NLS-1$
            13, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_483 = new TagInfo("c:if", //$NON-NLS-1$
            13, 483,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_646 = new TagInfo("c:get", //$NON-NLS-1$
            13, 646,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_693 = new TagInfo("c:if", //$NON-NLS-1$
            13, 693,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_13_844 = new TagInfo("java:import", //$NON-NLS-1$
            13, 844,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_886 = new TagInfo("c:get", //$NON-NLS-1$
            13, 886,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_933 = new TagInfo("c:if", //$NON-NLS-1$
            13, 933,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_13_1084 = new TagInfo("java:import", //$NON-NLS-1$
            13, 1084,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_1132 = new TagInfo("c:get", //$NON-NLS-1$
            13, 1132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_1179 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 1179,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+(-1)", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_1228 = new TagInfo("c:if", //$NON-NLS-1$
            13, 1228,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$count>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_8 = new TagInfo("c:get", //$NON-NLS-1$
            15, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_63 = new TagInfo("c:get", //$NON-NLS-1$
            15, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_126 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 126,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_193 = new TagInfo("c:if", //$NON-NLS-1$
            15, 193,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='VARCHAR'or$primaryKey/@type='CHAR'or$primaryKey/@type='SET'or$primaryKey/@type='ENUM'or$primaryKey/@type='TINYTEXT'or$primaryKey/@type='TEXT'or$primaryKey/@type='MEDIUMTEXT'or$primaryKey/@type='LONGTEXT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_436 = new TagInfo("c:get", //$NON-NLS-1$
            15, 436,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_483 = new TagInfo("c:if", //$NON-NLS-1$
            15, 483,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='SMALLINT'or$primaryKey/@type='MEDIUMINT'or$primaryKey/@type='INT'or$primaryKey/@type='INTEGER'or$primaryKey/@type='BIGINT'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_646 = new TagInfo("c:get", //$NON-NLS-1$
            15, 646,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_693 = new TagInfo("c:if", //$NON-NLS-1$
            15, 693,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='TIMESTAMP'or$primaryKey/@type='DATE'or$primaryKey/@type='TIME'or$primaryKey/@type='YEAR'or$primaryKey/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_15_844 = new TagInfo("java:import", //$NON-NLS-1$
            15, 844,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_15_886 = new TagInfo("c:get", //$NON-NLS-1$
            15, 886,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_933 = new TagInfo("c:if", //$NON-NLS-1$
            15, 933,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@type='DOUBLE'or$primaryKey/@type='FLOAT'or$primaryKey/@type='REAL'or$primaryKey/@type='DECIMAL'or$primaryKey/@type='NUMERIC'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_15_1084 = new TagInfo("java:import", //$NON-NLS-1$
            15, 1084,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_15_1132 = new TagInfo("c:get", //$NON-NLS-1$
            15, 1132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$primaryKey/@name", //$NON-NLS-1$
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
        RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_1.setRuntimeParent(null);
        _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
        _jettag_c_if_6_1.doStart(context, out);
        while (_jettag_c_if_6_1.okToProcessBody()) {
            out.write("public ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_7_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_8.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_get_7_8.setTagInfo(_td_c_get_7_8);
            _jettag_c_get_7_8.doStart(context, out);
            _jettag_c_get_7_8.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_7_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_63.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_get_7_63.setTagInfo(_td_c_get_7_63);
            _jettag_c_get_7_63.doStart(context, out);
            _jettag_c_get_7_63.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_7_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_7_126.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_iterate_7_126.setTagInfo(_td_c_iterate_7_126);
            _jettag_c_iterate_7_126.doStart(context, out);
            while (_jettag_c_iterate_7_126.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_7_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_193); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_193.setRuntimeParent(_jettag_c_iterate_7_126);
                _jettag_c_if_7_193.setTagInfo(_td_c_if_7_193);
                _jettag_c_if_7_193.doStart(context, out);
                while (_jettag_c_if_7_193.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_7_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_436.setRuntimeParent(_jettag_c_if_7_193);
                    _jettag_c_get_7_436.setTagInfo(_td_c_get_7_436);
                    _jettag_c_get_7_436.doStart(context, out);
                    _jettag_c_get_7_436.doEnd();
                    _jettag_c_if_7_193.handleBodyContent(out);
                }
                _jettag_c_if_7_193.doEnd();
                RuntimeTagElement _jettag_c_if_7_478 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_478); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_478.setRuntimeParent(_jettag_c_iterate_7_126);
                _jettag_c_if_7_478.setTagInfo(_td_c_if_7_478);
                _jettag_c_if_7_478.doStart(context, out);
                while (_jettag_c_if_7_478.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_7_641 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_641); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_641.setRuntimeParent(_jettag_c_if_7_478);
                    _jettag_c_get_7_641.setTagInfo(_td_c_get_7_641);
                    _jettag_c_get_7_641.doStart(context, out);
                    _jettag_c_get_7_641.doEnd();
                    _jettag_c_if_7_478.handleBodyContent(out);
                }
                _jettag_c_if_7_478.doEnd();
                RuntimeTagElement _jettag_c_if_7_683 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_683); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_683.setRuntimeParent(_jettag_c_iterate_7_126);
                _jettag_c_if_7_683.setTagInfo(_td_c_if_7_683);
                _jettag_c_if_7_683.doStart(context, out);
                while (_jettag_c_if_7_683.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_7_834 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_7_834); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_7_834.setRuntimeParent(_jettag_c_if_7_683);
                    _jettag_java_import_7_834.setTagInfo(_td_java_import_7_834);
                    _jettag_java_import_7_834.doStart(context, out);
                    JET2Writer _jettag_java_import_7_834_saved_out = out;
                    while (_jettag_java_import_7_834.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_7_834.handleBodyContent(out);
                    }
                    out = _jettag_java_import_7_834_saved_out;
                    _jettag_java_import_7_834.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_7_876 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_876); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_876.setRuntimeParent(_jettag_c_if_7_683);
                    _jettag_c_get_7_876.setTagInfo(_td_c_get_7_876);
                    _jettag_c_get_7_876.doStart(context, out);
                    _jettag_c_get_7_876.doEnd();
                    _jettag_c_if_7_683.handleBodyContent(out);
                }
                _jettag_c_if_7_683.doEnd();
                RuntimeTagElement _jettag_c_if_7_918 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_918); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_918.setRuntimeParent(_jettag_c_iterate_7_126);
                _jettag_c_if_7_918.setTagInfo(_td_c_if_7_918);
                _jettag_c_if_7_918.doStart(context, out);
                while (_jettag_c_if_7_918.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_7_1069 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_7_1069); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_7_1069.setRuntimeParent(_jettag_c_if_7_918);
                    _jettag_java_import_7_1069.setTagInfo(_td_java_import_7_1069);
                    _jettag_java_import_7_1069.doStart(context, out);
                    JET2Writer _jettag_java_import_7_1069_saved_out = out;
                    while (_jettag_java_import_7_1069.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_7_1069.handleBodyContent(out);
                    }
                    out = _jettag_java_import_7_1069_saved_out;
                    _jettag_java_import_7_1069.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_7_1117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_1117); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_1117.setRuntimeParent(_jettag_c_if_7_918);
                    _jettag_c_get_7_1117.setTagInfo(_td_c_get_7_1117);
                    _jettag_c_get_7_1117.doStart(context, out);
                    _jettag_c_get_7_1117.doEnd();
                    _jettag_c_if_7_918.handleBodyContent(out);
                }
                _jettag_c_if_7_918.doEnd();
                RuntimeTagElement _jettag_c_setVariable_7_1159 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_1159); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_7_1159.setRuntimeParent(_jettag_c_iterate_7_126);
                _jettag_c_setVariable_7_1159.setTagInfo(_td_c_setVariable_7_1159);
                _jettag_c_setVariable_7_1159.doStart(context, out);
                _jettag_c_setVariable_7_1159.doEnd();
                RuntimeTagElement _jettag_c_if_7_1208 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1208); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_7_1208.setRuntimeParent(_jettag_c_iterate_7_126);
                _jettag_c_if_7_1208.setTagInfo(_td_c_if_7_1208);
                _jettag_c_if_7_1208.doStart(context, out);
                while (_jettag_c_if_7_1208.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_7_1208.handleBodyContent(out);
                }
                _jettag_c_if_7_1208.doEnd();
                _jettag_c_iterate_7_126.handleBodyContent(out);
            }
            _jettag_c_iterate_7_126.doEnd();
            out.write(") throws DataAccessException;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("public ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_8.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_get_9_8.setTagInfo(_td_c_get_9_8);
            _jettag_c_get_9_8.doStart(context, out);
            _jettag_c_get_9_8.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_63.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_get_9_63.setTagInfo(_td_c_get_9_63);
            _jettag_c_get_9_63.doStart(context, out);
            _jettag_c_get_9_63.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_9_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_9_126.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_iterate_9_126.setTagInfo(_td_c_iterate_9_126);
            _jettag_c_iterate_9_126.doStart(context, out);
            while (_jettag_c_iterate_9_126.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_9_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_193); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_193.setRuntimeParent(_jettag_c_iterate_9_126);
                _jettag_c_if_9_193.setTagInfo(_td_c_if_9_193);
                _jettag_c_if_9_193.doStart(context, out);
                while (_jettag_c_if_9_193.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_436.setRuntimeParent(_jettag_c_if_9_193);
                    _jettag_c_get_9_436.setTagInfo(_td_c_get_9_436);
                    _jettag_c_get_9_436.doStart(context, out);
                    _jettag_c_get_9_436.doEnd();
                    _jettag_c_if_9_193.handleBodyContent(out);
                }
                _jettag_c_if_9_193.doEnd();
                RuntimeTagElement _jettag_c_if_9_478 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_478); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_478.setRuntimeParent(_jettag_c_iterate_9_126);
                _jettag_c_if_9_478.setTagInfo(_td_c_if_9_478);
                _jettag_c_if_9_478.doStart(context, out);
                while (_jettag_c_if_9_478.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_641 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_641); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_641.setRuntimeParent(_jettag_c_if_9_478);
                    _jettag_c_get_9_641.setTagInfo(_td_c_get_9_641);
                    _jettag_c_get_9_641.doStart(context, out);
                    _jettag_c_get_9_641.doEnd();
                    _jettag_c_if_9_478.handleBodyContent(out);
                }
                _jettag_c_if_9_478.doEnd();
                RuntimeTagElement _jettag_c_if_9_683 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_683); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_683.setRuntimeParent(_jettag_c_iterate_9_126);
                _jettag_c_if_9_683.setTagInfo(_td_c_if_9_683);
                _jettag_c_if_9_683.doStart(context, out);
                while (_jettag_c_if_9_683.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_9_834 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_834); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_9_834.setRuntimeParent(_jettag_c_if_9_683);
                    _jettag_java_import_9_834.setTagInfo(_td_java_import_9_834);
                    _jettag_java_import_9_834.doStart(context, out);
                    JET2Writer _jettag_java_import_9_834_saved_out = out;
                    while (_jettag_java_import_9_834.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_9_834.handleBodyContent(out);
                    }
                    out = _jettag_java_import_9_834_saved_out;
                    _jettag_java_import_9_834.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_876 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_876); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_876.setRuntimeParent(_jettag_c_if_9_683);
                    _jettag_c_get_9_876.setTagInfo(_td_c_get_9_876);
                    _jettag_c_get_9_876.doStart(context, out);
                    _jettag_c_get_9_876.doEnd();
                    _jettag_c_if_9_683.handleBodyContent(out);
                }
                _jettag_c_if_9_683.doEnd();
                RuntimeTagElement _jettag_c_if_9_918 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_918); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_918.setRuntimeParent(_jettag_c_iterate_9_126);
                _jettag_c_if_9_918.setTagInfo(_td_c_if_9_918);
                _jettag_c_if_9_918.doStart(context, out);
                while (_jettag_c_if_9_918.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_9_1069 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_1069); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_9_1069.setRuntimeParent(_jettag_c_if_9_918);
                    _jettag_java_import_9_1069.setTagInfo(_td_java_import_9_1069);
                    _jettag_java_import_9_1069.doStart(context, out);
                    JET2Writer _jettag_java_import_9_1069_saved_out = out;
                    while (_jettag_java_import_9_1069.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_9_1069.handleBodyContent(out);
                    }
                    out = _jettag_java_import_9_1069_saved_out;
                    _jettag_java_import_9_1069.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_1117 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_1117); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_1117.setRuntimeParent(_jettag_c_if_9_918);
                    _jettag_c_get_9_1117.setTagInfo(_td_c_get_9_1117);
                    _jettag_c_get_9_1117.doStart(context, out);
                    _jettag_c_get_9_1117.doEnd();
                    _jettag_c_if_9_918.handleBodyContent(out);
                }
                _jettag_c_if_9_918.doEnd();
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_iterate_9_126.handleBodyContent(out);
            }
            _jettag_c_iterate_9_126.doEnd();
            out.write(" int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_6_1.handleBodyContent(out);
        }
        _jettag_c_if_6_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_11_1.setRuntimeParent(null);
        _jettag_c_setVariable_11_1.setTagInfo(_td_c_setVariable_11_1);
        _jettag_c_setVariable_11_1.doStart(context, out);
        _jettag_c_setVariable_11_1.doEnd();
        RuntimeTagElement _jettag_c_if_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_12_1.setRuntimeParent(null);
        _jettag_c_if_12_1.setTagInfo(_td_c_if_12_1);
        _jettag_c_if_12_1.doStart(context, out);
        while (_jettag_c_if_12_1.okToProcessBody()) {
            out.write("public ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_8.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_get_13_8.setTagInfo(_td_c_get_13_8);
            _jettag_c_get_13_8.doStart(context, out);
            _jettag_c_get_13_8.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_63.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_get_13_63.setTagInfo(_td_c_get_13_63);
            _jettag_c_get_13_63.doStart(context, out);
            _jettag_c_get_13_63.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_13_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_13_126.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_iterate_13_126.setTagInfo(_td_c_iterate_13_126);
            _jettag_c_iterate_13_126.doStart(context, out);
            while (_jettag_c_iterate_13_126.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_13_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_193); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_193.setRuntimeParent(_jettag_c_iterate_13_126);
                _jettag_c_if_13_193.setTagInfo(_td_c_if_13_193);
                _jettag_c_if_13_193.doStart(context, out);
                while (_jettag_c_if_13_193.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_436.setRuntimeParent(_jettag_c_if_13_193);
                    _jettag_c_get_13_436.setTagInfo(_td_c_get_13_436);
                    _jettag_c_get_13_436.doStart(context, out);
                    _jettag_c_get_13_436.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_13_193.handleBodyContent(out);
                }
                _jettag_c_if_13_193.doEnd();
                RuntimeTagElement _jettag_c_if_13_483 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_483); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_483.setRuntimeParent(_jettag_c_iterate_13_126);
                _jettag_c_if_13_483.setTagInfo(_td_c_if_13_483);
                _jettag_c_if_13_483.doStart(context, out);
                while (_jettag_c_if_13_483.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_646 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_646); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_646.setRuntimeParent(_jettag_c_if_13_483);
                    _jettag_c_get_13_646.setTagInfo(_td_c_get_13_646);
                    _jettag_c_get_13_646.doStart(context, out);
                    _jettag_c_get_13_646.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_13_483.handleBodyContent(out);
                }
                _jettag_c_if_13_483.doEnd();
                RuntimeTagElement _jettag_c_if_13_693 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_693); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_693.setRuntimeParent(_jettag_c_iterate_13_126);
                _jettag_c_if_13_693.setTagInfo(_td_c_if_13_693);
                _jettag_c_if_13_693.doStart(context, out);
                while (_jettag_c_if_13_693.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_13_844 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_13_844); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_13_844.setRuntimeParent(_jettag_c_if_13_693);
                    _jettag_java_import_13_844.setTagInfo(_td_java_import_13_844);
                    _jettag_java_import_13_844.doStart(context, out);
                    JET2Writer _jettag_java_import_13_844_saved_out = out;
                    while (_jettag_java_import_13_844.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_13_844.handleBodyContent(out);
                    }
                    out = _jettag_java_import_13_844_saved_out;
                    _jettag_java_import_13_844.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_886 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_886); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_886.setRuntimeParent(_jettag_c_if_13_693);
                    _jettag_c_get_13_886.setTagInfo(_td_c_get_13_886);
                    _jettag_c_get_13_886.doStart(context, out);
                    _jettag_c_get_13_886.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_13_693.handleBodyContent(out);
                }
                _jettag_c_if_13_693.doEnd();
                RuntimeTagElement _jettag_c_if_13_933 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_933); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_933.setRuntimeParent(_jettag_c_iterate_13_126);
                _jettag_c_if_13_933.setTagInfo(_td_c_if_13_933);
                _jettag_c_if_13_933.doStart(context, out);
                while (_jettag_c_if_13_933.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_13_1084 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_13_1084); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_13_1084.setRuntimeParent(_jettag_c_if_13_933);
                    _jettag_java_import_13_1084.setTagInfo(_td_java_import_13_1084);
                    _jettag_java_import_13_1084.doStart(context, out);
                    JET2Writer _jettag_java_import_13_1084_saved_out = out;
                    while (_jettag_java_import_13_1084.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_13_1084.handleBodyContent(out);
                    }
                    out = _jettag_java_import_13_1084_saved_out;
                    _jettag_java_import_13_1084.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_1132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_1132); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_1132.setRuntimeParent(_jettag_c_if_13_933);
                    _jettag_c_get_13_1132.setTagInfo(_td_c_get_13_1132);
                    _jettag_c_get_13_1132.doStart(context, out);
                    _jettag_c_get_13_1132.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_13_933.handleBodyContent(out);
                }
                _jettag_c_if_13_933.doEnd();
                RuntimeTagElement _jettag_c_setVariable_13_1179 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_1179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_13_1179.setRuntimeParent(_jettag_c_iterate_13_126);
                _jettag_c_setVariable_13_1179.setTagInfo(_td_c_setVariable_13_1179);
                _jettag_c_setVariable_13_1179.doStart(context, out);
                _jettag_c_setVariable_13_1179.doEnd();
                RuntimeTagElement _jettag_c_if_13_1228 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_1228); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_1228.setRuntimeParent(_jettag_c_iterate_13_126);
                _jettag_c_if_13_1228.setTagInfo(_td_c_if_13_1228);
                _jettag_c_if_13_1228.doStart(context, out);
                while (_jettag_c_if_13_1228.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    _jettag_c_if_13_1228.handleBodyContent(out);
                }
                _jettag_c_if_13_1228.doEnd();
                _jettag_c_iterate_13_126.handleBodyContent(out);
            }
            _jettag_c_iterate_13_126.doEnd();
            out.write(") throws DataAccessException;");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("public ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_15_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_8.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_get_15_8.setTagInfo(_td_c_get_15_8);
            _jettag_c_get_15_8.doStart(context, out);
            _jettag_c_get_15_8.doEnd();
            out.write(" find");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_15_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_63.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_get_15_63.setTagInfo(_td_c_get_15_63);
            _jettag_c_get_15_63.doStart(context, out);
            _jettag_c_get_15_63.doEnd();
            out.write("ByPrimaryKey(");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_iterate_15_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_126); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_15_126.setRuntimeParent(_jettag_c_if_12_1);
            _jettag_c_iterate_15_126.setTagInfo(_td_c_iterate_15_126);
            _jettag_c_iterate_15_126.doStart(context, out);
            while (_jettag_c_iterate_15_126.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_15_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_193); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_15_193.setRuntimeParent(_jettag_c_iterate_15_126);
                _jettag_c_if_15_193.setTagInfo(_td_c_if_15_193);
                _jettag_c_if_15_193.doStart(context, out);
                while (_jettag_c_if_15_193.okToProcessBody()) {
                    out.write("String ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_436.setRuntimeParent(_jettag_c_if_15_193);
                    _jettag_c_get_15_436.setTagInfo(_td_c_get_15_436);
                    _jettag_c_get_15_436.doStart(context, out);
                    _jettag_c_get_15_436.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_15_193.handleBodyContent(out);
                }
                _jettag_c_if_15_193.doEnd();
                RuntimeTagElement _jettag_c_if_15_483 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_483); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_15_483.setRuntimeParent(_jettag_c_iterate_15_126);
                _jettag_c_if_15_483.setTagInfo(_td_c_if_15_483);
                _jettag_c_if_15_483.doStart(context, out);
                while (_jettag_c_if_15_483.okToProcessBody()) {
                    out.write("Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_646 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_646); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_646.setRuntimeParent(_jettag_c_if_15_483);
                    _jettag_c_get_15_646.setTagInfo(_td_c_get_15_646);
                    _jettag_c_get_15_646.doStart(context, out);
                    _jettag_c_get_15_646.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_15_483.handleBodyContent(out);
                }
                _jettag_c_if_15_483.doEnd();
                RuntimeTagElement _jettag_c_if_15_693 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_693); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_15_693.setRuntimeParent(_jettag_c_iterate_15_126);
                _jettag_c_if_15_693.setTagInfo(_td_c_if_15_693);
                _jettag_c_if_15_693.doStart(context, out);
                while (_jettag_c_if_15_693.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_15_844 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_15_844); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_15_844.setRuntimeParent(_jettag_c_if_15_693);
                    _jettag_java_import_15_844.setTagInfo(_td_java_import_15_844);
                    _jettag_java_import_15_844.doStart(context, out);
                    JET2Writer _jettag_java_import_15_844_saved_out = out;
                    while (_jettag_java_import_15_844.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.util.Date");  //$NON-NLS-1$        
                        _jettag_java_import_15_844.handleBodyContent(out);
                    }
                    out = _jettag_java_import_15_844_saved_out;
                    _jettag_java_import_15_844.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_886 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_886); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_886.setRuntimeParent(_jettag_c_if_15_693);
                    _jettag_c_get_15_886.setTagInfo(_td_c_get_15_886);
                    _jettag_c_get_15_886.doStart(context, out);
                    _jettag_c_get_15_886.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_15_693.handleBodyContent(out);
                }
                _jettag_c_if_15_693.doEnd();
                RuntimeTagElement _jettag_c_if_15_933 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_933); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_15_933.setRuntimeParent(_jettag_c_iterate_15_126);
                _jettag_c_if_15_933.setTagInfo(_td_c_if_15_933);
                _jettag_c_if_15_933.doStart(context, out);
                while (_jettag_c_if_15_933.okToProcessBody()) {
                    RuntimeTagElement _jettag_java_import_15_1084 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_15_1084); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_import_15_1084.setRuntimeParent(_jettag_c_if_15_933);
                    _jettag_java_import_15_1084.setTagInfo(_td_java_import_15_1084);
                    _jettag_java_import_15_1084.doStart(context, out);
                    JET2Writer _jettag_java_import_15_1084_saved_out = out;
                    while (_jettag_java_import_15_1084.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("java.math.BigDecimal");  //$NON-NLS-1$        
                        _jettag_java_import_15_1084.handleBodyContent(out);
                    }
                    out = _jettag_java_import_15_1084_saved_out;
                    _jettag_java_import_15_1084.doEnd();
                    out.write(" ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_1132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_1132); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_1132.setRuntimeParent(_jettag_c_if_15_933);
                    _jettag_c_get_15_1132.setTagInfo(_td_c_get_15_1132);
                    _jettag_c_get_15_1132.doStart(context, out);
                    _jettag_c_get_15_1132.doEnd();
                    out.write("Field");  //$NON-NLS-1$        
                    _jettag_c_if_15_933.handleBodyContent(out);
                }
                _jettag_c_if_15_933.doEnd();
                out.write(",");  //$NON-NLS-1$        
                _jettag_c_iterate_15_126.handleBodyContent(out);
            }
            _jettag_c_iterate_15_126.doEnd();
            out.write(" int startResult, int maxRows) throws DataAccessException;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_12_1.handleBodyContent(out);
        }
        _jettag_c_if_12_1.doEnd();
    }
}
