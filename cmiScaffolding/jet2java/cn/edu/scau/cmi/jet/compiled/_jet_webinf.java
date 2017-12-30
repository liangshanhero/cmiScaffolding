package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_webinf implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_webinf() {
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
                "templates/content/configure/appengine-web.xml.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/appengine-web.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_7_1 = new TagInfo("ws:file", //$NON-NLS-1$
            7, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/decorators.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/decorators.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_10_1 = new TagInfo("ws:file", //$NON-NLS-1$
            10, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/spring-form.tld.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/spring-form.tld", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_13_1 = new TagInfo("ws:file", //$NON-NLS-1$
            13, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/spring.tld.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/spring.tld", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_16_1 = new TagInfo("ws:file", //$NON-NLS-1$
            16, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/webxml.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/web.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 生成appengine-web.xml文件 
        RuntimeTagElement _jettag_ws_file_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_4_1.setRuntimeParent(null);
        _jettag_ws_file_4_1.setTagInfo(_td_ws_file_4_1);
        _jettag_ws_file_4_1.doStart(context, out);
        _jettag_ws_file_4_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成decorators.xml文件 
        RuntimeTagElement _jettag_ws_file_7_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_7_1.setRuntimeParent(null);
        _jettag_ws_file_7_1.setTagInfo(_td_ws_file_7_1);
        _jettag_ws_file_7_1.doStart(context, out);
        _jettag_ws_file_7_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成spring-form.tld文件 
        RuntimeTagElement _jettag_ws_file_10_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_10_1.setRuntimeParent(null);
        _jettag_ws_file_10_1.setTagInfo(_td_ws_file_10_1);
        _jettag_ws_file_10_1.doStart(context, out);
        _jettag_ws_file_10_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成spring.tld文件 
        RuntimeTagElement _jettag_ws_file_13_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_13_1.setRuntimeParent(null);
        _jettag_ws_file_13_1.setTagInfo(_td_ws_file_13_1);
        _jettag_ws_file_13_1.doStart(context, out);
        _jettag_ws_file_13_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成web.xml文件 
        RuntimeTagElement _jettag_ws_file_16_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_16_1.setRuntimeParent(null);
        _jettag_ws_file_16_1.setTagInfo(_td_ws_file_16_1);
        _jettag_ws_file_16_1.doStart(context, out);
        _jettag_ws_file_16_1.doEnd();
    }
}
