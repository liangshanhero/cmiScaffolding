package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_body implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_body() {
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
    private static final TagInfo _td_c_get_3_31 = new TagInfo("c:get", //$NON-NLS-1$
            3, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_98 = new TagInfo("c:get", //$NON-NLS-1$
            4, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_149 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 149,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_220 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 220,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_284 = new TagInfo("c:if", //$NON-NLS-1$
            4, 284,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_337 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 337,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_372 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 372,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_407 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 407,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_468 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 468,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_518 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 518,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_587 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 587,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_4_637 = new TagInfo("c:choose", //$NON-NLS-1$
            4, 637,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_4_647 = new TagInfo("c:when", //$NON-NLS-1$
            4, 647,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_674 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 674,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_4_740 = new TagInfo("c:choose", //$NON-NLS-1$
            4, 740,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_4_750 = new TagInfo("c:when", //$NON-NLS-1$
            4, 750,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_4_816 = new TagInfo("c:otherwise", //$NON-NLS-1$
            4, 816,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_4_830 = new TagInfo("c:get", //$NON-NLS-1$
            4, 830,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_4_935 = new TagInfo("c:otherwise", //$NON-NLS-1$
            4, 935,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_4_949 = new TagInfo("c:get", //$NON-NLS-1$
            4, 949,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_1204 = new TagInfo("c:get", //$NON-NLS-1$
            4, 1204,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_70 = new TagInfo("c:get", //$NON-NLS-1$
            6, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_4 = new TagInfo("c:include", //$NON-NLS-1$
            12, 4,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/list/thead.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_13_4 = new TagInfo("c:include", //$NON-NLS-1$
            13, 4,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/list/tbody.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_69 = new TagInfo("c:get", //$NON-NLS-1$
            17, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_69 = new TagInfo("c:get", //$NON-NLS-1$
            19, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_69 = new TagInfo("c:get", //$NON-NLS-1$
            21, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_69 = new TagInfo("c:get", //$NON-NLS-1$
            22, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_69 = new TagInfo("c:get", //$NON-NLS-1$
            23, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_69 = new TagInfo("c:get", //$NON-NLS-1$
            24, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_69 = new TagInfo("c:get", //$NON-NLS-1$
            25, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_69 = new TagInfo("c:get", //$NON-NLS-1$
            26, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_69 = new TagInfo("c:get", //$NON-NLS-1$
            27, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_69 = new TagInfo("c:get", //$NON-NLS-1$
            28, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_69 = new TagInfo("c:get", //$NON-NLS-1$
            29, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_69 = new TagInfo("c:get", //$NON-NLS-1$
            32, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_69 = new TagInfo("c:get", //$NON-NLS-1$
            33, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_69 = new TagInfo("c:get", //$NON-NLS-1$
            34, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_69 = new TagInfo("c:get", //$NON-NLS-1$
            35, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_69 = new TagInfo("c:get", //$NON-NLS-1$
            36, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_69 = new TagInfo("c:get", //$NON-NLS-1$
            37, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_69 = new TagInfo("c:get", //$NON-NLS-1$
            38, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_69 = new TagInfo("c:get", //$NON-NLS-1$
            39, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_69 = new TagInfo("c:get", //$NON-NLS-1$
            40, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_69 = new TagInfo("c:get", //$NON-NLS-1$
            43, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_69 = new TagInfo("c:get", //$NON-NLS-1$
            44, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_69 = new TagInfo("c:get", //$NON-NLS-1$
            45, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_69 = new TagInfo("c:get", //$NON-NLS-1$
            46, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_69 = new TagInfo("c:get", //$NON-NLS-1$
            47, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_69 = new TagInfo("c:get", //$NON-NLS-1$
            48, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_69 = new TagInfo("c:get", //$NON-NLS-1$
            49, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_50_69 = new TagInfo("c:get", //$NON-NLS-1$
            50, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_69 = new TagInfo("c:get", //$NON-NLS-1$
            51, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_69 = new TagInfo("c:get", //$NON-NLS-1$
            53, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_69 = new TagInfo("c:get", //$NON-NLS-1$
            61, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_69 = new TagInfo("c:get", //$NON-NLS-1$
            64, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_69 = new TagInfo("c:get", //$NON-NLS-1$
            70, 69,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
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
                out.write("<body>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t<div id=\"content\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<h1>Manage<fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_3_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_31); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_3_31.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_3_31.setTagInfo(_td_c_get_3_31);
                _jettag_c_get_3_31.doStart(context, out);
                _jettag_c_get_3_31.doEnd();
                out.write(".title\"/>s</h1>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div class=\"navitem\"><a class=\"button\" href=\"Dollar_symbol{pageContext.request.contextPath}/new");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_98.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_4_98.setTagInfo(_td_c_get_4_98);
                _jettag_c_get_4_98.doStart(context, out);
                _jettag_c_get_4_98.doEnd();
                out.write("?");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_iterate_4_149 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_149); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_4_149.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_iterate_4_149.setTagInfo(_td_c_iterate_4_149);
                _jettag_c_iterate_4_149.doStart(context, out);
                while (_jettag_c_iterate_4_149.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_4_220 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_220); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_4_220.setRuntimeParent(_jettag_c_iterate_4_149);
                    _jettag_c_iterate_4_220.setTagInfo(_td_c_iterate_4_220);
                    _jettag_c_iterate_4_220.doStart(context, out);
                    while (_jettag_c_iterate_4_220.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_if_4_284 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_284); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_if_4_284.setRuntimeParent(_jettag_c_iterate_4_220);
                        _jettag_c_if_4_284.setTagInfo(_td_c_if_4_284);
                        _jettag_c_if_4_284.doStart(context, out);
                        while (_jettag_c_if_4_284.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_4_337 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_337); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_4_337.setRuntimeParent(_jettag_c_if_4_284);
                            _jettag_c_setVariable_4_337.setTagInfo(_td_c_setVariable_4_337);
                            _jettag_c_setVariable_4_337.doStart(context, out);
                            _jettag_c_setVariable_4_337.doEnd();
                            RuntimeTagElement _jettag_c_setVariable_4_372 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_372); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_4_372.setRuntimeParent(_jettag_c_if_4_284);
                            _jettag_c_setVariable_4_372.setTagInfo(_td_c_setVariable_4_372);
                            _jettag_c_setVariable_4_372.doStart(context, out);
                            _jettag_c_setVariable_4_372.doEnd();
                            RuntimeTagElement _jettag_c_iterate_4_407 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_407); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_4_407.setRuntimeParent(_jettag_c_if_4_284);
                            _jettag_c_iterate_4_407.setTagInfo(_td_c_iterate_4_407);
                            _jettag_c_iterate_4_407.doStart(context, out);
                            while (_jettag_c_iterate_4_407.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_4_468 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_468); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_4_468.setRuntimeParent(_jettag_c_iterate_4_407);
                                _jettag_c_setVariable_4_468.setTagInfo(_td_c_setVariable_4_468);
                                _jettag_c_setVariable_4_468.doStart(context, out);
                                _jettag_c_setVariable_4_468.doEnd();
                                _jettag_c_iterate_4_407.handleBodyContent(out);
                            }
                            _jettag_c_iterate_4_407.doEnd();
                            RuntimeTagElement _jettag_c_iterate_4_518 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_518); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_4_518.setRuntimeParent(_jettag_c_if_4_284);
                            _jettag_c_iterate_4_518.setTagInfo(_td_c_iterate_4_518);
                            _jettag_c_iterate_4_518.doStart(context, out);
                            while (_jettag_c_iterate_4_518.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_setVariable_4_587 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_587); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_setVariable_4_587.setRuntimeParent(_jettag_c_iterate_4_518);
                                _jettag_c_setVariable_4_587.setTagInfo(_td_c_setVariable_4_587);
                                _jettag_c_setVariable_4_587.doStart(context, out);
                                _jettag_c_setVariable_4_587.doEnd();
                                _jettag_c_iterate_4_518.handleBodyContent(out);
                            }
                            _jettag_c_iterate_4_518.doEnd();
                            RuntimeTagElement _jettag_c_choose_4_637 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_4_637); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_4_637.setRuntimeParent(_jettag_c_if_4_284);
                            _jettag_c_choose_4_637.setTagInfo(_td_c_choose_4_637);
                            _jettag_c_choose_4_637.doStart(context, out);
                            JET2Writer _jettag_c_choose_4_637_saved_out = out;
                            while (_jettag_c_choose_4_637.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_4_647 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_647); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_4_647.setRuntimeParent(_jettag_c_choose_4_637);
                                _jettag_c_when_4_647.setTagInfo(_td_c_when_4_647);
                                _jettag_c_when_4_647.doStart(context, out);
                                JET2Writer _jettag_c_when_4_647_saved_out = out;
                                while (_jettag_c_when_4_647.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    RuntimeTagElement _jettag_c_iterate_4_674 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_674); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_4_674.setRuntimeParent(_jettag_c_when_4_647);
                                    _jettag_c_iterate_4_674.setTagInfo(_td_c_iterate_4_674);
                                    _jettag_c_iterate_4_674.doStart(context, out);
                                    while (_jettag_c_iterate_4_674.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_choose_4_740 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_4_740); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_choose_4_740.setRuntimeParent(_jettag_c_iterate_4_674);
                                        _jettag_c_choose_4_740.setTagInfo(_td_c_choose_4_740);
                                        _jettag_c_choose_4_740.doStart(context, out);
                                        JET2Writer _jettag_c_choose_4_740_saved_out = out;
                                        while (_jettag_c_choose_4_740.okToProcessBody()) {
                                            out = out.newNestedContentWriter();
                                            RuntimeTagElement _jettag_c_when_4_750 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_750); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_when_4_750.setRuntimeParent(_jettag_c_choose_4_740);
                                            _jettag_c_when_4_750.setTagInfo(_td_c_when_4_750);
                                            _jettag_c_when_4_750.doStart(context, out);
                                            JET2Writer _jettag_c_when_4_750_saved_out = out;
                                            while (_jettag_c_when_4_750.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                _jettag_c_when_4_750.handleBodyContent(out);
                                            }
                                            out = _jettag_c_when_4_750_saved_out;
                                            _jettag_c_when_4_750.doEnd();
                                            RuntimeTagElement _jettag_c_otherwise_4_816 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_4_816); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_otherwise_4_816.setRuntimeParent(_jettag_c_choose_4_740);
                                            _jettag_c_otherwise_4_816.setTagInfo(_td_c_otherwise_4_816);
                                            _jettag_c_otherwise_4_816.doStart(context, out);
                                            JET2Writer _jettag_c_otherwise_4_816_saved_out = out;
                                            while (_jettag_c_otherwise_4_816.okToProcessBody()) {
                                                out = out.newNestedContentWriter();
                                                out.write("&");  //$NON-NLS-1$        
                                                RuntimeTagElement _jettag_c_get_4_830 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_830); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_get_4_830.setRuntimeParent(_jettag_c_otherwise_4_816);
                                                _jettag_c_get_4_830.setTagInfo(_td_c_get_4_830);
                                                _jettag_c_get_4_830.doStart(context, out);
                                                _jettag_c_get_4_830.doEnd();
                                                out.write("Page=previousPage");  //$NON-NLS-1$        
                                                _jettag_c_otherwise_4_816.handleBodyContent(out);
                                            }
                                            out = _jettag_c_otherwise_4_816_saved_out;
                                            _jettag_c_otherwise_4_816.doEnd();
                                            _jettag_c_choose_4_740.handleBodyContent(out);
                                        }
                                        out = _jettag_c_choose_4_740_saved_out;
                                        _jettag_c_choose_4_740.doEnd();
                                        _jettag_c_iterate_4_674.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_4_674.doEnd();
                                    _jettag_c_when_4_647.handleBodyContent(out);
                                }
                                out = _jettag_c_when_4_647_saved_out;
                                _jettag_c_when_4_647.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_4_935 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_4_935); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_4_935.setRuntimeParent(_jettag_c_choose_4_637);
                                _jettag_c_otherwise_4_935.setTagInfo(_td_c_otherwise_4_935);
                                _jettag_c_otherwise_4_935.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_4_935_saved_out = out;
                                while (_jettag_c_otherwise_4_935.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("&");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_4_949 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_949); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_4_949.setRuntimeParent(_jettag_c_otherwise_4_935);
                                    _jettag_c_get_4_949.setTagInfo(_td_c_get_4_949);
                                    _jettag_c_get_4_949.doStart(context, out);
                                    _jettag_c_get_4_949.doEnd();
                                    out.write("Page=previousPage");  //$NON-NLS-1$        
                                    _jettag_c_otherwise_4_935.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_4_935_saved_out;
                                _jettag_c_otherwise_4_935.doEnd();
                                _jettag_c_choose_4_637.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_4_637_saved_out;
                            _jettag_c_choose_4_637.doEnd();
                            _jettag_c_if_4_284.handleBodyContent(out);
                        }
                        _jettag_c_if_4_284.doEnd();
                        _jettag_c_iterate_4_220.handleBodyContent(out);
                    }
                    _jettag_c_iterate_4_220.doEnd();
                    _jettag_c_iterate_4_149.handleBodyContent(out);
                }
                _jettag_c_iterate_4_149.doEnd();
                out.write("\"><span><img src=\"Dollar_symbol{pageContext.request.contextPath}/images/icons/new.gif\" /><fmt:message key=\"navigation.new\"/> <fmt:message key=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_1204 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_1204); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_1204.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_4_1204.setTagInfo(_td_c_get_4_1204);
                _jettag_c_get_4_1204.doStart(context, out);
                _jettag_c_get_4_1204.doEnd();
                out.write(".title\"/></span></a></div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<form action=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_70); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_70.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_6_70.setTagInfo(_td_c_get_6_70);
                _jettag_c_get_6_70.doStart(context, out);
                _jettag_c_get_6_70.doEnd();
                out.write("?page=eachPageShow\" method=\"post\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t \t选择每页显示<input type=\"text\" id=\"pageSize\" name=\"pageSize\" style=\"height:15px;width:50px\">条 ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t \t<input type=\"submit\" id=\"sure\" value=\"确认\" style=\"height:22px;width:35px\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</form>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<div id=\"tablewrapper\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<table id=\"listTable\" cellpadding=\"0\" cellspacing=\"0\">");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_12_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_12_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_include_12_4.setTagInfo(_td_c_include_12_4);
                _jettag_c_include_12_4.doStart(context, out);
                _jettag_c_include_12_4.doEnd();
                RuntimeTagElement _jettag_c_include_13_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_13_4); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_13_4.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_include_13_4.setTagInfo(_td_c_include_13_4);
                _jettag_c_include_13_4.doStart(context, out);
                _jettag_c_include_13_4.doEnd();
                out.write("\t\t</table>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<tr>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_17_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_17_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_17_69.setTagInfo(_td_c_get_17_69);
                _jettag_c_get_17_69.doStart(context, out);
                _jettag_c_get_17_69.doEnd();
                out.write("?page=homePage\">首页</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{totalPage>=9}\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_19_69.setTagInfo(_td_c_get_19_69);
                _jettag_c_get_19_69.doStart(context, out);
                _jettag_c_get_19_69.doEnd();
                out.write("?page=previousPage\">上一页</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{prePage-3>0&&prePage+5<=totalPage}\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_21_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_21_69.setTagInfo(_td_c_get_21_69);
                _jettag_c_get_21_69.doStart(context, out);
                _jettag_c_get_21_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage-3}\">Dollar_symbol{prePage-3}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_22_69.setTagInfo(_td_c_get_22_69);
                _jettag_c_get_22_69.doStart(context, out);
                _jettag_c_get_22_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage-2}\">Dollar_symbol{prePage-2}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_23_69.setTagInfo(_td_c_get_23_69);
                _jettag_c_get_23_69.doStart(context, out);
                _jettag_c_get_23_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage-1}\">Dollar_symbol{prePage-1}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_24_69.setTagInfo(_td_c_get_24_69);
                _jettag_c_get_24_69.doStart(context, out);
                _jettag_c_get_24_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage}\">Dollar_symbol{prePage}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_25_69.setTagInfo(_td_c_get_25_69);
                _jettag_c_get_25_69.doStart(context, out);
                _jettag_c_get_25_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage+1}\">Dollar_symbol{prePage+1}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_26_69.setTagInfo(_td_c_get_26_69);
                _jettag_c_get_26_69.doStart(context, out);
                _jettag_c_get_26_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage+2}\">Dollar_symbol{prePage+2}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_27_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_27_69.setTagInfo(_td_c_get_27_69);
                _jettag_c_get_27_69.doStart(context, out);
                _jettag_c_get_27_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage+3}\">Dollar_symbol{prePage+3}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_28_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_28_69.setTagInfo(_td_c_get_28_69);
                _jettag_c_get_28_69.doStart(context, out);
                _jettag_c_get_28_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage+4}\">Dollar_symbol{prePage+4}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_29_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_29_69.setTagInfo(_td_c_get_29_69);
                _jettag_c_get_29_69.doStart(context, out);
                _jettag_c_get_29_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{prePage+5}\">Dollar_symbol{prePage+5}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{prePage-3<=0}\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_32_69.setTagInfo(_td_c_get_32_69);
                _jettag_c_get_32_69.doStart(context, out);
                _jettag_c_get_32_69.doEnd();
                out.write("?page=jumpPage&WantToPage=1\">1</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_33_69.setTagInfo(_td_c_get_33_69);
                _jettag_c_get_33_69.doStart(context, out);
                _jettag_c_get_33_69.doEnd();
                out.write("?page=jumpPage&WantToPage=2\">2</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_34_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_34_69.setTagInfo(_td_c_get_34_69);
                _jettag_c_get_34_69.doStart(context, out);
                _jettag_c_get_34_69.doEnd();
                out.write("?page=jumpPage&WantToPage=3\">3</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_35_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_35_69.setTagInfo(_td_c_get_35_69);
                _jettag_c_get_35_69.doStart(context, out);
                _jettag_c_get_35_69.doEnd();
                out.write("?page=jumpPage&WantToPage=4\">4</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_36_69.setTagInfo(_td_c_get_36_69);
                _jettag_c_get_36_69.doStart(context, out);
                _jettag_c_get_36_69.doEnd();
                out.write("?page=jumpPage&WantToPage=5\">5</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_37_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_37_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_37_69.setTagInfo(_td_c_get_37_69);
                _jettag_c_get_37_69.doStart(context, out);
                _jettag_c_get_37_69.doEnd();
                out.write("?page=jumpPage&WantToPage=6\">6</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_38_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_38_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_38_69.setTagInfo(_td_c_get_38_69);
                _jettag_c_get_38_69.doStart(context, out);
                _jettag_c_get_38_69.doEnd();
                out.write("?page=jumpPage&WantToPage=7\">7</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_39_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_39_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_39_69.setTagInfo(_td_c_get_39_69);
                _jettag_c_get_39_69.doStart(context, out);
                _jettag_c_get_39_69.doEnd();
                out.write("?page=jumpPage&WantToPage=8\">8</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_40_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_40_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_40_69.setTagInfo(_td_c_get_40_69);
                _jettag_c_get_40_69.doStart(context, out);
                _jettag_c_get_40_69.doEnd();
                out.write("?page=jumpPage&WantToPage=9\">9</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{prePage+5>totalPage}\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_43_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_43_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_43_69.setTagInfo(_td_c_get_43_69);
                _jettag_c_get_43_69.doStart(context, out);
                _jettag_c_get_43_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-7}\">Dollar_symbol{totalPage-7}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_44_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_44_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_44_69.setTagInfo(_td_c_get_44_69);
                _jettag_c_get_44_69.doStart(context, out);
                _jettag_c_get_44_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-6}\">Dollar_symbol{totalPage-6}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_45_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_45_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_45_69.setTagInfo(_td_c_get_45_69);
                _jettag_c_get_45_69.doStart(context, out);
                _jettag_c_get_45_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-5}\">Dollar_symbol{totalPage-5}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_46_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_46_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_46_69.setTagInfo(_td_c_get_46_69);
                _jettag_c_get_46_69.doStart(context, out);
                _jettag_c_get_46_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-4}\">Dollar_symbol{totalPage-4}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_47_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_47_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_47_69.setTagInfo(_td_c_get_47_69);
                _jettag_c_get_47_69.doStart(context, out);
                _jettag_c_get_47_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-3}\">Dollar_symbol{totalPage-3}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_48_69.setTagInfo(_td_c_get_48_69);
                _jettag_c_get_48_69.doStart(context, out);
                _jettag_c_get_48_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-2}\">Dollar_symbol{totalPage-2}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_49_69.setTagInfo(_td_c_get_49_69);
                _jettag_c_get_49_69.doStart(context, out);
                _jettag_c_get_49_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage-1}\">Dollar_symbol{totalPage-1}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_50_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_50_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_50_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_50_69.setTagInfo(_td_c_get_50_69);
                _jettag_c_get_50_69.doStart(context, out);
                _jettag_c_get_50_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage}\">Dollar_symbol{totalPage}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_51_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_51_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_51_69.setTagInfo(_td_c_get_51_69);
                _jettag_c_get_51_69.doStart(context, out);
                _jettag_c_get_51_69.doEnd();
                out.write("?page=jumpPage&WantToPage=Dollar_symbol{totalPage+1}\">Dollar_symbol{totalPage+1}</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_53_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_53_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_53_69.setTagInfo(_td_c_get_53_69);
                _jettag_c_get_53_69.doStart(context, out);
                _jettag_c_get_53_69.doEnd();
                out.write("?page=nextPage\">下一页</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_bracketsc:if test=\"Dollar_symbol{totalPage<9}\"%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets% ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t   String pageCount2 = request.getAttribute(\"totalPage\").toString();");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t   int pageCount = Integer.parseInt(pageCount2);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t   for (int i = 1; i <= pageCount+1; i++) {");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_61_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_61_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_61_69.setTagInfo(_td_c_get_61_69);
                _jettag_c_get_61_69.doStart(context, out);
                _jettag_c_get_61_69.doEnd();
                out.write("?page=jumpPage&WantToPage=%Left_angle_brackets%=i%%Right_angle_brackets\">%Left_angle_brackets%=i%%Right_angle_brackets</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets%}%%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t%Left_angle_brackets/c:if%Right_angle_brackets");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td><a href=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_64_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_64_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_64_69.setTagInfo(_td_c_get_64_69);
                _jettag_c_get_64_69.doStart(context, out);
                _jettag_c_get_64_69.doEnd();
                out.write("?page=lastPage\">尾页</a></td>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</tr>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<tr>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t<td>当前为第Dollar_symbol{prePage+1}页</td>&nbsp&nbsp&nbsp");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</tr>每页显示Dollar_symbol{prePageSize}条数据 &nbsp&nbsp总共Dollar_symbol{totalPage+1}页");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<form action=\"Dollar_symbol{pageContext.request.contextPath}/index");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_70_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_69); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_70_69.setRuntimeParent(_jettag_c_replaceStrings_1_53);
                _jettag_c_get_70_69.setTagInfo(_td_c_get_70_69);
                _jettag_c_get_70_69.doStart(context, out);
                _jettag_c_get_70_69.doEnd();
                out.write("?page=jumpPage\" method=\"post\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t跳转到第<input type=\"text\" id=\"WantToPage\" name=\"WantToPage\" style=\"height:15px;width:100px\">页 ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t<input type=\"submit\" id=\"skip\" value=\"跳转\" style=\"height:22px;width:35px\">");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t</form>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t</div>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("</body>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_replaceStrings_1_53.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_1_53_saved_out;
            _jettag_c_replaceStrings_1_53.doEnd();
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
    }
}
