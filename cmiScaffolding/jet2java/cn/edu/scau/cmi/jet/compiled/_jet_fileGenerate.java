package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_fileGenerate implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_fileGenerate() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_copyFile_3_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            3, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-common/dashboard.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-common/dashboard.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_5_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            5, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-common/footer.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-common/footer.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_7_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            7, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-common/header.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-common/header.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_9_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            9, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-common/login.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-common/login.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_11_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            11, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-common/tabs.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-common/tabs.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_13_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            13, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-decorators/include.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-decorators/include.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_15_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            15, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-decorators/main.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-decorators/main.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_17_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            17, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-decorators/panel.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-decorators/panel.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_19_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            19, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/sitemesh-decorators/printable.jsp", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/sitemesh-decorators/printable.jsp", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_3_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_3_1.setRuntimeParent(null);
        _jettag_ws_copyFile_3_1.setTagInfo(_td_ws_copyFile_3_1);
        _jettag_ws_copyFile_3_1.doStart(context, out);
        _jettag_ws_copyFile_3_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_5_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_5_1.setRuntimeParent(null);
        _jettag_ws_copyFile_5_1.setTagInfo(_td_ws_copyFile_5_1);
        _jettag_ws_copyFile_5_1.doStart(context, out);
        _jettag_ws_copyFile_5_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_7_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_7_1.setRuntimeParent(null);
        _jettag_ws_copyFile_7_1.setTagInfo(_td_ws_copyFile_7_1);
        _jettag_ws_copyFile_7_1.doStart(context, out);
        _jettag_ws_copyFile_7_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_9_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_9_1.setRuntimeParent(null);
        _jettag_ws_copyFile_9_1.setTagInfo(_td_ws_copyFile_9_1);
        _jettag_ws_copyFile_9_1.doStart(context, out);
        _jettag_ws_copyFile_9_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_11_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_11_1.setRuntimeParent(null);
        _jettag_ws_copyFile_11_1.setTagInfo(_td_ws_copyFile_11_1);
        _jettag_ws_copyFile_11_1.doStart(context, out);
        _jettag_ws_copyFile_11_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_13_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_13_1.setRuntimeParent(null);
        _jettag_ws_copyFile_13_1.setTagInfo(_td_ws_copyFile_13_1);
        _jettag_ws_copyFile_13_1.doStart(context, out);
        _jettag_ws_copyFile_13_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_15_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_15_1.setRuntimeParent(null);
        _jettag_ws_copyFile_15_1.setTagInfo(_td_ws_copyFile_15_1);
        _jettag_ws_copyFile_15_1.doStart(context, out);
        _jettag_ws_copyFile_15_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_17_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_17_1.setRuntimeParent(null);
        _jettag_ws_copyFile_17_1.setTagInfo(_td_ws_copyFile_17_1);
        _jettag_ws_copyFile_17_1.doStart(context, out);
        _jettag_ws_copyFile_17_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_19_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_19_1.setRuntimeParent(null);
        _jettag_ws_copyFile_19_1.setTagInfo(_td_ws_copyFile_19_1);
        _jettag_ws_copyFile_19_1.doStart(context, out);
        _jettag_ws_copyFile_19_1.doEnd();
    }
}
