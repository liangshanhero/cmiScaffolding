package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_orgeclipsewstcommonprojectfacetcoreprefsxml implements JET2Template {

    public _jet_orgeclipsewstcommonprojectfacetcoreprefsxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<root>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <facet id=\"java\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <facet id=\"jst.web\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <facet id=\"wst.jsdt.web\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <facet id=\"me.spring\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <node name=\"libprov\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <attribute name=\"config-id\" value=\"me.spring_3.1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <attribute name=\"copy-tlds\" value=\"true\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <attribute name=\"nested-config-me.spring_3.1-security\" value=\"none\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <attribute name=\"nested-config-me.spring_3.1-webflow\" value=\"none\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <attribute name=\"provider-id\" value=\"me-spring-library-provider\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <attribute name=\"version-id\" value=\"3.1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </node>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </facet>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</root>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
