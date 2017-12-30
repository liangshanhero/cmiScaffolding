package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_appenginewebxml implements JET2Template {

    public _jet_appenginewebxml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<appengine-web-app xmlns=\"http://appengine.google.com/ns/1.0\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<application></application>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<version>1</version>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<sessions-enabled>true</sessions-enabled>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<!-- Configure serving/caching of GWT files -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<static-files>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<include path=\"**\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t<!-- The following line requires App Engine 1.3.2 SDK -->");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<include path=\"**.nocache.*\" expiration=\"0s\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t<include path=\"**.cache.*\" expiration=\"365d\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<exclude path=\"**.gwt.rpc\" />");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</static-files>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("</appengine-web-app>");  //$NON-NLS-1$        
    }
}
