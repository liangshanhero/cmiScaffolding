package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_countEntity implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_countEntity() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "pkcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_2_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "pk", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$pkcount+1", //$NON-NLS-1$
                "pkcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_22 = new TagInfo("c:get", //$NON-NLS-1$
            6, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_18 = new TagInfo("c:get", //$NON-NLS-1$
            7, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_6 = new TagInfo("c:if", //$NON-NLS-1$
            8, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkcount<2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_51 = new TagInfo("c:get", //$NON-NLS-1$
            8, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_110 = new TagInfo("c:if", //$NON-NLS-1$
            8, 110,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$pkcount>1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_155 = new TagInfo("c:get", //$NON-NLS-1$
            8, 155,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_2 = new TagInfo("c:if", //$NON-NLS-1$
            13, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_30 = new TagInfo("c:get", //$NON-NLS-1$
            15, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_88 = new TagInfo("c:get", //$NON-NLS-1$
            15, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_148 = new TagInfo("c:get", //$NON-NLS-1$
            15, 148,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_36 = new TagInfo("c:get", //$NON-NLS-1$
            16, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_93 = new TagInfo("c:get", //$NON-NLS-1$
            16, 93,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_138 = new TagInfo("c:get", //$NON-NLS-1$
            16, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_18 = new TagInfo("c:get", //$NON-NLS-1$
            17, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_26_3 = new TagInfo("c:if", //$NON-NLS-1$
            26, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_27_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            27, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_28_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            28, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_29_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            29, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_33_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            33, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_35_4 = new TagInfo("c:if", //$NON-NLS-1$
            35, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "rc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_37_4 = new TagInfo("c:choose", //$NON-NLS-1$
            37, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_38_4 = new TagInfo("c:when", //$NON-NLS-1$
            38, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rc/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_40_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            40, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_42_24 = new TagInfo("c:get", //$NON-NLS-1$
            42, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_74 = new TagInfo("c:get", //$NON-NLS-1$
            42, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rc/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_137 = new TagInfo("c:get", //$NON-NLS-1$
            42, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_38 = new TagInfo("c:get", //$NON-NLS-1$
            43, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($referenced/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_96 = new TagInfo("c:get", //$NON-NLS-1$
            43, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_133 = new TagInfo("c:get", //$NON-NLS-1$
            43, 133,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_21 = new TagInfo("c:get", //$NON-NLS-1$
            44, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_1_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_2.setRuntimeParent(null);
        _jettag_c_setVariable_1_2.setTagInfo(_td_c_setVariable_1_2);
        _jettag_c_setVariable_1_2.doStart(context, out);
        _jettag_c_setVariable_1_2.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_2.setRuntimeParent(null);
        _jettag_c_iterate_2_2.setTagInfo(_td_c_iterate_2_2);
        _jettag_c_iterate_2_2.doStart(context, out);
        while (_jettag_c_iterate_2_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_2.setRuntimeParent(_jettag_c_iterate_2_2);
            _jettag_c_setVariable_3_2.setTagInfo(_td_c_setVariable_3_2);
            _jettag_c_setVariable_3_2.doStart(context, out);
            _jettag_c_setVariable_3_2.doEnd();
            _jettag_c_iterate_2_2.handleBodyContent(out);
        }
        _jettag_c_iterate_2_2.doEnd();
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Integer count");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_22.setRuntimeParent(null);
        _jettag_c_get_6_22.setTagInfo(_td_c_get_6_22);
        _jettag_c_get_6_22.doStart(context, out);
        _jettag_c_get_6_22.doEnd();
        out.write("s(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn ((Long) ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_18.setRuntimeParent(null);
        _jettag_c_get_7_18.setTagInfo(_td_c_get_7_18);
        _jettag_c_get_7_18.doStart(context, out);
        _jettag_c_get_7_18.doEnd();
        out.write("DAO.createQuerySingleResult(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_8_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_6.setRuntimeParent(null);
        _jettag_c_if_8_6.setTagInfo(_td_c_if_8_6);
        _jettag_c_if_8_6.doStart(context, out);
        while (_jettag_c_if_8_6.okToProcessBody()) {
            out.write("select count(o) from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_51.setRuntimeParent(_jettag_c_if_8_6);
            _jettag_c_get_8_51.setTagInfo(_td_c_get_8_51);
            _jettag_c_get_8_51.doStart(context, out);
            _jettag_c_get_8_51.doEnd();
            out.write(" o");  //$NON-NLS-1$        
            _jettag_c_if_8_6.handleBodyContent(out);
        }
        _jettag_c_if_8_6.doEnd();
        RuntimeTagElement _jettag_c_if_8_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_110); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_110.setRuntimeParent(null);
        _jettag_c_if_8_110.setTagInfo(_td_c_if_8_110);
        _jettag_c_if_8_110.doStart(context, out);
        while (_jettag_c_if_8_110.okToProcessBody()) {
            out.write("select count(*) from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_155 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_155); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_155.setRuntimeParent(_jettag_c_if_8_110);
            _jettag_c_get_8_155.setTagInfo(_td_c_get_8_155);
            _jettag_c_get_8_155.doStart(context, out);
            _jettag_c_get_8_155.doEnd();
            out.write(" o");  //$NON-NLS-1$        
            _jettag_c_if_8_110.handleBodyContent(out);
        }
        _jettag_c_if_8_110.doEnd();
        out.write("\").getSingleResult()).intValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_2.setRuntimeParent(null);
        _jettag_c_iterate_11_2.setTagInfo(_td_c_iterate_11_2);
        _jettag_c_iterate_11_2.doStart(context, out);
        while (_jettag_c_iterate_11_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_12_2.setRuntimeParent(_jettag_c_iterate_11_2);
            _jettag_c_iterate_12_2.setTagInfo(_td_c_iterate_12_2);
            _jettag_c_iterate_12_2.doStart(context, out);
            while (_jettag_c_iterate_12_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_2.setRuntimeParent(_jettag_c_iterate_12_2);
                _jettag_c_if_13_2.setTagInfo(_td_c_if_13_2);
                _jettag_c_if_13_2.doStart(context, out);
                while (_jettag_c_if_13_2.okToProcessBody()) {
                    out.write("\t@Transactional");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\tpublic Integer countRelative");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_30); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_30.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_15_30.setTagInfo(_td_c_get_15_30);
                    _jettag_c_get_15_30.doStart(context, out);
                    _jettag_c_get_15_30.doEnd();
                    RuntimeTagElement _jettag_c_get_15_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_88); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_88.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_15_88.setTagInfo(_td_c_get_15_88);
                    _jettag_c_get_15_88.doStart(context, out);
                    _jettag_c_get_15_88.doEnd();
                    out.write("s(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_15_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_148); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_15_148.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_15_148.setTagInfo(_td_c_get_15_148);
                    _jettag_c_get_15_148.doStart(context, out);
                    _jettag_c_get_15_148.doEnd();
                    out.write(") {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\tString sql=\"select count(*) from ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_16_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_36); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_36.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_16_36.setTagInfo(_td_c_get_16_36);
                    _jettag_c_get_16_36.doStart(context, out);
                    _jettag_c_get_16_36.doEnd();
                    out.write(" where ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_16_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_93); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_93.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_16_93.setTagInfo(_td_c_get_16_93);
                    _jettag_c_get_16_93.doStart(context, out);
                    _jettag_c_get_16_93.doEnd();
                    out.write("=\"+");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_16_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_138); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_16_138.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_16_138.setTagInfo(_td_c_get_16_138);
                    _jettag_c_get_16_138.doStart(context, out);
                    _jettag_c_get_16_138.doEnd();
                    out.write(";");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\treturn ((Long) ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_18); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_18.setRuntimeParent(_jettag_c_if_13_2);
                    _jettag_c_get_17_18.setTagInfo(_td_c_get_17_18);
                    _jettag_c_get_17_18.doStart(context, out);
                    _jettag_c_get_17_18.doEnd();
                    out.write("DAO.createQuerySingleResult(sql).getSingleResult())");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t.intValue();");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_13_2.handleBodyContent(out);
                }
                _jettag_c_if_13_2.doEnd();
                _jettag_c_iterate_12_2.handleBodyContent(out);
            }
            _jettag_c_iterate_12_2.doEnd();
            _jettag_c_iterate_11_2.handleBodyContent(out);
        }
        _jettag_c_iterate_11_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_24_2.setRuntimeParent(null);
        _jettag_c_iterate_24_2.setTagInfo(_td_c_iterate_24_2);
        _jettag_c_iterate_24_2.doStart(context, out);
        while (_jettag_c_iterate_24_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_25_2.setRuntimeParent(_jettag_c_iterate_24_2);
            _jettag_c_iterate_25_2.setTagInfo(_td_c_iterate_25_2);
            _jettag_c_iterate_25_2.doStart(context, out);
            while (_jettag_c_iterate_25_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_26_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_26_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_26_3.setRuntimeParent(_jettag_c_iterate_25_2);
                _jettag_c_if_26_3.setTagInfo(_td_c_if_26_3);
                _jettag_c_if_26_3.doStart(context, out);
                while (_jettag_c_if_26_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_27_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_27_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_27_4.setRuntimeParent(_jettag_c_if_26_3);
                    _jettag_c_setVariable_27_4.setTagInfo(_td_c_setVariable_27_4);
                    _jettag_c_setVariable_27_4.doStart(context, out);
                    _jettag_c_setVariable_27_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_28_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_28_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_28_4.setRuntimeParent(_jettag_c_if_26_3);
                    _jettag_c_setVariable_28_4.setTagInfo(_td_c_setVariable_28_4);
                    _jettag_c_setVariable_28_4.doStart(context, out);
                    _jettag_c_setVariable_28_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_29_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_29_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_29_4.setRuntimeParent(_jettag_c_if_26_3);
                    _jettag_c_iterate_29_4.setTagInfo(_td_c_iterate_29_4);
                    _jettag_c_iterate_29_4.doStart(context, out);
                    while (_jettag_c_iterate_29_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_30_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_30_5.setRuntimeParent(_jettag_c_iterate_29_4);
                        _jettag_c_setVariable_30_5.setTagInfo(_td_c_setVariable_30_5);
                        _jettag_c_setVariable_30_5.doStart(context, out);
                        _jettag_c_setVariable_30_5.doEnd();
                        _jettag_c_iterate_29_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_29_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_32_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_32_4.setRuntimeParent(_jettag_c_if_26_3);
                    _jettag_c_iterate_32_4.setTagInfo(_td_c_iterate_32_4);
                    _jettag_c_iterate_32_4.doStart(context, out);
                    while (_jettag_c_iterate_32_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_33_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_33_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_33_5.setRuntimeParent(_jettag_c_iterate_32_4);
                        _jettag_c_setVariable_33_5.setTagInfo(_td_c_setVariable_33_5);
                        _jettag_c_setVariable_33_5.doStart(context, out);
                        _jettag_c_setVariable_33_5.doEnd();
                        _jettag_c_iterate_32_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_32_4.doEnd();
                    RuntimeTagElement _jettag_c_if_35_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_35_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_35_4.setRuntimeParent(_jettag_c_if_26_3);
                    _jettag_c_if_35_4.setTagInfo(_td_c_if_35_4);
                    _jettag_c_if_35_4.doStart(context, out);
                    while (_jettag_c_if_35_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_iterate_36_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_36_4.setRuntimeParent(_jettag_c_if_35_4);
                        _jettag_c_iterate_36_4.setTagInfo(_td_c_iterate_36_4);
                        _jettag_c_iterate_36_4.doStart(context, out);
                        while (_jettag_c_iterate_36_4.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_choose_37_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_37_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_37_4.setRuntimeParent(_jettag_c_iterate_36_4);
                            _jettag_c_choose_37_4.setTagInfo(_td_c_choose_37_4);
                            _jettag_c_choose_37_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_37_4_saved_out = out;
                            while (_jettag_c_choose_37_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_38_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_38_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_38_4.setRuntimeParent(_jettag_c_choose_37_4);
                                _jettag_c_when_38_4.setTagInfo(_td_c_when_38_4);
                                _jettag_c_when_38_4.doStart(context, out);
                                JET2Writer _jettag_c_when_38_4_saved_out = out;
                                while (_jettag_c_when_38_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    _jettag_c_when_38_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_38_4_saved_out;
                                _jettag_c_when_38_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_40_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_40_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_40_4.setRuntimeParent(_jettag_c_choose_37_4);
                                _jettag_c_otherwise_40_4.setTagInfo(_td_c_otherwise_40_4);
                                _jettag_c_otherwise_40_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_40_4_saved_out = out;
                                while (_jettag_c_otherwise_40_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("\t\t\t@Transactional");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\tpublic Integer count");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_42_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_24); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_42_24.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_42_24.setTagInfo(_td_c_get_42_24);
                                    _jettag_c_get_42_24.doStart(context, out);
                                    _jettag_c_get_42_24.doEnd();
                                    RuntimeTagElement _jettag_c_get_42_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_74); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_42_74.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_42_74.setTagInfo(_td_c_get_42_74);
                                    _jettag_c_get_42_74.doStart(context, out);
                                    _jettag_c_get_42_74.doEnd();
                                    out.write("s(Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_42_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_137); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_42_137.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_42_137.setTagInfo(_td_c_get_42_137);
                                    _jettag_c_get_42_137.doStart(context, out);
                                    _jettag_c_get_42_137.doEnd();
                                    out.write("){");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\tString sql=\"select count(*) from ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_43_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_38); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_43_38.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_43_38.setTagInfo(_td_c_get_43_38);
                                    _jettag_c_get_43_38.doStart(context, out);
                                    _jettag_c_get_43_38.doEnd();
                                    out.write(" where ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_43_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_96); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_43_96.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_43_96.setTagInfo(_td_c_get_43_96);
                                    _jettag_c_get_43_96.doStart(context, out);
                                    _jettag_c_get_43_96.doEnd();
                                    out.write("=\"+");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_43_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_133); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_43_133.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_43_133.setTagInfo(_td_c_get_43_133);
                                    _jettag_c_get_43_133.doStart(context, out);
                                    _jettag_c_get_43_133.doEnd();
                                    out.write(";");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t\t\treturn ((Long) ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_44_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_21); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_44_21.setRuntimeParent(_jettag_c_otherwise_40_4);
                                    _jettag_c_get_44_21.setTagInfo(_td_c_get_44_21);
                                    _jettag_c_get_44_21.doStart(context, out);
                                    _jettag_c_get_44_21.doEnd();
                                    out.write("DAO.createQuerySingleResult(sql).getSingleResult()).intValue();");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    out.write("\t\t\t}");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_40_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_40_4_saved_out;
                                _jettag_c_otherwise_40_4.doEnd();
                                _jettag_c_choose_37_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_37_4_saved_out;
                            _jettag_c_choose_37_4.doEnd();
                            _jettag_c_iterate_36_4.handleBodyContent(out);
                        }
                        _jettag_c_iterate_36_4.doEnd();
                        _jettag_c_if_35_4.handleBodyContent(out);
                    }
                    _jettag_c_if_35_4.doEnd();
                    _jettag_c_if_26_3.handleBodyContent(out);
                }
                _jettag_c_if_26_3.doEnd();
                _jettag_c_iterate_25_2.handleBodyContent(out);
            }
            _jettag_c_iterate_25_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            _jettag_c_iterate_24_2.handleBodyContent(out);
        }
        _jettag_c_iterate_24_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
    }
}
