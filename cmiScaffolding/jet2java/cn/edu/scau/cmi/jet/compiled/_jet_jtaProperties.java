package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_jtaProperties implements JET2Template {

    public _jet_jtaProperties() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("com.atomikos.icatch.service=com.atomikos.icatch.standalone.UserTransactionServiceFactory");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.console_file_name = tm.out");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.log_base_name = tmlog");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.tm_unique_name = myeclipseforspring");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.serial_jta_transactions=false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.automatic_resource_registration=true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.max_actives=15000");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.max_timeout=3600000");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.enable_logging=false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.console_log_level=WARN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.output_dir=/atomikos-sw-tmp/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("com.atomikos.icatch.log_base_dir=/atomikos-sw-tmp/");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
