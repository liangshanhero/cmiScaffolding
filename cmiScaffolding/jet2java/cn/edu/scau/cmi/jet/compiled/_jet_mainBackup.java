package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_mainBackup implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_mainBackup() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_4_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "project", //$NON-NLS-1$
                "project", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "projectName", //$NON-NLS-1$
                "project/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "packageName", //$NON-NLS-1$
                "project/package/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "referenceTables", //$NON-NLS-1$
                "project/model/dataBaseType/tables", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "table", //$NON-NLS-1$
                "project/model/dataBaseType/tables/table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_10_1 = new TagInfo("ws:project", //$NON-NLS-1$
            10, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$projectName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_1 = new TagInfo("c:include", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/configure.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_19_1 = new TagInfo("c:include", //$NON-NLS-1$
            19, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/java.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_1 = new TagInfo("c:include", //$NON-NLS-1$
            22, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/jsp.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_1 = new TagInfo("c:include", //$NON-NLS-1$
            25, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/css.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_28_1 = new TagInfo("c:include", //$NON-NLS-1$
            28, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/image.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_31_1 = new TagInfo("c:include", //$NON-NLS-1$
            31, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/lib.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 定义获取数据的变量 
        RuntimeTagElement _jettag_c_setVariable_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_4_1.setRuntimeParent(null);
        _jettag_c_setVariable_4_1.setTagInfo(_td_c_setVariable_4_1);
        _jettag_c_setVariable_4_1.doStart(context, out);
        _jettag_c_setVariable_4_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_5_1.setRuntimeParent(null);
        _jettag_c_setVariable_5_1.setTagInfo(_td_c_setVariable_5_1);
        _jettag_c_setVariable_5_1.doStart(context, out);
        _jettag_c_setVariable_5_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_6_1.setRuntimeParent(null);
        _jettag_c_setVariable_6_1.setTagInfo(_td_c_setVariable_6_1);
        _jettag_c_setVariable_6_1.doStart(context, out);
        _jettag_c_setVariable_6_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_7_1.setRuntimeParent(null);
        _jettag_c_setVariable_7_1.setTagInfo(_td_c_setVariable_7_1);
        _jettag_c_setVariable_7_1.doStart(context, out);
        _jettag_c_setVariable_7_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_project_10_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_10_1.setRuntimeParent(null);
        _jettag_ws_project_10_1.setTagInfo(_td_ws_project_10_1);
        _jettag_ws_project_10_1.doStart(context, out);
        while (_jettag_ws_project_10_1.okToProcessBody()) {
            _jettag_ws_project_10_1.handleBodyContent(out);
        }
        _jettag_ws_project_10_1.doEnd();
        out.write(NL);         
        // 生成配置文件  
        RuntimeTagElement _jettag_c_include_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_14_1.setRuntimeParent(null);
        _jettag_c_include_14_1.setTagInfo(_td_c_include_14_1);
        _jettag_c_include_14_1.doStart(context, out);
        _jettag_c_include_14_1.doEnd();
        out.write(NL);         
        out.write("      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        // 生成java代码  
        RuntimeTagElement _jettag_c_include_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_19_1.setRuntimeParent(null);
        _jettag_c_include_19_1.setTagInfo(_td_c_include_19_1);
        _jettag_c_include_19_1.doStart(context, out);
        _jettag_c_include_19_1.doEnd();
        out.write(NL);         
        // 生成jsp代码  
        RuntimeTagElement _jettag_c_include_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_22_1.setRuntimeParent(null);
        _jettag_c_include_22_1.setTagInfo(_td_c_include_22_1);
        _jettag_c_include_22_1.doStart(context, out);
        _jettag_c_include_22_1.doEnd();
        out.write(NL);         
        // 生成css文件 
        RuntimeTagElement _jettag_c_include_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_25_1.setRuntimeParent(null);
        _jettag_c_include_25_1.setTagInfo(_td_c_include_25_1);
        _jettag_c_include_25_1.doStart(context, out);
        _jettag_c_include_25_1.doEnd();
        out.write(NL);         
        // 生成image文件 
        RuntimeTagElement _jettag_c_include_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_28_1.setRuntimeParent(null);
        _jettag_c_include_28_1.setTagInfo(_td_c_include_28_1);
        _jettag_c_include_28_1.doStart(context, out);
        _jettag_c_include_28_1.doEnd();
        out.write(NL);         
        // 生成lib文件 
        RuntimeTagElement _jettag_c_include_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_31_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_31_1.setRuntimeParent(null);
        _jettag_c_include_31_1.setTagInfo(_td_c_include_31_1);
        _jettag_c_include_31_1.doStart(context, out);
        _jettag_c_include_31_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
    }
}
