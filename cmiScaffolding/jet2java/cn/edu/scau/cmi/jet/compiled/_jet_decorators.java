package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_decorators implements JET2Template {

    public _jet_decorators() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<decorators defaultdir=\"/WEB-INF/sitemesh-decorators\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<excludes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    <pattern>/j_spring_security_logout</pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    <pattern>/pages/logout-redirect.jsp</pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    <pattern>/flexweb/*</pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t    <pattern>/ApplicationScaffold.html</pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</excludes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <decorator name=\"main\" page=\"main.jsp\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <pattern>/*</pattern>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </decorator>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    <decorator name=\"panel\" page=\"panel.jsp\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <decorator name=\"printable\" page=\"printable.jsp\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</decorators>");  //$NON-NLS-1$        
    }
}
