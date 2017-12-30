package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_settings implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_settings() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_file_2_1 = new TagInfo("ws:file", //$NON-NLS-1$
            2, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/org.eclipse.jdt.core.prefs.jet", //$NON-NLS-1$
                "{$projectName}/.settings/org.eclipse.jdt.core.prefs", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_3_1 = new TagInfo("ws:file", //$NON-NLS-1$
            3, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/org.eclipse.wst.common.component.jet", //$NON-NLS-1$
                "{$projectName}/.settings/org.eclipse.wst.common.component", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_4_1 = new TagInfo("ws:file", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/org.eclipse.wst.common.project.facet.core.xml.jet", //$NON-NLS-1$
                "{$projectName}/.settings/org.eclipse.wst.common.project.facet.core.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_5_1 = new TagInfo("ws:file", //$NON-NLS-1$
            5, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/com.genuitec.runtime.libraries.xml.jet", //$NON-NLS-1$
                "{$projectName}/.settings/com.genuitec.runtime.libraries.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_6_1 = new TagInfo("ws:file", //$NON-NLS-1$
            6, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/org.eclipse.wst.common.project.facet.core.prefs.xml.jet", //$NON-NLS-1$
                "{$projectName}/.settings/org.eclipse.wst.common.project.facet.core.prefs.xml", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_ws_file_2_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_2_1.setRuntimeParent(null);
        _jettag_ws_file_2_1.setTagInfo(_td_ws_file_2_1);
        _jettag_ws_file_2_1.doStart(context, out);
        _jettag_ws_file_2_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_file_3_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_3_1.setRuntimeParent(null);
        _jettag_ws_file_3_1.setTagInfo(_td_ws_file_3_1);
        _jettag_ws_file_3_1.doStart(context, out);
        _jettag_ws_file_3_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_file_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_4_1.setRuntimeParent(null);
        _jettag_ws_file_4_1.setTagInfo(_td_ws_file_4_1);
        _jettag_ws_file_4_1.doStart(context, out);
        _jettag_ws_file_4_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_file_5_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_5_1.setRuntimeParent(null);
        _jettag_ws_file_5_1.setTagInfo(_td_ws_file_5_1);
        _jettag_ws_file_5_1.doStart(context, out);
        _jettag_ws_file_5_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_file_6_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_6_1.setRuntimeParent(null);
        _jettag_ws_file_6_1.setTagInfo(_td_ws_file_6_1);
        _jettag_ws_file_6_1.doStart(context, out);
        _jettag_ws_file_6_1.doEnd();
        out.write(NL);         
        out.write(NL);         
    }
}
