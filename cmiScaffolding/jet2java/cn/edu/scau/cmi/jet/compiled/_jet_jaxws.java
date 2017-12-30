package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_jaxws implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_jaxws() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_file_3_1 = new TagInfo("ws:file", //$NON-NLS-1$
            3, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/jaxws-web-context.jet", //$NON-NLS-1$
                "{$projectName}/cmi/jaxws/jaxws-web-context.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // 生成.classpath文件 
        RuntimeTagElement _jettag_ws_file_3_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_3_1.setRuntimeParent(null);
        _jettag_ws_file_3_1.setTagInfo(_td_ws_file_3_1);
        _jettag_ws_file_3_1.doStart(context, out);
        _jettag_ws_file_3_1.doEnd();
        out.write(NL);         
    }
}
