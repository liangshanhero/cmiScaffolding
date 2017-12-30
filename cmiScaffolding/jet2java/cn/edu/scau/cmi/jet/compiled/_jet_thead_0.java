package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_thead_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_thead_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_f_replaceAll_1_1 = new TagInfo("f:replaceAll", //$NON-NLS-1$
            1, 1,
            new String[] {
                "value", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            },
            new String[] {
                "Dollar_symbol", //$NON-NLS-1$
                "$", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_1_53 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 53,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_160 = new TagInfo("c:get", //$NON-NLS-1$
            1, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "PK", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count+1", //$NON-NLS-1$
                "count", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$count", //$NON-NLS-1$
                "num", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_98 = new TagInfo("c:get", //$NON-NLS-1$
            7, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_26 = new TagInfo("c:get", //$NON-NLS-1$
            13, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_61 = new TagInfo("c:get", //$NON-NLS-1$
            13, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_15_7 = new TagInfo("c:choose", //$NON-NLS-1$
            15, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_16_7 = new TagInfo("c:when", //$NON-NLS-1$
            16, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@type='TIMESTAMP'or$attribute/@type='DATE'or$attribute/@type='TIME'or$attribute/@type='YEAR'or$attribute/@type='DATETIME'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_79 = new TagInfo("c:get", //$NON-NLS-1$
            17, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_114 = new TagInfo("c:get", //$NON-NLS-1$
            17, 114,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_19_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            19, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_20_26 = new TagInfo("c:get", //$NON-NLS-1$
            20, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_61 = new TagInfo("c:get", //$NON-NLS-1$
            20, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_26 = new TagInfo("c:get", //$NON-NLS-1$
            28, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_49 = new TagInfo("c:get", //$NON-NLS-1$
            29, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_84 = new TagInfo("c:get", //$NON-NLS-1$
            29, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_32_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            32, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "rt", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_33_5 = new TagInfo("c:if", //$NON-NLS-1$
            33, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rt/@name=$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_34_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            34, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$rt/columns/column", //$NON-NLS-1$
                "attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_26 = new TagInfo("c:get", //$NON-NLS-1$
            37, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_69 = new TagInfo("c:get", //$NON-NLS-1$
            37, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$attribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_22 = new TagInfo("c:get", //$NON-NLS-1$
            40, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_57 = new TagInfo("c:get", //$NON-NLS-1$
            40, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_100 = new TagInfo("c:get", //$NON-NLS-1$
            40, 100,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($attribute/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_f_replaceAll_1_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "replaceAll", "f:replaceAll", _td_f_replaceAll_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_replaceAll_1_1.setRuntimeParent(null);
        _jettag_f_replaceAll_1_1.setTagInfo(_td_f_replaceAll_1_1);
        _jettag_f_replaceAll_1_1.doStart(context, out);
        JET2Writer _jettag_f_replaceAll_1_1_saved_out = out;
        while (_jettag_f_replaceAll_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_replaceStrings_1_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_replaceStrings_1_53.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_replaceStrings_1_53.setTagInfo(_td_c_replaceStrings_1_53);
            _jettag_c_replaceStrings_1_53.doStart(context, out);
            JET2Writer _jettag_c_replaceStrings_1_53_saved_out = out;
            while (_jettag_c_replaceStrings_1_53.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t<h1><fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_1_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_160); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_1_160.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_1_160.setTagInfo(_td_c_get_1_160);
                _jettag_c_get_1_160.doStart(context, out);
                _jettag_c_get_1_160.doEnd();
                out.write(".title\"/>Details</h1>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_2_2.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_2_2.setTagInfo(_td_c_setVariable_2_2);
                _jettag_c_setVariable_2_2.doStart(context, out);
                _jettag_c_setVariable_2_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_3_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_3_2.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_3_2.setTagInfo(_td_c_iterate_3_2);
                _jettag_c_iterate_3_2.doStart(context, out);
                while (_jettag_c_iterate_3_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_4_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_4_2.setRuntimeParent(_jettag_c_iterate_3_2);
                    _jettag_c_setVariable_4_2.setTagInfo(_td_c_setVariable_4_2);
                    _jettag_c_setVariable_4_2.doStart(context, out);
                    _jettag_c_setVariable_4_2.doEnd();
                    _jettag_c_iterate_3_2.handleBodyContent(out);
                }
                _jettag_c_iterate_3_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_6_2.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_setVariable_6_2.setTagInfo(_td_c_setVariable_6_2);
                _jettag_c_setVariable_6_2.doStart(context, out);
                _jettag_c_setVariable_6_2.doEnd();
                out.write("<div class=\"navitem\"><a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_7_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_98.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_7_98.setTagInfo(_td_c_get_7_98);
                _jettag_c_get_7_98.doStart(context, out);
                _jettag_c_get_7_98.doEnd();
                out.write("?page=homePage\"><span><img src=\"images/icons/back.gif\" /><fmt:message key=\"navigation.back\"/></span></a></div>\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"viewTable\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t<tbody>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_10_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_10_6.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_10_6.setTagInfo(_td_c_iterate_10_6);
                _jettag_c_iterate_10_6.doStart(context, out);
                while (_jettag_c_iterate_10_6.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t<tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<td class=\"label\" valign=\"top\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t<fmt:message key=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_26); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_26.setRuntimeParent(_jettag_c_iterate_10_6);
                    _jettag_c_get_13_26.setTagInfo(_td_c_get_13_26);
                    _jettag_c_get_13_26.doStart(context, out);
                    _jettag_c_get_13_26.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_13_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_13_61.setRuntimeParent(_jettag_c_iterate_10_6);
                    _jettag_c_get_13_61.setTagInfo(_td_c_get_13_61);
                    _jettag_c_get_13_61.doStart(context, out);
                    _jettag_c_get_13_61.doEnd();
                    out.write(".title\"/>:");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_choose_15_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_15_7); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_15_7.setRuntimeParent(_jettag_c_iterate_10_6);
                    _jettag_c_choose_15_7.setTagInfo(_td_c_choose_15_7);
                    _jettag_c_choose_15_7.doStart(context, out);
                    JET2Writer _jettag_c_choose_15_7_saved_out = out;
                    while (_jettag_c_choose_15_7.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_16_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_16_7.setRuntimeParent(_jettag_c_choose_15_7);
                        _jettag_c_when_16_7.setTagInfo(_td_c_when_16_7);
                        _jettag_c_when_16_7.doStart(context, out);
                        JET2Writer _jettag_c_when_16_7_saved_out = out;
                        while (_jettag_c_when_16_7.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t\t\t\t<td><fmt:formatDate pattern=\"yyyy-MM-dd HH:mm:ss\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_17_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_79); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_17_79.setRuntimeParent(_jettag_c_when_16_7);
                            _jettag_c_get_17_79.setTagInfo(_td_c_get_17_79);
                            _jettag_c_get_17_79.doStart(context, out);
                            _jettag_c_get_17_79.doEnd();
                            out.write(".");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_17_114 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_114); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_17_114.setRuntimeParent(_jettag_c_when_16_7);
                            _jettag_c_get_17_114.setTagInfo(_td_c_get_17_114);
                            _jettag_c_get_17_114.doStart(context, out);
                            _jettag_c_get_17_114.doEnd();
                            out.write("}\"/>&nbsp;</td>");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_when_16_7.handleBodyContent(out);
                        }
                        out = _jettag_c_when_16_7_saved_out;
                        _jettag_c_when_16_7.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_19_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_19_7); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_19_7.setRuntimeParent(_jettag_c_choose_15_7);
                        _jettag_c_otherwise_19_7.setTagInfo(_td_c_otherwise_19_7);
                        _jettag_c_otherwise_19_7.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_19_7_saved_out = out;
                        while (_jettag_c_otherwise_19_7.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("\t\t\t\t\t\t\t<td>Dollar_symbol{");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_20_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_26); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_20_26.setRuntimeParent(_jettag_c_otherwise_19_7);
                            _jettag_c_get_20_26.setTagInfo(_td_c_get_20_26);
                            _jettag_c_get_20_26.doStart(context, out);
                            _jettag_c_get_20_26.doEnd();
                            out.write(".");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_20_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_61); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_20_61.setRuntimeParent(_jettag_c_otherwise_19_7);
                            _jettag_c_get_20_61.setTagInfo(_td_c_get_20_61);
                            _jettag_c_get_20_61.doStart(context, out);
                            _jettag_c_get_20_61.doEnd();
                            out.write("}&nbsp;</td>");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_19_7.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_19_7_saved_out;
                        _jettag_c_otherwise_19_7.doEnd();
                        _jettag_c_choose_15_7.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_15_7_saved_out;
                    _jettag_c_choose_15_7.doEnd();
                    out.write("\t\t\t\t\t\t</tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_10_6.handleBodyContent(out);
                }
                _jettag_c_iterate_10_6.doEnd();
                out.write("\t\t\t\t</tbody>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</table>");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_27_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_27_2.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_27_2.setTagInfo(_td_c_iterate_27_2);
                _jettag_c_iterate_27_2.doStart(context, out);
                while (_jettag_c_iterate_27_2.okToProcessBody()) {
                    out.write("\t\t\t<h1><fmt:message key=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_28_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_26); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_28_26.setRuntimeParent(_jettag_c_iterate_27_2);
                    _jettag_c_get_28_26.setTagInfo(_td_c_get_28_26);
                    _jettag_c_get_28_26.doStart(context, out);
                    _jettag_c_get_28_26.doEnd();
                    out.write(".title\"/></h1>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t%Left_angle_bracketsc:if test='Dollar_symbol{");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_49); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_49.setRuntimeParent(_jettag_c_iterate_27_2);
                    _jettag_c_get_29_49.setTagInfo(_td_c_get_29_49);
                    _jettag_c_get_29_49.doStart(context, out);
                    _jettag_c_get_29_49.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_84); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_84.setRuntimeParent(_jettag_c_iterate_27_2);
                    _jettag_c_get_29_84.setTagInfo(_td_c_get_29_84);
                    _jettag_c_get_29_84.doStart(context, out);
                    _jettag_c_get_29_84.doEnd();
                    out.write(" != null}'%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" id=\"viewTable\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t<tbody>");  //$NON-NLS-1$        
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_iterate_32_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_32_5); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_32_5.setRuntimeParent(_jettag_c_iterate_27_2);
                    _jettag_c_iterate_32_5.setTagInfo(_td_c_iterate_32_5);
                    _jettag_c_iterate_32_5.doStart(context, out);
                    while (_jettag_c_iterate_32_5.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_33_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_33_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_33_5.setRuntimeParent(_jettag_c_iterate_32_5);
                        _jettag_c_if_33_5.setTagInfo(_td_c_if_33_5);
                        _jettag_c_if_33_5.doStart(context, out);
                        while (_jettag_c_if_33_5.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_iterate_34_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_34_5); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_34_5.setRuntimeParent(_jettag_c_if_33_5);
                            _jettag_c_iterate_34_5.setTagInfo(_td_c_iterate_34_5);
                            _jettag_c_iterate_34_5.doStart(context, out);
                            while (_jettag_c_iterate_34_5.okToProcessBody()) {
                                out.write("\t\t\t\t\t<tr>");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t<td  class=\"label\">");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t\t<fmt:message key=\"");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_37_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_26); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_37_26.setRuntimeParent(_jettag_c_iterate_34_5);
                                _jettag_c_get_37_26.setTagInfo(_td_c_get_37_26);
                                _jettag_c_get_37_26.doStart(context, out);
                                _jettag_c_get_37_26.doEnd();
                                out.write(".");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_37_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_69); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_37_69.setRuntimeParent(_jettag_c_iterate_34_5);
                                _jettag_c_get_37_69.setTagInfo(_td_c_get_37_69);
                                _jettag_c_get_37_69.doStart(context, out);
                                _jettag_c_get_37_69.doEnd();
                                out.write(".title\"/>:");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t</td>");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t<td>");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t\tDollar_symbol{");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_40_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_22); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_40_22.setRuntimeParent(_jettag_c_iterate_34_5);
                                _jettag_c_get_40_22.setTagInfo(_td_c_get_40_22);
                                _jettag_c_get_40_22.doStart(context, out);
                                _jettag_c_get_40_22.doEnd();
                                out.write(".");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_40_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_57); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_40_57.setRuntimeParent(_jettag_c_iterate_34_5);
                                _jettag_c_get_40_57.setTagInfo(_td_c_get_40_57);
                                _jettag_c_get_40_57.doStart(context, out);
                                _jettag_c_get_40_57.doEnd();
                                out.write(".");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_40_100 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_100); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_40_100.setRuntimeParent(_jettag_c_iterate_34_5);
                                _jettag_c_get_40_100.setTagInfo(_td_c_get_40_100);
                                _jettag_c_get_40_100.doStart(context, out);
                                _jettag_c_get_40_100.doEnd();
                                out.write("}");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t&nbsp;");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t\t</td>");  //$NON-NLS-1$        
                                out.write(NL);         
                                out.write("\t\t\t\t\t</tr>");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_iterate_34_5.handleBodyContent(out);
                            }
                            _jettag_c_iterate_34_5.doEnd();
                            _jettag_c_if_33_5.handleBodyContent(out);
                        }
                        _jettag_c_if_33_5.doEnd();
                        _jettag_c_iterate_32_5.handleBodyContent(out);
                    }
                    _jettag_c_iterate_32_5.doEnd();
                    out.write("\t\t\t\t</tbody>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t</table>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_27_2.handleBodyContent(out);
                }
                _jettag_c_iterate_27_2.doEnd();
                _jettag_c_replaceStrings_1_53.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_1_53_saved_out;
            _jettag_c_replaceStrings_1_53.doEnd();
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
        out.write(NL);         
    }
}
