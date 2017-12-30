package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_classpath implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_classpath() {
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

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_replaceStrings_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_1_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_1_1.setTagInfo(_td_c_replaceStrings_1_1);
        _jettag_c_replaceStrings_1_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_1_1_saved_out = out;
        while (_jettag_c_replaceStrings_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("%Left_angle_brackets?xml version=\"1.0\" encoding=\"UTF-8\"?%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<classpath>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"src\" path=\"src\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"owner.project.facets\" value=\"java\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.generic_6.0\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"owner.project.facets\" value=\"jst.web\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"org.eclipse.jst.j2ee.internal.web.container\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"org.eclipse.jst.j2ee.internal.module.container\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.jstl_1.2.1\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"owner.project.facets\" value=\"jst.web.jstl\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.spring_3.1\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"owner.project.facets\" value=\"me.spring\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.spring.security_3.1\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"owner.project.facets\" value=\"me.spring\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.spring.webflow_2.3\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"owner.project.facets\" value=\"me.spring\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"src\" path=\"generated\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"src\" path=\"resources\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/skyway.spring.utils_7.1.3\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/dwr_2.0.5\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/junit_4.7\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/cxf_2.1.9\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/atomikos_3.6.4\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/apache.commons.io_1.4\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/google.guice_3.0\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/apache.commons.dbcp_1.3\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/sitemesh_2.4\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/postgres.jdbc_8.3\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/jta_1.1\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/logging_1.6.6\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/apache.commons.beanutils_1.8.3\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/apache.commons.codec_1.5\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/hibernate.core_3.5.5\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"con\" path=\"com.genuitec.runtime.library/com.genuitec.me4s/derby_10.1.1.0\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<attribute name=\"org.eclipse.jst.component.dependency\" value=\"WEB-INF/lib\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</attributes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</classpathentry>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"lib\" path=\"WebRoot/WEB-INF/lib/mysql-connector-java-5.1.25.jar\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<classpathentry kind=\"output\" path=\"WebRoot/WEB-INF/classes\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</classpath>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_1_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_1_1_saved_out;
        _jettag_c_replaceStrings_1_1.doEnd();
        out.write(NL);         
    }
}
