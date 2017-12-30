package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_editRelate implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_editRelate() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "operate", //$NON-NLS-1$
                "'Edit'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_2_1 = new TagInfo("c:include", //$NON-NLS-1$
            2, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/fileHead.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_2 = new TagInfo("c:include", //$NON-NLS-1$
            4, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/head.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_2 = new TagInfo("c:include", //$NON-NLS-1$
            5, 2,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/fragment/editRelate/body.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c_include_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_1.setRuntimeParent(null);
        _jettag_c_include_2_1.setTagInfo(_td_c_include_2_1);
        _jettag_c_include_2_1.doStart(context, out);
        _jettag_c_include_2_1.doEnd();
        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_4_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_4_2.setRuntimeParent(null);
        _jettag_c_include_4_2.setTagInfo(_td_c_include_4_2);
        _jettag_c_include_4_2.doStart(context, out);
        _jettag_c_include_4_2.doEnd();
        RuntimeTagElement _jettag_c_include_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_5_2.setRuntimeParent(null);
        _jettag_c_include_5_2.setTagInfo(_td_c_include_5_2);
        _jettag_c_include_5_2.doStart(context, out);
        _jettag_c_include_5_2.doEnd();
        out.write("</html>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
