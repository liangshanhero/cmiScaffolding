package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_configure implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_configure() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_3_1 = new TagInfo("c:include", //$NON-NLS-1$
            3, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_1 = new TagInfo("c:include", //$NON-NLS-1$
            6, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/settings.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_1 = new TagInfo("c:include", //$NON-NLS-1$
            9, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/properties.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_1 = new TagInfo("c:include", //$NON-NLS-1$
            12, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/jaxws.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_1 = new TagInfo("c:include", //$NON-NLS-1$
            15, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/meta-inf.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_1 = new TagInfo("c:include", //$NON-NLS-1$
            18, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/resources.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_21_1 = new TagInfo("c:include", //$NON-NLS-1$
            21, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/process/web-inf.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_24_1 = new TagInfo("ws:file", //$NON-NLS-1$
            24, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/applicationContext.xml.jet", //$NON-NLS-1$
                "{$projectName}/cmi/applicationContext.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 生成项目根目录下的配置文件  
        RuntimeTagElement _jettag_c_include_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_3_1.setRuntimeParent(null);
        _jettag_c_include_3_1.setTagInfo(_td_c_include_3_1);
        _jettag_c_include_3_1.doStart(context, out);
        _jettag_c_include_3_1.doEnd();
        out.write(NL);         
        // 生成.setting根目录下的配置文件 
        RuntimeTagElement _jettag_c_include_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_6_1.setRuntimeParent(null);
        _jettag_c_include_6_1.setTagInfo(_td_c_include_6_1);
        _jettag_c_include_6_1.doStart(context, out);
        _jettag_c_include_6_1.doEnd();
        out.write(NL);         
        // 生成bundles目录下的配置文件 
        RuntimeTagElement _jettag_c_include_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_9_1.setRuntimeParent(null);
        _jettag_c_include_9_1.setTagInfo(_td_c_include_9_1);
        _jettag_c_include_9_1.doStart(context, out);
        _jettag_c_include_9_1.doEnd();
        out.write(NL);         
        // 生成jaxws目录下的配置文件 
        RuntimeTagElement _jettag_c_include_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_12_1.setRuntimeParent(null);
        _jettag_c_include_12_1.setTagInfo(_td_c_include_12_1);
        _jettag_c_include_12_1.doStart(context, out);
        _jettag_c_include_12_1.doEnd();
        out.write(NL);         
        // META-INF目录下的配置文件 
        RuntimeTagElement _jettag_c_include_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_15_1.setRuntimeParent(null);
        _jettag_c_include_15_1.setTagInfo(_td_c_include_15_1);
        _jettag_c_include_15_1.doStart(context, out);
        _jettag_c_include_15_1.doEnd();
        out.write(NL);         
        // resources目录下的配置文件 
        RuntimeTagElement _jettag_c_include_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_18_1.setRuntimeParent(null);
        _jettag_c_include_18_1.setTagInfo(_td_c_include_18_1);
        _jettag_c_include_18_1.doStart(context, out);
        _jettag_c_include_18_1.doEnd();
        out.write(NL);         
        // 生成WEB-INF根目录下的配置文件 
        RuntimeTagElement _jettag_c_include_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_21_1.setRuntimeParent(null);
        _jettag_c_include_21_1.setTagInfo(_td_c_include_21_1);
        _jettag_c_include_21_1.doStart(context, out);
        _jettag_c_include_21_1.doEnd();
        out.write(NL);         
        // 生成applicationContext.xml文件  
        RuntimeTagElement _jettag_ws_file_24_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_24_1.setRuntimeParent(null);
        _jettag_ws_file_24_1.setTagInfo(_td_ws_file_24_1);
        _jettag_ws_file_24_1.doStart(context, out);
        _jettag_ws_file_24_1.doEnd();
    }
}
