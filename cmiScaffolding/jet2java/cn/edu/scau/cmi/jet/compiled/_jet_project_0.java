package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_project_0 implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_project_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_copyFile_5_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            5, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/.project", //$NON-NLS-1$
                "{$projectName}/.project", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_8_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            8, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/.classpath", //$NON-NLS-1$
                "{$projectName}/.classpath", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_11_1 = new TagInfo("ws:file", //$NON-NLS-1$
            11, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/merge.jet", //$NON-NLS-1$
                "{$projectName}/.merge.xml", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_14_1 = new TagInfo("ws:file", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/configure/springBeans.jet", //$NON-NLS-1$
                "{$projectName}/.springBeans", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 生成.project文件 
        //<ws:file template="templates/content/configure/project/project.jet" path="{$projectName/.project"/>
        RuntimeTagElement _jettag_ws_copyFile_5_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_5_1.setRuntimeParent(null);
        _jettag_ws_copyFile_5_1.setTagInfo(_td_ws_copyFile_5_1);
        _jettag_ws_copyFile_5_1.doStart(context, out);
        _jettag_ws_copyFile_5_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成.classpath文件 
        RuntimeTagElement _jettag_ws_copyFile_8_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_8_1.setRuntimeParent(null);
        _jettag_ws_copyFile_8_1.setTagInfo(_td_ws_copyFile_8_1);
        _jettag_ws_copyFile_8_1.doStart(context, out);
        _jettag_ws_copyFile_8_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成.merge.xml文件 
        RuntimeTagElement _jettag_ws_file_11_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_11_1.setRuntimeParent(null);
        _jettag_ws_file_11_1.setTagInfo(_td_ws_file_11_1);
        _jettag_ws_file_11_1.doStart(context, out);
        _jettag_ws_file_11_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成.springBeans文件 
        RuntimeTagElement _jettag_ws_file_14_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_14_1.setRuntimeParent(null);
        _jettag_ws_file_14_1.setTagInfo(_td_ws_file_14_1);
        _jettag_ws_file_14_1.doStart(context, out);
        _jettag_ws_file_14_1.doEnd();
    }
}
