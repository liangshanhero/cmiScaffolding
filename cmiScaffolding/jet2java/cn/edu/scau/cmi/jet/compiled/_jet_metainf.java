package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_metainf implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_metainf() {
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
                "templates/content/configure/persistence.jet", //$NON-NLS-1$
                "{$projectName}/cmi/META-INF/persistence.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_7_1 = new TagInfo("ws:file", //$NON-NLS-1$
            7, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/MANIFEST.MF.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/META-INF/MANIFEST.MF", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 生成persistence.xml文件 
        RuntimeTagElement _jettag_ws_file_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_4_1.setRuntimeParent(null);
        _jettag_ws_file_4_1.setTagInfo(_td_ws_file_4_1);
        _jettag_ws_file_4_1.doStart(context, out);
        _jettag_ws_file_4_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成MANIFEST.MF文件 
        RuntimeTagElement _jettag_ws_file_7_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_7_1.setRuntimeParent(null);
        _jettag_ws_file_7_1.setTagInfo(_td_ws_file_7_1);
        _jettag_ws_file_7_1.doStart(context, out);
        _jettag_ws_file_7_1.doEnd();
        out.write(NL);         
    }
}
