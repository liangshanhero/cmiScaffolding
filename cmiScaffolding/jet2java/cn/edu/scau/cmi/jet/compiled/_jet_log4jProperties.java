package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_log4jProperties implements JET2Template {

    public _jet_log4jProperties() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("# STDOUT appender");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("log4j.appender.STDOUT=org.apache.log4j.ConsoleAppender");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("log4j.appender.STDOUT.layout=org.apache.log4j.PatternLayout");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("log4j.appender.STDOUT.layout.ConversionPattern=%d %p [%t] %C{1} - %m\\n");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("# use the STDOUT appender. set the level to ERROR.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("log4j.rootLogger=INFO, STDOUT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("log4j.category.atomikos=ERROR, STDOUT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("log4j.category.org.springframework=ERROR, STDOUT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("# use this category for skyway / spring util output");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#log4j.category.org.skyway.spring.util=DEBUG, STDOUT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
    }
}
