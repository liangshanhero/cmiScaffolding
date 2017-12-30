package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_tbody_1 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_tbody_1() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_3_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "ft", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_14 = new TagInfo("c:if", //$NON-NLS-1$
            4, 14,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$ft/@name=$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ft/primaryKeys/column", //$NON-NLS-1$
                "fc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_23 = new TagInfo("c:get", //$NON-NLS-1$
            8, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_58 = new TagInfo("c:get", //$NON-NLS-1$
            8, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_35 = new TagInfo("c:get", //$NON-NLS-1$
            11, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_70 = new TagInfo("c:get", //$NON-NLS-1$
            11, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_105 = new TagInfo("c:get", //$NON-NLS-1$
            11, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_38 = new TagInfo("c:get", //$NON-NLS-1$
            17, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_73 = new TagInfo("c:get", //$NON-NLS-1$
            17, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_61 = new TagInfo("c:get", //$NON-NLS-1$
            20, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_96 = new TagInfo("c:get", //$NON-NLS-1$
            20, 96,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_22 = new TagInfo("c:get", //$NON-NLS-1$
            29, 22,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_57 = new TagInfo("c:get", //$NON-NLS-1$
            29, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_27 = new TagInfo("c:get", //$NON-NLS-1$
            31, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_62 = new TagInfo("c:get", //$NON-NLS-1$
            31, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_97 = new TagInfo("c:get", //$NON-NLS-1$
            31, 97,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_14 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 14,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ft/columns/column", //$NON-NLS-1$
                "fc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_23 = new TagInfo("c:get", //$NON-NLS-1$
            39, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_58 = new TagInfo("c:get", //$NON-NLS-1$
            39, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_36 = new TagInfo("c:get", //$NON-NLS-1$
            40, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_71 = new TagInfo("c:get", //$NON-NLS-1$
            40, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_106 = new TagInfo("c:get", //$NON-NLS-1$
            40, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_37 = new TagInfo("c:get", //$NON-NLS-1$
            46, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_72 = new TagInfo("c:get", //$NON-NLS-1$
            46, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_60 = new TagInfo("c:get", //$NON-NLS-1$
            49, 60,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_95 = new TagInfo("c:get", //$NON-NLS-1$
            49, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$fc/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<table cellpadding=\"0\" cellspacing=\"0\" id=\"viewTable\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tbody>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_14.setRuntimeParent(null);
        _jettag_c_iterate_3_14.setTagInfo(_td_c_iterate_3_14);
        _jettag_c_iterate_3_14.doStart(context, out);
        while (_jettag_c_iterate_3_14.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_4_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_4_14.setRuntimeParent(_jettag_c_iterate_3_14);
            _jettag_c_if_4_14.setTagInfo(_td_c_if_4_14);
            _jettag_c_if_4_14.doStart(context, out);
            while (_jettag_c_if_4_14.okToProcessBody()) {
                RuntimeTagElement _jettag_c_iterate_5_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_5_14.setRuntimeParent(_jettag_c_if_4_14);
                _jettag_c_iterate_5_14.setTagInfo(_td_c_iterate_5_14);
                _jettag_c_iterate_5_14.doStart(context, out);
                while (_jettag_c_iterate_5_14.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"label\" valign=\"top\"><fmt:message");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tkey=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_23.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_8_23.setTagInfo(_td_c_get_8_23);
                    _jettag_c_get_8_23.doStart(context, out);
                    _jettag_c_get_8_23.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_58); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_58.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_8_58.setTagInfo(_td_c_get_8_58);
                    _jettag_c_get_8_58.doStart(context, out);
                    _jettag_c_get_8_58.doEnd();
                    out.write(".title\" />:</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>%Left_angle_bracketsc:choose%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%Left_angle_bracketsc:when test='Dollar_symbol{newFlag}'%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<form:input id=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_35.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_11_35.setTagInfo(_td_c_get_11_35);
                    _jettag_c_get_11_35.doStart(context, out);
                    _jettag_c_get_11_35.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_70); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_70.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_11_70.setTagInfo(_td_c_get_11_70);
                    _jettag_c_get_11_70.doStart(context, out);
                    _jettag_c_get_11_70.doEnd();
                    out.write("\" path=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_105); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_105.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_11_105.setTagInfo(_td_c_get_11_105);
                    _jettag_c_get_11_105.doStart(context, out);
                    _jettag_c_get_11_105.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcssStyle=\"width:300px;\" />");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<script type=\"text/javascript\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSpring");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.addDecoration(new Spring.ElementDecoration(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telementId : \"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_38); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_38.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_17_38.setTagInfo(_td_c_get_17_38);
                    _jettag_c_get_17_38.doStart(context, out);
                    _jettag_c_get_17_38.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_73.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_17_73.setTagInfo(_td_c_get_17_73);
                    _jettag_c_get_17_73.doStart(context, out);
                    _jettag_c_get_17_73.doEnd();
                    out.write("\",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidgetType : \"dijit.form.NumberTextBox\",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidgetAttrs : {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpromptMessage : \"<fmt:message key=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_61); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_61.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_20_61.setTagInfo(_td_c_get_20_61);
                    _jettag_c_get_20_61.doStart(context, out);
                    _jettag_c_get_20_61.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_96); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_96.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_20_96.setTagInfo(_td_c_get_20_96);
                    _jettag_c_get_20_96.doStart(context, out);
                    _jettag_c_get_20_96.doEnd();
                    out.write(".help\"/>\",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tconstraints : {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tplaces : 0");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}));");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%Left_angle_brackets/c:when%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%Left_angle_bracketsc:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\tDollar_symbol{");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_22); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_22.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_29_22.setTagInfo(_td_c_get_29_22);
                    _jettag_c_get_29_22.doStart(context, out);
                    _jettag_c_get_29_22.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_29_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_57); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_29_57.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_29_57.setTagInfo(_td_c_get_29_57);
                    _jettag_c_get_29_57.doStart(context, out);
                    _jettag_c_get_29_57.doEnd();
                    out.write("}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t&nbsp;");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t<form:hidden id=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_27); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_27.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_31_27.setTagInfo(_td_c_get_31_27);
                    _jettag_c_get_31_27.doStart(context, out);
                    _jettag_c_get_31_27.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_62.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_31_62.setTagInfo(_td_c_get_31_62);
                    _jettag_c_get_31_62.doStart(context, out);
                    _jettag_c_get_31_62.doEnd();
                    out.write("\" path=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_31_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_97); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_31_97.setRuntimeParent(_jettag_c_iterate_5_14);
                    _jettag_c_get_31_97.setTagInfo(_td_c_get_31_97);
                    _jettag_c_get_31_97.doStart(context, out);
                    _jettag_c_get_31_97.doEnd();
                    out.write("\" />");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%Left_angle_brackets/c:otherwise%Right_angle_brackets");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%Left_angle_brackets/c:choose%Right_angle_brackets</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_5_14.handleBodyContent(out);
                }
                _jettag_c_iterate_5_14.doEnd();
                RuntimeTagElement _jettag_c_iterate_36_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_14); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_36_14.setRuntimeParent(_jettag_c_if_4_14);
                _jettag_c_iterate_36_14.setTagInfo(_td_c_iterate_36_14);
                _jettag_c_iterate_36_14.doStart(context, out);
                while (_jettag_c_iterate_36_14.okToProcessBody()) {
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"label\" valign=\"top\"><fmt:message");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tkey=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_39_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_23); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_39_23.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_39_23.setTagInfo(_td_c_get_39_23);
                    _jettag_c_get_39_23.doStart(context, out);
                    _jettag_c_get_39_23.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_39_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_58); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_39_58.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_39_58.setTagInfo(_td_c_get_39_58);
                    _jettag_c_get_39_58.doStart(context, out);
                    _jettag_c_get_39_58.doEnd();
                    out.write(".title\" />:</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><form:input id=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_36); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_36.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_40_36.setTagInfo(_td_c_get_40_36);
                    _jettag_c_get_40_36.doStart(context, out);
                    _jettag_c_get_40_36.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_71); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_71.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_40_71.setTagInfo(_td_c_get_40_71);
                    _jettag_c_get_40_71.doStart(context, out);
                    _jettag_c_get_40_71.doEnd();
                    out.write("\" path=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_40_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_106); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_40_106.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_40_106.setTagInfo(_td_c_get_40_106);
                    _jettag_c_get_40_106.doStart(context, out);
                    _jettag_c_get_40_106.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcssStyle=\"width:300px;\" /> <script");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text/javascript\">");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSpring");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.addDecoration(new Spring.ElementDecoration(");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telementId : \"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_46_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_37); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_46_37.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_46_37.setTagInfo(_td_c_get_46_37);
                    _jettag_c_get_46_37.doStart(context, out);
                    _jettag_c_get_46_37.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_46_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_72); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_46_72.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_46_72.setTagInfo(_td_c_get_46_72);
                    _jettag_c_get_46_72.doStart(context, out);
                    _jettag_c_get_46_72.doEnd();
                    out.write("\",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidgetType : \"dijit.form.ValidationTextBox\",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\twidgetAttrs : {");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpromptMessage : \"<fmt:message key=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_49_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_60); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_60.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_49_60.setTagInfo(_td_c_get_49_60);
                    _jettag_c_get_49_60.doStart(context, out);
                    _jettag_c_get_49_60.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_49_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_95); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_49_95.setRuntimeParent(_jettag_c_iterate_36_14);
                    _jettag_c_get_49_95.setTagInfo(_td_c_get_49_95);
                    _jettag_c_get_49_95.doStart(context, out);
                    _jettag_c_get_49_95.doEnd();
                    out.write(".help\"/>\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}));");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_iterate_36_14.handleBodyContent(out);
                }
                _jettag_c_iterate_36_14.doEnd();
                _jettag_c_if_4_14.handleBodyContent(out);
            }
            _jettag_c_if_4_14.doEnd();
            _jettag_c_iterate_3_14.handleBodyContent(out);
        }
        _jettag_c_iterate_3_14.doEnd();
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tbody>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</table>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
