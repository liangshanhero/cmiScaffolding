package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_list_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_list_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_28 = new TagInfo("c:get", //$NON-NLS-1$
            1, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_14 = new TagInfo("c:get", //$NON-NLS-1$
            3, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_70 = new TagInfo("c:get", //$NON-NLS-1$
            3, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_34 = new TagInfo("c:get", //$NON-NLS-1$
            4, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_86 = new TagInfo("c:get", //$NON-NLS-1$
            4, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_132 = new TagInfo("c:get", //$NON-NLS-1$
            4, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t@RequestMapping(value = \"/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_28); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_28.setRuntimeParent(null);
        _jettag_c_get_1_28.setTagInfo(_td_c_get_1_28);
        _jettag_c_get_1_28.doStart(context, out);
        _jettag_c_get_1_28.doEnd();
        out.write("\", method = RequestMethod.GET)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@ResponseBody");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_14.setRuntimeParent(null);
        _jettag_c_get_3_14.setTagInfo(_td_c_get_3_14);
        _jettag_c_get_3_14.doStart(context, out);
        _jettag_c_get_3_14.doEnd();
        out.write("> list");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_70.setRuntimeParent(null);
        _jettag_c_get_3_70.setTagInfo(_td_c_get_3_70);
        _jettag_c_get_3_70.doStart(context, out);
        _jettag_c_get_3_70.doEnd();
        out.write("s() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn new java.util.ArrayList<");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_34.setRuntimeParent(null);
        _jettag_c_get_4_34.setTagInfo(_td_c_get_4_34);
        _jettag_c_get_4_34.doStart(context, out);
        _jettag_c_get_4_34.doEnd();
        out.write(">(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_86.setRuntimeParent(null);
        _jettag_c_get_4_86.setTagInfo(_td_c_get_4_86);
        _jettag_c_get_4_86.doStart(context, out);
        _jettag_c_get_4_86.doEnd();
        out.write("Service.load");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_132); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_132.setRuntimeParent(null);
        _jettag_c_get_4_132.setTagInfo(_td_c_get_4_132);
        _jettag_c_get_4_132.doStart(context, out);
        _jettag_c_get_4_132.doEnd();
        out.write("s());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
    }
}
