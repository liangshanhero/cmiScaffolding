package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_MANIFESTMF implements JET2Template {

    public _jet_MANIFESTMF() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("Manifest-Version: 1.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("Class-Path: ");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
