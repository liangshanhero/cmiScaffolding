package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_comgenuitecruntimelibrariesxml implements JET2Template {

    public _jet_comgenuitecruntimelibrariesxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<project>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <add-on id=\"spring.web\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</project>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
