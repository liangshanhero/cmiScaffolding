package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_springBeans implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_springBeans() {
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
    private static final TagInfo _td_c_get_11_21 = new TagInfo("c:get", //$NON-NLS-1$
            11, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_21 = new TagInfo("c:get", //$NON-NLS-1$
            12, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_21 = new TagInfo("c:get", //$NON-NLS-1$
            13, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_21 = new TagInfo("c:get", //$NON-NLS-1$
            14, 21,
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
            out.write("<beansProjectDescription>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<version>1</version>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<pluginVersion><![CDATA[3.3.0.me201310081624]]></pluginVersion>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<configSuffixes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<configSuffix><![CDATA[xml]]></configSuffix>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</configSuffixes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<enableImports><![CDATA[false]]></enableImports>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<configs>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<config>src/applicationContext.xml</config>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<config>resources/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_21.setRuntimeParent(_jettag_c_replaceStrings_1_1);
            _jettag_c_get_11_21.setTagInfo(_td_c_get_11_21);
            _jettag_c_get_11_21.doStart(context, out);
            _jettag_c_get_11_21.doEnd();
            out.write("-dao-context.xml</config>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<config>resources/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_21.setRuntimeParent(_jettag_c_replaceStrings_1_1);
            _jettag_c_get_12_21.setTagInfo(_td_c_get_12_21);
            _jettag_c_get_12_21.doStart(context, out);
            _jettag_c_get_12_21.doEnd();
            out.write("-security-context.xml</config>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<config>resources/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_21.setRuntimeParent(_jettag_c_replaceStrings_1_1);
            _jettag_c_get_13_21.setTagInfo(_td_c_get_13_21);
            _jettag_c_get_13_21.doStart(context, out);
            _jettag_c_get_13_21.doEnd();
            out.write("-service-context.xml</config>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<config>resources/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_14_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_21.setRuntimeParent(_jettag_c_replaceStrings_1_1);
            _jettag_c_get_14_21.setTagInfo(_td_c_get_14_21);
            _jettag_c_get_14_21.doStart(context, out);
            _jettag_c_get_14_21.doEnd();
            out.write("-web-context.xml</config>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</configs>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<configSets>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</configSets>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</beansProjectDescription>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_1_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_1_1_saved_out;
        _jettag_c_replaceStrings_1_1.doEnd();
    }
}
