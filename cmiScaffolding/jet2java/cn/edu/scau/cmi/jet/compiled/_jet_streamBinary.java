package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_streamBinary implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_streamBinary() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_20 = new TagInfo("c:get", //$NON-NLS-1$
            1, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t@RequestMapping(\"/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_20.setRuntimeParent(null);
        _jettag_c_get_1_20.setTagInfo(_td_c_get_1_20);
        _jettag_c_get_1_20.doStart(context, out);
        _jettag_c_get_1_20.doEnd();
        out.write("Controller/binary.action\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ModelAndView streamBinary(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t@ModelAttribute HttpServletRequest request,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t@ModelAttribute HttpServletResponse response) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAndView mav = new ModelAndView();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmav.setViewName(\"streamedBinaryContentView\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn mav;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
