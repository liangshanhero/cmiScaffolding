package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_properties implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_properties() {
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
                "templates/content/configure/application-bundles.jet", //$NON-NLS-1$
                "{$projectName}/cmi/bundles/application-resources.properties", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$table", //$NON-NLS-1$
                "eachTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_8_1 = new TagInfo("ws:file", //$NON-NLS-1$
            8, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/entity-bundles.jet", //$NON-NLS-1$
                "{$projectName}/cmi/bundles/{$eachTable/@name}-resources.properties", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 生成application-resources.properties文件 
        RuntimeTagElement _jettag_ws_file_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_4_1.setRuntimeParent(null);
        _jettag_ws_file_4_1.setTagInfo(_td_ws_file_4_1);
        _jettag_ws_file_4_1.doStart(context, out);
        _jettag_ws_file_4_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成实体.properties文件 
        RuntimeTagElement _jettag_c_iterate_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_1.setRuntimeParent(null);
        _jettag_c_iterate_7_1.setTagInfo(_td_c_iterate_7_1);
        _jettag_c_iterate_7_1.doStart(context, out);
        while (_jettag_c_iterate_7_1.okToProcessBody()) {
            RuntimeTagElement _jettag_ws_file_8_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_8_1.setRuntimeParent(_jettag_c_iterate_7_1);
            _jettag_ws_file_8_1.setTagInfo(_td_ws_file_8_1);
            _jettag_ws_file_8_1.doStart(context, out);
            _jettag_ws_file_8_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_7_1.handleBodyContent(out);
        }
        _jettag_c_iterate_7_1.doEnd();
    }
}
