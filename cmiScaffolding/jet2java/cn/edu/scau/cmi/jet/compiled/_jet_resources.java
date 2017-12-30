package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_resources implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_resources() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_file_4_1 = new TagInfo("ws:file", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/hibemateProperties.jet", //$NON-NLS-1$
                "{$projectName}/cmi/hibernate.properties", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_7_1 = new TagInfo("ws:file", //$NON-NLS-1$
            7, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/jtaProperties.jet", //$NON-NLS-1$
                "{$projectName}/cmi/jta.properties", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_10_1 = new TagInfo("ws:file", //$NON-NLS-1$
            10, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/log4jProperties.jet", //$NON-NLS-1$
                "{$projectName}/cmi/log4j.properties", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_13_1 = new TagInfo("ws:file", //$NON-NLS-1$
            13, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/dao-context.jet", //$NON-NLS-1$
                "{$projectName}/cmi/{$projectName}-dao-context.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_16_1 = new TagInfo("ws:file", //$NON-NLS-1$
            16, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/dao-property.jet", //$NON-NLS-1$
                "{$projectName}/cmi/{$projectName}-dao.properties", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_19_1 = new TagInfo("ws:file", //$NON-NLS-1$
            19, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/security-context.jet", //$NON-NLS-1$
                "{$projectName}/cmi/{$projectName}-security-context.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_22_1 = new TagInfo("ws:file", //$NON-NLS-1$
            22, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/service-context.jet", //$NON-NLS-1$
                "{$projectName}/cmi/{$projectName}-service-context.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_25_1 = new TagInfo("ws:file", //$NON-NLS-1$
            25, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/web-context.jet", //$NON-NLS-1$
                "{$projectName}/cmi/{$projectName}-web-context.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 生成hibernate.properties文件 
        RuntimeTagElement _jettag_ws_file_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_4_1.setRuntimeParent(null);
        _jettag_ws_file_4_1.setTagInfo(_td_ws_file_4_1);
        _jettag_ws_file_4_1.doStart(context, out);
        _jettag_ws_file_4_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成jta.properties文件 
        RuntimeTagElement _jettag_ws_file_7_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_7_1.setRuntimeParent(null);
        _jettag_ws_file_7_1.setTagInfo(_td_ws_file_7_1);
        _jettag_ws_file_7_1.doStart(context, out);
        _jettag_ws_file_7_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成log4j.properties文件 
        RuntimeTagElement _jettag_ws_file_10_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_10_1.setRuntimeParent(null);
        _jettag_ws_file_10_1.setTagInfo(_td_ws_file_10_1);
        _jettag_ws_file_10_1.doStart(context, out);
        _jettag_ws_file_10_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成dao-context.xml文件 
        RuntimeTagElement _jettag_ws_file_13_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_13_1.setRuntimeParent(null);
        _jettag_ws_file_13_1.setTagInfo(_td_ws_file_13_1);
        _jettag_ws_file_13_1.doStart(context, out);
        _jettag_ws_file_13_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成dao.properties文件 
        RuntimeTagElement _jettag_ws_file_16_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_16_1.setRuntimeParent(null);
        _jettag_ws_file_16_1.setTagInfo(_td_ws_file_16_1);
        _jettag_ws_file_16_1.doStart(context, out);
        _jettag_ws_file_16_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成security-context.xml文件 
        RuntimeTagElement _jettag_ws_file_19_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_19_1.setRuntimeParent(null);
        _jettag_ws_file_19_1.setTagInfo(_td_ws_file_19_1);
        _jettag_ws_file_19_1.doStart(context, out);
        _jettag_ws_file_19_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成service-context.xml文件 
        RuntimeTagElement _jettag_ws_file_22_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_22_1.setRuntimeParent(null);
        _jettag_ws_file_22_1.setTagInfo(_td_ws_file_22_1);
        _jettag_ws_file_22_1.doStart(context, out);
        _jettag_ws_file_22_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成web-context.xml文件 
        RuntimeTagElement _jettag_ws_file_25_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_25_1.setRuntimeParent(null);
        _jettag_ws_file_25_1.setTagInfo(_td_ws_file_25_1);
        _jettag_ws_file_25_1.doStart(context, out);
        _jettag_ws_file_25_1.doEnd();
    }
}
