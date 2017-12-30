package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_securitycontext implements JET2Template {

    public _jet_securitycontext() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<beans:beans xmlns=\"http://www.springframework.org/schema/security\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:beans=\"http://www.springframework.org/schema/beans\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:context=\"http://www.springframework.org/schema/context\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:lang=\"http://www.springframework.org/schema/lang\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txsi:schemaLocation=\"http://www.springframework.org/schema/beans");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/beans/spring-beans-3.1.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \thttp://www.springframework.org/schema/security ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\thttp://www.springframework.org/schema/security/spring-security-3.1.xsd");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      \thttp://www.springframework.org/schema/context ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      \thttp://www.springframework.org/schema/context/spring-context-3.1.xsd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("</beans:beans>");  //$NON-NLS-1$        
    }
}
