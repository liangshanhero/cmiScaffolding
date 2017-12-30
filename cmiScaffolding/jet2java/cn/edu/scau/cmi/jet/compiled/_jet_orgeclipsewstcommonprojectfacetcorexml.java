package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_orgeclipsewstcommonprojectfacetcorexml implements JET2Template {

    public _jet_orgeclipsewstcommonprojectfacetcorexml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<faceted-project>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <fixed facet=\"wst.jsdt.web\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <installed facet=\"java\" version=\"1.7\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <installed facet=\"jst.web\" version=\"3.1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <installed facet=\"wst.jsdt.web\" version=\"1.0\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</faceted-project>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
