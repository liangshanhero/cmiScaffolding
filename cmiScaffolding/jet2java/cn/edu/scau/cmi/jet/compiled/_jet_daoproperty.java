package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_daoproperty implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_daoproperty() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_1 = new TagInfo("c:get", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_1 = new TagInfo("c:get", //$NON-NLS-1$
            3, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_1 = new TagInfo("c:get", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_1 = new TagInfo("c:get", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_1 = new TagInfo("c:get", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_1 = new TagInfo("c:get", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_106 = new TagInfo("c:get", //$NON-NLS-1$
            11, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_1 = new TagInfo("c:get", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_75 = new TagInfo("c:get", //$NON-NLS-1$
            13, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@username", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_1 = new TagInfo("c:get", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_75 = new TagInfo("c:get", //$NON-NLS-1$
            15, 75,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@password", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_1 = new TagInfo("c:get", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_get_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_1.setRuntimeParent(null);
        _jettag_c_get_1_1.setTagInfo(_td_c_get_1_1);
        _jettag_c_get_1_1.doStart(context, out);
        _jettag_c_get_1_1.doEnd();
        out.write(".dialect=org.hibernate.dialect.MySQL5InnoDBDialect");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_1.setRuntimeParent(null);
        _jettag_c_get_3_1.setTagInfo(_td_c_get_3_1);
        _jettag_c_get_3_1.doStart(context, out);
        _jettag_c_get_3_1.doEnd();
        out.write(".show_sql=false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_1.setRuntimeParent(null);
        _jettag_c_get_5_1.setTagInfo(_td_c_get_5_1);
        _jettag_c_get_5_1.doStart(context, out);
        _jettag_c_get_5_1.doEnd();
        out.write(".generateDdl=false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_1.setRuntimeParent(null);
        _jettag_c_get_7_1.setTagInfo(_td_c_get_7_1);
        _jettag_c_get_7_1.doStart(context, out);
        _jettag_c_get_7_1.doEnd();
        out.write(".minPoolSize=1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_1.setRuntimeParent(null);
        _jettag_c_get_9_1.setTagInfo(_td_c_get_9_1);
        _jettag_c_get_9_1.doStart(context, out);
        _jettag_c_get_9_1.doEnd();
        out.write(".maxPoolSize=10");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_1.setRuntimeParent(null);
        _jettag_c_get_11_1.setTagInfo(_td_c_get_11_1);
        _jettag_c_get_11_1.doStart(context, out);
        _jettag_c_get_11_1.doEnd();
        out.write(".connection.url=jdbc\\:mysql\\://202.116.162.90\\:3306/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_106); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_106.setRuntimeParent(null);
        _jettag_c_get_11_106.setTagInfo(_td_c_get_11_106);
        _jettag_c_get_11_106.doStart(context, out);
        _jettag_c_get_11_106.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_1.setRuntimeParent(null);
        _jettag_c_get_13_1.setTagInfo(_td_c_get_13_1);
        _jettag_c_get_13_1.doStart(context, out);
        _jettag_c_get_13_1.doEnd();
        out.write(".connection.username=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_75.setRuntimeParent(null);
        _jettag_c_get_13_75.setTagInfo(_td_c_get_13_75);
        _jettag_c_get_13_75.doStart(context, out);
        _jettag_c_get_13_75.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_1.setRuntimeParent(null);
        _jettag_c_get_15_1.setTagInfo(_td_c_get_15_1);
        _jettag_c_get_15_1.doStart(context, out);
        _jettag_c_get_15_1.doEnd();
        out.write(".connection.password=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_75 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_75); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_75.setRuntimeParent(null);
        _jettag_c_get_15_75.setTagInfo(_td_c_get_15_75);
        _jettag_c_get_15_75.doStart(context, out);
        _jettag_c_get_15_75.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_1.setRuntimeParent(null);
        _jettag_c_get_17_1.setTagInfo(_td_c_get_17_1);
        _jettag_c_get_17_1.doStart(context, out);
        _jettag_c_get_17_1.doEnd();
        out.write(".connection.driver_class=com.mysql.jdbc.Driver");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
    }
}
