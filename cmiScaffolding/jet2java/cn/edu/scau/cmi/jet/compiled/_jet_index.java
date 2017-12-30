package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_index implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_index() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_1_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_replaceStrings_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_1_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_1_1.setTagInfo(_td_c_replaceStrings_1_1);
        _jettag_c_replaceStrings_1_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_1_1_saved_out = out;
        while (_jettag_c_replaceStrings_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("%Left_angle_brackets%@ page language=\"java\" import=\"java.util.*\" pageEncoding=\"UTF-8\"%%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("%Left_angle_brackets%");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("String path = request.getContextPath();");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("String basePath = request.getScheme()+\"://\"+request.getServerName()+\":\"+request.getServerPort()+path+\"/\";");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("%%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<html>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <head>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    <base href=\"%Left_angle_brackets%=basePath%%Right_angle_brackets\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    <title>My JSP 'index.jsp' starting page</title>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<meta http-equiv=\"expires\" content=\"0\">    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  </head>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <body>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  </body>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</html>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_1_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_1_1_saved_out;
        _jettag_c_replaceStrings_1_1.doEnd();
    }
}
