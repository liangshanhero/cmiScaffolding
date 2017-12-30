package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_CmiController implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_CmiController() {
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
    private static final TagInfo _td_c_get_9_8 = new TagInfo("c:get", //$NON-NLS-1$
            9, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_8 = new TagInfo("c:get", //$NON-NLS-1$
            10, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$table", //$NON-NLS-1$
                "eachTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_16_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            16, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "colcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "refcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_19_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$colcount+1", //$NON-NLS-1$
                "colcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$refcount+1", //$NON-NLS-1$
                "refcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_24_2 = new TagInfo("c:if", //$NON-NLS-1$
            24, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$colcount!=0or$refcount!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_10 = new TagInfo("c:get", //$NON-NLS-1$
            26, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_67 = new TagInfo("c:get", //$NON-NLS-1$
            26, 67,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_10 = new TagInfo("c:get", //$NON-NLS-1$
            29, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_68 = new TagInfo("c:get", //$NON-NLS-1$
            29, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_38_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            38, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$table", //$NON-NLS-1$
                "eachTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_39_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            39, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "colcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_40_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "refcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$colcount+1", //$NON-NLS-1$
                "colcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_44_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            44, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$refcount+1", //$NON-NLS-1$
                "refcount", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_47_3 = new TagInfo("c:if", //$NON-NLS-1$
            47, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$colcount!=0or$refcount!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_31 = new TagInfo("c:get", //$NON-NLS-1$
            48, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_98 = new TagInfo("c:get", //$NON-NLS-1$
            48, 98,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_48_150 = new TagInfo("c:get", //$NON-NLS-1$
            48, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_51 = new TagInfo("c:get", //$NON-NLS-1$
            49, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_104 = new TagInfo("c:get", //$NON-NLS-1$
            49, 104,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_53_3 = new TagInfo("java:import", //$NON-NLS-1$
            53, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_55_31 = new TagInfo("java:import", //$NON-NLS-1$
            55, 31,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_55_84 = new TagInfo("java:import", //$NON-NLS-1$
            55, 84,
            new String[] {
            },
            new String[] {
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
        out.write("import javax.servlet.http.HttpServletRequest;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.beans.factory.annotation.Autowired;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.stereotype.Controller;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.bind.WebDataBinder;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.web.bind.annotation.InitBinder;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_8.setRuntimeParent(null);
        _jettag_c_get_9_8.setTagInfo(_td_c_get_9_8);
        _jettag_c_get_9_8.doStart(context, out);
        _jettag_c_get_9_8.doEnd();
        out.write(".initBinder.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_8.setRuntimeParent(null);
        _jettag_c_get_10_8.setTagInfo(_td_c_get_10_8);
        _jettag_c_get_10_8.doStart(context, out);
        _jettag_c_get_10_8.doEnd();
        out.write(".domain.*;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("@Controller(\"CmiController\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public class CmiController {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_15_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_15_2.setRuntimeParent(null);
        _jettag_c_iterate_15_2.setTagInfo(_td_c_iterate_15_2);
        _jettag_c_iterate_15_2.doStart(context, out);
        while (_jettag_c_iterate_15_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_16_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_16_2.setRuntimeParent(_jettag_c_iterate_15_2);
            _jettag_c_setVariable_16_2.setTagInfo(_td_c_setVariable_16_2);
            _jettag_c_setVariable_16_2.doStart(context, out);
            _jettag_c_setVariable_16_2.doEnd();
            RuntimeTagElement _jettag_c_setVariable_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_17_2.setRuntimeParent(_jettag_c_iterate_15_2);
            _jettag_c_setVariable_17_2.setTagInfo(_td_c_setVariable_17_2);
            _jettag_c_setVariable_17_2.doStart(context, out);
            _jettag_c_setVariable_17_2.doEnd();
            RuntimeTagElement _jettag_c_iterate_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_18_2.setRuntimeParent(_jettag_c_iterate_15_2);
            _jettag_c_iterate_18_2.setTagInfo(_td_c_iterate_18_2);
            _jettag_c_iterate_18_2.doStart(context, out);
            while (_jettag_c_iterate_18_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_19_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_19_2.setRuntimeParent(_jettag_c_iterate_18_2);
                _jettag_c_setVariable_19_2.setTagInfo(_td_c_setVariable_19_2);
                _jettag_c_setVariable_19_2.doStart(context, out);
                _jettag_c_setVariable_19_2.doEnd();
                _jettag_c_iterate_18_2.handleBodyContent(out);
            }
            _jettag_c_iterate_18_2.doEnd();
            RuntimeTagElement _jettag_c_iterate_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_21_2.setRuntimeParent(_jettag_c_iterate_15_2);
            _jettag_c_iterate_21_2.setTagInfo(_td_c_iterate_21_2);
            _jettag_c_iterate_21_2.doStart(context, out);
            while (_jettag_c_iterate_21_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_22_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_22_2.setRuntimeParent(_jettag_c_iterate_21_2);
                _jettag_c_setVariable_22_2.setTagInfo(_td_c_setVariable_22_2);
                _jettag_c_setVariable_22_2.doStart(context, out);
                _jettag_c_setVariable_22_2.doEnd();
                _jettag_c_iterate_21_2.handleBodyContent(out);
            }
            _jettag_c_iterate_21_2.doEnd();
            RuntimeTagElement _jettag_c_if_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_24_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_24_2.setRuntimeParent(_jettag_c_iterate_15_2);
            _jettag_c_if_24_2.setTagInfo(_td_c_if_24_2);
            _jettag_c_if_24_2.doStart(context, out);
            while (_jettag_c_if_24_2.okToProcessBody()) {
                out.write("\t@Autowired");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tprivate ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_10.setRuntimeParent(_jettag_c_if_24_2);
                _jettag_c_get_26_10.setTagInfo(_td_c_get_26_10);
                _jettag_c_get_26_10.doStart(context, out);
                _jettag_c_get_26_10.doEnd();
                out.write("Editor ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_26_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_67); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_67.setRuntimeParent(_jettag_c_if_24_2);
                _jettag_c_get_26_67.setTagInfo(_td_c_get_26_67);
                _jettag_c_get_26_67.doStart(context, out);
                _jettag_c_get_26_67.doEnd();
                out.write("Editor;");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t@Autowired");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\tprivate ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_29_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_10); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_10.setRuntimeParent(_jettag_c_if_24_2);
                _jettag_c_get_29_10.setTagInfo(_td_c_get_29_10);
                _jettag_c_get_29_10.doStart(context, out);
                _jettag_c_get_29_10.doEnd();
                out.write("sEditor ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_29_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_29_68.setRuntimeParent(_jettag_c_if_24_2);
                _jettag_c_get_29_68.setTagInfo(_td_c_get_29_68);
                _jettag_c_get_29_68.doStart(context, out);
                _jettag_c_get_29_68.doEnd();
                out.write("sEditor;");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_24_2.handleBodyContent(out);
            }
            _jettag_c_if_24_2.doEnd();
            _jettag_c_iterate_15_2.handleBodyContent(out);
        }
        _jettag_c_iterate_15_2.doEnd();
        out.write("\t/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * Register custom, context-specific property editors");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@InitBinder");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void initBinder(WebDataBinder binder, HttpServletRequest request) { ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_38_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_38_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_38_3.setRuntimeParent(null);
        _jettag_c_iterate_38_3.setTagInfo(_td_c_iterate_38_3);
        _jettag_c_iterate_38_3.doStart(context, out);
        while (_jettag_c_iterate_38_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_39_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_39_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_39_3.setRuntimeParent(_jettag_c_iterate_38_3);
            _jettag_c_setVariable_39_3.setTagInfo(_td_c_setVariable_39_3);
            _jettag_c_setVariable_39_3.doStart(context, out);
            _jettag_c_setVariable_39_3.doEnd();
            RuntimeTagElement _jettag_c_setVariable_40_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_40_3.setRuntimeParent(_jettag_c_iterate_38_3);
            _jettag_c_setVariable_40_3.setTagInfo(_td_c_setVariable_40_3);
            _jettag_c_setVariable_40_3.doStart(context, out);
            _jettag_c_setVariable_40_3.doEnd();
            RuntimeTagElement _jettag_c_iterate_41_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_41_3.setRuntimeParent(_jettag_c_iterate_38_3);
            _jettag_c_iterate_41_3.setTagInfo(_td_c_iterate_41_3);
            _jettag_c_iterate_41_3.doStart(context, out);
            while (_jettag_c_iterate_41_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_42_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_42_3.setRuntimeParent(_jettag_c_iterate_41_3);
                _jettag_c_setVariable_42_3.setTagInfo(_td_c_setVariable_42_3);
                _jettag_c_setVariable_42_3.doStart(context, out);
                _jettag_c_setVariable_42_3.doEnd();
                _jettag_c_iterate_41_3.handleBodyContent(out);
            }
            _jettag_c_iterate_41_3.doEnd();
            RuntimeTagElement _jettag_c_iterate_44_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_44_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_44_3.setRuntimeParent(_jettag_c_iterate_38_3);
            _jettag_c_iterate_44_3.setTagInfo(_td_c_iterate_44_3);
            _jettag_c_iterate_44_3.doStart(context, out);
            while (_jettag_c_iterate_44_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_45_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_45_3.setRuntimeParent(_jettag_c_iterate_44_3);
                _jettag_c_setVariable_45_3.setTagInfo(_td_c_setVariable_45_3);
                _jettag_c_setVariable_45_3.doStart(context, out);
                _jettag_c_setVariable_45_3.doEnd();
                _jettag_c_iterate_44_3.handleBodyContent(out);
            }
            _jettag_c_iterate_44_3.doEnd();
            RuntimeTagElement _jettag_c_if_47_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_47_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_47_3.setRuntimeParent(_jettag_c_iterate_38_3);
            _jettag_c_if_47_3.setTagInfo(_td_c_if_47_3);
            _jettag_c_if_47_3.doStart(context, out);
            while (_jettag_c_if_47_3.okToProcessBody()) {
                out.write("\t\tbinder.registerCustomEditor(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_31); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_31.setRuntimeParent(_jettag_c_if_47_3);
                _jettag_c_get_48_31.setTagInfo(_td_c_get_48_31);
                _jettag_c_get_48_31.doStart(context, out);
                _jettag_c_get_48_31.doEnd();
                out.write(".class, \"relative");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_98 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_98); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_98.setRuntimeParent(_jettag_c_if_47_3);
                _jettag_c_get_48_98.setTagInfo(_td_c_get_48_98);
                _jettag_c_get_48_98.doStart(context, out);
                _jettag_c_get_48_98.doEnd();
                out.write("\",");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_48_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_48_150); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_48_150.setRuntimeParent(_jettag_c_if_47_3);
                _jettag_c_get_48_150.setTagInfo(_td_c_get_48_150);
                _jettag_c_get_48_150.doStart(context, out);
                _jettag_c_get_48_150.doEnd();
                out.write("Editor);");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\tbinder.registerCustomEditor(Set.class, \"relative");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_51.setRuntimeParent(_jettag_c_if_47_3);
                _jettag_c_get_49_51.setTagInfo(_td_c_get_49_51);
                _jettag_c_get_49_51.doStart(context, out);
                _jettag_c_get_49_51.doEnd();
                out.write("s\",");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_49_104 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_104); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_49_104.setRuntimeParent(_jettag_c_if_47_3);
                _jettag_c_get_49_104.setTagInfo(_td_c_get_49_104);
                _jettag_c_get_49_104.doStart(context, out);
                _jettag_c_get_49_104.doEnd();
                out.write("sEditor);");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_47_3.handleBodyContent(out);
            }
            _jettag_c_if_47_3.doEnd();
            _jettag_c_iterate_38_3.handleBodyContent(out);
        }
        _jettag_c_iterate_38_3.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_53_3 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_53_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_53_3.setRuntimeParent(null);
        _jettag_java_import_53_3.setTagInfo(_td_java_import_53_3);
        _jettag_java_import_53_3.doStart(context, out);
        JET2Writer _jettag_java_import_53_3_saved_out = out;
        while (_jettag_java_import_53_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.text.SimpleDateFormat");  //$NON-NLS-1$        
            _jettag_java_import_53_3.handleBodyContent(out);
        }
        out = _jettag_java_import_53_3_saved_out;
        _jettag_java_import_53_3.doEnd();
        out.write(" dateFormat = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\");  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdateFormat.setLenient(false);  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_55_31 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_55_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_55_31.setRuntimeParent(null);
        _jettag_java_import_55_31.setTagInfo(_td_java_import_55_31);
        _jettag_java_import_55_31.doStart(context, out);
        JET2Writer _jettag_java_import_55_31_saved_out = out;
        while (_jettag_java_import_55_31.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("java.util.Date");  //$NON-NLS-1$        
            _jettag_java_import_55_31.handleBodyContent(out);
        }
        out = _jettag_java_import_55_31_saved_out;
        _jettag_java_import_55_31.doEnd();
        out.write(".class, new ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_55_84 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_55_84); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_55_84.setRuntimeParent(null);
        _jettag_java_import_55_84.setTagInfo(_td_java_import_55_84);
        _jettag_java_import_55_84.doStart(context, out);
        JET2Writer _jettag_java_import_55_84_saved_out = out;
        while (_jettag_java_import_55_84.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("org.springframework.beans.propertyeditors.CustomDateEditor");  //$NON-NLS-1$        
            _jettag_java_import_55_84.handleBodyContent(out);
        }
        out = _jettag_java_import_55_84_saved_out;
        _jettag_java_import_55_84.doEnd();
        out.write("(dateFormat, true));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(boolean.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.EnhancedBooleanEditor(false));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(Boolean.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.EnhancedBooleanEditor(true));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\tbinder.registerCustomEditor(java.util.Date.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.CustomDateEditor());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\tbinder.registerCustomEditor(java.util.Date.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.CustomDateEditor());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(java.util.Calendar.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.CustomCalendarEditor());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(java.math.BigDecimal.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(Integer.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.NaNHandlingNumberEditor(Integer.class, true));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(String.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.StringEditor());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(Long.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.NaNHandlingNumberEditor(Long.class, true));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbinder.registerCustomEditor(Double.class, new cn.edu.scau.cmi.liangzaoqing.initbinder.NaNHandlingNumberEditor(Double.class, true));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
