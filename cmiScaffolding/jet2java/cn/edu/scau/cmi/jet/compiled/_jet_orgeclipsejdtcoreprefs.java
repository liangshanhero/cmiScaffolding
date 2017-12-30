package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_orgeclipsejdtcoreprefs implements JET2Template {

    public _jet_orgeclipsejdtcoreprefs() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("eclipse.preferences.version=1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jdt.core.compiler.compliance=1.7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jdt.core.compiler.problem.assertIdentifier=error");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jdt.core.compiler.problem.enumIdentifier=error");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("org.eclipse.jdt.core.compiler.source=1.7");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
