package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_css implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_css() {
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
                "templates/content/css/dashboard.css", //$NON-NLS-1$
                "{$projectName}/WebRoot/css/dashboard.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_5_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            5, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/css/style.css", //$NON-NLS-1$
                "{$projectName}/WebRoot/css/style.css", //$NON-NLS-1$
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
    }
}
