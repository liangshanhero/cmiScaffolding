package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_persistence implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_persistence() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_6_26 = new TagInfo("c:get", //$NON-NLS-1$
            6, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "et", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_10 = new TagInfo("c:get", //$NON-NLS-1$
            20, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_48 = new TagInfo("c:get", //$NON-NLS-1$
            20, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($et/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<persistence version=\"1.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns=\"http://java.sun.com/xml/ns/persistence\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txsi:schemaLocation=\"http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<persistence-unit name=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_26.setRuntimeParent(null);
        _jettag_c_get_6_26.setTagInfo(_td_c_get_6_26);
        _jettag_c_get_6_26.doStart(context, out);
        _jettag_c_get_6_26.doEnd();
        out.write("\" transaction-type=\"JTA\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>generated-persistence-unit</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<provider>org.hibernate.ejb.HibernatePersistence</provider>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_3.setRuntimeParent(null);
        _jettag_c_iterate_9_3.setTagInfo(_td_c_iterate_9_3);
        _jettag_c_iterate_9_3.doStart(context, out);
        while (_jettag_c_iterate_9_3.okToProcessBody()) {
            //<c:setVariable select="0" var="i"/>
            //		<c:iterate select="$et/columns/column" var="col">
            //		<c:setVariable select="$i+1" var="i"/>
            //		</c:iterate>
            //		<c:setVariable select="0" var="j"/>
            //		<c:iterate select="$et/referenceds/referenced" var="ref">
            //		<c:setVariable select="$j+1" var="j"/>
            //		</c:iterate>
            //		<c:if test="$i!=0 or $j!=0">
            //		
            out.write("\t\t<class>");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_20_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_10); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_10.setRuntimeParent(_jettag_c_iterate_9_3);
            _jettag_c_get_20_10.setTagInfo(_td_c_get_20_10);
            _jettag_c_get_20_10.doStart(context, out);
            _jettag_c_get_20_10.doEnd();
            out.write(".domain.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_20_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_48.setRuntimeParent(_jettag_c_iterate_9_3);
            _jettag_c_get_20_48.setTagInfo(_td_c_get_20_48);
            _jettag_c_get_20_48.doStart(context, out);
            _jettag_c_get_20_48.doEnd();
            out.write("</class>");  //$NON-NLS-1$        
            out.write(NL);         
            //</c:if>
            _jettag_c_iterate_9_3.handleBodyContent(out);
        }
        _jettag_c_iterate_9_3.doEnd();
        out.write("\t\t<exclude-unlisted-classes>true</exclude-unlisted-classes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</persistence-unit>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</persistence>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
    }
}
