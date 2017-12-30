package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_orgeclipsewstcommoncomponent implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_orgeclipsewstcommoncomponent() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_29 = new TagInfo("c:get", //$NON-NLS-1$
            2, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_46 = new TagInfo("c:get", //$NON-NLS-1$
            7, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_51 = new TagInfo("c:get", //$NON-NLS-1$
            8, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?><project-modules id=\"moduleCoreId\" project-version=\"1.5.0\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <wb-module deploy-name=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_29); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_29.setRuntimeParent(null);
        _jettag_c_get_2_29.setTagInfo(_td_c_get_2_29);
        _jettag_c_get_2_29.doStart(context, out);
        _jettag_c_get_2_29.doEnd();
        out.write("\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <wb-resource deploy-path=\"/\" source-path=\"/WebRoot\" tag=\"defaultRootSource\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <wb-resource deploy-path=\"/WEB-INF/classes\" source-path=\"/src\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <wb-resource deploy-path=\"/WEB-INF/classes\" source-path=\"/resources\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <wb-resource deploy-path=\"/WEB-INF/classes\" source-path=\"/generated\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"context-root\" value=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_46); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_46.setRuntimeParent(null);
        _jettag_c_get_7_46.setTagInfo(_td_c_get_7_46);
        _jettag_c_get_7_46.doStart(context, out);
        _jettag_c_get_7_46.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <property name=\"java-output-path\" value=\"/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_51.setRuntimeParent(null);
        _jettag_c_get_8_51.setTagInfo(_td_c_get_8_51);
        _jettag_c_get_8_51.doStart(context, out);
        _jettag_c_get_8_51.doEnd();
        out.write("/bin\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </wb-module>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</project-modules>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
