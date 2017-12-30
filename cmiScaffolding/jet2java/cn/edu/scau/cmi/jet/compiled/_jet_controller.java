package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_controller implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_controller() {
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
    private static final TagInfo _td_c_get_5_8 = new TagInfo("c:get", //$NON-NLS-1$
            5, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_8 = new TagInfo("c:get", //$NON-NLS-1$
            6, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_format_19_1 = new TagInfo("java:format", //$NON-NLS-1$
            19, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_20_14 = new TagInfo("c:get", //$NON-NLS-1$
            20, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_14 = new TagInfo("c:get", //$NON-NLS-1$
            21, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_2 = new TagInfo("c:include", //$NON-NLS-1$
            22, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/variable.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_2 = new TagInfo("c:include", //$NON-NLS-1$
            24, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/indexEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_2 = new TagInfo("c:include", //$NON-NLS-1$
            26, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/selectEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_28_2 = new TagInfo("c:include", //$NON-NLS-1$
            28, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/confirmDeleteEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_30_2 = new TagInfo("c:include", //$NON-NLS-1$
            30, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/deleteEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_32_2 = new TagInfo("c:include", //$NON-NLS-1$
            32, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/editEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_34_2 = new TagInfo("c:include", //$NON-NLS-1$
            34, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/newEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_36_2 = new TagInfo("c:include", //$NON-NLS-1$
            36, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/listEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_38_2 = new TagInfo("c:include", //$NON-NLS-1$
            38, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/saveEntity.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_40_2 = new TagInfo("c:include", //$NON-NLS-1$
            40, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/java/method/controller/streamBinary.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(".web;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_java_importsLocation_2_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_2_1.setRuntimeParent(null);
        _jettag_java_importsLocation_2_1.setTagInfo(_td_java_importsLocation_2_1);
        _jettag_java_importsLocation_2_1.doStart(context, out);
        _jettag_java_importsLocation_2_1.doEnd();
        out.write(NL);         
        out.write("import java.util.Set;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_8.setRuntimeParent(null);
        _jettag_c_get_4_8.setTagInfo(_td_c_get_4_8);
        _jettag_c_get_4_8.doStart(context, out);
        _jettag_c_get_4_8.doEnd();
        out.write(".dao.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_8.setRuntimeParent(null);
        _jettag_c_get_5_8.setTagInfo(_td_c_get_5_8);
        _jettag_c_get_5_8.doStart(context, out);
        _jettag_c_get_5_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_8.setRuntimeParent(null);
        _jettag_c_get_6_8.setTagInfo(_td_c_get_6_8);
        _jettag_c_get_6_8.doStart(context, out);
        _jettag_c_get_6_8.doEnd();
        out.write(".service.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import javax.servlet.http.HttpServletRequest;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.servlet.http.HttpServletResponse;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.springframework.beans.factory.annotation.Autowired;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.context.annotation.Scope;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.stereotype.Controller;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.bind.annotation.ModelAttribute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.bind.annotation.RequestMapping;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.bind.annotation.RequestParam;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.servlet.ModelAndView;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_java_format_19_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_format_19_1.setRuntimeParent(null);
        _jettag_java_format_19_1.setTagInfo(_td_java_format_19_1);
        _jettag_java_format_19_1.doStart(context, out);
        JET2Writer _jettag_java_format_19_1_saved_out = out;
        while (_jettag_java_format_19_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("@Controller(\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_20_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_14.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_get_20_14.setTagInfo(_td_c_get_20_14);
            _jettag_c_get_20_14.doStart(context, out);
            _jettag_c_get_20_14.doEnd();
            out.write("Controller\")");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("public class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_21_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_21_14.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_get_21_14.setTagInfo(_td_c_get_21_14);
            _jettag_c_get_21_14.doStart(context, out);
            _jettag_c_get_21_14.doEnd();
            out.write("Controller extends CmiController {");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_22_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_22_2.setTagInfo(_td_c_include_22_2);
            _jettag_c_include_22_2.doStart(context, out);
            _jettag_c_include_22_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_24_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_24_2.setTagInfo(_td_c_include_24_2);
            _jettag_c_include_24_2.doStart(context, out);
            _jettag_c_include_24_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_26_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_26_2.setTagInfo(_td_c_include_26_2);
            _jettag_c_include_26_2.doStart(context, out);
            _jettag_c_include_26_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_28_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_28_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_28_2.setTagInfo(_td_c_include_28_2);
            _jettag_c_include_28_2.doStart(context, out);
            _jettag_c_include_28_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_30_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_30_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_30_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_30_2.setTagInfo(_td_c_include_30_2);
            _jettag_c_include_30_2.doStart(context, out);
            _jettag_c_include_30_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_32_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_32_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_32_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_32_2.setTagInfo(_td_c_include_32_2);
            _jettag_c_include_32_2.doStart(context, out);
            _jettag_c_include_32_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_34_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_34_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_34_2.setTagInfo(_td_c_include_34_2);
            _jettag_c_include_34_2.doStart(context, out);
            _jettag_c_include_34_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_36_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_36_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_36_2.setTagInfo(_td_c_include_36_2);
            _jettag_c_include_36_2.doStart(context, out);
            _jettag_c_include_36_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_38_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_38_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_38_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_38_2.setTagInfo(_td_c_include_38_2);
            _jettag_c_include_38_2.doStart(context, out);
            _jettag_c_include_38_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_include_40_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_40_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_40_2.setRuntimeParent(_jettag_java_format_19_1);
            _jettag_c_include_40_2.setTagInfo(_td_c_include_40_2);
            _jettag_c_include_40_2.doStart(context, out);
            _jettag_c_include_40_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_java_format_19_1.handleBodyContent(out);
        }
        out = _jettag_java_format_19_1_saved_out;
        _jettag_java_format_19_1.doEnd();
    }
}
