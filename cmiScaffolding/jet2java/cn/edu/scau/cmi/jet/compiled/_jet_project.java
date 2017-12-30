package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_project implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_project() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_1_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_8 = new TagInfo("c:get", //$NON-NLS-1$
            3, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_replaceStrings_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_1_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_1_1.setTagInfo(_td_c_replaceStrings_1_1);
        _jettag_c_replaceStrings_1_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_1_1_saved_out = out;
        while (_jettag_c_replaceStrings_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("%Left_angle_brackets?xml version=\"1.0\" encoding=\"UTF-8\"?%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<projectDescription>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<name>");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_3_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_8.setRuntimeParent(_jettag_c_replaceStrings_1_1);
            _jettag_c_get_3_8.setTagInfo(_td_c_get_3_8);
            _jettag_c_get_3_8.doStart(context, out);
            _jettag_c_get_3_8.doEnd();
            out.write("</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<comment></comment>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<projects>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</projects>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<buildSpec>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>org.eclipse.wst.jsdt.core.javascriptValidator</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>org.eclipse.jdt.core.javabuilder</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>org.eclipse.wst.common.project.facet.core.builder</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>org.eclipse.wst.validation.validationbuilder</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>com.genuitec.eclipse.j2eedt.core.DeploymentDescriptorValidator</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>com.genuitec.eclipse.springframework.springbuilder</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<name>com.genuitec.eclipse.ast.deploy.core.DeploymentBuilder</name>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</arguments>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</buildCommand>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</buildSpec>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<natures>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<nature>com.genuitec.eclipse.springframework.springnature</nature>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<nature>org.eclipse.jem.workbench.JavaEMFNature</nature>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<nature>org.eclipse.wst.common.project.facet.core.nature</nature>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<nature>org.eclipse.jdt.core.javanature</nature>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<nature>org.eclipse.wst.jsdt.core.jsNature</nature>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</natures>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</projectDescription>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_1_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_1_1_saved_out;
        _jettag_c_replaceStrings_1_1.doEnd();
    }
}
